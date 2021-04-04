#include "pch.h"
#include "Tauren.h"

Tauren::Tauren(string new_name) : std_monster(new_name)
{
	hp = 60;
	damage = 15;
}


Tauren::~Tauren()
{
}

string Tauren::getStatus() {
	string ret =std_monster::getStatus();
	return ret;
}