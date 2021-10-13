
public class RacineCarre extends Expr {
	public double val;
	public RacineCarre(Expr v1) {
		this.val=Math.sqrt(v1.eval());
	}
	public double eval() {
		return this.val;
	}
	public String toString() {
		return ("RacineCarré:"+"\u221a"+this.val);
	}
}
