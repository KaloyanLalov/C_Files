#pragma once

#include <string>

using namespace std;

class std_monster
{
public:
	std_monster(string new_name);
	~std_monster();

	int deal_dmg(int hit);
	int receive_dmg();
	int getHp();
	string getName();
	string getStatus();

	string levelUp();

protected:
	int hp;
	int damage;

	string name;

private:

	int status; // 1 alive, 0 dead
};
