package Class_Diagram;

public class Mezo {

	private boolean checkpoint;
	private boolean palyaszakasz;
	private Akadaly akadaly;
	private Robot robot;
	private Vektor poziciovektor;
	
	private String obinev;


	// A Mezo osztály konstruktora, beállítja a checkpointot, pályaszakaszt, akadályt, robotot és a pozíciót
	public Mezo(boolean checkp, boolean palyaszakasz, Akadaly akadaly, Robot robot, Vektor pozicio, String nev) {
		this.checkpoint = checkp;
		this.palyaszakasz = palyaszakasz;
		this.akadaly = akadaly;
		this.robot = robot;
		this.obinev = nev;
	}
	
	// checkpoint gettere
	public boolean getCheckpoint() {
		return this.checkpoint;
	}

	//checkpoint settere
	public void setCheckpoint(boolean checkpoint) {
		this.checkpoint = checkpoint;
	}
	
	//palyaszakasz gettere
	public boolean getPalyaszakasz() {
		return this.palyaszakasz;
	}

	//palyaszakasz settere
	public void setPalyaszakasz(boolean palyaszakasz) {
		this.palyaszakasz = palyaszakasz;
	}
	
	//akadaly gettere, meghívja az akadály viselkedését
	public Akadaly getAkadaly() {
		this.akadaly.viselkedes(this.robot);
		return this.akadaly;
	}

	//akadaly settere
	public void setAkadaly(Akadaly akadaly) {
		this.akadaly = akadaly;
	}
	
	//robot gettere
	public Robot getRobot() {
		return this.robot;
	}

	//robot settere
	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	//poziciovektor gettere
	public Vektor getPoziciovektor() {
		return this.poziciovektor;
	}

	//poziciovektor settere
	public void setPoziciovektor(Vektor poziciovektor) {
		this.poziciovektor = poziciovektor;
	}



}
