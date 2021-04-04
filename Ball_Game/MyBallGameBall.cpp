// Copyright 1998-2018 Epic Games, Inc. All Rights Reserved.

#define dmsgc(index, text, parameter) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.0f, FColor::Red, FString::Printf(TEXT(text), parameter))


#include "MyBallGameBall.h"
#include "UObject/ConstructorHelpers.h"
#include "Camera/CameraComponent.h"
#include "Components/StaticMeshComponent.h"
#include "Components/InputComponent.h"
#include "GameFramework/SpringArmComponent.h"
#include "Engine/CollisionProfile.h"
#include "Engine/StaticMesh.h"

AMyBallGameBall::AMyBallGameBall()
{
	static ConstructorHelpers::FObjectFinder<UStaticMesh> BallMesh(TEXT("/Game/Rolling/Meshes/BallMesh.BallMesh"));


	// Create mesh component for the ball
	
	Ball = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("Ball0"));
	Ball->SetStaticMesh(BallMesh.Object);
	Ball->BodyInstance.SetCollisionProfileName(UCollisionProfile::PhysicsActor_ProfileName);
	Ball->SetSimulatePhysics(true);
	
	Ball->BodyInstance.MassScale = 3.5f;
	Ball->SetNotifyRigidBodyCollision(true);
	RootComponent = Ball;
	// Create a camera boom attached to the root (ball)
	SpringArm = CreateDefaultSubobject<USpringArmComponent>(TEXT("SpringArm0"));
	SpringArm->SetupAttachment(RootComponent);
	SpringArm->bDoCollisionTest = false;
	SpringArm->bAbsoluteRotation = true; // Rotation of the ball should not affect rotation of boom
	SpringArm->RelativeRotation = FRotator(-20.f, 0.f, 0.f);
	SpringArm->TargetArmLength = 1200.f;
	SpringArm->bEnableCameraLag = false;
	SpringArm->CameraLagSpeed = 3.f;

	// Create a camera and attach to boom
	Camera = CreateDefaultSubobject<UCameraComponent>(TEXT("Camera0"));
	Camera->SetupAttachment(SpringArm, USpringArmComponent::SocketName);
	Camera->bUsePawnControlRotation = false; // We don't want the controller rotating the camera
	//Camera->SetRelativeLocation(TeleportTarget);



	// Set up forces
	
	RollTorque = 30000000.0f;
	JumpImpulse = 450000.0f;
	// Start being able to jump
	bCanJump = true;
	
	
	//Audio Files
	static ConstructorHelpers::FObjectFinder<USoundWave>jumpWave(TEXT("SoundWave'/Game/Audio/jump.jump'"));

	audioWave = jumpWave.Object;
	audioComponent =CreateDefaultSubobject<UAudioComponent>(TEXT("AudioComp"));
	audioComponent->bAutoActivate = false;
	audioComponent->AttachTo(RootComponent);
	audioComponent->SetRelativeLocation(FVector(1.0f, 0.0f, 0.0f));
	//changing material 
	FirstMaterial = Ball->GetMaterial(0);

	ConstructorHelpers::FObjectFinder<UMaterial> SphereMaterial(TEXT("/Game/StarterContent/Materials/M_Metal_Burnished_Steel.M_Metal_Burnished_Steel"));
	SecondMaterial = SphereMaterial.Object;


	/*TArray<AActor*> FoundActors;
	UGameplayStatics::GetAllActorsOfClass(GetWorld(), AMyBallGameBall::StaticClass(), FoundActors);
	Cast<AMyBallGameBall>(FoundActors[0])->SetActorLocation(TeleportTarget);
	*/
	
	}


void AMyBallGameBall::SetupPlayerInputComponent(class UInputComponent* PlayerInputComponent)
{
	// set up gameplay key bindings
	PlayerInputComponent->BindAxis("MoveRight", this, &AMyBallGameBall::MoveRight);
	PlayerInputComponent->BindAxis("MoveForward", this, &AMyBallGameBall::MoveForward);

	PlayerInputComponent->BindAction("Jump", IE_Pressed, this, &AMyBallGameBall::Jump);
	PlayerInputComponent->BindAction("Change", IE_Pressed, this, &AMyBallGameBall::ChangeBall);
	// handle touch devices
	PlayerInputComponent->BindTouch(IE_Pressed, this, &AMyBallGameBall::TouchStarted);
	PlayerInputComponent->BindTouch(IE_Released, this, &AMyBallGameBall::TouchStopped);
}

void AMyBallGameBall::MoveRight(float Val)
{
	const FVector Torque = FVector(-1.f * Val * RollTorque, 0.f, 0.f);
	Ball->AddTorqueInRadians(Torque);
}

void AMyBallGameBall::MoveForward(float Val)
{
	const FVector Torque = FVector(0.f, Val * RollTorque, 0.f);
	Ball->AddTorqueInRadians(Torque);

}
	

// Handle movement based on our "MoveX" and "MoveY" axes
void AMyBallGameBall::Tick(float DeltaTime)
{
	Super::Tick(DeltaTime);

	dmsgc(10, "tick test: %f", 1.5);

}

void AMyBallGameBall::Jump()
{
	if (bCanJump)
	{
		const FVector Impulse = FVector(0.f, 0.f, JumpImpulse);
		Ball->AddImpulse(Impulse);
		bCanJump = false;
	}
	if (audioWave->IsValidLowLevelFast()) {
		audioComponent->SetSound(audioWave);
	}
	audioComponent->Play();
}
	

void AMyBallGameBall::NotifyHit(class UPrimitiveComponent* MyComp, class AActor* Other, class UPrimitiveComponent* OtherComp, bool bSelfMoved, FVector HitLocation, FVector HitNormal, FVector NormalImpulse, const FHitResult& Hit)
{
	Super::NotifyHit(MyComp, Other, OtherComp, bSelfMoved, HitLocation, HitNormal, NormalImpulse, Hit);

	bCanJump = true;
}

void AMyBallGameBall::TouchStarted(ETouchIndex::Type FingerIndex, FVector Location)
{
	if (bCanJump)
	{
		const FVector Impulse = FVector(0.f, 0.f, JumpImpulse);
		Ball->AddImpulse(Impulse);
		bCanJump = false;
	}

}

void AMyBallGameBall::TouchStopped(ETouchIndex::Type FingerIndex, FVector Location)
{
	if (bCanJump)
	{
		const FVector Impulse = FVector(0.f, 0.f, JumpImpulse);
		Ball->AddImpulse(Impulse);
		bCanJump = false;
	}
}
void AMyBallGameBall::ChangeBall() 
{
		bCanJump = false;
		if (Ball->GetMaterial(0) == SecondMaterial) {
			Ball->SetMaterial(0, FirstMaterial);
			HeavyBall = true;
			AgileBall = false;
		}
		else if (Ball->GetMaterial(0) == FirstMaterial) {
			Ball->SetMaterial(0, SecondMaterial);
			HeavyBall = false;
			AgileBall = true;
		

		}
	
		if (HeavyBall == true) {
			// Agile Ball //
			Ball->SetMaterial(0, FirstMaterial);
			Ball->BodyInstance.SetMassScale(3.5f);
			RootComponent = Ball;
			RollTorque = 30000000.0f;
			JumpImpulse = 450000.0f;
			
		}
		else if (AgileBall == true) {
			// Heavy ball //
			Ball->SetMaterial(0, SecondMaterial);
			Ball->BodyInstance.SetMassScale(50.5f);
			RootComponent = Ball;
			RollTorque = 300000000.0f;
			JumpImpulse = 1.0f;
	}

		
}
