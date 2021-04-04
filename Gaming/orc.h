#pragma once
#include "std_monster.h"
class orc :
	public std_monster
{
public:
	orc(string new_name);
	~orc();

	string getStatus();
};
