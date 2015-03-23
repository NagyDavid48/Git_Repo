package Class_Diagram;

public class Palya {

	public Mezo[][] mezok = new Mezo[2][2];
	private Robot[] robotok = new Robot[2];
	private int soronlevo;
	
	private String objNev;

	/**
	 * 
	 * @param szelesseg
	 * @param magassag
	 * @param robotszam
	 * @param olaj
	 * @param ragacs
	 */
	public Palya(int szelesseg, int magassag, int robotszam, int olaj, int ragacs, String objNev, int init) {
		Logger.logMetodusStart(objNev, "(new Palya)");
		this.objNev = objNev;
		//Mezők létrehozása
		mezok[0][0] = new Mezo(false, true, null, null, null, "m");
		cpKioszt();
	
		//Robotok létrehozása
		robotok[0] = new Robot(0,0,"r");
		robotok[0].setMezo(mezok[0][0]);
		
		Olajfolt o = new Olajfolt("o");
		mezok[0][0].setAkadaly(o);
		Logger.tabok-=1;
	}
	
	public Palya(int szelesseg, int magassag, int robotszam, int olaj, int ragacs, String objNev) {
		//Mezők létrehozása
		mezok = new Mezo[magassag][szelesseg];
		for(int i = 0; i < magassag; ++i){
			for(int j = 0; j < szelesseg; j++){
				mezok[i][j] = new Mezo(false, false, null, null, null, objNev);
			}
		}

		this.objNev = objNev;
	}

	/**
	 * 
	 * 
	 * 
	 * @param v
	 */
	public void vektorFeldolgoz(Vektor v) {
		Logger.logMetodusStart(objNev,"vektorFeldolgoz(v)");
		
		
		robotok[0].getOlajonvan();
		robotLeptet(robotok[0], v);
		mezok[0][1].setRobot(robotok[0]);
		if (mezok[0][1].getCheckpoint())
			robotok[0].addCheckpoint();
		Logger.logMetodusReturn("");
		
	}

	/**Robot léptetése
	 * 
	 * Kiszámolja az új mező pozícióját, megnézi a mező tulajdonságait majd lépteti a robotot
	 * 
	 * @param r
	 * @param v
	 */
	public void robotLeptet(Robot r, Vektor v) {
		Logger.logMetodusStart(objNev, "robotLeptet("+r.obinev+", v)");
		Robot masikrobot;
		
		r.lep(v);
		mezok[0][0].setRobot(null);
		
		if(!mezok[0][1].getPalyaszakasz())
			r.setKiesett(true);
		else {
			mezok[0][1].getAkadaly();
			if((masikrobot=mezok[0][1].getRobot())!=null){
				masikrobot.getVektor();
				utkozes(masikrobot, new Vektor(0,0));
			}
			
		}
		r.setMezo(mezok[0][1]);
		Logger.logMetodusReturn("");
		
	}
	/** Checkpoint elhelyezés
	 *
	 * Bizonyos számú kör leteltével néhány mezőt checkpointnak állít be.
	 * 
	 */
	public void cpKioszt() {
		Logger.logMetodusStart(objNev, "cpKioszt()");
		
		mezok[0][0].setCheckpoint(true);
		if (mezok[0][1]!=null){
			mezok[0][1].setCheckpoint(true);
			mezok[1][0].setCheckpoint(true);
		}
		Logger.logMetodusReturn("");
	}

	/**Olajfolt elhelyezése
	 * 
	 * Olajfoltot tesz arra a mezőre ahol az azt elhelyező robot áll éppen.
	 * 
	 * @param r
	 */
	public void olajLerak(Robot r) {
		Logger.logMetodusStart(objNev, "olajLerak("+r.obinev+")");
		r.olajLerak();
		Logger.logMetodusReturn("");
	}

	/**Ragacs elhelyezése
	 * 
	 * Ragacsot tesz arra a mezőre ahol az azt elhelyező robot áll éppen.
	 * 
	 * @param r
	 */
	public void ragacsLerak(Robot r) {
		Logger.logMetodusStart(objNev, "ragacsLerak("+r.obinev+")");
		r.ragacsLerak();
		Logger.logMetodusReturn("");
	}

	/**Két robot ütközése
	 * 
	 * A robotot akinek nekiütköztek visszalépteti az előző pozíciójára
	 * 
	 * @param r
	 * @param v
	 */
	public void utkozes(Robot r, Vektor v) {
		Logger.logMetodusStart(objNev, "utkozes("+r.obinev+", -2w)");
		Robot masikrobot;
		r.lep(v);

		if(!mezok[1][0].getPalyaszakasz())
			r.setKiesett(true);
		else {
			mezok[1][0].getAkadaly();
			if((masikrobot=mezok[1][0].getRobot())!=null){
				masikrobot.getVektor();
				utkozes(masikrobot, new Vektor(0,0));
			}
			
		}
		r.setMezo(mezok[1][0]);
		
		Logger.logMetodusReturn("");
	}
	
	/**
	 *
	 * A játék végén kiválasztja hogy melyik robot lépett ráa legtöbb checkpointra
	 * 
	 */
	public void gyoztesValaszt() {
		Logger.logMetodusStart(objNev, "gyoztesValaszt()");
		
		robotok[0].getCheckpoint();
		robotok[1].getCheckpoint();
		Logger.logMetodusReturn("");
	}
	
	public void addRobot(Robot r){
		if(robotok[0] == null)
			robotok[0] = r;
		else robotok[1] = r;
	}

}
