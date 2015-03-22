package Class_Diagram;

public class Robot {

	private Vektor sebessegvektor;
	private int olaj;
	private int ragacs;
	private int checkpoint;
	private Mezo mezo;
	private boolean olajonvan;
	private boolean kiesett;

	/**
	 * 
	 * @param olajszam
	 * @param ragacsszam
	 */
	public Robot(int olajszam, int ragacsszam) {
		Vektor v = new Vektor(0,0);		
		mezo = new Mezo(false,false,false,v);
		this.mezo = mezo;
	}

	/**
	 * 
	 * @param v
	 */
	public int[] lep(Vektor v) {
		Vektor pozicio = mezo.getPoziciovektor();
		
		int[] index = new int[2];
		index[0]=pozicio.getX();
		index[1]=pozicio.getY();
		
		vektorAtvalt(pozicio);
		
		return index;
	}

	/**
	 * 
	 * @param v
	 */
	public int[] vektorAtvalt(Vektor v) {
		v.setX(1);
		v.setY(1);
		
		int[] index = new int[2];
		index[0]=v.getX();
		index[1]=v.getY();
		
		return index;
	}

	public void olajLerak() {
		Olajfolt o = new Olajfolt();
		mezo.setAkadaly(o);
	}

	public void ragacsLerak() {
		Ragacs r = new Ragacs();
		mezo.setAkadaly(r);
	}

	public void ragacsraLepett() {
		sebessegvektor.setX(sebessegvektor.getX()/2);
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
