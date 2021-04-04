#pragma once
#include "CoreMinimal.h"
#include "GameFramework/Actor.h"
#include "CountdownLine.generated.h"
UCLASS()
class MYBALLGAME_API ACountdownLine : public AActor
{
	GENERATED_BODY()
		UPROPERTY(VisibleAnywhere, BlueprintReadOnly, Category = CountdownLine, meta = (AllowPrivateAccess = "true"))
		class UStaticMeshComponent* CountdownLine;
public:
	// Sets default values for this actor's properties
	ACountdownLine();

protected:
	// Called when the game starts or when spawned
	virtual void BeginPlay() override;
	UFUNCTION()
		void MyOnBeginOverlap(AActor* ThisActor, AActor* OtherActor);

	// Implementati of OnEndOverlap event
	UFUNCTION()
		void MyOnEndOverlap(AActor* ThisActor, AActor* OtherActor);
	UPROPERTY(EditAnywhere)
		FVector TeleportTarget = FVector(2913.0, -7.0, 609.0);
	class UTextRenderComponent* TextRenderComponent;
public:
	// Called every frame
	virtual void Tick(float DeltaTime) override;
	float time = 0;
	bool bHasRaceStarted = false;
};
