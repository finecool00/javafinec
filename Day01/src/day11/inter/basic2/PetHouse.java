package day11.inter.basic2;

public class PetHouse {

	public static void carePet(IPet pets) {
		
		if(pets instanceof Dog) {
			Dog dog = (Dog)pets;
			dog.play();
		} else if(pets instanceof Cat) {
			Cat cat = (Cat)pets;
			cat.play();
		} else if(pets instanceof GoldFish) {
			GoldFish goldfish = (GoldFish)pets;
			goldfish.play();
		}
		
	}
}
