public class Car2 {
    private String type="Vehicle";
    public static int wheels = 4;
    public String color = "red";
    String fuel = "Hydro";

    public String getfuel(){
        return fuel;
    }

    protected void Seats(){
        int seat = 4;
        System.out.println("Car Seats = "+seat);
    }
}