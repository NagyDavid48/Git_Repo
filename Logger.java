import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Logger {
	
	public static boolean enablelogging=false;
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
			if(enablelogging){
			System.out.println(tabKiir() + "-> " + objneve + "." + metneve);
		}
	}
	
	//visszatérés logolása
	//használat: metódusok végén meghívni a visszatérési értékkel
	public static void logMetodusReturn(String visszaertek){
		if(enablelogging){
			System.out.println(tabKiir() + "<- " + visszaertek);
		}
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
		enablelogging=true;
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
			case 1:
				
				objektumok.add("pm : Palya_Menedzser");
				System.out.println("Kiindulási objektumok:");
				objKiir();
				Palya_Menedzser pm_1 = new Palya_Menedzser(1,2,2,1,2,2,"pm",1);
				break;
			case 2: //Robot Léptet
				
				objektumok.add("pm : Palya_Menedzser");
				Palya p_2 = new Palya(2,2,2,2,2,"p");
				Palya_Menedzser pm_2 = new Palya_Menedzser(1,2,2,1,2,2,p_2,"pm");
				objektumok.add("p : Palya");
				Mezo m1_2 = new Mezo(false,true,null, null, new Vektor(0,0), "m1");
				objektumok.add("m1 : Mezo");
				Mezo m2_2 = new Mezo(false,true,null, null, new Vektor(1,0), "m2");
				objektumok.add("m2 : Mezo");
				Robot r_2 = new Robot(2,2,"r");
				r_2.setMezo(m1_2);
				p_2.addRobot(r_2);
				p_2.mezok[0][0] = m1_2;
				p_2.mezok[0][1] = m2_2;
				p_2.mezok[0][0].setRobot(r_2);
				objektumok.add("r : Robot");
				Vektor v = new Vektor(0,0);
				objektumok.add("v : Vektor");
				System.out.println("Kiindulási objektumok:");
				objKiir();
				p_2.vektorFeldolgoz(v);
				pm_2.korSzamol();
				break;
			case 3: //Olajfolt Elhelyezése
				
				objektumok.add("pm : Palya_Menedzser");
				Palya p_3 = new Palya(2,2,2,2,2,"p");
				Palya_Menedzser pm_3 = new Palya_Menedzser(1,2,2,1,2,2,p_3,"pm");
				objektumok.add("p : Palya");
				Mezo m_3 = new Mezo(false,true,null, null, new Vektor(0,0),"m");
				objektumok.add("m : Mezo");
				Robot r_3 = new Robot(2,2,"r");
				objektumok.add("r : Robot");
				r_3.setMezo(m_3);
				m_3.setRobot(r_3);
				p_3.addRobot(r_3);
				System.out.println("Kiindulási objektumok:");
				objKiir();
				p_3.olajLerak(r_3);
				break;
			case 4: //Ragacs Elhelyezése
				
				objektumok.add("pm : Palya_Menedzser");
				Palya p_4 = new Palya(2,2,2,2,2,"p");
				Palya_Menedzser pm_4 = new Palya_Menedzser(1,2,2,1,2,2,p_4,"pm");
				objektumok.add("p : Palya");
				Mezo m_4 = new Mezo(false,true,null, null, new Vektor(0,0), "m");
				objektumok.add("m : Mezo");
				Robot r_4 = new Robot(2,2,"r");
				objektumok.add("r : Robot");
				r_4.setMezo(m_4);
				m_4.setRobot(r_4);
				p_4.addRobot(r_4);
				System.out.println("Kiindulási objektumok:");
				objKiir();
				p_4.ragacsLerak(r_4);
				break;
			case 5: //CheckPoint Beállítása
				
				objektumok.add("pm : Palya_Menedzser");
				Palya p_5 = new Palya(2,2,2,2,2,"p");
				Palya_Menedzser pm_5 = new Palya_Menedzser(1,2,2,1,2,2,p_5,"pm");
				objektumok.add("p : Palya");
				Mezo m_5 = new Mezo(false,true,null, null, new Vektor(0,0),"m");
				objektumok.add("m : Mezo");
				Mezo m1_5 = new Mezo(false,true, null, null, new Vektor(1,0),"m1");
				objektumok.add("m1 : Mezo");
				Mezo m2_5 = new Mezo(false,true,null,null, new Vektor(0,1),"m2");
				objektumok.add("m2 : Mezo");
				p_5.mezok[0][0]=m_5;
				p_5.mezok[0][1]=m1_5;
				p_5.mezok[1][0]=m2_5;
				System.out.println("Kiindulási objektumok:");
				objKiir();
				for(int i=0; i<3; i++)
				   pm_5.korSzamol();
				p_5.cpKioszt();
				break;
			case 6: //Olajra Lépés
				Palya p_6 = new Palya(2,2,2,2,2,"p");
				objektumok.add("p : Palya");
				Olajfolt o_6 = new Olajfolt("o");
				Mezo m_6 = new Mezo(false,true,o_6, null, new Vektor(0,0),"m");
				objektumok.add("m : Mezo");
				Robot r_6 = new Robot(2,2,"r");
				objektumok.add("r : Robot");
				objektumok.add("o : Olajfolt");
				r_6.setMezo(m_6);
				m_6.setRobot(r_6);
				System.out.println("Kiindulási objektumok:");
				objKiir();
				m_6.getAkadaly();
				r_6.setMezo(m_6);
				break;
			case 7: //Ragacsra Lépés
				Palya p_7 = new Palya(2,2,2,2,2,"p");
				objektumok.add("p : Palya");
				Ragacs ra_7 = new Ragacs("ra");
				Mezo m_7 = new Mezo(false,true,ra_7, null, new Vektor(0,0),"m");
				objektumok.add("m : Mezo");
				Robot r_7 = new Robot(2,2,"r");
				objektumok.add("r : Robot");
				objektumok.add("ra : Ragacs");
				r_7.setMezo(m_7);
				m_7.setRobot(r_7);
				System.out.println("Kiindulási objektumok:");
				objKiir();
				m_7.getAkadaly();
				r_7.setMezo(m_7);
				break;
			case 8: //Checkpointra Lépés
				Palya p_8 = new Palya(2,2,2,2,2,"p");
				objektumok.add("p : Palya");
				Mezo m_8 = new Mezo(true,true,null, null, new Vektor(0,0),"m");
				objektumok.add("m : Mezo");
				Robot r_8 = new Robot(2,2,"r");
				objektumok.add("r : Robot");
				System.out.println("Kiindulási objektumok:");
				objKiir();
				r_8.setMezo(m_8);
				m_8.getCheckpoint();
				r_8.addCheckpoint();
				m_8.setCheckpoint(false);
				break;
			case 9: // Ütközés
				Palya p_9 = new Palya(2,2,2,2,2,"p");
				objektumok.add("p : Palya");
				Robot r2_9 = new Robot(2,2,"r2");
				Mezo m_9 = new Mezo(false, true, null, null, new Vektor(0,0),"m");
				objektumok.add("m : Mezo");
				Mezo m2_9 = new Mezo(false, true, null, r2_9, new Vektor(0,1),"m2");
				objektumok.add("m2 : Mezo");
				Mezo m3_9 = new Mezo(false, true, null, null, new Vektor(1,0),"m3");
				Robot r_9 = new Robot(2, 2, "r");
				objektumok.add("r : Robot");
				
				objektumok.add("r2 : Robot");
				p_9.addRobot(r_9);
				p_9.addRobot(r2_9);
				r_9.setMezo(m_9);
				r2_9.setMezo(m2_9);
				p_9.mezok[0][0] = m_9;
				p_9.mezok[0][1] = m2_9;
				p_9.mezok[1][0] = m3_9;
				System.out.println("Kiindulási objektumok:");
				objKiir();//"Init" vége
				p_9.robotLeptet(r_9, new Vektor(0,1));//Indul
				break;
			case 10: //Leesés
				Palya p_10 = new Palya(2,2,2,2,2,"p");
				objektumok.add("p : Palya");
				Robot r1_10 = new Robot(2,2,"r1");
				objektumok.add("r1 : Robot");
				Mezo m_10 = new Mezo(false, true, null, r1_10, new Vektor(0,0),"m");
				objektumok.add("m1 : Mezo");
				Mezo m2_10 = new Mezo(false, false, null, null, new Vektor(0,1),"m2");
				objektumok.add("m2 : Mezo");
				System.out.println("Kiindulási objektumok:");
				p_10.addRobot(r1_10);
				p_10.mezok[0][0]=m_10;
				p_10.mezok[0][1]=m2_10;
				p_10.mezok[0][0].setRobot(r1_10);
				r1_10.setMezo(m_10);
				objKiir();//"Init" vége
				p_10.robotLeptet(r1_10, new Vektor(0,1));//Indul
				break;
			case 11://Nyerés
				Palya p_11 = new Palya(2, 2, 2, 2, 2, "p");
				Palya_Menedzser PM_11 = new Palya_Menedzser(2, 2, 2, 2, 2, 2,p_11, "pm");
				objektumok.add("PM : Palya_Menedzser");
				objektumok.add("p : Palya");
				Robot r1_11 = new Robot(2, 2, "r1");
				objektumok.add("r1 : Robot");
				Robot r2_11 = new Robot(2,2,"r2");
				objektumok.add("r2 : Robot");
				p_11.addRobot(r1_11);
				p_11.addRobot(r2_11);
				System.out.println("Kiindulási objektumok:");
				objKiir();//"Init" vége
				PM_11.korSzamol();
				p_11.gyoztesValaszt();
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
