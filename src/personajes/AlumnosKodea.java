package personajes;
import java.util.Random;

public class AlumnosKodea extends Personaje{
	
	public AlumnosKodea(String nombre, char sexo){
		super(nombre, sexo);
		super.setHp(200);
		super.setEdad(28);
		
		habilidades= new String [5];
		
		habilidades[0]="No Compila"; 	
		habilidades[1]="Donde la China"; 	
		habilidades[2]="Dia de pago";
		habilidades[3]="Tomar desayuno";
		habilidades[4]="Poción";
		 
		 super.setHabilidades(habilidades);
	}
	
	 public int daño(int pelea) {
		 int daño=0;
	 Random ran= new Random();

		switch(pelea) {
		case 1:
			daño=ran.nextInt(25)+20;
			break;
		case 2:
			daño=ran.nextInt(35)+15;
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
			return "Alumna Kodea "+ nombre;
		}
		return "Alumno Kodea"+ nombre;
	}
	
	public String rasgos(){
		return "una persona normal sin poderes especiales, sólo tienes angustia en tu corazón por cada día que te levantas temprano";
	}
	
	public String historia() {
		if (sexo=='f') {return "Desde que nací, supe inmediatamente que era normal, nunca tuve nada especial. "
				+ "Mientras crecia me daba cuenta que mi normalidad se ampliaba sin limites para conseguir un trabajo estable,"
				+ " pero lamentablemente necesitaba años de experiencia, por eso debo emprender esta cruzada para obtenerla. ";
	
		}
		return "Desde que nací, supe inmediatamente que era normal, nunca tuve nada especial. "
				+ "Mientras crecia me daba cuenta que mi normalidad se ampliaba sin limites para conseguir un trabajo estable,"
				+ " pero lamentablemente necesitaba años de experiencia, por eso debo emprender esta cruzada para obtenerla. ";
	}
}
