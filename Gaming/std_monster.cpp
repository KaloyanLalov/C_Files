#include "pch.h"
#include "std_monster.h"

using namespace std;

std_monster::std_monster(string new_name)
{
	name = new_name;

	status = 1;

	hp = 0;
	damage = 0;
	
}

std_monster::~std_monster()
{
}

int std_monster::deal_dmg(int hit)
{
	hp -= hit;

	return hp;
}

int std_monster::receive_dmg()
{
	return damage;
}

int std_monster::getHp()
{
	return hp;
}
string std_monster::getName()
{
	return name;
}

string std_monster::getStatus()
{
	string ret = name + "'s current health is: |" + to_string(hp) + "|\n";
	
	return ret;
}


		
