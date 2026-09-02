#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Product{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:
    void acceptDetails(){
        cout<<"Enter product ID: ";
        cin>>productId;

        cout<<"Enter name: ";
        cin>>name;

        cout<<"Enter price: ";
        cin>>price;

        cout<<"Enter quantity: ";
        cin>>quantity;
    }

    void displayDetails() const{
        cout<<productId<<"\t"<<name<<"\t"
            <<fixed<<setprecision(2)<<price<<"\t"
            <<quantity<<"\t"<<totalValue()<<endl;
    }

    double totalValue() const{
        return price*quantity;
    }

    bool isLowStock(int threshold) const{
        return quantity<threshold;
    }

    string getName() const{
        return name;
    }
};

double reorderCost(int qty,double unitPrice){
    return qty*unitPrice;
}

double reorderCost(double qty,double unitPrice){
    return qty*unitPrice;
}

double reorderCost(int qty,double unitPrice,double taxRate){
    double cost=qty*unitPrice;
    return cost+(cost*taxRate/100);
}

double applyDiscount(double price,double discountPercent=10.0){
    return price-(price*discountPercent/100);
}

int main(){
    Product products[5];

    for(int i=0;i<5;i++){
        cout<<"\nProduct "<<i+1<<endl;
        products[i].acceptDetails();
    }

    cout<<"\n===== INVENTORY REPORT ====="<<endl;
    cout<<"ID\tName\tPrice\tQty\tTotal Value"<<endl;

    int highestIndex=0;

    for(int i=0;i<5;i++){
        products[i].displayDetails();

        if(products[i].totalValue()>products[highestIndex].totalValue())
            highestIndex=i;
    }

    cout<<fixed<<setprecision(2);
    cout<<"\nHighest Value Product : "
        <<products[highestIndex].getName()
        <<" (Rs. "<<products[highestIndex].totalValue()<<")"<<endl;

    int threshold;
    cout<<"\nEnter low stock threshold: ";
    cin>>threshold;

    cout<<"Low Stock (threshold: "<<threshold<<") : ";

    bool found=false;

    for(int i=0;i<5;i++){
        if(products[i].isLowStock(threshold)){
            if(found)
                cout<<", ";
            cout<<products[i].getName();
            found=true;
        }
    }

    if(!found)
        cout<<"None";

    cout<<endl;

    cout<<"\n===== REORDER COST ====="<<endl;
    cout<<"Integer quantity : "<<reorderCost(10,250.0)<<endl;
    cout<<"Fractional quantity : "<<reorderCost(5.5,100.0)<<endl;
    cout<<"Quantity with tax : "<<reorderCost(10,250.0,18.0)<<endl;

    cout<<"\n===== DISCOUNT ====="<<endl;
    cout<<"Default 10% discount : "<<applyDiscount(1000)<<endl;
    cout<<"20% discount : "<<applyDiscount(1000,20.0)<<endl;

    return 0;
}
