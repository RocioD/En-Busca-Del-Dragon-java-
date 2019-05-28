package opciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acertijos {
	
	private String acertijos[];
	private String respuesta;
	private int resultado1=-1, resultado2=-1, resultado3=-1, inte1, inte2, inte3, inte4, inte5, inte6, inte7, inte8, it1, it2, it3, it4, it5, it6, it7, it8, it9, it10, it11, it12, it13, it14, it15, it16;
	public Acertijos() throws IOException {
		
		FileReader lector=null;
	
	
		try {
			lector = new FileReader ("Acertijosencrip.txt");
			} catch (FileNotFoundException fn)
			{
				System.out.println("Archivo no encontrado");
			}
	
		String texto = "";
		int car = lector.read();
		while (car!=-1)
		{
			texto=texto + ((char)(car-5));
			car= lector.read();
		}
		
		acertijos = texto.split("#\r\n");
		lector.close();
	}
		
	public boolean mostrarAcertijo(int numero) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		switch (numero) 
		{
		case 1: 
		do
		{
			System.out.println(acertijos[0]);
			respuesta = bf.readLine();
			inte1=respuesta.compareTo("Fuego");
			inte2=respuesta.compareTo("fuego");
			inte3=respuesta.compareTo("FUEGO");
			inte4=respuesta.compareTo("El Fuego");
			inte5=respuesta.compareTo("El fuego");
			inte6=respuesta.compareTo("EL FUEGO");
			inte7=respuesta.compareTo("el fuego");
			inte8=respuesta.compareTo("el Fuego");
				if(inte1==0 || inte2==0 || inte3==0 || inte4==0 || inte5==0 || inte6==0 || inte7==0 || inte8==0)
				{
					System.out.println("Muy Bien");
					resultado1=0;
				}else
				{
					System.out.println("intenta nuevamente");
				}
		}while (resultado1 !=0);
		return true;
		case 2: 
		do
		{
			System.out.println(acertijos[1]);
			respuesta = bf.readLine();
			resultado2=respuesta.compareTo("1893");
				if(resultado2 == 0)
				{
					System.out.println("Muy bien");
				}else
				{
					System.out.println("Intenta nuevamente");
				}
		}while (resultado2 !=0);		
		return true;
		case 3:
		do
		{
			System.out.println(acertijos[2]);
			respuesta = bf.readLine();
			it1=respuesta.compareTo("Corazon");
			it2=respuesta.compareTo("Corazón");
			it3=respuesta.compareTo("corazon");
			it4=respuesta.compareTo("corazón");
			it5=respuesta.compareTo("CORAZON");
			it6=respuesta.compareTo("CORAZÓN");
			it7=respuesta.compareTo("El Corazon");
			it8=respuesta.compareTo("El Corazón");
			it9=respuesta.compareTo("El corazon");
			it10=respuesta.compareTo("El corazón");
			it11=respuesta.compareTo("EL CORAZON");
			it12=respuesta.compareTo("EL CORAZÓN");
			it13=respuesta.compareTo("el Corazon");
			it14=respuesta.compareTo("el Corazón");
			it15=respuesta.compareTo("el corazon");
			it16=respuesta.compareTo("el corazón");
				if(it1==0 || it2==0 || it3==0 || it4==0 || it5==0 || it6==0 || it7==0 || it8==0 || it9==0 || it10==0 || it11==0 || it12==0 || it13==0 || it14==0 || it15==0 || it16==0)
				{
					System.out.println("Muy Bien");
					resultado3=0;
				}else
				{
					System.out.println("intenta nuevamente");
				}
		}while(resultado3 !=0);
		return true;
		}
	
		return false;
	}

	public String[] getAcertijos() {
		return acertijos;
	}

	public void setAcertijos(String[] acertijos) {
		this.acertijos = acertijos;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getResultado1() {
		return resultado1;
	}

	public void setResultado1(int resultado1) {
		this.resultado1 = resultado1;
	}

	public int getResultado2() {
		return resultado2;
	}

	public void setResultado2(int resultado2) {
		this.resultado2 = resultado2;
	}

	public int getResultado3() {
		return resultado3;
	}

	public void setResultado3(int resultado3) {
		this.resultado3 = resultado3;
	}

	public int getInte1() {
		return inte1;
	}

	public void setInte1(int inte1) {
		this.inte1 = inte1;
	}

	public int getInte2() {
		return inte2;
	}

	public void setInte2(int inte2) {
		this.inte2 = inte2;
	}

	public int getInte3() {
		return inte3;
	}

	public void setInte3(int inte3) {
		this.inte3 = inte3;
	}

	public int getInte4() {
		return inte4;
	}

	public void setInte4(int inte4) {
		this.inte4 = inte4;
	}

	public int getInte5() {
		return inte5;
	}

	public void setInte5(int inte5) {
		this.inte5 = inte5;
	}

	public int getInte6() {
		return inte6;
	}

	public void setInte6(int inte6) {
		this.inte6 = inte6;
	}

	public int getInte7() {
		return inte7;
	}

	public void setInte7(int inte7) {
		this.inte7 = inte7;
	}

	public int getInte8() {
		return inte8;
	}

	public void setInte8(int inte8) {
		this.inte8 = inte8;
	}

	public int getIt1() {
		return it1;
	}

	public void setIt1(int it1) {
		this.it1 = it1;
	}

	public int getIt2() {
		return it2;
	}

	public void setIt2(int it2) {
		this.it2 = it2;
	}

	public int getIt3() {
		return it3;
	}

	public void setIt3(int it3) {
		this.it3 = it3;
	}

	public int getIt4() {
		return it4;
	}

	public void setIt4(int it4) {
		this.it4 = it4;
	}

	public int getIt5() {
		return it5;
	}

	public void setIt5(int it5) {
		this.it5 = it5;
	}

	public int getIt6() {
		return it6;
	}

	public void setIt6(int it6) {
		this.it6 = it6;
	}

	public int getIt7() {
		return it7;
	}

	public void setIt7(int it7) {
		this.it7 = it7;
	}

	public int getIt8() {
		return it8;
	}

	public void setIt8(int it8) {
		this.it8 = it8;
	}

	public int getIt9() {
		return it9;
	}

	public void setIt9(int it9) {
		this.it9 = it9;
	}

	public int getIt10() {
		return it10;
	}

	public void setIt10(int it10) {
		this.it10 = it10;
	}

	public int getIt11() {
		return it11;
	}

	public void setIt11(int it11) {
		this.it11 = it11;
	}

	public int getIt12() {
		return it12;
	}

	public void setIt12(int it12) {
		this.it12 = it12;
	}

	public int getIt13() {
		return it13;
	}

	public void setIt13(int it13) {
		this.it13 = it13;
	}

	public int getIt14() {
		return it14;
	}

	public void setIt14(int it14) {
		this.it14 = it14;
	}

	public int getIt15() {
		return it15;
	}

	public void setIt15(int it15) {
		this.it15 = it15;
	}

	public int getIt16() {
		return it16;
	}

	public void setIt16(int it16) {
		this.it16 = it16;
	}
	
}

