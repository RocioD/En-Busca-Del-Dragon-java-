package personajes;

import java.util.Random;

public class Esqueleto extends Personaje{
	public Esqueleto(){
		super("Esqueleto" , 300 , 'm' , 250);
		
		 habilidades= new String [4];
		 
		 habilidades[0]="Espada de venganza";
		 habilidades[1]="Oscuridad mental";
		 habilidades[2]="Puño desgarrador";
		 habilidades[3]="Ira de los no-muertos";
		 
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
				daño=ran.nextInt(10)+30;
				break;
			case 3:
				daño=ran.nextInt(15)+15;
				break;
			case 4:
				daño=ran.nextInt(15)+30;
				break;
			}
			return daño;
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
