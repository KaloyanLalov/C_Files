#include "pch.h"
#include "orc.h"

orc::orc(string new_name) : std_monster(new_name)
{
	hp = 40;
	damage = 10;
}


orc::~orc()
{
}

string orc::getStatus() {
	string ret = std_monster::getStatus();
	return ret;
}