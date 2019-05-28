package ejecucion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import opciones.AdministradorGuion;
import personajes.*;

public class Inicio {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Pelea pl = new Pelea();
		AdministradorGuion ad = null;
		boolean amigo = false;
		int sigues=2;
		int opciones=0;
		int respuesta=-1;
		String nombreJugador="";
		String nombre="";
		String etapa= "[Etapa: 1-3]: En la ciudad";
		int s=0;
		int clase=0;
		char sexo='n';
		Personaje jugador= null;
		
		int opcion=-1;
		do {
			
				mostrarArchivo("dragonInicioencrip.txt");
				
				try {
					opcion= Integer.parseInt(bf.readLine());
				} catch (NumberFormatException nf) {
					
				}
				
			switch (opcion) {
			case 1: 
				ad = new AdministradorGuion();
				do {
					System.out.print("Ingresa tu nombre: ");
			        nombreJugador= bf.readLine();
				}while (nombreJugador.compareTo("")==0); 
				do {
			       System.out.print("Ingresa el nombre de tu personaje: ");
		    	   nombre= bf.readLine();
				}while (nombre.compareTo("")==0);
		    	   
				do {
			       try {
			    	   System.out.println("Tu personaje sera 1) Femenino \n                  2) Masculino");
			    	   s=Integer.parseInt(bf.readLine());
			       } catch (NumberFormatException nf) {}
			       if (s!=1 && s!=2) {
			    	   System.out.println("Por favor ingresa 1 para personaje femenino y 2 para masculino");
			       }
			    }while (s!=1 && s!=2);
			    	
				if (s==1) {
			       sexo='f';
			    } else {
			       sexo='m';
			    }
			  

			    do {
			       System.out.println(ad.mostrarTextos(0));
			       System.out.println(ad.mostrarOpciones(0));
			       			      
			       try {
			    		respuesta=Integer.parseInt(bf.readLine());
			    	} catch (NumberFormatException nf) {}
			       
			    	if (respuesta<1 || respuesta >4) {
			    		System.out.println("Por favor ingresa un número entre 1 y 4");
			    	}
			       
			    }while (respuesta<1 || respuesta >4);
			       
			    switch (respuesta) {
			       case 1:
			    	   jugador = new Mago(nombre, sexo);
			       break;
			       case 2:
			    	   jugador = new Guerrero(nombre, sexo);
			       break;
			       case 3:
			    	   jugador = new Cazador(nombre, sexo);
			       break;
			       case 4:
			    	   jugador = new AlumnosKodea(nombre, sexo);
			       break;
			    }
			    clase=respuesta;
			    System.out.println(ad.mostrarTextos(1).substring(0, (ad.mostrarTextos(1).length()-2)) + jugador.rasgos());
			    opciones=1;
			    ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			      
			case 2:	
				if (opcion==2) {
					ad = new AdministradorGuion();
					String caracteristicasJugador = ad.cargar();
					if (caracteristicasJugador.compareTo("")!=0) {
						String caracteristicas[]=caracteristicasJugador.split("#");
						clase=Integer.parseInt(caracteristicas[1]);
						switch (clase) {
							case 1:
								jugador = new Mago(caracteristicas[2], caracteristicas[3].charAt(0));
							break;
							case 2:
								jugador = new Guerrero(caracteristicas[2], caracteristicas[3].charAt(0));
							break;
							case 3:
								jugador = new Cazador(caracteristicas[2], caracteristicas[3].charAt(0));
							break;
							case 4:
								jugador = new AlumnosKodea(caracteristicas[2], caracteristicas[3].charAt(0));
							break;
						}
						nombreJugador=caracteristicas[0];
						nombre=caracteristicas[2];
						sexo= caracteristicas[3].charAt(0);
						jugador.setDinero(Integer.parseInt(caracteristicas[4]));
						jugador.setPociones(Integer.parseInt(caracteristicas[5]));
						jugador.setHp(Integer.parseInt(caracteristicas[6]));
						opciones = Integer.parseInt(caracteristicas[7]);
						etapa = caracteristicas[8];
					} else {
						opciones= 0;
						System.out.println("No hay partidas guardadas");
					}
						
				}
			       
			    if (opciones!=0) {
			    	do {
			    		do {
			    			sigues=2;
			    			if (ad.isTalisman()==false) {
			    				System.out.println("[Etapa: 1-3]");
			    				etapa="[Etapa: 1-3]: En la ciudad";
			    			} else if (ad.getSabio()==false) {
			    				System.out.println("[Etapa: 2-3]");
			    				etapa="[Etapa: 2-3]: Obtuviste el talismán, debes encontrar la cueva";
			    			} else {
			    				System.out.println("[Etapa: 3-3]");
			    				etapa="[Etapa: 3-3]: Obtuviste el talismán, encontraste la cueva, solo resta superar los obstáculos y derrotar al dragón";
			    			}
			    			respuesta=-1;	  
			   
			    			System.out.println(ad.mostrarOpciones(opciones));

			    			try {
			    				respuesta=Integer.parseInt(bf.readLine());
			    			} catch (NumberFormatException nf) {}
			    			if (respuesta<1 || respuesta> ad.cantidadDeOpciones(opciones) ) {
			    				System.out.println("Por favor ingresa un número entre 1 y "+ ad.cantidadDeOpciones(opciones));
			    			}
			    		}while (respuesta<1 || respuesta>ad.cantidadDeOpciones(opciones));

			    		if (opciones==10 && respuesta==1) {
			    			do {
			    				sigues=-1;
			    				System.out.println("¿Deseas grabar y salir?\n1) Sí\n2) No");	
			    				try {
			    					sigues=Integer.parseInt(bf.readLine());
			    				} catch (NumberFormatException nf) {}
			    				if (sigues!=1 && sigues!= 2) {
			    					System.out.println("Por favor ingresa un número entre 1 y 2");
			    				}
			    			} while (sigues!=1 && sigues!= 2);
			    		}
			    		if (sigues==1) {
			    			 ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    			 opciones=56;
			    		} else {
			    			if (opciones==7 && respuesta==1) {
			    				System.out.println("Tienes: " + jugador.getDinero() + " monedas de plata.");
			    			}	   
			    			if (respuesta==1 && opciones==2) {
			    				System.out.println("Saludos, me llamo "+ jugador.getNombre());
			    			}
			    			if ((opciones==2 || opciones==3) && respuesta==2) {
			    				if (sexo=='m') {
			    					System.out.println(ad.mostrarTextos(104));
			    				}
			    				else {
			    					System.out.println(ad.mostrarTextos(105));
			    				}
			    			}	
			    			if (respuesta==1 && opciones==3) {
			    				System.out.println(jugador.historia());
			    			}
			    			if (respuesta==3 && opciones==1 && ad.isTaberna1()) {
			    				System.out.print(jugador.toString());
			    			}
			    			if (((opciones==5 && respuesta==2) || (opciones==6 && respuesta==5)) && ad.isAyudanteRey()==false && ad.isRey()==false) {
			    				System.out.print(jugador.toString());
			    			}
			    			if (opciones==13 &&(respuesta==3 || respuesta==1)) {
			    				if (ad.isRey()==false) {
			    					System.out.println(ad.mostrarTextos(11));
			    					if (ad.isAyudanteRey()==false) {
			    						System.out.println(jugador.toString() + ad.mostrarTextos(13));
			    					} else {
			    						System.out.println(ad.mostrarTextos(113));
			    					}	
			    				}
			    			}
			    			if (respuesta==2 && opciones==13 && ad.isRey()==false) {
			    				System.out.print(jugador.toString());
			    				ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    			}
			    			if (opciones==8) {
			    				if (respuesta==1) {
			    					if (jugador.getDinero()>=20) {
			    						jugador.setPociones(jugador.getPociones()+1); 
			    						jugador.setDinero(jugador.getDinero()-20);
			    						System.out.println(ad.mostrarTextos(109));
			    						System.out.println("Tienes: " + jugador.getDinero() + " monedas de plata.");
			    					} else {
			    						System.out.println(ad.mostrarTextos(112));
			    					}
			    				}
			    				if (respuesta==2) {
			    					if (ad.isArmadura()==false) {
			    						if (jugador.getDinero()>=100) {
			    							jugador.setHp(jugador.getHp()+100); 
			    							jugador.setDinero(jugador.getDinero()-100);
			    							ad.setArmadura(true);
			    							System.out.println(ad.mostrarTextos(110));
			    							System.out.println("Tienes: " + jugador.getDinero() + " monedas de plata.");
			    						} else {
			    							System.out.println(ad.mostrarTextos(112));
			    						}
			    					} else {
			    						System.out.println(ad.mostrarTextos(111));
			    					}
			    				}
			    			}
			    			if (opciones==9 && respuesta==1 && ad.isPocion1()==false) {
			    				jugador.setPociones(jugador.getPociones()+1);
			    				System.out.println(ad.mostrarTextos(57));
			    				ad.setPocion1(true);
			    			}
			    		
			    			if (opciones==44 && respuesta==1 && ad.isPocion2()==false) {
			    				jugador.setPociones(jugador.getPociones()+1);
			    				System.out.println(ad.mostrarTextos(57));
			    				ad.setPocion2(true);
			    			}
			    		
			    			if (opciones==31 && respuesta==1) {
			    				if (ad.isPlata1()==false) {
			    					jugador.setDinero(jugador.getDinero()+60);
			    					System.out.println(ad.mostrarTextos(34));
			    					ad.setPlata1(true);
			    				}
			    				else {
			    					System.out.println(ad.mostrarTextos(35));
			    				}
			    			}
			    	   
			    			if (opciones==18 && respuesta==1 && ad.getSabio()==false) {
			    				String[] sabio1 = ad.mostrarTextos(25).split("AAA");
			    				System.out.println(sabio1[0]+jugador.toString()+sabio1[1]);
			    			}
			    		
			    			if (opciones==40 && respuesta==1) {
			    				String[] diego = ad.mostrarTextos(48).split("AAA");
			    				System.out.println(ad.mostrarTextos(47) + diego[0]+jugador.toString()+diego[1]);
			    			}
			    			
			    			if (opciones==16 && respuesta==1 && ad.isLobo()==false) {
			    				Lobo lobo = new Lobo();
			    				amigo=ad.isAmigo();
			    				boolean vsLobo= pl.vs(jugador, lobo, amigo);
			    				if (vsLobo==false) {
			    					System.out.println("Te ha matado el lobo");
			    				} else {
			    					System.out.println(ad.mostrarTextos(117));
			    					ad.setLobo(true);
			    					ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    				}
			    			} 
			    		
			    			if (opciones==19 && respuesta==2 && ad.isGoblins()==false) {
			    				Goblin goblins = new Goblin();
			    				amigo=ad.isAmigo();
			    				boolean vsGoblins= pl.vs(jugador, goblins, amigo);
			    				if (vsGoblins==false) {
			    					System.out.println("Te han matado los goblins");
			    				} else {
			    					System.out.println(ad.mostrarTextos(119));
			    					ad.setGoblins(true);
			    					ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), 21, etapa);
			    				}
			    			}
			    			if (opciones==26 && (respuesta==1 || respuesta==2)) {
			    				if (respuesta==2) {
			    					System.out.println("Te corta el paso");
			    				}
			    				Troll troll = new Troll();
			    				amigo=ad.isAmigo();
			    				boolean vsTroll= pl.vs(jugador, troll, amigo);
			    				if (vsTroll==false) {
			    					System.out.println("Te ha matado el Troll");
			    				} else {
			    					System.out.println(ad.mostrarTextos(121));
			    					ad.setTroll(true);
			    					jugador.setHp(jugador.getHp()+10);
			    					ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    				}
			    			}
			    			if (opciones==29) {
			    				if (respuesta==2) {
			    					System.out.println(ad.mostrarTextos(31));
			    				}
			    				Esqueleto esqueleto = new Esqueleto();
			    				amigo=ad.isAmigo();
			    				boolean vsEsqueleto= pl.vs(jugador, esqueleto, amigo);
			    				if (vsEsqueleto==false) {
			    					System.out.println("Te ha matado el Esqueleto");
			    				} else {
			    					System.out.println(ad.mostrarTextos(32));
			    					ad.setEsqueleto(true);
			    					jugador.setHp(jugador.getHp()+10);
			    					ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    				}
			    			}
			    			if (opciones==28 && respuesta==2 && ad.isReyGoblin()==false) {
			    				System.out.println(ad.mostrarTextos(36));
			    				ReyGoblin reyGoblin = new ReyGoblin();
			    				amigo=ad.isAmigo();
			    				boolean vsReyGoblin= pl.vs(jugador, reyGoblin, amigo);
			    				if (vsReyGoblin==false) {
			    					System.out.println("Te ha matado el Rey Goblin");
			    				} else {
			    					System.out.println("Venciste al Rey Goblin");
			    					ad.setReyGoblin(true);
			    					jugador.setHp(jugador.getHp()+10);
			    					ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    				}
			    			}
			    			if (opciones==37 && respuesta==1 && ad.isProfe()==false) {
			    				System.out.println(ad.mostrarTextos(124));
			    				ProfesorPablo profe = new ProfesorPablo();
			    				amigo=ad.isAmigo();
			    				boolean vsProfe= pl.vs(jugador, profe, amigo);
			    				if (vsProfe==false) {
			    					System.out.println("Te ha matado el Profe, debes estudiar más");
			    				} else {
			    					System.out.println(ad.mostrarTextos(43));
			    					ad.setProfe(true);
			    					jugador.setHp(jugador.getHp()+10);
			    					ad.grabar(nombreJugador, clase, nombre, sexo, jugador.getDinero(), jugador.getPociones(), jugador.getHp(), opciones, etapa);
			    				}
			    			}
			    			if  (opciones==55 && respuesta==1) {
			    				mostrarArchivo("dragonPeleaencrip.txt");
			    				Dragon draco = new Dragon();
			    				amigo=ad.isAmigo();
			    				boolean vsDraco= pl.vs(jugador, draco, amigo);
			    				if (vsDraco==false) {
			    					System.out.println("Te ha matado el Dragón, todo fue en vano");
			    				} else {
			    					if (ad.isPiedraDiego()) {
			    						String[] textoDividido = ad.mostrarTextos(51).split("AAA");
			    						System.out.println(textoDividido[0]+jugador.toString()+textoDividido[1]);
			    					}
			    					else {
			    						System.out.println(ad.mostrarTextos(45));
			    					}
			    					if (sexo=='m') {
			    						System.out.println(ad.mostrarTextos(46));
			    					} else {
			    						System.out.println(ad.mostrarTextos(129));
			    					}
			    						
			    					ad.setDragon(true);
			    				}
			    			}
			    	   
			    			opciones=ad.resultado(opciones, respuesta);
			    		}
			    	} while (opciones!=56 &&opciones!=57 && opciones!=58 && jugador.getHp()>0);
			       
			    	if (sigues!=1) {
			    		System.out.println("Fin del juego");   
			    	}
			    }   
				
			break;
			case 3: 
				mostrarArchivo("infoencrip.txt");
				
			 	System.out.println("\n(Presione enter para continuar)");
			 	bf.readLine();
			 	
			break;
			case 4: 
				System.out.println("Juego finalizado");
			break;
			default: System.out.println("Ingrese un número entre 1 y 4"); 
			}
		
		}while(opcion!=4);
	
	
	}
	
	public static void mostrarArchivo(String nombre) throws IOException {
		FileReader lector=null;
		try { lector= new FileReader(nombre);
		
		} catch (FileNotFoundException fn) {
			System.out.println("Archivo "+ nombre + " no encontrado");
		}
		int car= lector.read();
		
		while (car !=-1) {
			System.out.print((char)(car-5));
			car= lector.read();
		}
		System.out.println(" "); 
		lector.close();
	}

}