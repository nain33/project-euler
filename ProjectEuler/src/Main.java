
public class Main {

	public static void main(String[] args) {
		
	}
	
	public void problem2(){
		int previous = 1;
		int current = 2;
		
		while(current < 4000000){
			int sum = previous + current;
			previous = current;
			current = sum;
		}
	}

}
