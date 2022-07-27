
public class CopyDemo {
	public static void main(String[] args) {
		int original = 26;
		int target = original; // 값복사
		System.out.println("Before Change");
		System.out.println("orinina's valu=" + original);
		System.out.println("target's valu=" + target	);
		
		original=36;
		System.out.println("After Change");
		System.out.println("orinina's valu=" + original);
		System.out.println("target's valu=" + target	);
		
	}
}
