package lesson16;


public class Person {
	String name;
	int age;
	double weigth;
	boolean isMale;
	long personalNumber;
	
	Person[] friends;
	
	Person(){
		this.age = 0;
		this.weigth = 4.0;
	}
	
	Person(String name, long personalNumber, boolean isMale){
		this();
		int numberOfFriends = 3;
		
		if(name != null && !name.trim().equals("")) {
			System.out.println("Kvo e tva ime");
		}else {
			this.name = name;
		}
	
		this.friends = new Person[numberOfFriends];
		
		this.isMale = isMale;
		
		if(personalNumber <1000000000L || personalNumber>9999999999L) {
			System.out.println("kuv e toq nomer");
		}else {
			this.personalNumber = personalNumber;
		}
	}

	
	
}
