#pragma once
#include "std_monster.h"
class Tauren :
	public std_monster
{
public:
	Tauren(string new_name);
	~Tauren();

	string getStatus();
};
