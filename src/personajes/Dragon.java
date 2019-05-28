package personajes;
import java.util.Random;

public class Dragon extends Personaje{
		
	public Dragon(){
		super("Dragón de la Devastación", 5000 , 'm' , 550);
		
		 habilidades= new String [4];
		 
		 habilidades[0]="Fuego ardiente";
		 habilidades[1]="Golpe de ala"; 		
		 habilidades[2]="Llamas oscuras";	
		 habilidades[3]="Mordizco devastador"; 
		 
		 super.setHabilidades(habilidades);
		 
	}
	
	 public int daño(int pelea) {
		 int daño=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				daño=ran.nextInt(10)+30;
				break;
			case 2:
				daño=ran.nextInt(10)+40;
				break;
			case 3:
				daño=ran.nextInt(15)+25;
				break;
			case 4:
				daño=ran.nextInt(15)+40;
				break;
				
			}
			return daño;
		 }
	
	public String toString() {
		
			return "Enemigo "+ nombre;
	
	}
	
	public String rasgos(){
		return "Poder devastador";
	}
	
	public String historia() {
		return "Un dragón realmente aterrador, creado por los demonios hace 5000 años para destruir a los humanos,"
				+ "lo lograron sellar hace 3000 años, pero alguien rompió el sello y ahora ha estado causando grandes desastres.";
	

	}
}