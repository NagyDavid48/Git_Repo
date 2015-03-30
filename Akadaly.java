package Class_Diagram;

/**
 * Ez az osztály a felelős az akadályokra jellemző viselkedésért.
 */


public abstract class Akadaly {
	public String obinev;//Logger miatt - ideiglenes
	public int elet;//Az akadályok eltűnnek valaminek a hatására
	/**
	 * Ez az a függvény, ami kiváltja a robotokból a
	 * különböző reakciókat.
	 * @param r
	 */
	public abstract void viselkedes(Robot r);
	
	/**
	 * Az élet változót csökkenti.
	 * Olajfoltnál körönként hívódik meg, míg ragacsnál a viselkedés fv. hívásakor.
	 */
	public void eletCsokkent(){
		elet--;
	}
}
