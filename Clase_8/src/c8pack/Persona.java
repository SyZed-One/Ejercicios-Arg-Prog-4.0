package c8pack;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*************************************************************/
public class Persona {
	
		String Nombre;
		String Apellido;
		String DNI;
		LocalDate fechaNacim;
		
		public Persona() { //constructor que no pide parámetros
			this.Nombre= "";
			this.Apellido= "";
			this.DNI= "";
			this.fechaNacim = LocalDate.now();
		}

		public Persona(String nombre, String apellido, String DNI, String fechaNacim) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.Nombre= nombre;
			this.Apellido= apellido;
			this.DNI= DNI;
			this.fechaNacim = LocalDate.parse(fechaNacim, fmt);
		}
		
		//Getters
		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public String getApellido() {
			return Apellido;
		}

		public void setApellido(String apellido) {
			Apellido = apellido;
		}

		public String getDNI() {
			return DNI;
		}

		//Setters
		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public LocalDate getFechaNacim() {
			return fechaNacim;
		}

		public void setFechaNacim(LocalDate fechaNacim) {
			this.fechaNacim = fechaNacim;
		}

		public void setFechaNacim(String fechaNacim) { 
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.fechaNacim = LocalDate.parse(fechaNacim, fmt);
		}
		
		//Otros Métodos
		public int edad() {
			LocalDate ahora = LocalDate.now();
			int cantAnios;
			Period periodo = Period.between(this.fechaNacim, ahora);
			cantAnios = periodo.getYears(); 
			return cantAnios;
		}
	}

