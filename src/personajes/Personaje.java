package personajes;

public class Personaje {
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected String[] habilidades;
	protected int hp;
	protected int pociones;
	protected int dinero;
	
	public Personaje() {
		nombre= "";
	    edad= 0;
	    sexo= 'n';
	    habilidades= null;
	    hp=-1;	
	    dinero=200;
	    pociones=2;
	}

	public Personaje(String nombre, int edad, char sexo, int hp) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.hp = hp;
	}

	public Personaje(String nombre, char sexo) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.dinero=200;
	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	
	}

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public String toString() {
		return "Personaje " + nombre;
	}  
	
	public int daño(int num) {
		return 0;
	}
	
	public int numeroDeHabilidades() {
		return habilidades.length;
	}
	
	public String habilidad(int opcion) {
		return habilidades[opcion-1];
	}
	
	public String rasgos() {
		return "";
	}
	
	public String historia() {
		return "";
	}
}
