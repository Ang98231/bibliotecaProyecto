package bibliotecaTest1;
import java.util.ArrayList;

public class Socio {
	private static int numSocio=0;
	private int numeroSocio;
        private int numPrestados;
	private String nombreSocio;
	private String direccion;
	private ArrayList<LibroPrestado> librosPrestados;
	
	Socio(String n, String dir){
		this.nombreSocio=n;
		this.numeroSocio=numSocio;
		this.direccion=dir;
		this.librosPrestados=new ArrayList<>();
                this.numPrestados=0;
		numSocio++;
	}
	public int getNumPrestados(){
            return numPrestados;
        }
	public int getNumeroSocio() {
		return numeroSocio;
	}
	public String getNombreSocio() {
		return nombreSocio;
	}
	public String getDireccion() {
		return direccion;
	}
	public ArrayList<LibroPrestado> getLibrosPrestados() {
		return librosPrestados;
	}
	public void setLibroPrestado(ArrayList<LibroPrestado> libroPrestado) {
		this.librosPrestados = libroPrestado;
	}
	
	public void agregarPrestamo(LibroPrestado libro) {
		this.librosPrestados.add(libro);
                this.numPrestados++;
	}
	public void removerPrestamo(LibroPrestado libro) {
		this.librosPrestados.remove(libro);
	}
	public void mostrarPrestamo() {
		for(LibroPrestado libroPrestado : librosPrestados) {
			System.out.println(libroPrestado);
		}
	}
	public int librosPrestados() {
		return this.librosPrestados.size();
	}
	
	public String toString() {
		return ("\nNombre: "+ this.nombreSocio+"\tNumero Socio: "+this.numeroSocio+
				"\nDireccion: "+this.direccion+"\tLibros Prestados: "+this.librosPrestados());
	}
}
