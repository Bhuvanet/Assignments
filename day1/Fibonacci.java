package Week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0;
		int lastNum=1; 
		int sum;

		for(int i=0;i<=11;i++) {
			sum=firstNum+lastNum;
			firstNum=lastNum;
			lastNum=sum;

			System.out.println(sum);
		}

	}

}
