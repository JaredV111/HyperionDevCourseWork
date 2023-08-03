package Task13;

public class Lion extends Animal
{
	public String cub ;
	public boolean male;
	public int weight1; 
	
	public Lion(String cub,boolean male,int weight1) {
		super(12, true, 46);
	
		this.setWeight(weight1);
		this.setCub(cub);
		this.setWeight1(weight1);
			
	}
	public String getCub() {
		return cub;	
	}
	
	public void setCub(String cub) {
		this.cub = cub;
	}
	
	public boolean getMale() {
		return male;
	}
	
	public void setMale(boolean male) {
		this.male = male;
	}
	public int getWeight1() {
		return weight1;
	}
	
	public void setWeight1(int weight1) {
		this.weight1 = weight1;
	}
		
		
	
}
