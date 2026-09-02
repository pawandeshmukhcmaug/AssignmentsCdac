
#include <iostream>
using namespace std;

int main() {
	int N;
	int i=0;
	double temperature[100];

	cout<<"enter the number of readings : ";
    cin>>N;

    cout<<"enter readings : ";
     while(i<N){
    	 cin>>temperature[i];
    	 i++;
     }
     cout << "Entered Reading : " << N << endl;
     int errors = 0;
     cout<<"valid readings : ";
     for(i=0; i<N; i++){
    	if(temperature[i]<0){
    		errors++;
    		continue;
    	}
    cout<<temperature[i]<<" ";
    }
    cout<<endl;
    cout<<"skipped (errors) : "<<errors<<endl;

    i=0;
    while(i<N){
    	if(temperature[i]>=45){
    		cout<<"Firsrt Critical   : index : "<<i<<"->"<<temperature[i]<<endl;
    		break;}
    	i++;
    }
      double min = 0;
      double max = 0;
      double sum=0;
      int count=0;

      i=0;
     while(i<N){
    	 if(temperature[i]<0){
    		 i++;
    		 continue;
    	 }
    	 if(count == 0){
    	   min = temperature[i];
    	   max = temperature[i];
    	 }
    	 else{
    		if(temperature[i]<min){
    			min = temperature[i];
    		}
    		if(temperature[i]>max){
    			max = temperature[i];
    		}
    	 }
    	 sum = sum + temperature[i];
    	 count++;
    	 i++;
     }
        double average = sum/count;
        cout<<"minimun value is : "<<min<<endl;
        cout<<"maximum value is : "<<max<<endl;
        cout<<"average value is : "<<average<<endl;


          int normal=0;
          int warning = 0;
          int critical = 0;
          int shutdown = 0;
          i=0;
      	while(i<N){
      		 if(temperature[i]<0){
      			      i++;
      		    	 continue;
      		    	 }
      		          if(temperature[i]<30){
      		    		 normal++;
      		    	 }
      		    	 else if(temperature[i]<45){
      		    		warning++;

      		    	 }
      		    	 else if(temperature[i]<60){
      		    		 critical++;
      		    	 }
      		    	 else{
      		    		 shutdown++;
      		    	 }
      		          i++;
      	}
     cout<<"normal : "<<normal<<" ";
  cout<<"warning : "<<warning<<" ";
  cout<<"critical : "<<critical<<" ";
  cout<<"shutdown : "<<shutdown<<" ";

   return 0;
}
