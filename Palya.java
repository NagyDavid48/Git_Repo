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

	/**Vektor feldolgozása
	 * 
	 * Megnézi hogy a robot az előző körben olajra lépett-e, majd annak függvényében
	 * lépteti a robotot. 
	 * @param v
	 */
	public void vektorFeldolgoz(Vektor v) {
		logMetodusStart(objNev, "vektorFeldolgoz(Vektor v)");
		
		
		robotok[0].getOlajonVan();
		robotLeptet(robotok[0], v);
		mezok[0][1].setrobot(robotok[0]);
		mezok[0][1].getCheckpoint();
		robotok[0].addCheckpoint();
		
		logMetodusReturn("");
	}

	/**Robot léptetése
	 * 
	 * Kiszámolja az új mező pozícióját, megnézi a mező tulajdonságait majd lépteti a robotot
	 * 
	 * @param r
	 * @param v
	 */
	public void robotLeptet(Robot r, Vektor v) {
		logMetodusStart(objNev, "robotLeptet(Robot r, Vektor v)");
		
		
		r.lep(v);
		
		mezok[0][0].setRobot(null);
		
		mezok[0][1].getPalyaszakasz();
		mezok[0][1].getAkadaly();
		mezok[0][1].getRobot();
		
		r.setMezo(mezok[0][1]);
		
		logMetodusReturn("");
	}
	/** Checkpoint elhelyezés
	 *
	 * Bizonyos számú kör leteltével néhány mezőt checkpointnak állít be.
	 * 
	 */
	public void cpKioszt() {
		logMetodusStart(objNev, "cpKioszt()");
		
		mezok[0][0].setCheckpoint(true);
		mezok[0][1].setCheckpoint(true);
		mezok[1][0].setCheckpoint(true);
	
		logMetodusReturn("");
	}

	/**Olajfolt elhelyezése
	 * 
	 * Olajfoltot tesz arra a mezőre ahol az azt elhelyező robot áll éppen.
	 * 
	 * @param r
	 */
	public void olajLerak(Robot r) {
		logMetodusStart(objNev, "olajLerak(Robot r)");
		r.olajLerak();
		logMetodusReturn("");
	}

	/**Ragacs elhelyezése
	 * 
	 * Ragacsot tesz arra a mezőre ahol az azt elhelyező robot áll éppen.
	 * 
	 * @param r
	 */
	public void ragacsLerak(Robot r) {
		logMetodusStart(objNev, "ragacsLerak(Robot r)");
		r.ragacsLerak();
		logMetodusReturn("");
	}

	/**Két robot ütközése
	 * 
	 * A robotot akinek nekiütköztek visszalépteti az előző pozíciójára
	 * 
	 * @param r
	 * @param v
	 */
	public void utkozes(Robot r, Vektor v) {
		logMetodusStart(objNev, "utkozes(Robot r, Vektor v)");
		
		r.lep(v);
		mezok[0][1].getRobot();
		r.setMezo(mezok[0][1]);
		logMetodusReturn("");
	}
	
	/**Checkpointok összesítése
	 *
	 * A játék végén kiválasztja hogy melyik robot lépett rá legtöbb checkpointra
	 * 
	 */
	public void gyoztesValaszt() {
		logMetodusStart(objNev, "gyoztesValaszt()");
		
		robotok[0].getCheckpoint();
		robotok[1].getCheckpoint();
		logMetodusReturn("");
	}

}
