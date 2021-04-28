public class Toyota extends Car2 {
    public int speed=140;

    public static void main(String[] args) {
        Toyota A = new Toyota();
        A.printdetails2();
        System.out.println("Color Of Toyota = "+A.color);
        System.out.println("Fuel Of Toyota = "+A.getfuel());
    }

    public void printdetails2() {
        System.out.println("Wheels Of Toyota = " + wheels);
        System.out.println("Speed Of Toyota = " + speed);
        Seats();
    }
}