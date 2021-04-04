// Fill out your copyright notice in the Description page of Project Settings.

#define dmsg(index, text) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, text)
#define dmsgc(index, text, parameter) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, FString::Printf(TEXT(text), parameter))

#include "PawnBall.h"
#include "MyBallGameBall.h"
#include "UObject/ConstructorHelpers.h"
#include "Camera/CameraComponent.h"
#include "Components/StaticMeshComponent.h"
#include "Components/InputComponent.h"
#include "GameFramework/SpringArmComponent.h"
#include "Engine/CollisionProfile.h"
#include "Engine/StaticMesh.h"

// Sets default values
APawnBall::APawnBall()
{
	static ConstructorHelpers::FObjectFinder<UStaticMesh> BallMesh(TEXT("/Game/Rolling/Meshes/BallMesh.BallMesh"));

	// Create mesh component for the ball
	Ball = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("Ball0"));
	Ball->SetStaticMesh(BallMesh.Object);
	Ball->BodyInstance.SetCollisionProfileName(UCollisionProfile::PhysicsActor_ProfileName);
	Ball->SetSimulatePhysics(true);
	Ball->SetAngularDamping(0.1f);
	Ball->SetLinearDamping(0.1f);
	Ball->BodyInstance.MassScale = 3.5f;
	Ball->BodyInstance.MaxAngularVelocity = 800.0f;
	Ball->SetNotifyRigidBodyCollision(true);
	RootComponent = Ball;
	// Set this pawn to call Tick() every frame.  You can turn this off to improve performance if you don't need it.
	PrimaryActorTick.bCanEverTick = true;

	// Set this pawn to be controlled by the lowest-numbered player
	AutoPossessPlayer = EAutoReceiveInput::Player0;

	// Create a dummy root component we can attach things to.
	RootComponent = CreateDefaultSubobject<USceneComponent>(TEXT("RootComponent"));
	// Create a camera and a visible object
	UCameraComponent* OurCamera = CreateDefaultSubobject<UCameraComponent>(TEXT("OurCamera"));

	OurCamera->SetupAttachment(RootComponent);
	OurCamera->SetRelativeLocation(cameraVector);
	OurCamera->SetRelativeRotation(cameraRotator);

	/*
		Visual
	*/

	// Define a root component for overlaps, collisions, etc. This component is not visible per se.
	USphereComponent* SphereComponent = CreateDefaultSubobject<USphereComponent>(TEXT("SphereComponent"));

	// Size root component and its collision model
	SphereComponent->InitSphereRadius(50.0f);
	SphereComponent->SetCollisionProfileName(TEXT("OverlapAllDynamic"));
	SphereComponent->AttachTo(RootComponent);

	// Create a sphere mesh for visuals and attach to root component
	SphereVisual = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("SphereMesh"));
	SphereVisual->AttachTo(RootComponent);

	ConstructorHelpers::FObjectFinder<UStaticMesh> SphereAsset(TEXT("/Game/StarterContent/Shapes/Shape_Sphere.Shape_Sphere"));

	if (SphereAsset.Succeeded()) {
		SphereVisual->SetStaticMesh(SphereAsset.Object);
		SphereVisual->SetRelativeLocation(FVector(0.0f, 0.0f, -50.0f));
	}
	// Set up forces
	RollTorque = 15000000.0f;
	JumpImpulse = 250000.0f;
	bCanJump = true; // Start being able to jump
}

// Called when the game starts or when spawned
void APawnBall::BeginPlay()
{
	Super::BeginPlay();

	dmsg(2, "PawnBall: BeginPlay called");
}

// Called every frame
void APawnBall::Tick(float DeltaTime)
{
	Super::Tick(DeltaTime);

	// Handle movement based on our "MoveX" and "MoveY" axes
	{
		if (!CurrentVelocity.IsZero())
		{
			FVector NewLocation = GetActorLocation() + (CurrentVelocity * DeltaTime);

			SetActorLocation(NewLocation);
		}
	}

	dmsgc(4, "Time between frames %f", DeltaTime);

	/*if (bHasRaceStarted == true) {
		timer = timer + DeltaTime;
	}
	*/
}

// Called to bind functionality to input
void APawnBall::SetupPlayerInputComponent(UInputComponent* PlayerInputComponent)
{
	Super::SetupPlayerInputComponent(PlayerInputComponent);

	// Respond when our "Float" key is pressed or released.
	InputComponent->BindAction("Float", IE_Pressed, this, &APawnBall::StartFloating);
	InputComponent->BindAction("Float", IE_Released, this, &APawnBall::StopFloating);

	// Respond every frame to the values of our two movement axes, "MoveX" and "MoveY".
	InputComponent->BindAxis("MoveRight", this, &APawnBall::Move_XAxis);
	InputComponent->BindAxis("MoveForward", this, &APawnBall::Move_YAxis);

	dmsg(3, "PawnBall: SetupPlayerInputComponent called");
}

void APawnBall::Move_XAxis(float AxisValue)
{
	// Move at 100 units per second forward or backward
	CurrentVelocity.X = FMath::Clamp(AxisValue, -1.0f, 1.0f) * Speed;
}

void APawnBall::Move_YAxis(float AxisValue)
{
	// Move at 100 units per second right or left
	CurrentVelocity.Y = FMath::Clamp(AxisValue, -1.0f, 1.0f) * Speed;
}

void APawnBall::StartFloating()
{
	SetActorLocation(GetActorLocation() + FVector(0.f, 0.f, 75.f));
	bFloating = true;
}

void APawnBall::StopFloating()
{
	SetActorLocation(GetActorLocation() + FVector(0.f, 0.f, -75.f));
	bFloating = false;
}
