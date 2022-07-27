
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.price = 25_000_000;

		Car matiz = new Car();
		matiz.price = sonata.price;

		System.out.println("Befor Change");
		System.out.println("sonata's price=" + sonata.price);
		System.out.println("matiz's price=" + matiz.price);

		sonata.price = 5;
		System.out.println("After Change");
		System.out.println("sonata's price=" + sonata.price);
		System.out.println("matiz's price=" + matiz.price);

	}
}

class Car {
	int price;

}