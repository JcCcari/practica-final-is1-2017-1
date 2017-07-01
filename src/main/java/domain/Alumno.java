package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nombres;
	
	private String apellidoPaterno;

	private String apellidoMaterno;

    private String dni;

    Alumno(){}
    Alumno(String name, String apellidoP, String apellidoM, String dni){
        this.nombres = name;
        this.apellidoPaterno = apellidoP;
        this.apellidoMaterno = apellidoM;
        this.dni = dni;
    }

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
