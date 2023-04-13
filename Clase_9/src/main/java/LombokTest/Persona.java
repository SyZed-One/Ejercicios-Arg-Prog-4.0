package LombokTest;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @NoArgsConstructor
public class Persona {
	private @Getter @Setter String Nombres;
	private @Getter @Setter String Apellido;
	private @Getter @Setter String FechaNacim;
	}
	