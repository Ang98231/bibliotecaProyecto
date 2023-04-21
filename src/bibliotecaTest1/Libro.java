package bibliotecaTest1;

public class Libro {
	private static int codLibro=0;
	private String titulo;
	private String autor;
	private int codigo;
	private String seccion;
	private String nivel;
	private boolean disponibilidad;
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getSeccion() {
		return seccion;
	}
	public String getNivel() {
		return nivel;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	Libro( String t, String a, String s, String n,boolean d){
		this.codigo=codLibro;
		this.titulo=t;
		this.autor=a;
		this.seccion=s;
		this.setDisponibilidad(d);
		this.nivel=n;
		codLibro++;
	}

	Libro(String t, String a, String s, String n){
		this.autor=a;
		this.titulo=t;
		this.codigo=codLibro;
		this.seccion=s;
		this.nivel=n;
		this.setDisponibilidad(true);
		codLibro++;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public String toString() {
		return ("Titulo: "+ this.titulo + "\tAutor: "+this.getAutor()+
				"\n"+this.codigo+"\tSeccion: "+this.seccion+"\nNivel: "+
				this.nivel+"\t Disponibilidad: "+this.isDisponibilidad());
	}
	

}
