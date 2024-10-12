package exception1;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            int makeZero = 10 / 0;
            System.out.println("makeZero: " + makeZero);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다...");
        }

        InputStreamReader isr = new InputStreamReader(System.in);
        try {
            System.out.print("경로를 입력하세요: ");
            isr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class cls = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("잘못된 클래스입니다...");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("종료");
    }
}
