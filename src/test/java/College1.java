public class College1 {

    public static String Collage_Name = "A1 Collage";


    private String Department = "Computer Engineering";
    private String name;
    private double percentile;
    public static void main(String[] args) {

        College1 student1 = new College1("Robert");
        student1.setPercentage(67.32);
        student1.print_details();

        College1 student2 = new College1("Alex");
        student2.setPercentage(72.95);
        student2.print_details();
    }
    public College1(String student_name){//Constructor

        name = student_name;
    }
    public void setPercentage(double perc){

        percentile = perc;
    }

    public void print_details(){
        int Year = 2014;
        System.out.println("Resultg Of Year = "+Year);
        System.out.println("Student's Collage Name = "+Collage_Name);
        System.out.println("Student's Department = "+Department);
        System.out.println("Student's Name = "+name);
        System.out.println("Student's percentile = "+percentile+"%");
        System.out.println("**********************");
    }

}

