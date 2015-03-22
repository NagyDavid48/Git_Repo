package Class_Diagram;

public class Olajfolt extends Akadaly {

	//Konstruktor a szkeleton idejére.
	public Olajfolt(String nev){
		this.obinev = nev;
	}
	/**
	 * A robot megcsúszik. A következő kőrben nem változtathatja a sebességét.
	 * @param r
	 */
	public void viselkedes(Robot r) {
		//System.out.println("");
		r.setOlajonVan(true);
		//System.out.println("");
	}
}
