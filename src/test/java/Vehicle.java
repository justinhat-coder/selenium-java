//public class Vehicle {
// public static void main(String[] args) {
//
//  Vehicle bicycle = new Vehicle("Black");
//
// }
//
// public Vehicle(String color){
//
//  System.out.println("Color Of vehicle Is "+color);
// }
//}

public class Vehicle {

 public static void main(String[] args) {

  Vehicle bicycle = new Vehicle("black", 2, 4500, 3.7);
  Vehicle motorcycle = new Vehicle("Blue", 2, 67000, 74.6);

 }

 public Vehicle(String color, int wheels, int price, double speed){
  System.out.println("Color = "+color+", Wheels = "+wheels+", Price = "+price+", Speed = "+speed);
 }
}