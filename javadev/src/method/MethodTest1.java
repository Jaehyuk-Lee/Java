package method;

public class MethodTest1 {
    public static void main(String[] args) {
        print();
        print("Java");
        int i = 10, j = 5;
        System.out.println(i + " + " + j + " = " + add(i, j));
        System.out.println(i + " - " + j + " = " + sub(i, j));
        System.out.println(i + " * " + j + " = " + mul(i, j));
        System.out.println(i + " / " + j + " = " + div(i, j) + " ... " + mod(i, j));
        System.out.println("주사위 숫자는 " + dice());
        System.out.println("End");
    }

    private static int dice() {
        int num = (int) (Math.random() * 6) + 1;
        return num;
    }

    private static void print() {
        System.out.println("---------");
        System.out.println("  SESAC  ");
        System.out.println("---------");
    }

    private static void print(String arg) {
        System.out.println("---------");
        System.out.println("  " + arg + "  ");
        System.out.println("---------");
    }

    private static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    private static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    private static int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    private static int div(int a, int b) {
        int result = a / b;
        return result;
    }

    private static int mod(int a, int b) {
        int result = a % b;
        return result;
    }
}
