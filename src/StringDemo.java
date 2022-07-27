
public class StringDemo {
	public static void main(String[] args) {
//		String name; // 선언, declaration
//		name = "한지민"; // 할당, Assignm
//		System.out.printf("이름=%s\n", name);

		String name = new String("한지민");
//		System.out.printf("이름=%s\n", name);
		// String name="한지민"; //초기화, initialization

		Student jimin; // declaration(선언)
		jimin = new Student(); // Assingnment(할당) //JIMIN은 주소만 저장한다
		jimin.name = "한지민"; // jimin.name에는 한지민이라는 주소가 저장
		jimin.age = 26;

		Student chulsu = new Student();
		chulsu.name = "김철수";
		chulsu.age = 36;

		Student younghee = new Student();
		younghee.name = "이영희";
		younghee.age = 46;

		System.out.println("한지민 학생정보");
		System.out.printf("이름=%s, 나이=%d\n", jimin.name, jimin.age);

		System.out.println("김철수 학생정보");
		System.out.printf("이름=%s, 나이=%d\n", chulsu.name, chulsu.age);

		System.out.println("이영희 학생정보");
		System.out.printf("이름=%s, 나이=%d\n", younghee.name, younghee.age);

	}
}
