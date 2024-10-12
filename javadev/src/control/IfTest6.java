package control;

import java.util.Scanner;

public class IfTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력: ");
		int rsp_u = sc.nextInt();
		int rsp_c = (int)(Math.random()*3) + 1;
		
		if (rsp_u == rsp_c)
			System.out.println("무승부 입니다.");
		else if (rsp_u + 1 == rsp_c || rsp_u - 2 == rsp_c)
			System.out.println("컴퓨터의 승리입니다.");
		else
			System.out.println("사용자의 승리입니다.");
		
		if (rsp_u == 1)
			System.out.print("사용자 가위 / ");
		else if (rsp_u == 2)
			System.out.print("사용자 바위 / ");
		else
			System.out.print("사용자 보 / ");
		
		if (rsp_c == 1)
			System.out.print("컴퓨터 가위");
		else if (rsp_c == 2)
			System.out.print("컴퓨터 바위");
		else
			System.out.print("컴퓨터 보");
	}
}
