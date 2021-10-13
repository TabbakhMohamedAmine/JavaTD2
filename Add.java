
public class Add extends Expr {
	public double numb;
	public Add(Expr v1, Expr val) {
		this.numb=v1.eval()+val.eval();
	}
	public double eval() {
		return this.numb;
	}
	public String toString() {
		return ("Add:"+this.numb);
	}
}
