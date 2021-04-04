// Fill out your copyright notice in the Description page of Project Settings.

#include "MyBallGamePlayerController.h"
#include "MyBallGame.h"
void AMyBallGamePlayerController::BeginPlay()
{
	Super::BeginPlay();
	SetInputMode(FInputModeGameAndUI());
}