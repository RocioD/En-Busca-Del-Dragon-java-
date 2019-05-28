package personajes;
import java.util.Random;

public class Dragon extends Personaje{
		
	public Dragon(){
		super("Drag�n de la Devastaci�n", 5000 , 'm' , 550);
		
		 habilidades= new String [4];
		 
		 habilidades[0]="Fuego ardiente";
		 habilidades[1]="Golpe de ala"; 		
		 habilidades[2]="Llamas oscuras";	
		 habilidades[3]="Mordizco devastador"; 
		 
		 super.setHabilidades(habilidades);
		 
	}
	
	 public int da�o(int pelea) {
		 int da�o=0;
		 Random ran= new Random();
	
			switch(pelea) {
			case 1:
				da�o=ran.nextInt(10)+30;
				break;
			case 2:
				da�o=ran.nextInt(10)+40;
				break;
			case 3:
				da�o=ran.nextInt(15)+25;
				break;
			case 4:
				da�o=ran.nextInt(15)+40;
				break;
				
			}
			return da�o;
		 }
	
	public String toString() {
		
			return "Enemigo "+ nombre;
	
	}
	
	public String rasgos(){
		return "Poder devastador";
	}
	
	public String historia() {
		return "Un drag�n realmente aterrador, creado por los demonios hace 5000 a�os para destruir a los humanos,"
				+ "lo lograron sellar hace 3000 a�os, pero alguien rompi� el sello y ahora ha estado causando grandes desastres.";
	

	}
}