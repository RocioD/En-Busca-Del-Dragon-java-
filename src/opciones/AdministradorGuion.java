package opciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdministradorGuion {
	private String opciones[], textos[], grabados[];
	private boolean amigo, taberna1, taberna2, goblins, lobo, troll, rey, dragon, llave1, llave2, llave3, talisman, pocion1, pocion2, plata1, armadura;
	private boolean palanca, roca, acertijo1, acertijo2, acertijo3, estatua, profe, reyGoblin, ayudanteRey, esqueleto, diego, piedraDiego, sabio;
	
	public AdministradorGuion() throws IOException {

		FileReader lector=null;
		FileReader lector2=null;
	
		try {
			lector = new FileReader ("opcionesencrip.txt");
			lector2 = new FileReader ("textosencrip.txt");
		} catch (FileNotFoundException fn) {
			System.out.println("Archivo no encontrado");
		}
		
		String textoCompleto = "";
		int car = lector.read();
		while (car!=-1) {
			textoCompleto=textoCompleto + ((char)(car-5));
			car= lector.read();
		}
		
		opciones = textoCompleto.split("#\r\n");
		
		String textoCompleto2 = "";
		int car2 = lector2.read();
		while (car2!=-1) {
			textoCompleto2=textoCompleto2 + ((char)(car2-5));
			car2= lector2.read();
		}
		
		textos=textoCompleto2.split("#\r\n");
		
		lector.close();
		lector2.close();		
	}
	
	
	//muestra solo las opciones
	public String mostrarOpciones(int numero) {
		String opcion = "";
		
		switch (numero) {
		case 1: opcion= opcion + mostrarTextos(60);							
		break;
		case 2: opcion= textos[61];
		break;
		case 3: opcion= textos[62];
		break;
		case 4: opcion= textos[62];
		break;
		case 5: opcion= textos[63];
		break;
		case 6: opcion= textos[64];
		break;
		case 7: opcion= textos[65];
		break;
		case 8: opcion= textos[66];
		break;
		case 9: opcion= textos[67];
		break;
		case 10: opcion= textos[68];
		break;
		case 11: opcion= textos[69];
		break;
		case 12: opcion= textos[70];
		break;
		case 13: opcion= textos[71];
		break;
		case 14: opcion= textos[72];
		break;
		case 15: opcion= textos[73];
		break;
		case 16: opcion= textos[74];
		break;
		case 17: opcion= textos[75];
		break;
		case 18: opcion= textos[76];
		break;
		case 19: opcion= textos[77];
		break;
		case 20: opcion= textos[78];
		break;
		case 21: opcion= textos[79];
		break;
		case 22 - 23: opcion= textos[128];
		break;
		case 24: opcion= textos[81];
		break;
		case 25: opcion= textos[81];
		break;
		case 26: opcion= textos[82];
		break;
		case 27: opcion= textos[83];
		break;
		case 28: opcion= textos[29];
		break;
		case 29: opcion= textos[84];
		break;
		case 30: opcion= textos[87];
		break;
		case 31: opcion= textos[90];
		break;
		case 32: opcion= textos[88];
		break;
		case 33: opcion= textos[88];
		break;
		case 34: opcion= textos[91];
		break;
		case 35: opcion= textos[92];
		break;
		case 36: opcion= textos[93];
		break;
		case 37: opcion= textos[86];
		break;
		case 38: opcion= textos[89];
		break;
		case 39: opcion= textos[89];
		break;
		case 40: opcion= textos[93];
		break;
		case 41: opcion= textos[95];
		break;
		case 42: opcion= textos[91];
		break;
		case 43: opcion= textos[96];
		break;
		case 44: opcion= textos[98];
		break;
		case 45: opcion= textos[98];
		break;
		case 46: opcion= textos[97];
		break;
		case 47: opcion= textos[97];
		break;
		case 48: opcion= textos[99];
		break;
		case 49: opcion= textos[100];
		break;
		case 50: opcion= textos[100];
		break;
		case 51: opcion= textos[101];
		break;
		case 52: opcion= textos[101];
		break;
		case 53: opcion= textos[102];
		break;
		case 54: opcion= textos[102];
		break;
		case 55: opcion= textos[125];
		break;
	
		
	}
		String dividido[]= opciones[numero].split("\r\n");
		
		for (int i=0; i<dividido.length; i++) {
			opcion=opcion+(dividido[i].substring(0, dividido[i].length()-3) + "\r\n");
		}
		return opcion;
	}
	
	public String mostrarTextos(int numero) {
		return textos[numero];
	}
	
	public int resultado(int numero, int respuesta) throws IOException {
		Acertijos acertijo = new Acertijos();
		String dividido[]= opciones[numero].split("\r\n");
		String opcion = "";
			opcion=dividido[respuesta-1].substring(dividido[respuesta-1].length()-2);
		
			switch (numero) {
				case 1: 
					if (respuesta==1 && taberna1==true) {
						if	(taberna2==true) {
							return 4;
						}
						else {
							return 3;
						}
					}
					if (respuesta==2) {
						System.out.println(textos[2]);
					}
					if (respuesta==3) {
						if (taberna1) {
							System.out.println(textos[3]);
						} else {
							System.out.println("L" + textos[3].substring(3));
						}
					}
				break;
				case 2: 
					if (respuesta==1) {
						taberna1=true;
					}
				break;
				case 3: 
					if (respuesta==1) {
						taberna2=true;
					}
				break;
				case 4: 
					if (respuesta==1) {
						System.out.println(textos[107]);
					}
					if (respuesta==2) {
						System.out.println(textos[108]);
					}
				break;
				case 5: 
					if (respuesta==2 && ayudanteRey==false) {
						System.out.println(textos[8]);
						ayudanteRey=true;
						return 13;
					}
				break;
				case 6: 
					if (respuesta==1) {
						System.out.println(textos[4]);
					}
					if (respuesta==5 && ayudanteRey==false && talisman==false) {
						System.out.println(textos[8]);
						ayudanteRey=true;
						return 13;
					}
				break;
				case 7: 
					if (respuesta==2 && ayudanteRey==false) {
						System.out.println(textos[27]);
					}
				break;
				case 9: 
					if (respuesta==1) {
						System.out.println(textos[5]);
					}
				break;
				case 10:
					if (respuesta==1) {
						System.out.println(textos[7]);
					}
				break;
				case 11: 
					if (respuesta==1) {
						System.out.println(textos[14]);
					}
					if (respuesta==2) {
						if (goblins==false) {
							System.out.println(textos[19]);
						} else {
							return 20;
						}
					}
				break;
				case 13: 
					if (respuesta==1) {
						if (rey==false) {
							if (ayudanteRey==false) {
								ayudanteRey=true;
							} 
							return 13;
						}
						System.out.println(textos[10]);;
					}
					if (respuesta==2) {
						if (rey==false) {
							System.out.println(textos[9]);
							rey=true;
						} else {
							System.out.println(textos[107]);
						}
					}
					if (respuesta==3 && rey==false) {
						if (ayudanteRey==false) {
							ayudanteRey=true;
						}
						return 13;
					}
					if (respuesta==3 && talisman==false) {
						System.out.println("Debes encontrar el talisman");
						return 13;
					}
				break;
				case 14: 
					if (respuesta==1) {
						if (diego==false) {
							System.out.println(textos[15]+"\n"+textos[16]);
							diego=true;
						} else { if(lobo==false) {
							return 16;
						} else
							System.out.println(textos[17]);
							return 17;
						}
					}
				break;
				case 15: 
					if (respuesta==1) {
						piedraDiego=true;
						System.out.println(textos[114]);
					} else if (respuesta==2) {
						System.out.println(textos[115]);
					} else {
						System.out.println(textos[116]);
					}
						
					if (lobo) {
						System.out.println(textos[17]);
						return 17;
					}
				break;
				case 16: 
					if (respuesta!=3) {
						System.out.println(textos[17]);
					}
				break;
				case 18: 
					if (respuesta==1) {
						if (sabio==true) {
							return 25;
						}
						sabio=true;
					}
					if (respuesta==3) {
						if (estatua==false) {
							if (amigo==false) {
								System.out.println(textos[21]);
							} else
								System.out.println(textos[22]);
						} else {
							return 20;
						}
					}
				break;
				case 19:
					if (respuesta==2) {
						System.out.println(textos[20]);
					}
				break;
				case 20: if (respuesta==1) {
					if (estatua==false) {
						if (amigo==false) {
							System.out.println(textos[21]);
						} else
							System.out.println(textos[22]);
					} else {
						return 16;
					}
				}
				break;
				case 21: 
					if (respuesta==1) {
						amigo=true;
						System.out.println(textos[22]);
					} else {
						System.out.println(textos[21]);
					}
				break;
				case 22: 
					if (respuesta==1) {
						if (amigo==false) {
								System.out.println(textos[23]);
							} else {
								System.out.println(textos[24]);
								return 16;
							}
						} 
				break;
				case 23: 
					if (respuesta==1) {
						if (amigo==false) {
								System.out.println(textos[23]);
							} else {
								System.out.println(textos[24]);
								return 20;
							}
						} 
				break;
				case 24: 
					if (respuesta==2) {
						System.out.println(textos[26]);
					}
					
					if (respuesta==3) {
						System.out.println(textos[120]);
					} 			
				break;
				case 25: 
					if (respuesta==1 && troll) {
						return 27;
					} 
					if (respuesta==2) {
						System.out.println(textos[27]);
					}
					if (respuesta==4) {
						System.out.println(textos[28]);
					}
				break;
				case 28: 
					if (respuesta==1) {
						if (esqueleto) {
							return 30;
						}
						System.out.println(textos[30]);
					} 
					if (respuesta==2) {
						if (reyGoblin && roca) {
							return 33;
						}
						if (reyGoblin==false) {
							System.out.println(textos[36]);
						}
					} 
					if (respuesta==3) {
						if (profe) {
							if (palanca) {
								return 39;
							} else {
								return 38;
							}
						}
						System.out.println(textos[42]);
					}
					
				break;
				case 30: 
					if (respuesta==1) {
						System.out.println(textos[33]);	
					}
				break;
				case 32: 
					if (respuesta==1) {
						System.out.println(textos[37]);	
					}
				break;
				case 34: 
					if (respuesta==3 && roca) {
						return 33;
					}
				break;
				case 35: 
					if (respuesta==1) {
						if (palanca) {
							System.out.println(textos[122]);
						} else {
							System.out.println(textos[38]);
							palanca=true;
						}
					}
				break;
				case 36: 
					if (respuesta==1) {
						if (roca) {
							System.out.println(textos[123]);
						} else {
							System.out.println(textos[41]);
							roca=true;
						}
					}
				break;
				case 37: 
					if (respuesta==1 && palanca) {
						return 39;
					}
				break;
				case 38: 
					if (respuesta==1) {
						System.out.println(textos[56]+"\n"+textos[37]);
					}
				break;
				case 39: 
					if (respuesta==1) {
						if (piedraDiego==false) {
							System.out.println(textos[44]);
							return 55;
						}
					}
				break;
				case 40: 
					if (respuesta==1) {
						System.out.println(textos[49]+ "\n" + textos[50]);
					} else {
						System.out.println(textos[44]);
					}
				break;
				case 41: 
					if (respuesta==2) {
						System.out.println(textos[52]);
					}
				break;
				case 42: 
					if (respuesta==1) {
						System.out.println(textos[126]);
					}
				break;
				case 43: 
					if (respuesta==1 && pocion2) {
						return 45;
					}
					if (respuesta==2 && llave1) {
						return 47;
					}
				break;
				case 46: 
					if (respuesta==1 && llave1==false) {
			    		llave1=true;
					}
				break;
				case 48: 
					if (respuesta==1) {
						if (llave1==false) {
							System.out.println(textos[58]);
						}
						else {
							if (acertijo1==false) {
								acertijo1=acertijo.mostrarAcertijo(1);
								return 49;
							} else {
								if (llave2) {
									return 50;
								} else {
									return 49;
								}
							}
						}
					}
					if (respuesta==2) {
						if (llave2==false) {
							System.out.println(textos[58]);
						} else {
							if (acertijo2==false) {
								acertijo2=acertijo.mostrarAcertijo(2);
								return 51;
							} else {
								if (llave3) {
									return 52;
								} else {
									return 51;
								}
							}
						}
					}
					if (respuesta==3) {
						if (llave3==false) {
							System.out.println(textos[58]);
						} else {
							if (acertijo3==false) {
								acertijo3=acertijo.mostrarAcertijo(3);
								return 53;
							} else {
								if (talisman) {
									return 54;
								} else {
									return 53;
								}
							}
						}
					}
				break;
				case 49: 
					if (respuesta==1 && llave2==false) {
						llave2=true;
					}
				break;
				case 51: 
					if (respuesta==1 && llave3==false) {
						llave3=true;
					}
				break;
				case 53: 
					if (respuesta==1 && llave2==false) {
						llave2=true;
					}
				break;
				case 54: 
					if (respuesta==1 && talisman==false) {
						talisman=true;
					}
				break;
				case 55: 
					if (respuesta==2) {
			    		System.out.println(textos[53] + "\n" + textos[54] + "\n" + textos[55]);
					}
				break;
			
				
			}
		
		return Integer.parseInt(opcion);
	}
	
	public void setOpciones(boolean amigo, boolean taberna1, boolean taberna2, boolean goblins, boolean lobo, boolean troll, boolean rey, boolean dragon, boolean llave1, boolean llave2, boolean llave3, boolean talisman, boolean pocion1, boolean pocion2, boolean plata1, boolean armadura, boolean palanca, boolean roca, boolean acertijo1, boolean acertijo2, boolean acertijo3, 
			boolean estatua, boolean profe, boolean reyGoblin, boolean ayudanteRey, boolean esqueleto, boolean diego, boolean piedraDiego, boolean sabio) {
		this.amigo=amigo;
		this.taberna1=taberna1;
		this.taberna2= taberna2;
		this.goblins=goblins;
		this.lobo=lobo;
		this.troll= troll;
		this.rey=rey;
		this.dragon= dragon;
		this.llave1= llave1;
		this.llave2= llave2;
		this.llave3= llave3;
		this.talisman= talisman;
		this.pocion1= pocion1;
		this.pocion2= pocion2;
		this.plata1=plata1;
		this.armadura=armadura;
		this.palanca= palanca;
		this.roca= roca;
		this.acertijo1=  acertijo1;
		this.acertijo2= acertijo2;
		this.acertijo3=  acertijo3;
		this.estatua = estatua;
		this.profe = profe;
		this.reyGoblin = reyGoblin;
		this.ayudanteRey = ayudanteRey;
		this.esqueleto = esqueleto;
		this.diego= diego;
		this.piedraDiego= piedraDiego;
		this.sabio= sabio;
	}
	
	public void grabar(String nombreJugador, int clase, String nombre, char sexo, int dinero, int pociones, int hp, int opcion, String etapa) throws IOException {
		FileReader lector3= null;
		
		String todo="";
		
		boolean existe=false;
		int indiceExiste=0;
		String guardadosAnteriores="";
		
		try {
			lector3= new FileReader("partidas.txt");
			int car3 = lector3.read();
			while (car3!=-1) {
				guardadosAnteriores=guardadosAnteriores + (char)car3;
				car3= lector3.read();
			}	
			lector3.close();	
		} catch (FileNotFoundException fn) {
			System.out.println("Archivo no encontrado");
		}
		FileWriter escritor= new FileWriter("partidas.txt");
		
		String escrito = nombreJugador + "#" + clase + "#" + nombre + "#" + sexo + "#" + dinero + "#" + pociones + "#" + hp + "#" + opcion + "#" + etapa + "\r\n" 
				+ amigo	+ "#" + taberna1 + "#" + taberna2 + "#" + goblins + "#" + lobo + "#" + troll + "#" + rey + "#" + dragon + "#" + llave1 + "#" + llave2 + "#" 
				+ llave3 + "#" + talisman + "#" + pocion1 + "#" + pocion2 + "#" + plata1 + "#" + armadura + "#" + palanca + "#" + roca + "#" +  acertijo1 + "#" 
				+ acertijo2 + "#" + acertijo3 + "#" + estatua + "#" + profe + "#" + reyGoblin + "#" + ayudanteRey + "#" + esqueleto + "#" + diego + "#" + piedraDiego + "#" + sabio+ "\r\n%%";
	
	
		if (guardadosAnteriores.compareTo("")!=0) {
			grabados=guardadosAnteriores.split("\r\n%%");
			
			for (int i=0; i<grabados.length; i++) {
				String contenido[] = grabados[i].split("#");
				if (contenido[0].compareTo(nombreJugador)==0) {
					existe=true;
					indiceExiste=i;
				}	
			}
			if (existe) {
				grabados[indiceExiste]= escrito.substring(0, escrito.length()-4);
			
				for (int i=0; i<grabados.length; i++) {
					todo=todo + grabados[i] + "\r\n%%";
				}
				escritor.append(todo);
			}
			else {
				for (int i=0; i<grabados.length; i++) {
					todo=todo + grabados[i] + "\r\n%%";
				}
				todo= todo + escrito;
				escritor.append(todo);
			}
			
		} else {
			escritor.append(escrito);
		}

		
		
		escritor.close();
	}
	
	public String cargar() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		FileReader lector3=null;
		String partida[];
		int opc=-1;
		int caract;
		String guardadas = "";
		try {
			lector3 = new FileReader ("partidas.txt");
			caract = lector3.read();
			while (caract!=-1) {
				guardadas=guardadas + (char)caract;
				caract= lector3.read();
			}
		lector3.close();
		} catch (FileNotFoundException fn) {
			//No hay partidas
		}
			
		
		if (guardadas.compareTo("")!=0) {
			grabados = guardadas.split("\r\n%%");
		
			for(int i=0;i<grabados.length;i++) {
				String mitad[]=grabados[i].split("\r\n");
				partida=mitad[0].split("#");
				System.out.println((i+1)+") "+partida[0] + " " + partida[8]);
			}
				
			do {	
				try {
					opc=Integer.parseInt(bf.readLine());
				} catch (NumberFormatException nf) {}
				if (opc<1 || opc> grabados.length) {
					System.out.println("Por favor ingresa un número entre 1 y " + grabados.length);
				}
			}while (opc<1 || opc> grabados.length);
					
			String partes[]=grabados[opc-1].split("\r\n");
			String booleans[] = partes[1].split("#");
			boolean booleanos[] = new boolean[29];
			
			for (int i=0; i<booleans.length; i++) {
				if (booleans[i].compareTo("true")==0) {
					booleanos[i]=true;
				} else {
					booleanos[i]=false;
				}
			}
			
			amigo = booleanos[0];
			taberna1 = booleanos[1];
			taberna2 = booleanos[2];
			goblins = booleanos[3];
			lobo = booleanos[4];
			troll = booleanos[5];
			rey = booleanos[6];
			dragon = booleanos[7]; 
			llave1 = booleanos[8];
			llave2 = booleanos[9];
			llave3 = booleanos[10];
			talisman = booleanos[11];
			pocion1 = booleanos[12];
			pocion2 = booleanos[13];
			plata1 = booleanos[14];
			armadura = booleanos[15];
			palanca = booleanos[16];
			roca = booleanos[17];
			acertijo1 = booleanos[18];
			acertijo2 = booleanos[19];
			acertijo3 = booleanos[20];
			estatua = booleanos[21];
			profe = booleanos[22];
			reyGoblin= booleanos[23];
			ayudanteRey = booleanos[24];
			esqueleto = booleanos[25];
			diego = booleanos[26];
			piedraDiego = booleanos[27];
			sabio = booleanos[28];

			return partes[0];
		}
	return "";
	
	
	}
	public boolean isAmigo() {
		return amigo;
	}
	public void setAmigo(boolean amigo) {
		this.amigo = amigo;
	}
	public boolean isGoblins() {
		return goblins;
	}
	public void setGoblins(boolean goblins) {
		this.goblins = goblins;
	}
	public boolean isLobo() {
		return lobo;
	}
	public void setLobo(boolean lobo) {
		this.lobo = lobo;
	}
	public boolean isTroll() {
		return troll;
	}
	public void setTroll(boolean troll) {
		this.troll = troll;
	}
	public boolean isRey() {
		return rey;
	}
	public void setRey(boolean rey) {
		this.rey = rey;
	}
	public boolean isDragon() {
		return dragon;
	}
	public void setDragon(boolean dragon) {
		this.dragon = dragon;
	}
	public boolean isTalisman() {
		return talisman;
	}
	public void setTalisman(boolean talisman) {
		this.talisman = talisman;
	}
	public boolean isPocion1() {
		return pocion1;
	}
	public void setPocion1(boolean pocion1) {
		this.pocion1 = pocion1;
	}
	public boolean isPocion2() {
		return pocion2;
	}
	public void setPocion2(boolean pocion2) {
		this.pocion2 = pocion2;
	}
	public boolean isPlata1() {
		return plata1;
	}
	public void setPlata1(boolean plata1) {
		this.plata1 = plata1;
	}
	public boolean isArmadura() {
		return armadura;
	}
	public void setArmadura(boolean armadura) {
		this.armadura = armadura;
	}
	public boolean isEstatua() {
		return estatua;
	}
	public void setEstatua(boolean estatua) {
		this.estatua = estatua;
	}
	public boolean isProfe() {
		return profe;
	}
	public void setProfe(boolean profe) {
		this.profe = profe;
	}
	public boolean getSabio() {
		return sabio;
	}
	public void setSabio(boolean sabio) {
		this.sabio = sabio;
	}
	public boolean isReyGoblin() {
		return reyGoblin;
	}
	public void setReyGoblin(boolean reyGoblin) {
		this.reyGoblin = reyGoblin;
	}
	public boolean isAyudanteRey() {
		return ayudanteRey;
	}
	public void setAyudanteRey(boolean ayudanteRey) {
		this.ayudanteRey = ayudanteRey;
	}
	public boolean isEsqueleto() {
		return esqueleto;
	}
	public void setEsqueleto(boolean esqueleto) {
		this.esqueleto = esqueleto;
	}
	public boolean isPiedraDiego() {
		return piedraDiego;
	}
	public void setPiedraDiego(boolean piedraDiego) {
		this.piedraDiego = piedraDiego;
	}
	public boolean isTaberna1() {
		return taberna1;
	}
	public void setTaberna1(boolean taberna1) {
		this.taberna1 = taberna1;
	}
	public int cantidadDeOpciones(int numero) {
		String dividido[]= opciones[numero].split("\r\n");
		return dividido.length;
	}
	
}
