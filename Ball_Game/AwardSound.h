// Fill out your copyright notice in the Description page of Project Settings.

#pragma once

#include "CoreMinimal.h"
#include "GameFramework/Actor.h"
#include "AwardSound.generated.h"

UCLASS()
class MYBALLGAME_API AAwardSound : public AActor
{
	GENERATED_BODY()

		UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = AwardSound, meta = (AllowPrivateAccess = "true"))
		class UStaticMeshComponent* AwardSound;
	
public:	
	// Sets default values for this actor's properties
	AAwardSound();

protected:
	// Called when the game starts or when spawned
	virtual void BeginPlay() override;

	UFUNCTION()
		void MyOnBeginOverlap(AActor* ThisActor, AActor* OtherActor);

	UFUNCTION()
		void MyOnEndOverlap(AActor* ThisActor, AActor* OtherActor);

public:	
	// Called every frame
	virtual void Tick(float DeltaTime) override;

	USoundWave* audioWave;
	UAudioComponent* audioComponent;

};
