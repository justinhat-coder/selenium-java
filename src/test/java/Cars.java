public class Cars{

    public static class Audi extends Car{

        public static void main(String[] args) {
            print_details();
            int speed = 150;
            int seat = 3;
            Audi A = new Audi();
            System.out.println("Color Of Audi = "+A.color);
            System.out.println("Fuel Of Audi = "+A.getfuel());
            System.out.println("Wheels Of Audi = "+wheels);
            System.out.println("Speed Of Audi = "+speed);
            System.out.println("Car Seats = "+seat);
        }
    }
    public static class Toyota extends Car2 {

        public static void main(String[] args) {
            print_details();
            int speed=140;
            int seat = 4;
            Toyota A = new Toyota();
            System.out.println("Color Of Toyota = "+A.color);
            System.out.println("Fuel Of Toyota = "+A.getfuel());
            System.out.println("Wheels Of Toyota = " + wheels);
            System.out.println("Speed Of Toyota = " + speed);
            System.out.println("Car Seats = "+seat);
        }
    }
    public static void print_details(){
        System.out.println(Toyota);
        System.out.println("**********************");
        System.out.println(Audi);
    }
}