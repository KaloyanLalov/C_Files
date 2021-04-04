#pragma once
#include "std_monster.h"
class sorcerer :
	public std_monster
{
public:
	sorcerer(string new_name);
	~sorcerer();

	string getStatus();
};
