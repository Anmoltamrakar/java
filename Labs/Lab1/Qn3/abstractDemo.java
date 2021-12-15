abstract class Animal{
	abstract void eat();
	abstract void move();
}
class Rabbit extends Animal{
	void eat(){
		System.out.println("Rabiit is eating");
	}
	void move(){
		System.out.println("Rabbit is running");
	}
}
class MyAnimal{
	public static void main(String[] args){
		Animal rabbit = new Rabbit();
		rabbit.eat();
		rabbit.move();
	}
}
