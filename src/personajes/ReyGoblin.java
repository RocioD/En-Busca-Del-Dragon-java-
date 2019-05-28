package personajes;
import java.util.Random;

public class ReyGoblin extends Personaje{
	
	public ReyGoblin(){
		super("Rey Goblin" , 100 , 'm' , 350);
		
		habilidades= new String [4];
		
		habilidades[0]="Mazazo real"; 		
		habilidades[1]="Patada del rey"; 	
		habilidades[2]="Puño del rey";
		habilidades[3]="Pesadilla real";
		 
		 super.setHabilidades(habilidades);
		 
	}
	
	public int daño(int pelea) {
		int daño=0;
		Random ran= new Random();
	
			switch(pelea) {
			case 1:
				daño=ran.nextInt(10)+20;
				break;
			case 2:
				daño=ran.nextInt(10)+30;
				break;
			case 3:
				daño=ran.nextInt(15)+20;
				break;
			case 4:
				daño=ran.nextInt(15)+30;
				break;	
			}
			return daño;
		 }
	
	public String toString() {
		return "Enemigo "+ nombre;
	}
	
	public String rasgos(){
		return "Fuerte, embustero y astuto";
	}
	
	public String historia() {
		return "Con mentiras y engaños llegó a ser el rey de estos seres llamados Goblin";

	}
}