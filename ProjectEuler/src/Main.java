
public class Main {

	public static void main(String[] args) {
		problem5();
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
	
	public static void problem5(){
		int num = 1;
		boolean foundNum = false;
		
		loop: while(!foundNum){
			for(int i = 1; i <= 20; i++){
				if(num%i != 0){
					num++;
					continue loop;
				}
			}
			foundNum = true;
		}
		System.out.println(num);
	}

}
