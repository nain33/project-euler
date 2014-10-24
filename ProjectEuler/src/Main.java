import java.math.BigInteger;


public class Main {

	public static void main(String[] args) {
		problem6();
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
	
	public static void problem6(){
		int sumOfTheSquares = 0;
		
		for(int i = 1; i <= 100; i++){
			sumOfTheSquares += Math.pow(i, 2);
		}
		
		int squareOfTheSums = 0;
		int sum = 0;
		
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		
		squareOfTheSums = (int) Math.pow(sum, 2);
		
		int difference = Math.abs(squareOfTheSums - sumOfTheSquares);
		System.out.println(difference);
	}

	public static void problem20(){
		BigInteger hundredFactorial = BigInteger.ONE;
		BigInteger i = BigInteger.valueOf(100);
		
		while(i.compareTo(BigInteger.ONE) != 0){
			hundredFactorial = hundredFactorial.multiply(i);
			i = i.subtract(BigInteger.ONE);
		}
		String hundredFactorialString = hundredFactorial.toString();
		int[] hundredFactorialArray = new int[hundredFactorialString.length()];
		
		for(int j = 0; j < hundredFactorialArray.length; j++){
			hundredFactorialArray[j] = Integer.parseInt(String.valueOf(hundredFactorialString.charAt(j)));
		}
		
		int sum = 0;
		
		for(int j = 0; j < hundredFactorialArray.length; j++){
			sum += hundredFactorialArray[j];
		}
		
		System.out.println(sum);
	}
}
