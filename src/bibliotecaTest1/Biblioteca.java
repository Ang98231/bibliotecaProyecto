package bibliotecaTest1;

import java.util.ArrayList;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Biblioteca {
	private ArrayList<Socio> socios;
	private ArrayList<Libro> libros;
	private ArrayList<LibroPrestado> librosPrestados;
	Biblioteca(){
		this.libros =new ArrayList<>();
		this.socios =new ArrayList<>();
		this.librosPrestados = new ArrayList<>();
		
	}
	
	Biblioteca(String archivoLibro, String archivoSocio) {
	    this.libros = new ArrayList<>();
	    this.socios = new ArrayList<>();
	    this.librosPrestados = new ArrayList<>();
	    try {
	        aniadirLibrosArchivo(archivoLibro);
	    } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(null,"Error al cargar los libros desde el archivo: " + e.getMessage()+"\n","ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
	        System.out.println("Error al cargar los libros desde el archivo: " + e.getMessage()+"\n");
	    }
	    try {
	    	aniadirSociosArchivo(archivoSocio);
	    }catch (IOException e) {
	    	System.out.println("Error al cargar los socios desde el archivo: " +e.getMessage()+"\n");
	    }
	}

	
	public ArrayList<Socio> getSocios() {
		return socios;
	}
	public void setSocios(ArrayList<Socio> socios) {
		this.socios = socios;
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public ArrayList<LibroPrestado> getLibroPrestado() {
		return librosPrestados;
	}
	public void setLibroPrestado(ArrayList<LibroPrestado> libroPrestado) {
		this.librosPrestados = libroPrestado;
	}	

	public void agregarLibro(String titulo, String autor, String seccion, String nivel) {
		this.libros.add(new Libro(titulo,autor, seccion, nivel));
	}
	
	public void agregarSocio(String n, String dir) {
		this.socios.add(new Socio(n, dir));
	}
	
	public Libro buscarLibro(int codigo) throws ELibroNoEncontrado {
		for(Libro libro : libros) {
			if(libro.getCodigo()==codigo) {
			return libro;}
		}throw new ELibroNoEncontrado("El libro con codigo: "+codigo+" no se encuentra en el registro");
	}
	
	private Socio buscarSocio(int numSocio) throws ESocioNoEncontrado {
		for(Socio socio : socios) {
			if(socio.getNumeroSocio()==numSocio){
				return socio;
			}
		}throw new ESocioNoEncontrado("El numero de socio "+numSocio+" no se encuentra en el registro");
	}
        
        public Socio socioBuscado(int numSocio) throws ESocioNoEncontrado{
            return buscarSocio(numSocio);
        }
	
	public void prestarLibro(int codigo, int numSocio, String fecha) {
		try {
			try {
			LocalDate fecI = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			Libro libroBuscado = buscarLibro(codigo);
			if (!libroBuscado.isDisponibilidad()) {
				throw new ELibroNoDisponible("El libro " +libroBuscado.getTitulo()+" no se encuentra disponible.");
			}
			Socio socioBuscado = buscarSocio(numSocio);
			LibroPrestado libroPrestado = new LibroPrestado(socioBuscado, libroBuscado, fecI);
			librosPrestados.add(libroPrestado);
			socioBuscado.agregarPrestamo(libroPrestado);
			libroBuscado.setDisponibilidad(false);
			}catch (DateTimeParseException e) {
				System.out.println("EL formato de fecha no es valido");
			}
                        
		}catch(EBiblioteca e) {
                    javax.swing.JOptionPane.showMessageDialog(null,"El libro no se encuentra disponible.", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
			System.out.println("Error: "+e.getMessage());
		}
                
	}
	
	private LibroPrestado buscarLibroP(int codigo) throws ELibroPrestado {
		for(LibroPrestado libroPrestado : librosPrestados) {
			if(libroPrestado.getLibro().getCodigo()==codigo) {
				return libroPrestado;
			}
		}throw new ELibroPrestado("No se tiene registro del prestamo");
	}
	
	public void devolverLibro(int codigo, int numSocio, String fecha) {
		try {
			try {
			LocalDate fechaF = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LibroPrestado prestamoBuscado=buscarLibroP(codigo);
			Socio socioBuscado = buscarSocio(numSocio);
			Libro libroBuscado = buscarLibro(codigo);
			prestamoBuscado.setFechaDevolucion(fechaF);
			libroBuscado.setDisponibilidad(true);
			socioBuscado.removerPrestamo(prestamoBuscado);
			}catch(DateTimeParseException e) {
			System.out.println("El fotmato de fecha no es valido");}
		}catch(EBiblioteca e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	public void mostrarPrestamosTotales() {
		for(LibroPrestado libroPrestado : librosPrestados) {
			System.out.println(libroPrestado);
		}
	}
        
        private Libro buscarTitulo(String titulo) throws ELibroNoEncontrado{
            for(Libro libro : libros){
                if(libro.getTitulo().equals(titulo)){
                    return libro;
                }
            }throw new ELibroNoEncontrado("No se tiene registro del libro");
            
        }
        
        
        public Libro tituloBuscado(String titulo) throws ELibroNoEncontrado{
           return buscarTitulo(titulo);
        }
	
	public void mostrarPrestamosSocio(int numSocio) {
		try {
			Socio socioBuscado=buscarSocio(numSocio);
			System.out.println(socioBuscado);
			socioBuscado.mostrarPrestamo();
		}catch (EBiblioteca e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
        
        public ArrayList librosTabla(){
            ArrayList<Libro> datosLibro = new ArrayList<Libro>();
                for(Libro libro : libros){
                    datosLibro.add(libro);
                }
            return datosLibro;
        }
        public ArrayList sociosTabla(){
            ArrayList<Socio> datosSocio = new ArrayList<Socio>();
            for(Socio socio : socios){
                datosSocio.add(socio);
            }
            return datosSocio;
        }
        
        private Socio buscarNombre(String nombre) throws ESocioNoEncontrado{
            for(Socio socio : socios){
                if(socio.getNombreSocio().equals(nombre)){
                    return socio;
                }
            }throw new ESocioNoEncontrado("No se tiene registro del socio");
        }
        
        public Socio nombreBuscado(String nombre)throws ESocioNoEncontrado{
            return buscarNombre(nombre);
        }
	
	public void mostrarLibros() {
		for(Libro libro : libros) {
			System.out.println(libro);
		}
		for(Socio socio : socios) {
			System.out.println(socio);
		}
	}
        
	public void guardarInformacion(String nombreArchivo) {
		try {
			String rutaArchivo = "C:\\Users\\angel\\Documents\\"+nombreArchivo+".txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));
			bw.write("SOCIOS: ");
			for(Socio socio : socios) {
				String cadena = socio.toString();
				bw.write(cadena);
			}
			bw.write("\n\nLIBROS:");
			for(Libro libro : libros)	{
				String cadena = libro.toString();
				bw.write(cadena);
			}
			bw.write("\n\nLIBROS PRESTADOS: ");
			for(LibroPrestado libroPrestado : librosPrestados) {
				String cadena = libroPrestado.toString();
				bw.write(cadena);
			}
			bw.close();
			System.out.println("La informaci�n se guardo correctamente");
		}catch (IOException e) {
			System.out.println("No se pudo guardar la informaci�n");
		}
	}
	
	private void aniadirLibrosArchivo(String nombreArchivo) throws FileNotFoundException, IOException{
		String rutaArchivo = "C:\\Users\\angel\\Documents\\"+nombreArchivo+".txt";
		File archivo = new File(rutaArchivo);
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while((linea = br.readLine())!=null){
				String[] datos = linea.split(",");
				if(datos.length!=5) {
					throw new IOException("El archivo contiene"+ datos.length);
				}
			    String titulo = datos[0];
			    String autor = datos[1];
			    String seccion = datos[2];
			    String nivel = datos[3];
			    boolean disponible = Boolean.parseBoolean(datos[4]);
			    libros.add(new Libro(titulo, autor, seccion, nivel));
			}
			br.close();
		}}
		
	private void aniadirSociosArchivo(String nombreArchivo) throws FileNotFoundException, IOException{
		String rutaArchivo = "C:\\Users\\angel\\Documents\\"+nombreArchivo+".txt";
		File archivo = new File(rutaArchivo);
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while((linea = br.readLine())!=null){
				String[] datos = linea.split(",");
				if(datos.length!=2) {
					throw new IOException("El archivo contiene datos incorrectos"+ rutaArchivo);
				}
				String nombre = datos[0];
			    String direccion = datos[1];
			    agregarSocio(nombre, direccion);
			}
			br.close();
		}
	}
	public void consultarLibro(int codigo){
		try {
			Libro libroBuscado = buscarLibro(codigo);
			System.out.println(libroBuscado);
		}catch(EBiblioteca e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
        

}