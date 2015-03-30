package Class_Diagram;

public class Ragacs extends Akadaly {

	public Ragacs(){
		this.elet = 4;
	}
	
	public Ragacs(String nev){
		Logger.logMetodusStart(nev, "(new Ragacs)");
		this.obinev = nev;
		Logger.tabok-=1;
	}
	
	/**
	 * A robot sebesség vektora a felére csökken.
	 * @param r
	 */
	public void viselkedes(Robot r) {
		Logger.logMetodusStart(obinev, "viselkedes("+r.obinev+")");
		this.eletCsokkent();
		r.ragacsraLepett();
		Logger.logMetodusReturn("");
	}
}
