package personajes;

import java.util.Random;

public class Esqueleto extends Personaje{
	public Esqueleto(){
		super("Esqueleto" , 300 , 'm' , 250);
		
		 habilidades= new String [4];
		 
		 habilidades[0]="Espada de venganza";
		 habilidades[1]="Oscuridad mental";
		 habilidades[2]="Pu�o desgarrador";
		 habilidades[3]="Ira de los no-muertos";
		 
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
				da�o=ran.nextInt(10)+30;
				break;
			case 3:
				da�o=ran.nextInt(15)+15;
				break;
			case 4:
				da�o=ran.nextInt(15)+30;
				break;
			}
			return da�o;
		 }
	
	
	public String toString() {
		return "Enemigo "+nombre;
	}
	
	public String rasgos(){
		return "Trabaja solo, agresivo, malvado";
	}
	
	public String historia() {
		
		return "El esqueleto de un antiguo guerrero, dominado por la maldad, busca venganza.";
		
	}

}
