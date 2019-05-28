package personajes;
import java.util.Random;

public class Goblin extends Personaje{
	
	public Goblin(){
		super("Goblins" , 30 , 'm' , 100);
		habilidades= new String [4];
		 
		habilidades[0]="Olor pestilente"; 		
		habilidades[1]="Golpe de Goblin"; 
		habilidades[2]="Mazazo";
		habilidades[3]="Arañazo";

		 
		super.setHabilidades(habilidades);
		 
	}
	 public int daño(int pelea) {
		 int daño=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				daño=ran.nextInt(10)+10;
				break;
			case 2:
				daño=ran.nextInt(10)+15;
				break;
			case 3:
				daño=ran.nextInt(15)+10;
				break;
			case 4:
				daño=ran.nextInt(15)+15;
				break;	
			}
			return daño;
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