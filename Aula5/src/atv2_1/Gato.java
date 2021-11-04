package atv2_1;

public class Gato extends Animal{
	public String mia() {
		return "miau miau miau!";
	}
	@Override
	public String toString() {
		return super.toString()+ "\nFala= " + this.mia() +"";
	}
}
