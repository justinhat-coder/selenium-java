import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class PartOneBasic {
    //Number 1
    public static class datatypes {

        public static void main(String[] args) {
            int i = 4523;   //Can store 32 bit integer values only.
            long l = 652345;  //Can store 64 bit integer values only.
            double d1 = 56.2354;         //Can store 64 bit decimal values.
            double d2 = 12456;  //We can use it for integer values too.
            char c = 'd';   //Can store single character only.
            boolean t = true;  //Can store only boolean values like true or false.
            String str = "Hello World";  //Can store any string values.

            System.out.println("Integer Var Is --> "+i);
            System.out.println("Long Var Is --> "+l);
            System.out.println("double Var d1 Is --> "+d1);
            System.out.println("double Var d2 Is --> "+d2);
            System.out.println("char Var c Is --> "+c);
            System.out.println("boolean Var b Is --> "+t);
            System.out.println("boolean Var str Is --> "+str);
        }
    }
    //Output
    //Integer Var org.hamcrest.core.Is --> 4523
    //Long Var Is --> 652345
    //double Var d1 Is --> 56.2354
    //double Var d2 Is --> 12456.0
    //char Var c Is --> d
    //boolean Var b Is --> true
    //String Var str Is --> Hello World

    //Number 2
    public static class Strng_Example {

        public static void main(String[] args) {

            String st1 = "This World is Very Nice";
            String st2 = " And Beautiful.";

            //Comparing two strings. Return true If both match else return false.
            System.out.println("st1 equals to st2? -> "+st1.equals(st2));

            //Concatenates st2 with st1.
            System.out.println("Concatenation of st1 and st2 Is -> "+st1.concat(st2));

            //Retrieve the 9th Indexed character from string.
            System.out.println("Character at Index 9 Is -> "+st1.charAt(9));

            //Find the length of string.
            System.out.println("Length Of St1 -> "+st1.length());

            //Converting whole string In lower case.
            System.out.println("String In Lowercase -> "+st1.toLowerCase());

            //Converting whole string In upper case.
            System.out.println("String In uppercase -> "+st1.toUpperCase());

            //Retrieve the Index of first 'i' character.
            System.out.println("Index of 1st charater i Is -> "+st1.indexOf('i'));

            //Retrieve the index of 2nd most 'i' character.
            System.out.println("Index of 2nd charater i Is -> "+st1.indexOf('i', 3));

            //Retrieve the Index of word 'Very' from string.
            System.out.println("Index of word Very Is -> "+st1.indexOf("Very"));

            //Converting value From int to string.
            int j = 75;
            String val2 = String.valueOf(j);
            System.out.println("Value Of string val2 Is -> "+val2);

            //Converting string to integer.
            String val1="50";
            int i = Integer.parseInt(val1);
            System.out.println("Value Of int i Is -> "+i);

            //Print the String starting from 5th Index to 12th Index.
            System.out.println("Retrieving sub string from string -> "+st1.substring(5, 13));

            //Split string.
            String splt[] = st1.split("Very");
            System.out.println("String Part 1 Is -> "+splt[0]);
            System.out.println("String Part 2 Is -> "+splt[1]);

            //Trim String.
            System.out.println("Trimmed st2 -> "+st2.trim());
        }
        //Output
        //String In uppercase -> THIS WORLD IS VERY NICE
        //Index of 1st charater i Is -> 2
        //Index of 2nd charater i Is -> 11
        //Index of word Very org.hamcrest.core.Is -> 14
        //Value Of string val2 Is -> 75
        //Value Of int i Is -> 50
        //Retrieving sub string from string -> World is
        //String Part 1 Is -> This World is
        //String Part 2 Is ->  Nice
        //Trimmed st2 -> And Beautiful.

        //Number 3
        public static class IfStatements {

            public static void main(String[] args) {

                int i = 25;
                int j = 50;
                int k = 24;
                //Simple If statement
                System.out.println("***Simple If Statement Example***");
                if (i<j) //Bellow given message will be printed only if value of variable i is less than value of variable j.
                    System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")." );

                //If Else Statement
                System.out.println("");
                System.out.println("***If Else Statement Example***");
                if (i>=j)//Bellow given message will be printed if value of variable i is greater than or equals to value of variable j.
                {
                    System.out.println("Value Of i("+i+") Is Greater Than Or Equals To Value Of j("+j+")." );
                }else//Bellow given message will be printed if value of variable i is less than value of variable j.
                {
                    System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")." );
                }

                //Nested If Else Statement
                System.out.println("");
                System.out.println("***Nested If Else Statement Part***");
                if (k<i)//Bellow given message will be printed if value of variable k is less than value of variable i.
                {
                    System.out.println("Value Of k("+k+") Is Less Than Value Of i("+i+")" );
                }else if (k>=i && k<=j)//Bellow given message will be printed if value of variable k is greater than or equals to value of variable i and less than or equals to value of variable j.
                {
                    System.out.println("Value Of k("+k+") Is In Between Value Of i("+i+") And Value Of Value Of j("+j+")" );
                }else //Bellow given message will be printed if value of variable k is greater than value of variable j.
                {
                    System.out.println("Value Of k("+k+") Is Greater Than Value Of j("+j+")" );
                }
            }
        }
        //Output
        //***Simple If Statement Example***
        //Value Of i(25) Is Smaller Than Value Of j(50).
        //***If Else Statement Example***
        //Value Of i(25) Is Smaller Than Value Of j(50).
        //***Nested If Else Statement Part***
        //Value Of k(24) Is Less Than Value Of i(25)

        //Number 4
        public static class forloop {

            public static void main(String[] args) {
                for(int i=0; i<=3; i++){ //This loop will be executed 4 times
                    System.out.println("Value Of Variable i is " +i);
                }

                System.out.println("");
                int i=0;
                int k = 200;
                for(int j=3; j>=i; j--){ //This loop will be executed 4 times
                    System.out.println("Value Of Variable j is " +j);
                    k = k-10;
                }
                System.out.println("");
                System.out.println("Value Of Variable k is " +k);

            }

        }
        //Output
        //Value Of Variable i is 0
        //Value Of Variable i is 1
        //Value Of Variable i is 2
        //Value Of Variable i is 3
        //Value Of Variable j is 3
        //Value Of Variable j is 2
        //Value Of Variable j is 1
        //Value Of Variable j is 0
        //Value Of Variable k is 160

        //Number 5
        public static class Whileloop {

            public static void main(String[] args) {

                //while loop - will be executed till condition returns true.
                System.out.println("***while loop example***");
                int i = 0; //Variable initialization
                while(i<=3){
                    System.out.println("Value Of Variable i Is "+i);
                    i++;//Incrementing value of i by 1.
                }

                //do while loop - will be executed minimum one time without considering condition.
                System.out.println("");
                System.out.println("***do while loop example***");
                int j=3; //Variable initialization
                do{
                    System.out.println("Value Of Variable j Is "+j);
                    j=j-1;//Decrementing value of j by 1;
                }while(j>=0);
            }
        }
        //Output
        //***while loop example***
        //Value Of Variable i Is 0
        //Value Of Variable i Is 1
        //Value Of Variable i Is 2
        //Value Of Variable i Is 3
        //      ***do while loop example***
        //Value Of Variable j Is 3
        //Value Of Variable j Is 2
        //Value Of Variable j Is 1
        //Value Of Variable j Is 0

        //Number 6
        public static class Twodimarray {

            public static void main(String[] args) {
                String str[][] = new String[3][2]; //3 rows, 2 columns
                str[0][0]="User1";
                str[1][0]="User2";
                str[2][0]="User3";
                str[0][1]="Password1";
                str[1][1]="Password2";
                str[2][1]="Password3";

                for(int i=0; i<str.length; i++){//This for loop will be total executed 3 times.
                    for(int j=0; j<str[i].length; j++){//This for loop will be executed for 2 time on every iteration.
                        System.out.println(str[i][j]);
                    }
                }
            }
        }
        //Output
        //User1
        //      Password1
        //User2
        //      Password2
        //User3
        //      Password3

        //Number 7


        //Number 9

        public static class Return_Types {

            static int c;
            static double d;
            public static void main(String[] args) {
                Mul(2,3);
                Div(7,3);
                System.out.println("Value of c Is "+c);
                System.out.println("Value of d Is "+d);
                Message();
            }
            //This method is returning integer value. It's return type is int.
            public static int Mul(int a, int b){
                c=a*b;
                return c;
            }
            //This method is returning double value. It's return type is double.
            public static double Div(double a, double b){
                d=a/b;
                return d;
            }
            //This method is returning nothing so there is used void return type.
            public static void Message(){
                System.out.println("Test Message");
            }
        }
        //Number 7
        public static void Testing_Nomod(){ //public method
            //Block of code
        }
        public int Return_Type(){ //This method has int return type.
            int i=10;
            return i;
        }public void My_Method1(){ //Non static Method
            //Block of code
        }

        public static void My_Method2(){ //Static Method
            //Block of code
        }public static void Login(String user, String Pass){ //Login is the method name.
            //Block of code
        }public static void Student_Details(int Rollno, String Name){ //Rollno and Name are input parameters preceded by their data types
            //Block of code
        }
        //Number 11
        public class vehicle {
            public void main(String[] args) {
                //Created object for vehicle class using new keyword.
                //bicycle is the reference variable of this object.
                vehicle bicycle = new vehicle("Black");

            }
            //Constructor with color parameter passed. It will retrieve value from object vehicle.
            public vehicle(String color){
                //Retrieved value will be printed.
                System.out.println("Color Of vehicle Is "+color);
            }
        }
        //public class vehicle {

            //public void main(String[] args) {
                //Create 2 objects of class. Both have different reference variables.
               // vehicle bicycle = new vehicle("black", 2, 4500, 3.7);
               // vehicle motorcycle = new vehicle("Blue", 2, 67000, 74.6);

           // }

            //public vehicle(String color, int wheels, int price, double speed){
               // System.out.println("Color = "+color+", Wheels = "+wheels+", Price = "+price+", Speed = "+speed);
           // }
        //}

        // output
        //Color = black, Wheels = 2, Price = 4500, Speed = 3.7
        //Color = Blue, Wheels = 2, Price = 67000, Speed = 74.6

        //Number 12
        public static class Collage1 {

            //Class Variables - Collage name will be same for both departments so declared as class(static) variable.
            public static String Collage_Name = "A1 Collage";

            //Instance Variables
            private String Department = "Computer Engineering";
            private String name;
            private double percentile;
            public static void main(String[] args) {//Static Method
                //Can access class variable directly If needed. i.e. Collage_Name
                Collage1 student1 = new Collage1("Robert");
                student1.setPercentage(67.32);
                student1.print_details();
                //Can access Instance variable using object reference If needed.
                //Example : student1.name = "Robert";

                Collage1 student2 = new Collage1("Alex");
                student2.setPercentage(72.95);
                student2.print_details();
            }
            public Collage1(String student_name){//Constructor
                //Can access Instance variable directly Inside constructor.
                name = student_name;
            }
            public void setPercentage(double perc){
                //Can access Instance variable directly Inside non static method.
                percentile = perc;
            }

            public void print_details(){
                int Year = 2014; //Local Variable - Can not access It outside this method.
                System.out.println("Resultg Of Year = "+Year);
                System.out.println("Student's Collage Name = "+Collage_Name);
                System.out.println("Student's Department = "+Department);
                System.out.println("Student's Name = "+name);
                System.out.println("Student's percentile = "+percentile+"%");
                System.out.println("**********************");
            }

        }
        public static class Collage2 {

            private String Department = "Mechanical Engineering";
            private String name;
            private double percentile;
            public static void main(String[] args) {
                Collage2 student1 = new Collage2("Smith");
                student1.setPercentage(57.35);
                student1.print_details();
            }
            public Collage2(String student_name){
                name = student_name;
            }

            public void setPercentage(double perc){
                percentile = perc;
            }

            public void print_details(){
                int Year = 2014;
                System.out.println("Resultg Of Year = "+Year);
                //Can access other class's class variable using that class name.
                System.out.println("Student's Collage Name = "+Collage1.Collage_Name);
                System.out.println("Student's Department = "+Department);
                System.out.println("Student's Name = "+name);
                System.out.println("Student's percentile = "+percentile+"%");
                System.out.println("**********************");
            }
        }
        //output
        //Resultg Of Year = 2014
        //Student's Collage Name = A1 Collage
        //Student's Department = Computer Engineering
        //Student's Name = Robert
        //Student's percentile = 67.32%
        //**********************
        //Resultg Of Year = 2014
        //Student's Collage Name = A1 Collage
        //Student's Department = Computer Engineering
        //Student's Name = Alex
        //Student's percentile = 72.95%
        //**********************
        //Resultg Of Year = 2014
        //Student's Collage Name = A1 Collage
        //Student's Department = Mechanical Engineering
        //Student's Name = Smith
        //Student's percentile = 57.35%
        //**********************

        //Number 13
        public static class Student {
            public static void main(String[] args) {
                //Two different objects created with value.
                Student stdn1 = new Student("Michael");
                Student stdn2 = new Student("Robert");
            }

            //Constructor with parameter to pass values of object
            //Name of constructor Is same as class name.
            public Student(String name){
                String stdnname = name;
                System.out.println("Student's Name Is "+stdnname);
            }

        }
        //outpit
        //Student's Name Is Michael
        //Student's Name Is Robert

       //   public class Student {
        //            String finame;//Instance variable
        //            String miname;//Instance Variable
        //            public static void main(String[] args) {
        //                Student stdn1 = new Student("Jim");
        //                Student stdn2 = new Student("Mary", "Elizabeth");
        //            }
        //
        //            //Constructor with one argument.
        //            public Student(String fname){
        //                finame = fname;//Local Variable
        //                System.out.println("1. First Name Is "+finame);
        //            }
        //
        //            //Overloaded Constructor with two arguments.
        //            public Student(String fname, String mname){
        //                finame = fname;
        //                miname = mname;
        //                System.out.println("2. First Name Is "+finame);
        //                System.out.println("2. Middle Name Is "+miname);
        //            }
        //        }
        //1. First Name Is Jim
        //2. First Name Is Mary
        //2. Middle Name Is Elizabeth
       // public class Student {
        //            String finame;
        //            String miname;
        //            public static void main(String[] args) {
        //                Student stdn2 = new Student("Mary", "Elizabeth");
        //            }
        //
        //            //Constructor with one argument.
        //            public Student(String fname){
        //                finame = fname;
        //                System.out.println("1. First Name Is "+finame);
        //            }
        //
        //            //Overloaded Constructor with two arguments.
        //            public Student(String fname, String mname){
        //                this("Jim"); //1st constructor Is called using this keyword.
        //                finame = fname;
        //                miname = mname;
        //                System.out.println("2. First Name Is "+finame);
        //                System.out.println("2. Middle Name Is "+miname);
        //            }
        //        }
        //Number 15
        //Import ArrayList class header file


        public static class ArrayList_Example {

            public static void main(String[] args) {
                //Create object of ArrayList class. It will store only string values.
                ArrayList<String> Sample = new ArrayList<String>();
                //Now you can store any number of values In this arraylist as bellow. Size constrain will comes never.
                Sample.add("button1"); //Putting an Item In arraylist at Index = 0.
                Sample.add("button2"); //Putting an Item In arraylist at Index = 1.
                Sample.add("button3"); //Putting an Item In arraylist at Index = 2.
                Sample.add("button4"); //Putting an Item In arraylist at Index = 3.

                for(int i=0; i<Sample.size();i++){//loop will execute till size of arraylist.
                    System.out.println(Sample.get(i)); //print arraylist values one by one.
                }

                System.out.println("*************************");
                //To get the Index of an Item from arraylist.
                int ItemIndex = Sample.indexOf("button3");
                System.out.println("Index Of button3 Item = "+ItemIndex);
                System.out.println("*************************");

                Sample.remove(1);//To remove an Item from arraylist.
                for(int i=0; i<Sample.size();i++){
                    System.out.println(Sample.get(i));
                }
                System.out.println("*************************");

                Sample.set(2, "Button8");//To reset value of an arraylist item.
                for(int i=0; i<Sample.size();i++){
                    System.out.println(Sample.get(i));
                }
            }
        }
        //Number 17
        //Import Hashtable header file.


        public static class Hash {
            public static void main(String[] args) {
                //Created hashtable class object to use Its different properties.
                Hashtable<String, Integer> t1 = new Hashtable<String, Integer>();
                t1.put("Legs", 4); //Store value 4 In key = Legs
                t1.put("Eyes",2); //Store value 2 In key = Eyes
                t1.put("Mouth",1); //Store value 1 In key = Mouth

                //Accessing hash table values using keys.
                System.out.println("Animal Legs = " +t1.get("Legs"));
                System.out.println("Animal Eyes = " +t1.get("Eyes"));
                System.out.println("Animal Mouth = " +t1.get("Mouth"));
            }
        }
        //Number 18

        public static class RW_File {

            public static void main(String[] args) throws IOException {
                //Create File In D: Driver.
                String TestFile = "D:\\temp.txt";
                File FC = new File(TestFile);//Created object of java File class.
                FC.createNewFile();//Create file.

                //Writing In to file.
                //Create Object of java FileWriter and BufferedWriter class.
                FileWriter FW = new FileWriter(TestFile);
                BufferedWriter BW = new BufferedWriter(FW);
                BW.write("This Is First Line."); //Writing In To File.
                BW.newLine();//To write next string on new line.
                BW.write("This Is Second Line."); //Writing In To File.
                BW.close();

                //Reading from file.
                //Create Object of java FileReader and BufferedReader class.
                FileReader FR = new FileReader(TestFile);
                BufferedReader BR = new BufferedReader(FR);
                String Content = "";

                //Loop to read all lines one by one from file and print It.
                while((Content = BR.readLine())!= null){
                    System.out.println(Content);
                }
            }
        }
        //Numher 19
        public static class Handle_exce {

            public static void main(String[] args) {
                int a[] = {3,1,6};
                try { //If any exception arise Inside this try block, Control will goes to catch block.
                    System.out.println("Before Exception");
                    //unchecked exception
                    System.out.println(a[9]);//Exception will arise here because we have only 3 values In array.
                    System.out.println("After Exception");
                }catch(Exception e){
                    System.out.println("Exception Is "+e);
                }
                System.out.println("Outside The try catch.");
            }
        }
        //public static class Handle_exce {
        //
        //            public static void main(String[] args) {
        //                catchexc();
        //            }
        //            private static void catchexc() {
        //                try {
        //                    //throwexc() Method called.
        //                    throwexc();
        //                } catch (ArrayIndexOutOfBoundsException e) {
        //                    System.out.println("Array Index out of bound exception.");
        //                }
        //            }
        //
        //            private static void throwexc() {
        //                //This statement will throw ArrayIndexOutOfBoundsException exception.
        //                throw new ArrayIndexOutOfBoundsException();
        //            }
        //        }
        //public class Handle_exce {
        //
        // public static void main(String[] args) {
        //  try{
        //   int i=5/0; //Exception will be thrown.
        //   System.out.println("Value Of i Is "+i);//This statement will be not executed.
        //  }catch (Exception e)//Exception will be caught.
        //  {
        //   System.out.println("Inside catch."+e);//print the exception.
        //  }finally//finally block will be executed.
        //  {
        //   System.out.println("Inside finally. Please take appropriate action");
        //  }
        //
        //  try{
        //   int j=5/2; //Exception will be not thrown.
        //   System.out.println("Value Of j Is "+j);//This statement will be executed.
        //  }catch (Exception e)//No exception so catch block code will not execute.
        //  {
        //   System.out.println("Inside catch."+e);
        //  }finally//finally block code will be executed.
        //  {
        //   System.out.println("Inside finally. Please take appropriate action");
        //  }
        // }
        //}
        //What is encapsulation in java

        public static class Encaps {

            private String name;
            private int rollNo;

            //Data setter method
            public void setName(String newName) {
                name = newName;
            }

            //Data setter method
            public void setrollNo(int newrollNo) {
                rollNo = newrollNo;
            }

            //Data getter method
            public String getName() {
                return name;
            }

            //Data getter method
            public int getrollNo() {
                return rollNo;
            }
        }
        public static class exeEncaps {

            public static void main(String[] args) {
                //Created object of Encaps class to set and get data.
                Encaps encaps = new Encaps();

                //Set data using setter methods of Encaps class.
                encaps.setName("Monika");
                encaps.setrollNo(56);

                //Get data using getter methods of Encaps class.
                System.out.println("RollNo : "+encaps.getrollNo()+", Name : "+encaps.getName());
            }
        }
    }
}
