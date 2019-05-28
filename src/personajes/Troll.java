package personajes;

import java.util.Random;

public class Troll extends Personaje{
	public Troll(){
		super("Troll" , 60 , 'm' , 200);
		
		 habilidades= new String [4];
		 
		 habilidades[0]="Golpe de hacha";
		 habilidades[1]="Rugido estremecedor";
		 habilidades[2]="Embestida";
		 habilidades[3]="Cabezaso";
		 
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
				da�o=ran.nextInt(10)+25;
				break;
			case 3:
				da�o=ran.nextInt(15)+20;
				break;
			case 4:
				da�o=ran.nextInt(15)+25;
				break;
			}
			return da�o;
		 }
	
	
	public String toString() {
		return "Enemigo "+nombre;
	}
	
	public String rasgos(){
		return "Trabaja solo, tosco, feroz";
	}
	
	public String historia() {
		
		return "Solitario, vive en la entrada de la cueva y no le agrada la gente";
		
	}
}
