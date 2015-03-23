package Class_Diagram;

public class Mezo {

	private boolean checkpoint;
	private boolean palyaszakasz;
	private Akadaly akadaly;
	private Robot robot;
	private Vektor poziciovektor;
	
	public String obinev;


	// A Mezo osztály konstruktora, beállítja a checkpointot, pályaszakaszt, akadályt, robotot és a pozíciót
	public Mezo(boolean checkp, boolean palyaszakasz, Akadaly akadaly, Robot robot, Vektor pozicio, String nev) {
		Logger.logMetodusStart(nev, "(new Mezo)");
		this.checkpoint = checkp;
		this.palyaszakasz = palyaszakasz;
		this.akadaly = akadaly;
		this.robot = robot;
		this.poziciovektor = pozicio;
		this.obinev = nev;
		Logger.tabok-=1;
	}
	
	// checkpoint gettere
	public boolean getCheckpoint() {
		Logger.logMetodusStart(obinev, "getCheckpoint()");
		Logger.logMetodusReturn(Boolean.toString(checkpoint));
		return this.checkpoint;
	}

	//checkpoint settere
	public void setCheckpoint(boolean checkpoint) {
		Logger.logMetodusStart(obinev, "setCheckpoint("+Boolean.toString(checkpoint)+")");
		Logger.logMetodusReturn("");
		this.checkpoint = checkpoint;
	}
	
	//palyaszakasz gettere
	public boolean getPalyaszakasz() {
		Logger.logMetodusStart(obinev, "getPalyaszakasz()");
		Logger.logMetodusReturn(Boolean.toString(palyaszakasz));
		return this.palyaszakasz;
	}

	//palyaszakasz settere
	public void setPalyaszakasz(boolean palyaszakasz) {
		Logger.logMetodusStart(obinev, "setPalyaszakasz("+Boolean.toString(palyaszakasz)+")");
		Logger.logMetodusReturn("");
		this.palyaszakasz = palyaszakasz;
	}
	
	//akadaly gettere, meghívja az akadály viselkedését
	public Akadaly getAkadaly() {
		Logger.logMetodusStart(obinev, "getAkadaly()");
		if (akadaly != null){
			this.akadaly.viselkedes(this.robot);
			Logger.logMetodusReturn(akadaly.obinev);
		}
		else
			Logger.logMetodusReturn("null");
		return this.akadaly;
	}

	//akadaly settere
	public void setAkadaly(Akadaly akadaly) {
		Logger.logMetodusStart(obinev, "setAkadaly("+akadaly.obinev+")");
		Logger.logMetodusReturn("");
		this.akadaly = akadaly;
	}
	
	//robot gettere
	public Robot getRobot() {
		Logger.logMetodusStart(obinev, "getRobot()");
		if( this.robot!=null)
			Logger.logMetodusReturn(robot.obinev);
		else Logger.logMetodusReturn("null");
		return this.robot;
	}

	//robot settere
	public void setRobot(Robot robot) {
		if (robot != null)
			Logger.logMetodusStart(obinev, "setRobot("+robot.obinev+")");
		else Logger.logMetodusStart(obinev, "setRobot(null)");
		this.robot = robot;
		Logger.logMetodusReturn("");
	}

	//poziciovektor gettere
	public Vektor getPoziciovektor() {
		Logger.logMetodusStart(obinev, "getPozicioVektor()");
		Logger.logMetodusReturn("pv");
		return this.poziciovektor;
	}

	//poziciovektor settere
	public void setPoziciovektor(Vektor poziciovektor) {
		Logger.logMetodusStart(obinev, "setPoziciovektor(pv)");
		this.poziciovektor = poziciovektor;
		Logger.logMetodusReturn("");
	}



}
