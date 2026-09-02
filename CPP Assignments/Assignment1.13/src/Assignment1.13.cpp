
#include <iostream>
using namespace std;

int main()
{
    double temperature[3][3];

    cout << "Enter temperatures for 9 rooms:\n";

    for (int floor = 0; floor < 3; floor++)
    {
        cout << "Floor " << floor + 1 << ":\n";
        for (int room = 0; room < 3; room++)
        {
            cout << "Room " << room + 1 << ": ";
            cin >> temperature[floor][room];
        }
    }

    cout << "\n\tRoom1\tRoom2\tRoom3\n";

    for (int floor = 0; floor < 3; floor++)
    {
        cout << "Floor " << floor + 1 << ":\t";
        for (int room = 0; room < 3; room++)
            cout << temperature[floor][room] << "\t";
        cout << endl;
    }

    double hottest = temperature[0][0];
    int hottestFloor = 0, hottestRoom = 0;
    int warningCount = 0;

    for (int floor = 0; floor < 3; floor++)
    {
        for (int room = 0; room < 3; room++)
        {
            if (temperature[floor][room] > hottest)
            {
                hottest = temperature[floor][room];
                hottestFloor = floor;
                hottestRoom = room;
            }

            if (temperature[floor][room] >= 30)
                warningCount++;
        }
    }

    double highestAverage = 0;
    int hottestFloorAverage = 0;

    for (int floor = 0; floor < 3; floor++)
    {
        double sum = 0;

        for (int room = 0; room < 3; room++)
            sum += temperature[floor][room];

        double average = sum / 3;

        if (floor == 0 || average > highestAverage)
        {
            highestAverage = average;
            hottestFloorAverage = floor;
        }
    }

    cout << "\nHottest Room : Floor " << hottestFloor + 1
         << ", Room " << hottestRoom + 1 << " -> "
         << hottest << " C\n";

    cout << "Hottest Floor : Floor " << hottestFloorAverage + 1
         << " (avg " << highestAverage << " C)\n";

    cout << "Rooms at WARNING or above : " << warningCount << endl;

    return 0;
}
