package personajes;

import java.io.*;
import java.util.Random;

public class Pelea {
	private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	private Random rn = new Random();
	
	public boolean vs(Object a, Object b, boolean amigo) throws IOException {
		int opcion=-1;
		int armandoAyuda=0;
		int escudo=0;
		int turnos=0;
		int da�o1, da�o2;
		String s;
		int hp= ((Personaje)a).getHp();
		if (a instanceof Personaje && b instanceof Personaje) {
			System.out.println(a.toString() + " v/s " + b.toString());
			do {
				do {
					System.out.println(a.toString()+": "+((Personaje)a).getHp()+" hp" );
					for (int i=0; i<((Personaje)a).numeroDeHabilidades(); i++) {
						if (i==4) {
							System.out.println((i+1)+") "+ ((Personaje)a).habilidades[i] + "(" + ((Personaje)a).getPociones()+")");
						}
						else
							System.out.println((i+1)+") "+ ((Personaje)a).habilidades[i]);
					}
					do {
						System.out.println("�Qu� habilidad usar�s?");
						try {
							opcion=-1;
							s=bf.readLine();
							opcion=Integer.parseInt(s);
						} catch (NumberFormatException nf) {	
						}
						if (opcion<=0 || opcion>((Personaje)a).numeroDeHabilidades()) {
							System.out.println("Por favor ingresa un n�mero entre 1 y "+((Personaje)a).numeroDeHabilidades());
						}
					}while (opcion>((Personaje)a).numeroDeHabilidades() || opcion<=0);
					
					if (opcion<4) {
					
							da�o1=((Personaje)a).da�o(opcion);
							System.out.println("Utilizas "+ ((Personaje)a).habilidad(opcion)+"\nDa�as "+ da�o1 + " hp");
							((Personaje)b).setHp(((Personaje)b).getHp()-da�o1);
					}
					
					else {
						if (opcion==5) {
							if (((Personaje)a).getPociones()>0) {
								da�o1=((Personaje)a).da�o(opcion);
								System.out.println("Utilizas "+ ((Personaje)a).habilidad(opcion)+"\nTe curas "+ da�o1 + " hp");
								((Personaje)a).setHp(((Personaje)a).getHp()+da�o1);
								((Personaje)a).setPociones(((Personaje)a).getPociones()-1);
							} else {
								System.out.println("No tienes pociones");
							}
						}
						if (opcion==4) {
							if (turnos==0) {
								System.out.println("Utilizas "+ ((Personaje)a).habilidad(opcion)+ " creas un escudo por 2 rondas");
								escudo=2;
								turnos=4;
							} else
								System.out.println("Aun no puedes volver a usar esta habilidad");
						}	
						
					}
				}while ((opcion==5 && ((Personaje)a).getPociones()==0) || (opcion==4 && (turnos>0 && turnos<4)));
					
				if (((Personaje)b).getHp()>0) {
					if (escudo==0) {
						int ataca=rn.nextInt(4)+1;
						da�o2=((Personaje)b).da�o(ataca);
						System.out.println(b.toString()+ "("+((Personaje)b).getHp() + ") ataca con " + ((Personaje)b).habilidad(ataca)+"\nTe da�a "+ da�o2 + " hp");
						((Personaje)a).setHp(((Personaje)a).getHp()-da�o2);
					}
					else {
						System.out.println(b.toString()+ "("+((Personaje)b).getHp() + ") ataca pero lo bloqueas");
						escudo--;
						}
					}
				if (turnos>0) {
					turnos--;
				}
				armandoAyuda ++;
				if (armandoAyuda>3 && amigo && ((Personaje)a).getHp()<(hp-19)) {
					System.out.println("Armando dice: �Yo te ayudo! \nTe cura 20 hp");
					((Personaje)a).setHp(((Personaje)a).getHp()+20);
					armandoAyuda=0;
				}
					
			}while (((Personaje)a).getHp()>0 && ((Personaje)b).getHp()>0);
			if (((Personaje)a).getHp()>0) {
				if (((Personaje)a).getHp()<hp) {
					((Personaje)a).setHp(hp);
				}
				System.out.println("Has ganado");
				return true;
			} else 
				System.out.println("Has muerto");
		
			}
		return false;
		
		}

	}
	

