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
		habilidades[4]="Poci�n";
		 
		 super.setHabilidades(habilidades);
	}
	
	 public int da�o(int pelea) {
		 int da�o=0;
	 Random ran= new Random();

		switch(pelea) {
		case 1:
			da�o=ran.nextInt(25)+20;
			break;
		case 2:
			da�o=ran.nextInt(35)+15;
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
			return "Alumna Kodea "+ nombre;
		}
		return "Alumno Kodea"+ nombre;
	}
	
	public String rasgos(){
		return "una persona normal sin poderes especiales, s�lo tienes angustia en tu coraz�n por cada d�a que te levantas temprano";
	}
	
	public String historia() {
		if (sexo=='f') {return "Desde que nac�, supe inmediatamente que era normal, nunca tuve nada especial. "
				+ "Mientras crecia me daba cuenta que mi normalidad se ampliaba sin limites para conseguir un trabajo estable,"
				+ " pero lamentablemente necesitaba a�os de experiencia, por eso debo emprender esta cruzada para obtenerla. ";
	
		}
		return "Desde que nac�, supe inmediatamente que era normal, nunca tuve nada especial. "
				+ "Mientras crecia me daba cuenta que mi normalidad se ampliaba sin limites para conseguir un trabajo estable,"
				+ " pero lamentablemente necesitaba a�os de experiencia, por eso debo emprender esta cruzada para obtenerla. ";
	}
}
