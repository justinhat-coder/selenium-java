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

        
    }
}
