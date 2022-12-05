package Week1.day1;

public class PrimeNum {

	public static void main(String[] args) {


		int n=17;


		for (int i = 2; i <n / 2;i++){
			// condition for non-prime number
			if (n % i != 0) 
			{
				System.out.println(n + " is a prime number");
				break;
			}
			else
			{
				System.out.println(n + " is not a prime number."); 
				break;
			}
		}



	}


}


