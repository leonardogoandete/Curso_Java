package atv2;

public class Cachorro extends Animal{
	public String late() {
		return "au au au!";
	}
	@Override
	public String toString() {
		return super.toString()+ "\nFala= " + this.late() +"";
	}
}
