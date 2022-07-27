import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		
		System.out.print("사원번호 : ");
		em.empno = sc.nextInt();
		sc.nextLine();  //enter 날리자.
		
		System.out.print("사원이름 : ");
		em.ename = sc.nextLine();
		
		System.out.print("사원출생년도 : ");
		em.birthYear = sc.nextInt();
		
		System.out.print("사원월급 : ");
		em.salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원이메일 : ");
		em.email = sc.nextLine();
		
		System.out.print("사원전화번호 : ");
		em.tel = sc.nextLine();
		
		System.out.print("정규직여부 : ");
		em.flag = sc.nextBoolean();
		
		System.out.println("<<사원정보>>");
		System.out.println("사원번호 : " + em.empno);
	    System.out.println("사원이름 : " + em.ename);
	    System.out.println("사원나이 : " + (2022 - em.birthYear + 1));
	    System.out.println("사원월급 : " + em.salary + "만원");
	    System.out.println("사원이메일 : " + em.email);
	    System.out.println("사원전화번호 : " + em.tel);
	    System.out.println("정규직 : " + em.flag);
	}
}