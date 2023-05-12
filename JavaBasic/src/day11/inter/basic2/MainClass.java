package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat ,tiger};
		
		for(Animal ani : animals) {
			ani.eat(); //Animal의 기능만 사용가능!
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다.
		//dog, cat, goldfish를 저장하고, 반복문 돌려보세요.
		IPet[] pets = new IPet[3];
		
//		IPet dog2 = new Dog();
//		IPet cat2 = new Cat();
//		IPet goldfish = new GoldFish();
		
		//pets[1] = (IPet)tiger; // tiger는 IPet의 기능이 없기 때문에 에러발생
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();
		
		for(IPet ipet : pets) {
			ipet.play();
		}
		
		System.out.println("----------------------------");
		
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet((IPet)cat);
		PetHouse.carePet(pets[2]);
		
		
	}
	
}
