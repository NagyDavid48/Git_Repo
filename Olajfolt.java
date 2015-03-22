package akadaly;

public class Ragacs extends Akadaly {

	/**
	 * A robot sebesség vektora a felére csökken.
	 * @param r
	 */
	public void viselkedes(Robot r) {
		System.out.println("Ragacs viselkedes fv. kezdodik r parameterrel.");
		r.ragacsraLepett();
		System.out.println("Ragacs viselkedes fv. vege.");
	}
}
