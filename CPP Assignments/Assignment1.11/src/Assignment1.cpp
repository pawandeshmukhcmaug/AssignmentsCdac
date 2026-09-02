#include <iostream>
using namespace std;
int main(){
	int status_code;
	double temp, fahren;
	cout<<"enter the temperature : ";
	cin>>temp;
	fahren = temp*(9/5)+32;
	cout << "Temprature  : "<<temp<<" / "<<fahren<<endl;
	if(temp >= 60 ){
		status_code = 3;
	}
	else if(temp <= 59 && temp >=45){
		status_code = 2;
	}
	else if(temp <= 44 && temp >= 30){
		status_code = 1;
	}
	else if(temp <= 29 && temp >= 0){
		status_code = 0;
	}
	else if(temp < 0){
		status_code = -1;
	}

	switch(status_code){
	case -1 :
	{
	   cout<<"Status Label : Sensor Error"<<endl;
	   cout<<"Action       : Sensor fault -- checking wiring"<<endl;
	   }
	break;
	case 0 : {
		 cout<<"Status Label : Normal"<<endl;
		 cout<<"Action       : No action required"<<endl;
	}
	break;
	case 1 : {
			 cout<<"Status Label : Warning"<<endl;
			 cout<<"Action       : Alert sent to supervisor"<<endl;
		}
	break;
	case 2 : {
			 cout<<"Status Label : CRITICAL"<<endl;
			 cout<<"Action       : Cooling system triggered"<<endl;
		}
	break;
	case 3 : {
			 cout<<"Status Label : SHUTDOWN "<<endl;
			 cout<<"Action       :Emergency shutdown initiated"<<endl;
		}
	break;
  }
  cout<< ( temp>25 ? "Above Average" : "Below Average");
}
