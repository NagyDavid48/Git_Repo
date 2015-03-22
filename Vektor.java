package Class_Diagram;

//Vektor Segédosztály a metemetikában megismert Vektor modellezésére szolgál

public class Vektor {
	private int x;	//A Vektor x koordinátája
	private int y;	//A Vektor y koordinátája
	
	//Konstruktor
	public Vektor(int x, int y)	
	{
		this.x = x;
		this.y = y;
	}
	
	//Getter függvény az x koordinátára
	public int getX() {		
		return x;
	}
	//Setter függvény az x koordinátára
	public void setX(int x) {
		this.x = x;
	}
	//Getter függvény az y koordinátára
	public int getY() {
		return y;
	}
	//Setter függvény az y koordinátára
	public void setY(int y) {
		this.y = y;
	}
	
	public void osszead(Vektor v){
		this.x += v.x;
		this.y += v.y;
	}
}
