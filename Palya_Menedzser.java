package Class_Diagram;

/**
 * Ez az osztály a pálya és a felhasználó "között" van. Fogadja az inputokat és a játék számára
 * értelmezhetővé teszi. Vektorokat tovább küldi a pályának, robotoknak. A játékos akadály 
 * lerakását is ezen keresztül küldi a robot/pálya felé.
 * A játék elején mód van a robotok ragacs és olaj készletének a beállítására.
 * Nyílván tartja a körök számát. Egy kőr alatt minden robot lép egyet. Miután minden robot lépett
 * letelik egy kőr.  
 * @author C Sharks
 *
 */
public class Palya_Menedzser {

	private int kor;//Ennyi kőr lesz a játék alatt
	private int olajkeszlet;//Robot olaj...
	private int ragacskeszlet;//...és ragacs készlete
	private Palya palya;
	private String obinev;
	
	/**
	 * 
	 * @param kor
	 * @param ragacs
	 * @param olaj
	 */
	public Palya_Menedzser(int kor, int mag, int szel, int rob, int ragacs, int olaj, String nev, int init) {
		
		//System.out.println("");
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
		this.obinev = nev;
		palya = new Palya(szel, mag, rob, olaj, ragacs, "p",1);
		//System.out.println("");
		
	}
	
	public Palya_Menedzser(int kor, int mag, int szel, int rob, int ragacs, int olaj, Palya palya, String nev) {
		//System.out.println("");
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
		this.obinev = nev;
		this.palya = palya;
		//System.out.println("");
	}

	public void korSzamol() {
		Logger.logMetodusStart(obinev, "korSzamol()");
		//System.out.println("PM - korSzamol fv. kezdodik.");
		// ... Kőr számlálás
		// ... Valami feltétel

		//System.out.println("korSzamol vege.");
		Logger.logMetodusReturn("");
	}

	public int getKor() {
		//System.out.println("PM - getKor fv. kezdodik és "+this.kor+" ertekkel ter vissza.");
		return this.kor;
	}

	/**
	 * 
	 * @param kor
	 */
	public void setKor(int kor) {
		//System.out.println("");
		this.kor = kor;
		//System.out.println("");
	}

	/**
	 * 
	 * @param olajkeszlet
	 */
	public void setOlajkeszlet(int olajkeszlet) {
		//System.out.println("");
		this.olajkeszlet = olajkeszlet;
		//System.out.println("");
	}

	/**
	 * 
	 * @param ragacskeszlet
	 */
	public void setRagacskeszlet(int ragacskeszlet) {
		//System.out.println("");
		this.ragacskeszlet = ragacskeszlet;
		//System.out.println("");
	}
}
