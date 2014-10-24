
public class Main {

	public static void main(String[] args) {
		problem2();
	}
	
	public static void problem2(){
		int previous = 1;
		int current = 2;
		int evenNumbersSum = 0;
		
		while(previous < 4000000){
			int sum = previous + current;
			if(previous%2 == 0){
				evenNumbersSum += previous;
			}
			previous = current;
			current = sum;
		}
		
		System.out.println(evenNumbersSum);
	}

}
