package Noor;

public class BasicMathOperators {
	public static void main(String[] args) {
	// create 2 int variables and assign values
		int num1 = 100;
		int num2 = 200;
		System.out.println(num1 + num2);
	//output 300, if one of them were string it would concatenate
		System.out.println(num1 + num2 + 1000);
	// output 1300
		
		int sum = num1 + num2 + 10;
		System.out.println(sum);
	// output 310
		System.out.println("Sum is " + sum);
	//output Sum is 310
		
		
	//create 3 variables: apples, carrots, tomatoes
	//add prices to it with decimals
	//create variable total and assign total price
	//print the tax then add the tax to the total
	//print total with tax
		
		double apples = 5.55;
		double carrots = 3.87;
		double tomatoes = 4.25;
		
		double totalBeforeTax = apples + carrots + tomatoes;
		System.out.println("Your total before tax = " + totalBeforeTax + "$");
		
		double tax = totalBeforeTax * 0.06;
		double totalWithTax = totalBeforeTax + tax;
		System.out.println("Your total with tax = " + totalWithTax + "$");
	//output Your total before tax = 13.67$
    //       Your total with tax = 14.49$
		
	}
}

