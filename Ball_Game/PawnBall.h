// Fill out your copyright notice in the Description page of Project Settings.

#pragma once

#include "Engine.h"
#include "CoreMinimal.h"
#include "GameFramework/Pawn.h"
#include "PawnBall.generated.h"

UCLASS()
class MYBALLGAME_API APawnBall : public APawn
{
	GENERATED_BODY()
		/** StaticMesh used for the ball */
		UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = Ball, meta = (AllowPrivateAccess = "true"))
		class UStaticMeshComponent* Ball;


public:
	// Sets default values for this pawn's properties
	APawnBall();
	/** Vertical impulse to apply when pressing jump */
	UPROPERTY(EditAnywhere, Category = Ball)
		float JumpImpulse;

	/** Torque to apply when trying to roll ball */
	UPROPERTY(EditAnywhere, Category = Ball)
		float RollTorque;

	/** Indicates whether we can currently jump, use to prevent double jumping */
	bool bCanJump;


protected:
	// Called when the game starts or when spawned
	virtual void BeginPlay() override;

public:
	// Called every frame
	virtual void Tick(float DeltaTime) override;

	// Called to bind functionality to input
	virtual void SetupPlayerInputComponent(class UInputComponent* PlayerInputComponent) override;

	UPROPERTY(EditAnywhere)
		UStaticMeshComponent* SphereVisual;

	//Input functions
	void Move_XAxis(float AxisValue);
	void Move_YAxis(float AxisValue);
	void StartFloating();
	void StopFloating();

	//Input variables
	FVector CurrentVelocity;
	bool bFloating;

	UPROPERTY(EditAnywhere)
		float Speed = 200.0f;

	UPROPERTY(EditAnywhere)
		FVector cameraVector = FVector(0.0f, 500.0f, 500.0f);

	UPROPERTY(EditAnywhere)
		FRotator cameraRotator = FRotator(-45.0f, -90.0f, 0.0f);


	float time = 0;
	bool bHasRaceStarted = false;
};
