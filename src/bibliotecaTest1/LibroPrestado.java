package bibliotecaTest1;
import java.time.LocalDate;

public class LibroPrestado {
	private Socio socio;
	private Libro libro;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	LibroPrestado(Socio socio, Libro libro, LocalDate fecha){
		this.libro=libro;
		this.socio=socio;
		this.fechaPrestamo=fecha;
		this.fechaDevolucion=null;
	}
	
	public Socio getSocio() {
		return socio;
	}
	public Libro getLibro() {
		return libro;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public String toString() {
		if(this.fechaDevolucion==null) {
		return ("\nTitulo"+ ": "+this.libro.getTitulo()+"\tAutor: "+this.libro.getAutor()
				+"\nSocio: "+this.socio.getNombreSocio()+"\tFecha prestamo: "+this.fechaPrestamo);
		}else {
			return ("\nTitulo"+ ": "+this.libro.getTitulo()+"\tAutor: "+this.libro.getAutor()
			+"\nSocio: "+this.socio.getNombreSocio()+"\tFecha prestamo: "+this.fechaPrestamo
			+"\nFecha devoluci�n: "+this.fechaDevolucion);
		}
	}
}
