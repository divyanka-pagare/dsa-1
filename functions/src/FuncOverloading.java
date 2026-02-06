public class FuncOverloading {
//    no of parameters are different
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
//    public static void main(String args[]) {
//        System.out.println(sum(4,6));
//
//    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String args[]) {
        System.out.println(sum(4,6));
        System.out.println(sum(3, 5, 8));
        System.out.println(sum(4.6f, 6.9f));
    }

}
