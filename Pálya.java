package Class_Diagram;

import java.awt.Robot;

public class Palya {

	private Mezo[][] mezok;
	private Robot[] robotok;
	private int soronlevo;

	/**
	 * 
	 * @param szelesseg
	 * @param magassag
	 * @param robotszam
	 * @param olaj
	 * @param ragacs
	 */
	public Palya(int szelesseg, int magassag, int robotszam, int olaj, int ragacs) {
		//Mezők létrehozása
		mezok = new Mezo[magassag][szelesseg]();
		
		//Robotok létrehozása
		robotok = new Robot[3]();
		
		
	}

	/**
	 * 
	 * @param v
	 */
	public void vektorFeldolgoz(Vektor v) {
		
		robotok[0].getOlajonVan();
		
		robotLeptet(robotok[0], v);
		
		mezok[0][1].setrobot(robotok[0]);
		
		mezok[0][1].getCheckpoint();
		
		robotok[0].addCheckpoint();
		
	}

	/**
	 * 
	 * @param r
	 * @param v
	 */
	public void robotLeptet(Robot r, Vektor v) {
		
		r.lep(v);
		
		mezok[0][0].setRobot(NULL);
		
		mezok[0][1].getPalyaszakasz();
		mezok[0][1].getAkadaly();
		mezok[0][1].getRobot();
		
		r.setMezo(mezok[0][1]);
		
	}

	public void cpKioszt() {
		mezok[0][0].setCheckpoint(true);
		mezok[0][1].setCheckpoint(true);
		mezok[0][2].setCheckpoint(true);
	}

	/**
	 * 
	 * @param r
	 */
	public void olajLerak(Robot r) {
		r.olajLerak();
	}

	/**
	 * 
	 * @param r
	 */
	public void ragacsLerak(Robot r) {
		r.ragacsLerak();
	}

	/**
	 * 
	 * @param r
	 * @param v
	 */
	public void utkozes(Robot r, Vektor v) {
		
		r.lep(v);
		mezok[0][1].getRobot();
		r.setMezo(mezok[0][1]);
		
	}

	public void gyoztesValaszt() {
		
		robotok[0].getCheckpoint();
		robotok[1].getCheckpoint();
	}

}
