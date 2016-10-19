package QueenProblem;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("how many Queens : ");
		int n=s.nextInt();
		QueenProblem qp=new QueenProblem(n);
		qp.solveQueenProblem();
	}
}
