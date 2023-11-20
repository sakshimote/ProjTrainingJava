package data;

public class AithmeticProb {
	
	public static void main(String[] args) {
		
		
		  ArithmeticOperation addition = (a, b) -> a + b;
	        int additionResult = addition.operation(10, 5);
	        System.out.println("Addition: " + additionResult);

	        // Subtraction
	        ArithmeticOperation subtraction = (a, b) -> a - b;
	        int subtractionResult = subtraction.operation(10, 5);
	        System.out.println("Subtraction: " + subtractionResult);

	        // Multiplication
	        ArithmeticOperation multiplication = (a, b) -> a * b;
	        int multiplicationResult = multiplication.operation(10, 5);
	        System.out.println("Multiplication: " + multiplicationResult);

	        // Division
	        ArithmeticOperation division = (a, b) -> a / b;
	        int divisionResult = division.operation(10, 5);
	        System.out.println("Division: " + divisionResult);
		
	}

}
