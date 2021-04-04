// Fill out your copyright notice in the Description page of Project Settings.

#pragma once

#include "CoreMinimal.h"
#include "GameFramework/Actor.h"
#include "StartPosition.generated.h"

UCLASS()
class MYBALLGAME_API AStartPosition : public AActor
{
	GENERATED_BODY()
		UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = CountdownLine, meta = (AllowPrivateAccess = "true"))
		class UStaticMeshComponent* StartPosition;
	
public:	
	// Sets default values for this actor's properties
	AStartPosition();

protected:
	// Called when the game starts or when spawned
	virtual void BeginPlay() override;
	UPROPERTY(EditAnywhere)
		FVector TeleportTarget = FVector(2913.0, -7.0, 609.0);

public:	
	// Called every frame
	virtual void Tick(float DeltaTime) override;

};
