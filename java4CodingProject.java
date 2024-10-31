package week04lab;

import java.util.Arrays;

public class java4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of ages
		int [] ages= {3, 9, 23, 64, 2, 8, 28, 93};
//subtract the value of the first element in the array from the value in the last element of the array.
		System.out.println(ages[ages.length-1] - ages[0]);
// new array of int called ages2- dramatic way
		int [] ages2= new int[9];
		ages2[0] = 7;
		ages2[1] = 12;
		ages2[2] = 10;
		ages2[3] = 25;
		ages2[4] = 16;
		ages2[5] = 67;
		ages2[6] = 9;
		ages2[7] = 15;
		ages2[8] = 42;
		System.out.println(Arrays.toString(ages2));
//copy and pasted program to subtract last first element from last- adjusted to ages2
		System.out.println(ages2[ages2.length-1] - ages2[0]);
//the .length function (minus 1) works for all lengths of arrays
int sum = 0;
//loops through every number in ages2 array
for (int i=0; i<ages2.length; i++) {
//adds the sum (which we started at 0) to the ages at index "i" which is running through loop
	sum += ages2[i];
}
//made a double so the number is more accurate
double average = sum /ages2.length;	
System.out.println(average);

String [] names= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
int totalLength = 0;
for (int i=0; i<names.length; i++) {
	//iterate through each name length and total the length of all the names...
	totalLength += names[i].length();
	// then divide the total length by the length of each name to get average
} int averageLength = totalLength/names.length;
System.out.println(averageLength);

for (int i=0; i<names.length; i++) {
	//this iterates through again and prints the names at index "i" with a space afterwards
	System.out.print(names[i] + " ");	
}
//to access the first element of an array you sysout the name of the array plus the index number, which is 0
System.out.println(names[0]);
//the end, if you know how long it is, is the last numbered element. If you don't, you use the .length function -1.
System.out.println(names[names.length-1]);
// I think they want us to add the length of each name in the nameLengths array to the name. 
int [] nameLengths = new int[names.length];
//iterating through the names array again
for (int i=0; i<names.length; i++) {
	//storing the length of each name in the nameLengths array
	nameLengths[i] = names[i].length(); }
for (int num : nameLengths) {
	System.out.print(num);}
// I can't figure out how to get them next to one another (sam 3, tommy 5, etc.)- I'll try later.

// loop to iterate over nameLengths array
	int sumNameLengths = 0;
	for (int i=0; i<nameLengths.length; i++) {
		sumNameLengths += nameLengths[i];
//this loop iterates over the nameLengths array to add each previous element to the next. 
//Those values are stores in the variable "sumNameLengths"		
	System.out.println(sumNameLengths);}
	
System.out.println(concat("Hello", 3));
System.out.println(fullName("Johannah", "Kohorst"));
int [] nums = {7, 10,25,56,86,3};
System.out.println(hundred(nums));
double [] elements = {2.5, 6.7, 8.5,10.7};
System.out.println(averageElements(elements));
double [] array1 = {2.4, 4.5, 7.2, 8.9, 11.4};
double [] array2= {3.5, 8.9, 10.3, 12.5, 4.6};
System.out.println(twoArrays(array1, array2));
boolean isHotOutside = true;
double moneyInPocket = 12.00;
System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
int cranky = 6;
int hungry = 3;
whatShouldIDo(cranky, hungry);
	}
//method returns a string and has String and int parameters
public static String concat(String word, int n) {
// initialize an empty String
	String result = "";
//loop through the result until "n" is reached- 
//result is the word added each time until n is reached. 
for (int i=0; i<n; i++) {
	result += word;}
return result;

}
//8 
public static String fullName(String firstName, String lastName) {
	return firstName + " " + lastName; // will return parameters passed through separated by a space
}
//9- This makes a loop that sums all of the integers in the array "nums"
// then it makes an if statement to determine whether true or false will be returned
public static boolean hundred(int [] nums) {
	int sumArrayNums = 0;
for (int i=0; i<nums.length; i++) {
	sumArrayNums += nums[i];
if (sumArrayNums >100) {
	return true;}
} return false; }

//10, this method takes an array of double, and adds together each element until array.length is met
// then it adds those elements together. It returns the sum of the elements divided by the length of the array.
public static double averageElements(double [] elements) {
	double elementsSum = 0.0;
	for (int i=0; i<elements.length; i++) {
		elementsSum += elements[i];}
	return elementsSum/(elements.length);
}
public static boolean twoArrays(double [] array1, double [] array2) {
// two counters for the arrays
	double array1Sum = 0;
	double array2Sum = 0;
// get totals for both arrays with for loop
for (int i=0; i<array1.length; i++) {
	array1Sum += array1[i];}
//store averages of both arrays in variable array1Average, or array2Average
	double array1Average = array1Sum/array1.length;
for (int b=0; b<array2.length; b++) {
	array2Sum += array2[b];}
	double array2Average = array2Sum/array2.length;
	// if statement to return as boolean
if (array1Average > array2Average) {
	return true;
} else {
	return false;}
}
//I made this more complicated initially, but if both are true, it will return true. 
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket>10.50;
		
	}
// I'm creating a method that determines if I should go on a walk or eat food depending on my level of crankiness.
//It will take two integer variables into account- level of hunger and level of crankiness.
public static void whatShouldIDo(int cranky, int hungry) {
	if (cranky>hungry) {
		System.out.println("Go for a walk!");
	}else if (hungry>cranky) {
		System.out.println("Go get a snack!");
	} else if (hungry == cranky) {
		System.out.println("Grab a snack and go for a walk.");
	} else {
		System.out.println("Go read for a bit.");
	}
}
}




