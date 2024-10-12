package sec05_innerinterface.EX02_ButtonAPIExample;

abstract class ABS_Button {
    abstract void onClick();
}

class Button {
    OnClickListener ocl;

    void setOnClickListener(OnClickListener ocl) {
        this.ocl = ocl;
    }

    interface OnClickListener {
        void onClick();
    }

    void onClick() {
        ocl.onClick();
    }
}

public class ButtonAPIExample {
    public static void main(String[] args) {
        // 개발자 1. 클릭하면 음악 재생
        Button btn1 = new Button();
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자 1: 음악 재생");
            }
        });
        btn1.onClick();

        // 개발자 2. 클릭하면 네이버 접속
        Button btn2 = new Button();
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자 2: 네이버 접속");
            }
        });
        btn2.onClick();

        // Abstract 클래스로 만들어봄
        // 근데 이렇게 만들면 onClick 메서드를 반드시 구현해야함
        // 그래서 코드가 짧아도 딱히 좋은거 같진 않음
        // 개발자 3. ABS 클릭하면 음악 재생
        ABS_Button btn3 = new ABS_Button() {
            void onClick() {
                System.out.println("개발자 3: ABS 음악 재생");
            }
        };
        btn3.onClick();
    }
}