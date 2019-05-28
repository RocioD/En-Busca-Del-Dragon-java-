package personajes;
import java.util.Random;

public class Cazador extends Personaje{
	
	public Cazador(String nombre, char sexo){
		super(nombre, sexo);
		super.setHp(200);
		super.setEdad(25);
		
		habilidades= new String [5];
			
		habilidades[0]="Flecha oscura"; 				
		habilidades[1]="Flecha explosiva"; 				
		habilidades[2]="Cuchillada certera";	
		habilidades[3]="Insignia protectora"; 				
		habilidades[4]="Poci�n";
		    
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
				da�o=ran.nextInt(15)+25;
				break;
			case 3:
				da�o=ran.nextInt(25)+20;
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
			return "Cazadora "+ nombre;
		}
		return "Cazador "+ nombre;
	}
	
	public String rasgos(){
		return "una persona con una inteligencia incre�ble, astucia desbordante y especialista en matar";
	}
	
	public String historia() {
		if (sexo=='f') {
			return "En el resguardo del bosque nac� sin padres, carente de todo signo de amor, "
			+ "s�lo busco derrotar a cada criatura que se me aparezca, "
			+ "hasta llegar al m�s temible de todos. Soy la mejor cazadora y lo cazare";
	
		}
		return "En el resguardo del bosque nac� sin padres, carente de todo signo de amor, "
		+ "s�lo busco derrotar a cada criatura que se me aparezca, "
		+ "hasta llegar al m�s temible de todos. Soy el mejor cazador y lo cazare";
	}
}