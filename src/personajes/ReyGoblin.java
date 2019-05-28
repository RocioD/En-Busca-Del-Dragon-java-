package personajes;
import java.util.Random;

public class ReyGoblin extends Personaje{
	
	public ReyGoblin(){
		super("Rey Goblin" , 100 , 'm' , 350);
		
		habilidades= new String [4];
		
		habilidades[0]="Mazazo real"; 		
		habilidades[1]="Patada del rey"; 	
		habilidades[2]="Pu�o del rey";
		habilidades[3]="Pesadilla real";
		 
		 super.setHabilidades(habilidades);
		 
	}
	
	public int da�o(int pelea) {
		int da�o=0;
		Random ran= new Random();
	
			switch(pelea) {
			case 1:
				da�o=ran.nextInt(10)+20;
				break;
			case 2:
				da�o=ran.nextInt(10)+30;
				break;
			case 3:
				da�o=ran.nextInt(15)+20;
				break;
			case 4:
				da�o=ran.nextInt(15)+30;
				break;	
			}
			return da�o;
		 }
	
	public String toString() {
		return "Enemigo "+ nombre;
	}
	
	public String rasgos(){
		return "Fuerte, embustero y astuto";
	}
	
	public String historia() {
		return "Con mentiras y enga�os lleg� a ser el rey de estos seres llamados Goblin";

	}
}