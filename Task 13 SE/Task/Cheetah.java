package Task13;


public class Cheetah extends Animal
{
	private int[] claws = new int[4];
	private static int Numpaws = 4;
	private int legs = 4;

	public Cheetah(int numPaws,int legs) {
		super(12,true,80);
		this.getNumpaws();
		claws = new int[]{0,0,0};
	
	}

	public int getNumpaws() {
		return Numpaws;
	}
	public void setNumpaws(int Numpaws) {
		Cheetah.Numpaws = Numpaws;
	}
	public int legs() {
		return legs;
	}
	public void legs(int legs) {
		this.legs = legs;
	}
	public int[] getclaws() {
		return claws;
	}
	public void claws(int[] claws) {
		this.claws = claws;
		
	}
	
	
	
public static void main (String [] args) {
	Cheetah b = new Cheetah(5,4);

	String s = new String("5,4");
	System.out.println(s);
	System.out.println(b.toString());
	
}
}

