// Fill out your copyright notice in the Description page of Project Settings.

#include "AwardSound.h"
#include "MyBallGameBall.h"

// Sets default values
AAwardSound::AAwardSound()
{
	AwardSound = CreateDefaultSubobject<UStaticMeshComponent>(TEXT("Sound"));
 	// Set this actor to call Tick() every frame.  You can turn this off to improve performance if you don't need it.
	PrimaryActorTick.bCanEverTick = true;
	OnActorBeginOverlap.AddDynamic(this, &AAwardSound::MyOnBeginOverlap);
	OnActorEndOverlap.AddDynamic(this, &AAwardSound::MyOnEndOverlap);
	RootComponent = AwardSound;

	UBoxComponent* SoundComponent = CreateDefaultSubobject<UBoxComponent>(TEXT("SoundComponent"));
	SoundComponent->SetCollisionProfileName(TEXT("OverlapAllDynamic"));
	SoundComponent->AttachTo(RootComponent);
	SoundComponent->SetRelativeLocation(FVector(0.0f, 0.0f, 0.0f));
	static ConstructorHelpers::FObjectFinder<USoundWave>jumpWave(TEXT("SoundWave'/Game/Audio/Noise_effect.Noise_effect'"));

	audioWave = jumpWave.Object;
	audioComponent = CreateDefaultSubobject<UAudioComponent>(TEXT("AudioComp"));
	audioComponent->bAutoActivate = false;
	audioComponent->AttachTo(RootComponent);
	audioComponent->SetRelativeLocation(FVector(1.0f, 0.0f, 0.0f));
}

// Called when the game starts or when spawned
void AAwardSound::BeginPlay()
{
	Super::BeginPlay();
	
}

// Called every frame
void AAwardSound::Tick(float DeltaTime)
{
	Super::Tick(DeltaTime);

}
void AAwardSound::MyOnBeginOverlap(AActor* ThisActor, AActor* OtherActor) {
	if (audioWave->IsValidLowLevelFast()) {
		audioComponent->SetSound(audioWave);
	}
	audioComponent->Play();
	
}
void AAwardSound::MyOnEndOverlap(AActor* ThisActor, AActor* OtherActor) {

}

