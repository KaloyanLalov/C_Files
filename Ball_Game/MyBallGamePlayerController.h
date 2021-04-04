// Fill out your copyright notice in the Description page of Project Settings.

#pragma once




#include "CoreMinimal.h"
#include "GameFramework/PlayerController.h"
#include "MyBallGamePlayerController.generated.h"




UCLASS()
class MYBALLGAME_API AMyBallGamePlayerController : public APlayerController
{
	GENERATED_BODY()
public:
	virtual void BeginPlay() override;

};


// Copyright 1998-2016 Epic Games, Inc. All Rights Reserved.

