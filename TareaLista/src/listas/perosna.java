package listas;

public class perosna {

	private int num;
	private String nombre;
	private int edad;
	
	public perosna() {
	}
	public perosna(int num, String nombre, int edad) {
		this.num =num;
		this.nombre=nombre;
		this.edad=edad;
	}
	public int getNum() {
		return num;
	   }
	   public void setNum(int num) {
		   this.num=num;
	}
	   
	public String getNombre() {
		return nombre;
	   }
	   public void setNombre(String nombre) {
		   this.nombre=nombre;
		   
	}
	public int getEdada() {
		return edad;
	   }
	   public void setEdada(int edad) {
		   this.edad=edad;
	}
}
