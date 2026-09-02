#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

class Entity{
private:
    string name;
    int health;
    int level;
    string type;

public:
    Entity& setName(const string& name){
        this->name=name;
        return *this;
    }

    Entity& setHealth(int health){
        this->health=health;
        return *this;
    }

    Entity& setLevel(int level){
        this->level=level;
        return *this;
    }

    Entity& setType(const string& type){
        this->type=type;
        return *this;
    }

    string getName() const{
        return name;
    }

    int getHealth() const{
        return health;
    }

    int getLevel() const{
        return level;
    }

    string getType() const{
        return type;
    }

    void displayInfo() const{
        cout<<"Name : "<<name<<endl;
        cout<<"Health : "<<health<<endl;
        cout<<"Level : "<<level<<endl;
        cout<<"Type : "<<type<<endl;
    }
};

namespace Physics{
    double clamp(double val,double min,double max){
        if(val<min)
            return min;
        if(val>max)
            return max;
        return val;
    }

    double lerp(double a,double b,double t){
        return a+(b-a)*t;
    }
}

namespace GameMath{
    int clamp(int val,int min,int max){
        if(val<min)
            return min;
        if(val>max)
            return max;
        return val;
    }

    double lerp(double a,double b,double t){
        return a+(b-a)*t;
    }
}

int level=1;

namespace Engine{
    namespace Audio{
        void playSound(string name){
            cout<<"Playing: "<<name<<endl;
        }
    }
}

int main(){
    Entity player,enemy,item;

    player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");
    enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");
    item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

    cout<<"===== ENTITIES ====="<<endl;
    player.displayInfo();
    cout<<endl;
    enemy.displayInfo();
    cout<<endl;
    item.displayInfo();

    cout<<"\n===== NAMESPACES ====="<<endl;
    cout<<"Physics clamp : "<<Physics::clamp(120.5,0.0,100.0)<<endl;
    cout<<"GameMath clamp : "<<GameMath::clamp(120,0,100)<<endl;
    cout<<"Physics lerp : "<<Physics::lerp(10,20,0.5)<<endl;
    cout<<"GameMath lerp : "<<GameMath::lerp(10,20,0.5)<<endl;

    {
        using namespace Physics;
        cout<<"Limited scope clamp : "<<clamp(150.0,0.0,100.0)<<endl;
    }

    int level=10;
    cout<<"\nLocal level : "<<level<<endl;
    cout<<"Global level : "<<::level<<endl;

    Engine::Audio::playSound("sword_clash");

    int R,C;
    cout<<"\nEnter rows and columns: ";
    cin>>R>>C;

    int** map=new int*[R];

    for(int i=0;i<R;i++)
        map[i]=new int[C];

    int count[5]={0,0,0,0,0};

    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            map[i][j]=rand()%5;
            count[map[i][j]]++;
        }
    }

    cout<<"\n===== GAME MAP ("<<R<<" x "<<C<<") ====="<<endl;

    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++)
            cout<<map[i][j]<<" ";
        cout<<endl;
    }

    cout<<"Legend: 0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon"<<endl;

    cout<<"Tile Count:"<<endl;
    cout<<"Grass : "<<count[0]<<endl;
    cout<<"Water : "<<count[1]<<endl;
    cout<<"Mountain : "<<count[2]<<endl;
    cout<<"Forest : "<<count[3]<<endl;
    cout<<"Dungeon : "<<count[4]<<endl;

    for(int i=0;i<R;i++)
        delete[] map[i];

    delete[] map;

    return 0;
}
