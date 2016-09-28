// Day 4
// Learn about the difference between a class and an instance
//
// @author Chinasa T. Okolo 

public class Person {
    private int age;	
    String statement;
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            age = 0; 
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            statement = "young";
        } else if (age >= 13 && age < 18) {
            statement = "a teenager"; 
        } else {
            statement = "old"; 
        }
        System.out.println("You are " + statement + ".");
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}
    
