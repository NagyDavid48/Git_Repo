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
		Logger.logMetodusStart(nev, "(new Palya_Menedzserf(kor, mag, szel, rob, ragacs, olaj))");
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
		this.obinev = nev;
		palya = new Palya(mag, szel, rob, olaj, ragacs);
		Logger.tabok-=1;
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
		Logger.logMetodusStart(obinev, "korSzamol()");
		Logger.logMetodusReturn("");
	}

	public int getKor() {
		Logger.logMetodusStart(obinev, "getKor()");
		Logger.logMetodusReturn("kor");
		return this.kor;
	}

	/**
	 * 
	 * @param kor
	 */
	public void setKor(int kor) {
		Logger.logMetodusStart(obinev, "setKor(kor)");
		this.kor = kor;
		Logger.logMetodusReturn("");
	}

	/**
	 * 
	 * @param olajkeszlet
	 */
	public void setOlajkeszlet(int olajkeszlet) {
		Logger.logMetodusStart(obinev, "setOlajkeszlet(olajkeszlet)");
		this.olajkeszlet = olajkeszlet;
		Logger.logMetodusReturn("");
	}

	/**
	 * 
	 * @param ragacskeszlet
	 */
	public void setRagacskeszlet(int ragacskeszlet) {
		Logger.logMetodusStart(obinev, "setRagacskeszlet(ragacskeszlet)");
		this.ragacskeszlet = ragacskeszlet;
		Logger.logMetodusReturn("");
	}
}
