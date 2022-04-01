
import java.util.*;

public class Student {
	// taking input from the user
	Scanner scanner = new Scanner(System.in);
	// Declaring the variables
	private int regNo, total = 0, subjects;

	private String name;

	private int marks[];

	// creating default constructor
	Student()

	{
		// ask the user to enter the registration number
		System.out.print("Enter Registration No.: ");

		regNo = scanner.nextInt();
		// ask the user to enter the name
		System.out.print("Enter Student Name: ");

		name = scanner.next();
		// calling the to display the values of it
		displayMarks();

	}

	// method to display the values

	void displayMarks()

	{
		// declare the marks
		marks = new int[5];

		System.out.print("Enter marks of Tamil: ");

		marks[0] = scanner.nextInt();

		System.out.print("Enter marks of English: ");

		marks[1] = scanner.nextInt();

		System.out.print("Enter marks of Maths: ");

		marks[2] = scanner.nextInt();

		System.out.print("Enter marks of Science: ");

		marks[3] = scanner.nextInt();

		System.out.print("Enter marks of Social: ");

		marks[4] = scanner.nextInt();

		for (int i = 0; i < 5; i++) // initialize the mark

		{

			total += marks[i];

		}

		System.out.println("Total Marks of student " + name + ": " + total);

	}

	// static class

	static class StudentDemo

	{

		public static void main(String args[])

		{

			Student student[] = new Student[5];

			for (int i = 0; i < 5; i++) // initialize the student

				student[i] = new Student();

		}

	}
}
