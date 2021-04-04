#include "pch.h"
#include "Sorcerer.h"

sorcerer::sorcerer(string new_name) : std_monster(new_name)
{
	hp = 40;
	damage = 10;
}


sorcerer::~sorcerer()
{
}

string sorcerer::getStatus() {
	string ret = "The sorcerer, " + name + ", frostbolts you! " + std_monster::getStatus();
	return ret;
}