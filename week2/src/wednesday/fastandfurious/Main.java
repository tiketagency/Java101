package wednesday.fastandfurious;

public class Main {
	public static void main(String[] args) {
		boolean isEcofriendly = true;
		Car vw = new Volkswagen();
		System.out.println(vw.isEcoFriendly(isEcofriendly));
		Car audi = new Audi();
		System.out.println(audi.isEcoFriendly(isEcofriendly));
		Car bmw = new BMW();
		System.out.println(bmw.isEcoFriendly(isEcofriendly));
		Car skoda = new Skoda();
		System.out.println(skoda.isEcoFriendly(isEcofriendly));
		Car honda = new Honda();
		System.out.println(honda.isEcoFriendly(isEcofriendly));
		Audi a8 = new Audi(250);
		System.out.println(a8.getMileage());
	}
}
