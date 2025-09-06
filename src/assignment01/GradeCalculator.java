package assignment01;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello and welcome to CSE 131! what is your name?");
		String name = in.nextLine();
        System.out.println("Hello and welcome to CSE 131: " + name);

		System.out.println("How many studios did you attend?");
        int studiosAttended = in.nextInt();
		System.out.println("what was your average quiz grade?" );
		double averageQuizGrade = in.nextDouble();
		System.out.println("what was your average Exam grade?" );
		double averageExamGrade = in.nextDouble();

		double studiosWeighted = (studiosAttended/8)*15.0;
		double quizWeighted = (averageQuizGrade/100)*25.0;
		double examWeighted = (averageExamGrade/100)*60.0;
		double finalGrade = (studiosWeighted + quizWeighted + examWeighted);

		System.out.println("The CS131 grade for:" + name);
		System.out.println("number of studios attended: " + studiosAttended);
		System.out.println("weighted studio grade(out of 15): " + studiosWeighted + "%");
		System.out.println("average quiz grade: " + averageQuizGrade);
		System.out.println("weighted quiz grade(out of 25): " + quizWeighted + "%");
		System.out.println("average exam grade: " + averageExamGrade + "%");
		System.out.println("weighted exam grade(out of 60): " + examWeighted + "%");
		System.out.println("final grade: " + finalGrade + "%");
	}

}