package Recursion_Chapter;
public class Recursion_Decrement_Print_Natural_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        PD(n);
	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		PD(n-1);
	}	
}
