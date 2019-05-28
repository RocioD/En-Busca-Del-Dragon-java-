package personajes;
import java.util.Random;

public class Guerrero extends Personaje{
	
	public Guerrero(String nombre, char sexo){
		super(nombre, sexo);
		super.setHp(300);
		super.setEdad(28);
		
		habilidades= new String [5];
		    
		habilidades[0]="Puñetazo mortal"; 		
		habilidades[1]="Super patada"; 		
		habilidades[2]="Grito de guerra";
		habilidades[3]="Aguante supremo"; 
		habilidades[4]="Poción";
		 
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
				daño=ran.nextInt(20)+15;
				break;
			case 3:
				daño=ran.nextInt(10)+25;
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
			return "Guerrera "+ nombre;
		}
		return "Guerrero "+ nombre;
	}
	
	public String rasgos(){
		return "una persona con fuerza sobre humana, una velocidad increíble y una agudeza de sentido implacable";
	}
	
	public String historia() {
		if (sexo=='f') {return "Soy hija de un gran rey, llevo conmigo la carga de la venganza por la muerte de mis padres en las garras del dragón, "
				+ "sólo la muerte de éste apaciguará la furia guardada en mi alma";
	
		}
		return "Soy hijo de un gran rey, llevo conmigo la carga de la venganza por la muerte de mis padre en las garras del dragón, "
				+ "sólo la muerte de éste apaciguará la furia guardada en mi alma";
	}
}
