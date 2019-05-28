package personajes;
import java.util.Random;

public class Goblin extends Personaje{
	
	public Goblin(){
		super("Goblins" , 30 , 'm' , 100);
		habilidades= new String [4];
		 
		habilidades[0]="Olor pestilente"; 		
		habilidades[1]="Golpe de Goblin"; 
		habilidades[2]="Mazazo";
		habilidades[3]="Ara�azo";

		 
		super.setHabilidades(habilidades);
		 
	}
	 public int da�o(int pelea) {
		 int da�o=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				da�o=ran.nextInt(10)+10;
				break;
			case 2:
				da�o=ran.nextInt(10)+15;
				break;
			case 3:
				da�o=ran.nextInt(15)+10;
				break;
			case 4:
				da�o=ran.nextInt(15)+15;
				break;	
			}
			return da�o;
		 }
	
	public String toString() {
			return "Enemigo "+ nombre;
	}

	public String rasgos(){
		return "Cobardes, poco inteligente y pestilente";
	}
	
	public String historia() {
	return "Criaturas desterradas por los hombres y obedientes a su rey";
	
	}
}