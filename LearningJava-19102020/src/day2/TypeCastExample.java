package day2;

public class TypeCastExample {
	
	public static void main(String[] args) {
		
		int num = 74895;
		
		long longNum = num;
		
		//double > float > long > int > byte > short
		
		double doubNum = 7584.78;
		
		int intNum = (int) doubNum;
		
		System.out.println(intNum);
		
	}

}
