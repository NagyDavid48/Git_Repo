package Class_Diagram;

public class Olajfolt extends Akadaly {

	public Olajfolt(){
		this.elet = 4;
	}
	
	//Konstruktor a szkeleton idejére.
	public Olajfolt(String nev){
		Logger.logMetodusStart(nev, "(new Olajfolt)");
		this.obinev = nev;
		Logger.tabok-=1;
	}
	/**
	 * A robot megcsúszik. A következő körben nem változtathatja a sebességét.
	 * @param r
	 */
	public void viselkedes(Robot r) {
		Logger.logMetodusStart(obinev, "viselkedes("+r.obinev+")");
		//System.out.println("");
		r.setOlajonvan(true);
		//System.out.println("");
		Logger.logMetodusReturn("");
	}
}
