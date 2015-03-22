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
			Palya_Menedzser pm = new Palya_Menedzser( argumentumok );
			objektumok.add("pm : Palya_Menedzser");
			Palya p = new Palya( argumentumok );
			objektumok.add("p : Palya");
			Mezo m = new Mezo( argumentumok );
			objektumok.add("m : Mezo");
			Mezo m1 = new Mezo( argumentumok );
			objektumok.add("m1 : Mezo");
			Mezo m2 = new Mezo( argumentumok );
			objektumok.add("m2 : Mezo");
			System.out.println("Kiindulási objektumok:");
			objKiir();
			for(int i=0; i<3; i++)
			   pm.korSzamol();
			m.setCheckpoint(true);
			m1.setCheckpoint(true);
			m2.setCheckpoint(true);
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
			Palya p = new Palya(2,2,2,,);
			objektumok.add("p : Palya");
			Mezo m = new Mezo();
			objektumok.add("m : Mezo");
			Mezo m2 = new Mezo();
			objektumok.add("m2 : Mezo");
			Robot r = new Robot();
			objektumok.add("r : Robot");
			Robot r2 = new Robot();
			objektumok.add("r2 : Robot");
			System.out.println("Kiindulási objektumok:");
			objKiir();
			break;
		default:
			System.out.println("Nincs ilyen számú szekvenciadiagram");
		}
		
	}
	
	public static int readMenu() throws IOException{
		return Integer.parseInt(reader.readLine());
		
	}

}
