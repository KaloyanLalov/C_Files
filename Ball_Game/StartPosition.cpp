// Fill out your copyright notice in the Description page of Project Settings.
#define dmsg(index, text) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, text)
#define dmsgc(index, text, parameter) if (GEngine) GEngine->AddOnScreenDebugMessage(index, 5.5f, FColor::Red, FString::Printf(TEXT(text), parameter))


#include "StartPosition.h"
#include "MyBallGameBall.h"

// Sets default values
AStartPosition::AStartPosition()
{
	StartPosition = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("Start"));
 	// Set this actor to call Tick() every frame.  You can turn this off to improve performance if you don't need it.
	PrimaryActorTick.bCanEverTick = true;
	RootComponent = StartPosition;
	PrimaryActorTick.bCanEverTick = true;

	UBoxComponent* StartComponent = CreateDefaultSubobject<UBoxComponent>(TEXT("LineComponent"));
	StartComponent->SetCollisionProfileName(TEXT("OverlapAllDynamic"));
	StartComponent->AttachTo(RootComponent);
	StartComponent->SetRelativeLocation(FVector(0.0f, 0.0f, 0.0f));

	
}

// Called when the game starts or when spawned
void AStartPosition::BeginPlay()
{
	Super::BeginPlay();
	

	

}

// Called every frame
void AStartPosition::Tick(float DeltaTime)
{
	Super::Tick(DeltaTime);

}

