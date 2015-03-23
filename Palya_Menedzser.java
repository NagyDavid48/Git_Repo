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
	public String obinev;
	
	/**
	 * A konstruktorban a pálya adatait  is meg kell adni.
	 * 
	 * @param kor - A kőrök száma
	 * @param mag - Pálya magassága
	 * @param szel - Pálya szélessége
	 * @param ragacs - Robotok ragacs száma
	 * @param olaj - Robotok olaj száma
	 * @param nev - Objektum név
	 */
	public Palya_Menedzser(int kor, int mag, int szel, int rob, int ragacs, int olaj, String nev) {
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
		this.obinev = nev;
		palya = new Palya(mag, szel, rob, olaj, ragacs);
	}
	
	public Palya_Menedzser(int kor, int ragacs, int olaj, String nev) {
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
		this.obinev = nev;
	}
	
	public Palya_Menedzser(int kor, int ragacs, int olaj) {
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
	}
	
	public void korSzamol() {
		// ... Kőr számlálás
		// ... Valami feltétel
		System.out.println("korszamol")
	}

	public int getKor() {
		return this.kor;
	}

	/**
	 * 
	 * @param kor
	 */
	public void setKor(int kor) {
		this.kor = kor;
	}

	/**
	 * 
	 * @param olajkeszlet
	 */
	public void setOlajkeszlet(int olajkeszlet) {
		this.olajkeszlet = olajkeszlet;
	}

	/**
	 * 
	 * @param ragacskeszlet
	 */
	public void setRagacskeszlet(int ragacskeszlet) {
		this.ragacskeszlet = ragacskeszlet;
	}
}
