public class Elephant extends Animal {
    int age = 100;


    Elephant() {
        // To invoke parent class constructor Animal().
        super();
        System.out.println("Elephant is running.");

        welcome();
        // Used super.welcome() to call parent class method.
        super.welcome();
    }

    void showAge() {
        System.out.println("Average age of Elephant : " + age);
        // Used super.age to access parent class variable value.
        System.out.println("Average age of Animals : " + super.age);
    }

    void welcome() {
        System.out.println("Welcome to Elephant class.");
    }

    public static void main(String[] args) {
        Elephant c = new Elephant();
        c.showAge();
    }
}