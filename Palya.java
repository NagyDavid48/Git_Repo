package Class_Diagram;

public class Palya {

	private Mezo[][] mezok;
	private Robot[] robotok;
	private int soronlevo;
	
	private Mezo m;
	private Robot r;
	private Ragacs rag;
	public String objNev;

	/**
	 * 
	 * @param szelesseg
	 * @param magassag
	 * @param robotszam
	 * @param olaj
	 * @param ragacs
	 */
	public Palya(int szelesseg, int magassag, int robotszam, int olaj, int ragacs, String objNev) {
		//Mező létrehozása
		m = new Mezo(false, true, null, null, new Vektor(0, 0), "m");
		
		cpKioszt();
		
		//Robot létrehozása
		r = new Robot(2, 2, "r");
		
		r.setMezo(m);
		
		this.objNev = objNev;
	}

	/**
	 * 
	 * 
	 * 
	 * @param v
	 */
	public void vektorFeldolgoz(Vektor v) {
		System.out.println("vektorFeldolgoz");
		
		
		robotok[0].getOlajonVan();
		robotLeptet(robotok[0], v);
		mezok[0][1].setrobot(robotok[0]);
		mezok[0][1].getCheckpoint();
		robotok[0].addCheckpoint();
		
	}

	/**Robot léptetése
	 * 
	 * Kiszámolja az új mező pozícióját, megnézi a mező tulajdonságait majd lépteti a robotot
	 * 
	 * @param r
	 * @param v
	 */
	public void robotLeptet(Robot r, Vektor v) {
		System.out.println("robotLeptet");
		
		
		r.lep(v);
		
		mezok[0][0].setRobot(null);
		
		mezok[0][1].getPalyaszakasz();
		mezok[0][1].getAkadaly();
		mezok[0][1].getRobot();
		
		r.setMezo(mezok[0][1]);
		
	}
	/** Checkpoint elhelyezés
	 *
	 * Bizonyos számú kör leteltével néhány mezőt checkpointnak állít be.
	 * 
	 */
	public void cpKioszt() {
		System.out.println("cpKioszt");
		
		mezok[0][0].setCheckpoint(true);
		mezok[0][1].setCheckpoint(true);
		mezok[1][0].setCheckpoint(true);
	}

	/**Olajfolt elhelyezése
	 * 
	 * Olajfoltot tesz arra a mezőre ahol az azt elhelyező robot áll éppen.
	 * 
	 * @param r
	 */
	public void olajLerak(Robot r) {
		System.out.println("olajLerak");
		r.olajLerak();
	}

	/**Ragacs elhelyezése
	 * 
	 * Ragacsot tesz arra a mezőre ahol az azt elhelyező robot áll éppen.
	 * 
	 * @param r
	 */
	public void ragacsLerak(Robot r) {
		System.out.println("ragacsLerak");
		r.ragacsLerak();
	}

	/**Két robot ütközése
	 * 
	 * A robotot akinek nekiütköztek visszalépteti az előző pozíciójára
	 * 
	 * @param r
	 * @param v
	 */
	public void utkozes(Robot r, Vektor v) {
		System.out.println("utkozes");
		
		r.lep(v);
		mezok[0][1].getRobot();
		r.setMezo(mezok[0][1]);
		
	}
	
	/**
	 *
	 * A játék végén kiválasztja hogy melyik robot lépett ráa legtöbb checkpointra
	 * 
	 */
	public void gyoztesValaszt() {
		System.out.println("gyoztesValaszt");
		
		robotok[0].getCheckpoint();
		robotok[1].getCheckpoint();
	}

}
