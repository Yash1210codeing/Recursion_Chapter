package Recursion_Chapter;
public class Recursion_Factorial_Question {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        System.out.println(fact(n));       
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fn=fact(n-1);   // S.P   Smaller Problem
		return n*fn;
	}
}
