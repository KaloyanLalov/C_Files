// Fill out your copyright notice in the Description page of Project Settings.
#define dmsg(index, text) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, text)
#define dmsgc(index, text, parameter) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, FString::Printf(TEXT(text), parameter))

#include "BurningGround.h"
#include "MyBallGameBall.h"


// Sets default values
ABurningGround::ABurningGround()
{
	static ConstructorHelpers::FObjectFinder<UStaticMesh> GroundMesh(TEXT("/Game/Geometry/Meshes/1M_Cube.1M_Cube"));

	BurningGround = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("Ground"));
	BurningGround->SetStaticMesh(GroundMesh.Object);
//	BurningGround->BodyInstance.SetCollisionProfileName(UCollisionProfile::PhysicsActor_ProfileName);

 	// Set this actor to call Tick() every frame.  You can turn this off to improve performance if you don't need it.
	PrimaryActorTick.bCanEverTick = true;
	OnActorBeginOverlap.AddDynamic(this, &ABurningGround::MyOnBeginOverlap);
	OnActorEndOverlap.AddDynamic(this, &ABurningGround::MyOnEndOverlap);
	RootComponent = BurningGround;

//	RootComponent = CreateDefaultSubobject<USceneComponent>(TEXT("RootComponent"));

	UBoxComponent* GroundComponent = CreateDefaultSubobject<UBoxComponent>(TEXT("GroundComponent"));
	GroundComponent->SetCollisionProfileName(TEXT("OverlapAllDynamic"));
	GroundComponent->AttachTo(RootComponent);
	GroundComponent->SetRelativeLocation(FVector(0.0f, 0.0f, 0.0f));

	GroundComponent->InitBoxExtent(FVector(50, 50, 50));
	GroundComponent->Bounds = RootComponent->Bounds;
	GroundComponent->Bounds.ExpandBy(1.1);

	//	GroundComponent->InitBoxExtent(BurningGround->GetComponentScale() + (FVector (1.2f,1,2f,1,2f));


	//GroundVisual = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("GroundMesh"));
	//GroundVisual->AttachTo(RootComponent);

	//ConstructorHelpers::FObjectFinder<UStaticMesh> GroundAsset(TEXT("/Game/StarterContent/Shapes/Shape_Cube.Shape_Cube"));

	if (GroundMesh.Succeeded()) {
		BurningGround->SetStaticMesh(GroundMesh.Object);
		BurningGround->SetRelativeLocation(FVector(0.0f, -5.0f, 0.0f));
	}


}

// Called when the game starts or when spawned
void ABurningGround::BeginPlay()
{
	Super::BeginPlay();
	
}

// Called every frame
void ABurningGround::Tick(float DeltaTime)
{
	Super::Tick(DeltaTime);

}

void ABurningGround::MyOnBeginOverlap(AActor* ThisActor, AActor* OtherActor) {
	OtherActor->SetActorLocation(TeleportTarget);
	dmsg(2, "collision");
	/*Reset Level*/
	//	UGameplayStatics::OpenLevel(GetWorld(), "RollingExampleMap");
	/*
	TArray<AActor*> FoundActors;
	UGameplayStatics::GetAllActorsOfClass(GetWorld(), AMyBallGameBall::StaticClass(), FoundActors);
	Cast<AMyBallGameBall>(FoundActors[0])->RollTorque = 0.0f;
	if (Cast<AMyBallGameBall>(FoundActors[0])->RollTorque == 0.0f) {
		Cast<AMyBallGameBall>(FoundActors[0])->RollTorque = 30000000.0f;

	}
		
	*/
}

void ABurningGround::MyOnEndOverlap(AActor* ThisActor, AActor* OtherActor) {

}

