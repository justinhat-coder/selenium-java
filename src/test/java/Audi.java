public class Audi extends Car{
    //Audi Is child Class Of Car Class.
    public int speed=150;

    public static void main(String[] args) {
        Audi A = new Audi();
        A.printdetails();
        //Can access instance variable of parent class using object reference of child class Inside static methods.
        System.out.println("Color Of Audi = "+A.color);
        //Can access non static method of parent class using object reference of child class Inside static methods.
        System.out.println("Fuel Of Audi = "+A.getfuel());
    }

    public void printdetails(){
        //Can access class variables of parent class directly Inside child class non static methods.
        System.out.println("Wheels Of Audi = "+wheels);
        System.out.println("Speed Of Audi = "+speed);
        //Can access non static methods of parent class directly Inside child class non static methods.
        Seats();
        //Can not access private variable of parent class In child class.
        //System.out.println("Wheels Of Audi = "+type);
    }
}