package akadaly;

public class Olajfolt extends Akadaly {

	/**
	 * A robot megcsúszik. A következő kőrben nem változtathatja a sebességét.
	 * @param r
	 */
	public void viselkedes(Robot r) {
		System.out.println("Olajfolt viselkedes fv.-e kezdodik r parameterrel");
		r.setOlajonVan(true);
		System.out.println("Olajfolt viselkedes fv. vege");
	}
}
