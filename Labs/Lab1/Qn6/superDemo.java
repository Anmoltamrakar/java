class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
}
class Demo{
	public static void main(String[] args){
		Dog dog = new Dog("Huskey");
		dog.getName();
	}
}
class Dog extends Animal{
	String name;
	Dog(String name){
		super(name);
		this.name = name;
	}
	void getName(){
		System.out.println("Dog's name: "+name);
		System.out.println("Animal's name: "+super.name);
	}
}