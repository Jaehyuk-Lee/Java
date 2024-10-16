package sec02_exceptionhandlingsyntax.EX05_TryWithResource_2;

class A implements AutoCloseable {
    String resource;

    A(String resource) {
        this.resource = resource;
    }

    @Override
    public void close() throws Exception {
        if (resource != null) {
            resource = null;
            System.out.println(resource + " 자원을 해제합니다.");
        }
    }
}

public class TryWithResource_2 {
    public static void main(String[] args) {
        // 1. 리소스를 사용하고 finally에서 리소스 수동 해제하기
        A a1 = null;
        try {
            a1 = new A("특정 파일");
        } catch (Exception e) {
            System.out.println("예외 처리");
        } finally {
            try {
                // 리소스 수동 해제
                if (a1 != null)
                    a1.close();
            } catch (Exception e) {
                System.out.println("예외 처리");
            }
        }

        // 2. 리소스 자동 해제
        try (A a2 = new A("특정 파일")) {

        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }
}
