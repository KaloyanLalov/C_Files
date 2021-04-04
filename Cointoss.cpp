#include <string>
#include <iostream>
#include <time.h>
using namespace std;

enum cointoss {heads = 1 ,tails = 2};
cointoss result;





int main()
{
	srand(time(NULL));
	for (int c = 0; c < 10; c++) {
		int i = rand() % 2;
		if (i) {
			result = heads;
		}
		else {
			result = tails;
		}

		if (result == heads) {
		cout << "The answer was heads" << endl;
	}
	else if (result == tails) {
		cout << "The answer was tails" << endl;
	}

}
		
		



	
	return 0;
}
