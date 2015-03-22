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
	 * Beállítja a tagváltozóit
	 */
	public Robot(int olajszam, int ragacsszam, String nev) {
		Vektor v = new Vektor(0,0);
		this.sebessegvektor = v;
		mezo = new Mezo(false,false,false,v);
		this.mezo = mezo;
		this.olaj = olajszam;
		this.ragacs = ragacsszam;
		this.obinev = nev;
		this.kiesett = false;
		this.olajonvan = false;
	}

	/**
	 * 
	 * @param v
	 * A kapott Vektort hozzáadja a sajátjához, lekérdezi a mezőjétől, hogy mi a pozícióvektora,
	 * ezután a vektorAtvalt segítségével kiszámolja, hogy a mezők tömbjében melyik indexű mezőre lépne
	 */
	public int[] lep(Vektor v) {
		sebessegvektor.osszead(v);			//Vektorok összeadása
		
		Vektor pozicio = mezo.getPoziciovektor();	//Lekérdezzük az cél mezőnek a pozicióVektorát
		
		int[] index = new int[2];			//Létrehozunk egy tömböt amibe majd a visszatérési érték lesz
		
		index = vektorAtvalt(pozicio);			//A vektorátvált létrehozza a végleges koordinátákat ami
								//alapján a Pálya tudja azonosítani a cél mezőt
		return index;
	}

	/**
	 * 
	 * @param v
	 * A megváltozott sebességvektor és a mező pozícióvektorából kiszámolja,
	 * hogy melyik pozícióra lépne a robot, ezt átváltja mezőindexé.
	 */
	public int[] vektorAtvalt(Vektor v) {
		sebessegvektor.osszead(v);		//Létrehozunk egy vektort
		
		return index;				//Majd visszaadjuk
	}
	//Az olaj lerakását Végző metódus
	public void olajLerak() {
		Olajfolt o = new Olajfolt();		//A robot létrehoz egy olyajfolt példányt
		mezo.setAkadaly(o);			//Majd beállítja az akadályt arra a mezőre ahol áll
	}
	//A ragacs lerakását Végző metódus
	public void ragacsLerak() {
		Ragacs r = new Ragacs();		//A robot létrehoz egy Ragacs példányt
		mezo.setAkadaly(r);			//Majd beállítja az akadályt arra a mezőre ahol áll
	}
	//A ragacsralépést következményeinek végrehejtását végző metódus
	public void ragacsraLepett() {
		sebessegvektor.setX(sebessegvektor.getX()/2);	//A Robot felezi a sebességvektorát
		sebessegvektor.setY(sebessegvektor.getY()/2);
		System.out.println("Ragacsralepett");
	}

	/**
	 * 
	 * @param olajonvan
	 * Setter függvény az Olajonvan tagváltozóhoz
	 */
	public void setOlajonvan(boolean olajonvan) {
		this.olajonvan = olajonvan;
	}
	//Getter függvény az Olajonvan tagváltozóhoz
	public boolean getOlajonvan() {
		return this.olajonvan;
	}
	//Getter függvény az checkpoint tagváltozóhoz
	public int getCheckpoint() {
		return this.checkpoint;
	}
	//A robot növeli Checkpointjainak számát
	public void addCheckpoint() {
		checkpoint++;
	}
	//Getter függvény az kiesett tagváltozóhoz
	public boolean getKiesett() {
		return this.kiesett;
	}

	/**
	 * 
	 * @param kiesett
	 * Setter függvény a kiesett tagváltozóhoz
	 */
	public void setKiesett(boolean kiesett) {
		this.kiesett = kiesett;
	}
	//Getter függvény a mezo tagváltozóhoz
	public Mezo getMezo() {
		return this.mezo;
	}

	/**
	 * 
	 * @param mezo
	 * Setter függvény a mezo tagváltozóhoz
	 */
	public void setMezo(Mezo mezo) {
		this.mezo = mezo;
	}
}
