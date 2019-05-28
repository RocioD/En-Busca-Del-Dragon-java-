package personajes;
import java.util.Random;

public class ProfesorPablo extends Personaje{
	
	public ProfesorPablo(){
		super("Profe Pablo", 39, 'm', 450);
		
		 habilidades= new String [4];
			habilidades[0]="Abstraccion"; 		
			habilidades[1]="�Me siguen?"; 	
			habilidades[2]="Exceptions";
			habilidades[3]="C�digo marciano";
		 
		 super.setHabilidades(habilidades);
		 
	}
	 public int da�o(int pelea) {
		 int da�o=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				da�o=ran.nextInt(10)+25;
				break;
			case 2:
				da�o=ran.nextInt(10)+35;
				break;
			case 3:
				da�o=ran.nextInt(15)+25;
				break;
			case 4:
				da�o=ran.nextInt(15)+35;
				break;
				
			}
			return da�o;
		 }
	
	public String toString() {	
			return "Enemigo "+ nombre;
	}

	public String rasgos(){
		return "Inteligencia del mundo marciano";
	}
	
	public String historia() {
		return "En un mundo marciano, ha nacido para ayudar a los humanos a entender un lenguaje incomprensible";
	
	}
}