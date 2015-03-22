package palya;

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
	
	/**
	 * 
	 * @param kor
	 * @param ragacs
	 * @param olaj
	 */
	public Palya_Menedzser(int kor, int ragacs, int olaj) {
		//System.out.println("");
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
		//System.out.println("");
	}

	public void korSzamol() {
		//System.out.println("PM - korSzamol fv. kezdodik.");
		this.kor--;//Mínusz 1 kőr
		//System.out.println("korSzamol vege.");
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
