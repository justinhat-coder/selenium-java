public class OverloadingByArgument {

    void Sum(int i, int j) {
        System.out.println(i + j);
    }

    void Sum(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    public static void main(String args[]) {
        OverloadingByArgument ol = new OverloadingByArgument();
        ol.Sum(10, 10, 10); //It will call Sum(int i, int j, int k)
        ol.Sum(20, 20);//It will call Sum(int i, int j)
    }
}


class OverloadingByDataTypes {

    void Sum(int i, int j) {
        System.out.println(i + j);
    }

    void Sum(double i, double j) {
        System.out.println(i + j);
    }

    public static void main(String args[]) {
        OverloadingByDataTypes ol = new OverloadingByDataTypes();
        ol.Sum(10.75, 10.5); //It will call Sum(double i, double j)
        ol.Sum(20, 20);//It will call Sum(int i, int j)
    }
}
