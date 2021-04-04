// Fill out your copyright notice in the Description page of Project Settings.
#define dmsg(index, text) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, text)
#define dmsgc(index, text, parameter) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, FString::Printf(TEXT(text), parameter))
#include "CountdownLine.h"
#include "MyBallGameBall.h"
// Sets default values
ACountdownLine::ACountdownLine()
{
	//static ConstructorHelpers::FObjectFinder<UStaticMesh> LineMesh(TEXT("/Game/Geometry/Meshes/1M_Cube.1M_Cube"));	
	CountdownLine = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("Line"));
	//CountdownLine->SetStaticMesh(LineMesh.Object);
	//	BurningGround->BodyInstance.SetCollisionProfileName(UCollisionProfile::PhysicsActor_ProfileName);
		// Set this actor to call Tick() every frame.  You can turn this off to improve performance if you don't need it.
	PrimaryActorTick.bCanEverTick = true;
	OnActorBeginOverlap.AddDynamic(this, &ACountdownLine::MyOnBeginOverlap);
	OnActorEndOverlap.AddDynamic(this, &ACountdownLine::MyOnEndOverlap);
	RootComponent = CountdownLine;
	//	RootComponent = CreateDefaultSubobject<USceneComponent>(TEXT("RootComponent"));

	UBoxComponent* LineComponent = CreateDefaultSubobject<UBoxComponent>(TEXT("LineComponent"));
	LineComponent->SetCollisionProfileName(TEXT("OverlapAllDynamic"));
	LineComponent->AttachTo(RootComponent);
	LineComponent->SetRelativeLocation(FVector(0.0f, 0.0f, 0.0f));

	LineComponent->InitBoxExtent(FVector(50, 50, 50));
	LineComponent->Bounds = RootComponent->Bounds;
	LineComponent->Bounds.ExpandBy(1.5);

	/*if (LineMesh.Succeeded()) {
		CountdownLine->SetStaticMesh(LineMesh.Object);
		CountdownLine->SetRelativeLocation(FVector(0.0f, -5.0f, 0.0f));
	}*/

}

// Called when the game starts or when spawned
void ACountdownLine::BeginPlay()
{
	Super::BeginPlay();

}

// Called every frame
void ACountdownLine::MyOnBeginOverlap(AActor* ThisActor, AActor* OtherActor) {

	if (bHasRaceStarted == true) {
		dmsg(11, "bHas is true");
		bHasRaceStarted = false;
	}
	else if (bHasRaceStarted == false) {
		bHasRaceStarted = true;
		dmsg(12, "BhasStarted was false now true");
	}
}
void ACountdownLine::MyOnEndOverlap(AActor* ThisActor, AActor* OtherActor) {
	
	ThisActor->SetActorLocation(TeleportTarget);
	dmsg(13, "Actor teleported");

}
void ACountdownLine::Tick(float DeltaTime) {
	Super::Tick(DeltaTime);

	if (bHasRaceStarted == true) {
		time = time + DeltaTime;

	}

	dmsgc(1, "Time elapsed: %f", time);

}


