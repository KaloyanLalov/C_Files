#include <iostream>
#include <string>


using namespace std;

int main()
{
	string playerName = "";


	int currentRoom = 1;


	bool gameFinished = false;


	bool room3lightOn = false;


	string cmdVerb = "";
	string cmdObj = "";

	cout << "-<[------------]>-"<< endl;
	cout << "   Bundle Chest" << endl;
	cout << "-<[------------]>-"<< endl;
	cout << endl;
	cout << "Welcome to BUNDLE CHEST! Can you find the magic chest and solve the riddle to acquire the gold inside?" << endl;
	cout << "(You can quit the game anytime by entering 'quit game'" << endl;
	cout << endl;
	cout << "What is your name? Enter name without whitespace." << endl;
	cout << endl;

	cin >> playerName;

	cout << endl;
	cout << "Hello " << playerName << "!" << endl;
	cout << "Like every day, you wake up to your normal, dreary life." << endl;
	cout << "\"No more!\", you shout. \"I, " << playerName << ", will find the magic bundle chest and live a wealthy life to the rest of my days" << endl;
	cout << endl;


	while (cmdVerb != "quit" && cmdVerb != "exit" && !gameFinished) {


		if (currentRoom == 1) {

			cout << "You are in the first room. An exit leads south. There is a lever here." << endl;
			cout << "What do you want to do ?" << endl;
			cout << "Options: 'go south' or 'pull lever'" << endl;
			cout << endl;


			cin >> cmdVerb >> cmdObj;

			cout << "Command: " << cmdVerb << " " << cmdObj << endl;


			if (cmdVerb == "go" && cmdObj == "south") {
				currentRoom = 2;
			}
		
			else if (cmdVerb == "pull" && cmdObj == "lever") {
				cout << "The lever creaks loudly as you pull it." << endl;
				cout << "Simultaneously, you scream as you fall through the trapdoor opening under your feet." << endl;
				cout << "You fall through the trapdoor." << endl;
				currentRoom = 5;
			}
			
		
			else {
				cout << "You can't \"" << cmdVerb << " " << cmdObj << "\"" << endl;
			}
		}

		else if (currentRoom == 2) {
			cout << "You are in the second room. You see a tunnel on your right. The other way is facing north" << endl;
			cout << "What do you want to do?\n Options: 'follow tunnel' or 'go north'" << endl;
			cin >> cmdVerb >> cmdObj;
			cout << "Command: " << cmdVerb << " " << cmdObj << endl;

			if (cmdVerb == "go" && cmdObj == "north") {
				currentRoom = 1;
			}
			if (cmdVerb == "follow" && cmdObj == "tunnel") {


				currentRoom = 6;
			}
		}
		
		
		else if (currentRoom == 5) {
			if (!room3lightOn) {
				cout << "You are in a dark room. You can feel some dry wood under your feet. There is a torch in the wall.\n Options: 'light torch'" << endl;
			}
			else if (room3lightOn = true) {
				cout << "You are at the bottom of a pit. A ladder leads up. A chest sits in a corner." << endl;
				cout << "Options: 'climb ladder' or 'open chest'" << endl;
			}

			cin >> cmdVerb >> cmdObj;

			cout << "Command: " << cmdVerb << " " << cmdObj << endl;

			if (cmdVerb == "climb" && cmdObj == "ladder") {
				cout << "You climb the ladder leading up and emerge through a hidden crevice in the floor." << endl;
				cout << "The crevice is so well hidden, you can't find it anymore after looking away for a moment." << endl;
				currentRoom = 1;
			}
			if (cmdVerb == "light" && cmdObj == "torch") {
				if (!room3lightOn) {
					cout << "As you light the torch, you can see the room around you." << endl;
					room3lightOn = true;
				}
				else if (room3lightOn = true) {
					cout << "The torch is already lit!" << endl;
				}

			}
			if (cmdVerb == "open" && cmdObj == "chest") {
				currentRoom = 7;
			}
			
		}
		else if (currentRoom == 6) {
			cout << "You chose to follow the tunnel. In the end of the tunnel, you see a guard protecting the chest of Sargeras. Do you choose to fight the guard or flee \n Options 'fight guard' or 'flee guard'?" << endl;
			cin >> cmdVerb >> cmdObj;

			cout << "Command: " << cmdVerb << " " << cmdObj << endl;

			if (cmdVerb == "fight" && cmdObj == "guard") {
				cout << "You have successfully fought off the guard and entered the room where the treasure of Sargeras is held. \n Options: 'open chest'" << endl;
				currentRoom = 7;
			}
			else if (cmdVerb == "flee" && cmdObj == "guard") {
				cout << "You have attepmted to flee. A spear pierced through your chest and you fall on the ground. You died.";
				gameFinished = true;
			}	
			} 
		else if (currentRoom == 7) {
				cout << endl;
				cout << "In order to open the magic chest, you need to say the magic word, which is an answer to a riddle."<< endl;
				cout << "The riddle is : 'A prisoner is forced to go into one of three rooms" << endl;
				cout << "The first room is ablaze with fire." << endl;
				cout << "The second room is rigged with explosives that will go off as soon as he enters." << endl;
				cout << "The third room contains a pair of lions who haven't eaten in years."<<endl;
				cout << "Which room should he choose to survive"<< endl;
				cout << endl;
				cout << "Options: 'first room';'second room';'third room'"<< endl;
				currentRoom = 8;
			
		}
		else if (currentRoom == 8) {
		cin >> cmdVerb >> cmdObj;
		cout << "Command: " << cmdVerb << " " << cmdObj << endl;
			if (cmdVerb == "third" && cmdObj == "room") {
				cout << "You have successfully answered the riddle and right before your eyes the treasure of Sargeras opens up full of gold." << endl;
				cout <<	"You won the game." << endl;
				gameFinished = true;
			}
			else {
				cout << "The answer you gave was wrong, making the chest cast itself a magic binding making it unlockable. You lost the game." << endl;
				gameFinished = true;
			}
		}
		}
	return 0;
}