
public class Multiplication extends Expr {
	public double val;
	public Multiplication(Expr v1, Expr val) {
		this.val=v1.eval()*val.eval();
	}
	public double eval() {
		return this.val;
	}
	public String toString() {
		return ("Multiplication:"+this.val);
	}
}
