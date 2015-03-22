import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Logger {
	
	//hány tabot kell kiírni
	public static int tabok=0;
	//a parancs beolvasásához
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//a kiinduló objektumok kiíratásához
	static ArrayList<String> objektumok = new ArrayList<String>();
	
	//metódushívás logolása
	//használat: metódusok elején meghívni a saját objektumnevével és a metódus nevével
	public static void logMetodusStart(String objneve, String metneve){
		tabok++;
		System.out.println(tabKiir() + "-> " + objneve + "." + metneve);
	}
	
	//visszatérés logolása
	//használat: metódusok végén meghívni a visszatérési értékkel
	public static void logMetodusReturn(String visszaertek){
		System.out.println(tabKiir() + "<- " + visszaertek);
		tabok--;
	}
	
	//tabok kiírására, annyi tabbal tér vissza, ahányadik szinten vagyunk
	public static String tabKiir(){
		StringBuilder sb = new StringBuilder();
		sb.append("");
		for (int i=0; i<tabok; i++){
			sb.append("    ");
		}
		return sb.toString();
	}
	
	//szekvenciainicializálásnál a kezdő objektumok kiírására
	public static void objKiir(){
		for(int i=0;i<objektumok.size();i++){
			System.out.println("    "+objektumok.get(i));
		}
	}
	
	//main függvény: menüt kiírja, végrehajtja a szekvenciákat
	public static void main(String[] args) throws IOException{
		int menupont;
		
		System.out.print("Adja meg a parancs kódját : ");
		menupont = readMenu();
		switch(menupont){
		
//		template
//		case sorszám:
//			Tipus obj = new Tipus();
//			objektumok.add("obj : Tipus");
//			System.out.println("Kiindulási objektumok:");
//			objKiir();
//			első metódus meghívása
//			break;
		case 5:
+			Palya_Menedzser pm = new Palya_Menedzser( argumentumok );
+			objektumok.add("pm : Palya_Menedzser");
+			Palya p = new Palya( argumentumok );
+			objektumok.add("p : Palya");
+			Mezo m = new Mezo( argumentumok );
+			objektumok.add("m : Mezo");
+			Mezo m1 = new Mezo( argumentumok );
+			objektumok.add("m1 : Mezo");
+			Mezo m2 = new Mezo( argumentumok );
+			objektumok.add("m2 : Mezo");
+			System.out.println("Kiindulási objektumok:");
+			objKiir();
+			for(int i=0; i<3; i++)
+			   pm.korSzamol();
+			m.setCheckpoint(true);
+			m1.setCheckpoint(true);
+			m2.setCheckpoint(true);
			break;
		case 8:
			Palya p = new Palya( argumentumok );
			objektumok.add("p : Palya");
			Mezo m = new Mezo( argumentumok );
			objektumok.add("m : Mezo");
			Robot r = new Robot( argumentumok );
			objektumok.add("r : Robot");
			System.out.println("Kiindulási objektumok:");
			objKiir();
			r.setMezo();
			break;
		case 9: // Ütközés
			Palya p = new Palya(2,2,2,2,2,"p");
			objektumok.add("p : Palya");
			Mezo m = new Mezo(false, true, null, r2, new Vektor(0,0));
			objektumok.add("m : Mezo");
			Mezo m2 = new Mezo(false, true, null, null, new Vektor(0,1));
			objektumok.add("m2 : Mezo");
			Robot r = new Robot(2, 2, "r");
			objektumok.add("r : Robot");
			Robot r2 = new Robot(2,2,"r2");
			objektumok.add("r2 : Robot");
			System.out.println("Kiindulási objektumok:");
			objKiir();//"Init" vége
			p.robotLeptet(r, new Vektor(0,1));//Indul
			m.getRobot();
			r2.getVektor();
			p.utkozes(r2, new Vektor(0,-2));
			m2.getRobot();
			r2.setMezo(r2);
			r.setMezo(m);
			break;
		case 10: //Leesés
			Palya p = new Palya(2,2,2,2,2,"p");
			objektumok.add("p : Palya");
			Robot r1 = new Robot(2,2,"r1");
			objektumok.add("r1 : Robot");
			Mezo m1 = new Mezo(false, true, null, r1, new Vektor(0,0));
			objektumok.add("m1 : Mezo");
			Mezo m2 = new Mezo(false, false, null, null, new Vektor(0,1));
			objektumok.add("m2 : Mezo");
			System.out.println("Kiindulási objektumok:");
			objKiir();//"Init" vége
			p.robotLeptet(r1, new Vektor(0,1));//Indul
			m2.getPalyaszakasz();
			r1.setKiesett(true);
			break;
		default://Magical place in Hell!
			System.out.println("Nincs ilyen számú szekvenciadiagram");
		}
		
	}
	
	//a megadott számot szövegből számmá alakítja. Ha nem tudja, 20-szal tér vissza
	public static int readMenu() throws IOException{
		try{
			return Integer.parseInt(reader.readLine());
		}catch (NumberFormatException e){return 20;}
		
	}

}
