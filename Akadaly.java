package Class_Diagram;

/**
 * Ez az osztály a felelős az akadályokra jellemző viselkedésért.
 */
public abstract class Akadaly {
	public String obinev;
	/**
	 * Ez az a függvény, ami kiváltja a robotokból a
	 * különböző reakciókat.
	 * @param r
	 */
	public abstract void viselkedes(Robot r);
}
