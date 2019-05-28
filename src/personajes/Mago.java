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
		habilidades[3] = "Escudo m�gico"; 
		habilidades[4] = "Poci�n";
		 
		 super.setHabilidades(habilidades);
	}
	
	 public int da�o(int pelea) {
		 Random ran= new Random();
		 int da�o=0;
			switch(pelea) {
			case 1:
				da�o=ran.nextInt(10)+25;
				break;
			case 2:
				da�o=ran.nextInt(25)+20;
				break;
			case 3:
				da�o=ran.nextInt(15)+25;
				break;
			case 4:
				da�o=0;
				break;
			case 5:
				da�o=ran.nextInt(15)+35;
				break;
			}
			return da�o;
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
			return "Soy la mejor estudiante de Roc�o, la m�s poderosa maga de la �poca, al o�r el rumor del ataque"
			+ " de un Drag�n a la ciudad principal, fui enviada a derrotarlo y regresar la paz al reino";
	
		}
		return "Soy el mejor estudiante de Roc�o, la m�s poderosa maga de la �poca, al o�r el rumor del ataque"
		+ " de un Drag�n a la ciudad principal, fui enviado a derrotarlo y regresar la paz al reino";
	}
}
