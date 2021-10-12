package exo2;

public class main {
	public static void main(String[] args) throws Exception {
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		//fille.miage();
		//((Fille)mereFille).miage();
		//mere.a();
		//mereFille.a();
		//fille.a();
		//((Mere)mereFille).a();
		//mereFille.b(null);
		//mereFille.c();
		mereFille.c(mere);
		mereFille.c(mereFille);
		mereFille.c(fille);
		fille.c(fille);
		Mere.d();
		Mere.d();
		mere.printF();
		mereFille.printF();
		mereFille.j();
		mereFille.l();
		mereFille.m();
	 }
}
