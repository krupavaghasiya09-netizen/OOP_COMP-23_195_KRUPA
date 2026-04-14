class Vehicle {
    protected String num, brand, fuel;

    Vehicle(String n,String b,String f){
        num=n; brand=b; fuel=f;
    }

    void display(){
        System.out.println(num+" "+brand+" "+fuel);
    }
}

class Car extends Vehicle{
    int seats;
    boolean ac;

    Car(String n,String b,String f,int s,boolean a){
        super(n,b,f);
        seats=s; ac=a;
    }

    void display(){
        super.display();
        System.out.println(seats+" "+ac);
    }
}

class ElectricCar extends Car{
    int battery;

    ElectricCar(String n,String b,String f,int s,boolean a,int bat){
        super(n,b,f,s,a);
        battery=bat;
    }

    void display(){
        super.display();
        System.out.println(battery);
    }

    public static void main(String[] args){
        Vehicle v=new Car("1","Honda","Petrol",5,true);
        v.display();
    }
}
