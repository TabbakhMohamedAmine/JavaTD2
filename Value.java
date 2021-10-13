
public class Value extends Expr{
	private double valeur;
	
	public Value(double valeur){
		this.valeur=valeur;
	}
	public double eval() {
		return this.valeur;
	}
	public String toString() {
		return ("Value:"+this.valeur);
	}
}
