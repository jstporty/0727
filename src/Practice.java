import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사원번호 : ");
		int empno = sc.nextInt();
		
		System.out.print("사원이름 : ");
		String ename = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("사원출생년도 : ");
		int birthyear = sc.nextInt();
		
		System.out.print("사원월급 : ");
		int salary = sc.nextInt();
		
		System.out.print("사원이메일 : ");
		String email = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("사원전화번호 : ");
		int tel = sc.nextInt();
		
		System.out.print("정규직여부 : ");
		boolean flag = sc.nextBoolean();

		System.out.printf("사원번호 : %d\n", empno);
		System.out.printf("사원이름 : %c\n", ename);
		System.out.printf("사원출생년도 : %d\n", 2022 - birthyear);
		System.out.printf("사원월급 : %d\n", salary);
		System.out.printf("사원이메일 : %d\n", email);
		System.out.printf("사원전화번호 : %d\n", tel);
		System.out.printf("정규직여부  : %b\n", flag);
	}
}
