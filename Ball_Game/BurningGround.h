// Fill out your copyright notice in the Description page of Project Settings.
#pragma once

#include "CoreMinimal.h"
#include "GameFramework/Actor.h"
#include "BurningGround.generated.h"

UCLASS()
class MYBALLGAME_API ABurningGround : public AActor
{
	GENERATED_BODY()
		UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = BurningGround, meta = (AllowPrivateAccess = "true"))
		class UStaticMeshComponent* BurningGround;
public:
	// Sets default values for this actor's properties
	ABurningGround();

protected:
	virtual void BeginPlay() override;
	UFUNCTION()
		void MyOnBeginOverlap(AActor* ThisActor, AActor* OtherActor);

	// Implementati of OnEndOverlap event
	UFUNCTION()
		void MyOnEndOverlap(AActor* ThisActor, AActor* OtherActor);

	UPROPERTY(EditAnywhere)
		FVector TeleportTarget = FVector(2913.0, -7.0, 609.0);

	//class UTextRenderComponent* TextRenderComponent;


public:
	// Called every frame
	virtual void Tick(float DeltaTime) override;




};



