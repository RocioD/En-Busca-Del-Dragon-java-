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
	
	 public int daño(int pelea) {
		 int daño=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				daño=ran.nextInt(10)+15;
				break;
			case 2:
				daño=ran.nextInt(10)+20;
				break;
			case 3:
				daño=ran.nextInt(15)+15;
				break;
			case 4:
				daño=ran.nextInt(15)+20;
				break;
			}
			return daño;
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
