package domain;

import javax.persistence.*;
import java.util.List;
import java.util.Vector;

@Entity
public class Curso implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String codigo;

	private String nombre;

	private Integer creditos;

    @ManyToMany
    @JoinTable(name="prerequisitos",
            joinColumns=@JoinColumn(name="curso_id1", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="curso_id2", referencedColumnName="id")
    )
    //@ManyToMany(mappedBy="prerequisitos")
	private List<Curso> prerequisitos;

    Curso(){
        this.prerequisitos = new Vector<Curso>();
    }

    Curso(String cod, String name, Integer cred){
        this.codigo = cod;
        this.nombre = name;
        this.creditos = cred;
        this.prerequisitos = new Vector<Curso>();
    }

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
    /*
	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}
    */
}
