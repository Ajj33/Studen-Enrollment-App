/*Author: Ajjuthan Sarvananthan */
package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {
		// Ask how many new users we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numbOfStudents = in.nextInt();
		Student [] students = new Student[numbOfStudents];
		
		// create n number of new students
		for (int n = 0; n< numbOfStudents; n++){
			students[n]= new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n] .toString());
			
		}
			 
	}

}
