package Class_Diagram;

public class Ragacs extends Akadaly {

	public Ragacs(String nev){
		this.obinev = nev;
	}
	/**
	 * A robot sebesség vektora a felére csökken.
	 * @param r
	 */
	public void viselkedes(Robot r) {
		Logger.logMetodusStart(obinev, "viselkedes(Robot r)");
		//System.out.println("");
		r.ragacsraLepett();
		//System.out.println("");
		Logger.logMetodusReturn("");
	}
}
