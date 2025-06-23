class Plane{
    void show(){
        System.out.println("Plane");
    }
    void display(){

        System.out.println("display");
    }
}

class PassengerPlane extends Plane{
    void show(){
        System.out.println("Passenger Plane");
    }

    
}   


class Airport{
    static void prmit(Plane p){
        p.display();
        p.show();
    }
}
public class poly {
    public static void main(String[] args) {
        Plane p = new PassengerPlane();
       //PassengerPlane pp = new PassengerPlane();
       //p.show();
        //((PassengerPlane)(p)).display();
        Airport.prmit(p);
    }
}