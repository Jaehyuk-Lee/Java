package exception1;

public class ExceptionTest3 {
    public static void main(String[] args) {
        // try 괄호 안에 선언된 리소스는 try 블럭이 종료될 때 자동으로 close() 메소드가 호출된다.
        try (NeMam nemam = new NeMam()) { // try with resources
            System.out.println("try 블럭 입니다.");
            if (true)
                throw new Exception("사용자 정의 예외 발생!");
            System.out.println("try 종료");
        } catch (Exception e) {
            System.out.println("catch 블럭 입니다.");
        }
        System.out.println("종료");
    }
}
