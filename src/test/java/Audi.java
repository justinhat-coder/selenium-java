public class Audi extends Car{
    public int speed=150;

    public static void main(String[] args) {
        Audi A = new Audi();
        A.printdetails1();
        System.out.println("Color Of Audi = "+A.color);
        System.out.println("Fuel Of Audi = "+A.getfuel());
    }

    public void printdetails1(){

        System.out.println("Wheels Of Audi = "+wheels);
        System.out.println("Speed Of Audi = "+speed);
        Seats();


    }

}
