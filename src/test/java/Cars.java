public class Cars{

    public static class Carz{

        public static void main(String[] args) {
            //Audi
            int speed = 150;
            int seat = 3;
            int wheel = 4;
            Audi A = new Audi();
            System.out.println("Color Of Audi = Blue ");
            System.out.println("Fuel Of Audi = Gasoline");
            System.out.println("Wheels Of Audi = "+wheel);
            System.out.println("Speed Of Audi = "+speed);
            System.out.println("Car Seats = "+seat);
            //Breaker in between
            System.out.println("******************************************");
            //Toyota car
            int speeds=140;
            int seats = 4;
            int wheels =4;
            Toyota B = new Toyota();
            System.out.println("Color Of Toyota = Red ");
            System.out.println("Fuel Of Toyota = Hydrogen");
            System.out.println("Wheels Of Toyota = " + wheels);
            System.out.println("Speed Of Toyota = " + speeds);
            System.out.println("Car Seats = "+seats);
        }
    }
    public static class Toyota extends Car2 {

        public static void main(String[] args) {
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
}