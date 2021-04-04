// Copyright 1998-2018 Epic Games, Inc. All Rights Reserved.

#include "MyBallGameGameMode.h"
#include "MyBallGameBall.h"

	void AMyBallGameGameMode::BeginPlay()
	{

		Super::BeginPlay();
		ChangeMenuWidget(StartingWidgetClass);
		if (AMyBallGameBall::StaticClass() != NULL)
		{
			DefaultPawnClass = AMyBallGameBall::StaticClass();
		}
	}

	void AMyBallGameGameMode::ChangeMenuWidget(TSubclassOf<UUserWidget> NewWidgetClass)
	{
		if (CurrentWidget != nullptr)
		{
			CurrentWidget->RemoveFromViewport();
			CurrentWidget = nullptr;
		}
		if (NewWidgetClass != nullptr)
		{ 
			CurrentWidget = CreateWidget<UUserWidget>(GetWorld(), NewWidgetClass);
			if (CurrentWidget != nullptr)
			{
				CurrentWidget->AddToViewport();
			}

		}
	}

