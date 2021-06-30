package problem_1;

import java.util.Scanner;

public class Program_1 
{

	public static void main(String[] args) 
	{
		int studentno;
		float mean;
		float median;
		float sum = 0;
		Scanner students = new Scanner(System.in);
		Scanner grade = new Scanner(System.in);
		
		System.out.println("Type in your how many students are in the class. Press Enter to Continue.");
		studentno = students.nextInt();
		float gradearray [] = new float [studentno];
		System.out.println("Type in the grade for each student. Press Enter to Continue.");
		for(int i = 0; i < studentno; i++)
		{
			gradearray[i] = grade.nextFloat();
		}
		
		//Mean
		for (int i = 0; i < studentno; i++)
		{
			sum += gradearray[i];
		}
		mean = sum / studentno;
		System.out.println("The mean is: " + (mean));
		
		//Median
		java.util.Arrays.sort(gradearray);
		if (gradearray.length % 2 == 0)
		{
			median = ((gradearray[gradearray.length/2] + gradearray[(gradearray.length/2) - 1]) / 2);
		}
		else
		{
			median = gradearray[gradearray.length/2];
		}
		System.out.println("The median is: " + median);
		
		//Highest
		float highest = gradearray[0];
		for (int i = 0; i< gradearray.length; i++)
			if (gradearray[i] > highest) 
			{
				highest = gradearray[i];
			}
		System.out.println("The highest grade is: " + highest);
		
		//Lowest
		float lowest = gradearray[0];
		for (int i = 0; i< gradearray.length; i++)
			if (gradearray[i] < lowest) 
			{
				lowest = gradearray[i];
			}
		System.out.println("The lowest grade  is: " + lowest);
		students.close();
		grade.close();
	}
}
