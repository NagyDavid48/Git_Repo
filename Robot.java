package Class_Diagram;

public class Robot {

	private Vektor sebessegvektor;	//A Robot Sebességét tároló tagváltozó
	private int olaj;		//A Robot Olajkészlete
	private int ragacs;		//A Robot Ragacskészlete
	private int checkpoint;		//A Robot Által elért Checkpointok száma
	private Mezo mezo;		//A Mező amin jelenleg a robot tartozkodik
	private boolean olajonvan;	//Megadja hogy a robot Olajfoltra lépett-e az előző körben
	private boolean kiesett;	//Megadja hogy a robot leesett-e már a pályáról
	private String Obinev;		//Segédváltozó objektum azonosításra

	/**
	 * 
	 * @param olajszam
	 * @param ragacsszam
	 * Konstruktor létrehoz egy Vektort, egy Mezőt
	 */
	public Robot(int olajszam, int ragacsszam, String nev) {
		Vektor v = new Vektor(0,0);		
		mezo = new Mezo(false,false,false,v);
		this.mezo = mezo;
	}

	/**
	 * 
	 * @param v
	 */
	public int[] lep(Vektor v) {
		Vektor pozicio = mezo.getPoziciovektor();	//Lekérdezzük az cél mezőnek a pozicióVektorát
		
		int[] index = new int[2];			//Létrehozunk belőle és a Vektorból egy érkezési poziciót
		index[0]=pozicio.getX();
		index[1]=pozicio.getY();
		
		vektorAtvalt(pozicio);				//A vektorátvált létrehozza a végleges koordinátákat ami
								//alapján a Pálya tudja azonosítani a cél mezőt
		
		return index;
	}

	/**
	 * 
	 * @param v
	 */
	public int[] vektorAtvalt(Vektor v) {
		v.setX(1);				//Átváltjuk a Vektort
		v.setY(1);
		
		int[] index = new int[2];		//Belerakjuk egy tömbbe 
		index[0]=v.getX();
		index[1]=v.getY();
		
		return index;				//Majd visszaadjuk
	}

	public void olajLerak() {
		Olajfolt o = new Olajfolt();		//A robot létrehoz egy olyajfolt példányt
		mezo.setAkadaly(o);			//Majd beállítja az akadályt arra a mezőre ahol áll
	}

	public void ragacsLerak() {
		Ragacs r = new Ragacs();		//A robot létrehoz egy Ragacs példányt
		mezo.setAkadaly(r);			//Majd beállítja az akadályt arra a mezőre ahol áll
	}

	public void ragacsraLepett() {
		sebessegvektor.setX(sebessegvektor.getX()/2);	//A Robot felezi a sebességvektorát
		sebessegvektor.setY(sebessegvektor.getY()/2);
		System.out.println("Ragacsralepett");
	}

	/**
	 * 
	 * @param olajonvan
	 */
	public void setOlajonvan(boolean olajonvan) {
		this.olajonvan = olajonvan;
	}

	public boolean getOlajonvan() {
		return this.olajonvan;
	}

	public int getCheckpoint() {
		return this.checkpoint;
	}
	//A robot növeli Checkpointjainak számát
	public void addCheckpoint() {
		checkpoint++;
	}

	public boolean getKiesett() {
		return this.kiesett;
	}

	/**
	 * 
	 * @param kiesett
	 */
	public void setKiesett(boolean kiesett) {
		this.kiesett = kiesett;
	}

	public Mezo getMezo() {
		return this.mezo;
	}

	/**
	 * 
	 * @param mezo
	 */
	public void setMezo(Mezo mezo) {
		this.mezo = mezo;
	}
}
