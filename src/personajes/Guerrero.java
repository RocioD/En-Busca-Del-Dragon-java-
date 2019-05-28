package personajes;
import java.util.Random;

public class Guerrero extends Personaje{
	
	public Guerrero(String nombre, char sexo){
		super(nombre, sexo);
		super.setHp(300);
		super.setEdad(28);
		
		habilidades= new String [5];
		    
		habilidades[0]="Pu�etazo mortal"; 		
		habilidades[1]="Super patada"; 		
		habilidades[2]="Grito de guerra";
		habilidades[3]="Aguante supremo"; 
		habilidades[4]="Poci�n";
		 
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
				da�o=ran.nextInt(20)+15;
				break;
			case 3:
				da�o=ran.nextInt(10)+25;
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
			return "Guerrera "+ nombre;
		}
		return "Guerrero "+ nombre;
	}
	
	public String rasgos(){
		return "una persona con fuerza sobre humana, una velocidad incre�ble y una agudeza de sentido implacable";
	}
	
	public String historia() {
		if (sexo=='f') {return "Soy hija de un gran rey, llevo conmigo la carga de la venganza por la muerte de mis padres en las garras del drag�n, "
				+ "s�lo la muerte de �ste apaciguar� la furia guardada en mi alma";
	
		}
		return "Soy hijo de un gran rey, llevo conmigo la carga de la venganza por la muerte de mis padre en las garras del drag�n, "
				+ "s�lo la muerte de �ste apaciguar� la furia guardada en mi alma";
	}
}
