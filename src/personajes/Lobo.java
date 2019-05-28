package personajes;
import java.util.Random;

public class Lobo extends Personaje{
	
	public Lobo(){
		super("Lobo" , 5 , 'm' , 150);
		
		 habilidades= new String [4];
		 
		 habilidades[0]="Mordida";
		 habilidades[1]="Aullido";
		 habilidades[2]="Derribo";
		 habilidades[3]="Colmillo afilado";
		 
		 super.setHabilidades(habilidades);
		 
	}
	
	 public int da�o(int pelea) {
		 int da�o=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				da�o=ran.nextInt(10)+15;
				break;
			case 2:
				da�o=ran.nextInt(10)+20;
				break;
			case 3:
				da�o=ran.nextInt(15)+15;
				break;
			case 4:
				da�o=ran.nextInt(15)+20;
				break;
			}
			return da�o;
		 }
	
	
	public String toString() {
		return "Enemigo"+ nombre;
	}
	
	public String rasgos(){
		return "Trabaja en equipo, inteligente, feroz";
	}
	
	public String historia() {
		
		return "Salio en busqueda de alimento y se perdio";
	
	}
}
