package java_practice;

import  java.util.Scanner ;

public class Add_or_Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = Scan.nextInt();
		System.out.println("ENter 2nd number");
		int b = Scan.nextInt();
		
		String str = "enter 0 for addition " + "enter 1 for multiplication";
		System.out.println(str);
		int input = Scan.nextInt();
		
		int sum = add(a, b);
		int mul = multiple(a, b);
//		System.out.println(sum);
//		System.out.println(mul);
		switch (input){
			case 0:
				System.out.println("Adding these number");
				System.out.println(sum);
				break;
		case 1:
			System.out.println("multipling these number");
			System.out.println(mul);
			break;
		}
}

	private static int multiple(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;

	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}