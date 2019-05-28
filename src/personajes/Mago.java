package personajes;
import java.util.Random;

public class Mago extends Personaje {
	
	public Mago(String nombre, char sexo){
		super(nombre, sexo);
		super.setHp(200);
		super.setEdad(32);
		
	    habilidades= new String [5];
	    
		habilidades[0] = "Bola de Fuego"; 
		habilidades[1] = "Rayo de Hielo"; 
		habilidades[2] = "Trueno del Emperador";
		habilidades[3] = "Escudo mágico"; 
		habilidades[4] = "Poción";
		 
		 super.setHabilidades(habilidades);
	}
	
	 public int daño(int pelea) {
		 Random ran= new Random();
		 int daño=0;
			switch(pelea) {
			case 1:
				daño=ran.nextInt(10)+25;
				break;
			case 2:
				daño=ran.nextInt(25)+20;
				break;
			case 3:
				daño=ran.nextInt(15)+25;
				break;
			case 4:
				daño=0;
				break;
			case 5:
				daño=ran.nextInt(15)+35;
				break;
			}
			return daño;
		 }
	 
	public String toString() {
		if (sexo=='f') {
			return "Maga "+ nombre;
		}
		return "Mago "+ nombre;
	}
	
	public String rasgos(){
		return "una persona con gran intelecto, que conoce las artes ocultas";
	}
	
	public String historia() {
		if (sexo=='f') {
			return "Soy la mejor estudiante de Rocío, la más poderosa maga de la época, al oír el rumor del ataque"
			+ " de un Dragón a la ciudad principal, fui enviada a derrotarlo y regresar la paz al reino";
	
		}
		return "Soy el mejor estudiante de Rocío, la más poderosa maga de la época, al oír el rumor del ataque"
		+ " de un Dragón a la ciudad principal, fui enviado a derrotarlo y regresar la paz al reino";
	}
}
