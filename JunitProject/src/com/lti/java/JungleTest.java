package com.lti.java;

public class JungleTest {
	public static void main(String[] args) {
		Sparrow theSparrow = new Sparrow();
		theSparrow.layEggs();
		
		Parrot theParrot = new Parrot();
		theParrot.fly();
		
		Crow theCrow = new Crow();
		theCrow.watching();
	}
}
class Tiger { }
class Lion { }
class Elephant {}

class Cow {}
class Goat { }
class Hen { }

class Parrot { 
	public void fly() {
		System.out.println("parrot is flying...");
	}
}
class Sparrow { 
	public void layEggs() {
		System.out.println("Sparrow is laying eggs...");
	}
	
}
class Crow { 
	public void watching() {
		System.out.println("Crow is watching...");
	}
}

class Crocodile {}
class Lizard { }
class Snake { }

class RosePlant { }
class LillyPlant { }
class LotusPlant { }