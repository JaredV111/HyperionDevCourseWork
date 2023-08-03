package Task3;
public class myTestResults {

	public static void main(String[] args) {
		
		int[] myTestResults = new int[5];
		myTestResults[0] = 50;
		myTestResults[1] = 40;
		myTestResults[2] = 78;
		myTestResults[3] = 67;
		myTestResults[4] = 60;
		
		int average = 0;
		for(int i = 0;i<=4;i++) {
			average = average + myTestResults[i];
		}
		System.out.println("Your Score is:" + average );
		average = average/5;
		System.out.println("Your Score is:" + average);
		
		 if((average>=80)&&(average<=100)){
	            System.out.println("A");
	        }
	        
	        else if((average>=70)&&(average<=79)){
	            System.out.println("B");
	        }
	        
	        else if((average>=60)&&(average<=69)){
	            System.out.println("C");
	        }
	        
	        else if((average>=50)&&(average<=59)){
	            System.out.println("D");
	        }
	        else{
	            System.out.println("F");
			
	        }
	}


}