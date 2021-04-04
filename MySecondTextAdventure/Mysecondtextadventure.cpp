
#include "pch.h"
#include <iostream>
#include <string>

using namespace std;
enum directions {north,south,east,west,up,down};
struct item {
	string name, description;
};
struct exit {
	int direction;
	int connectingRoom;
};
struct room {
	int id;
	string description;
	int objects[10];
	int exits[6];

};

int main()
{
	cout << "welcome to my game!"
};
