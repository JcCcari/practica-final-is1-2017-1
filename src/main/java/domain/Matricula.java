package domain;

import javax.persistence.*;

@Entity
public class Matricula implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="curso_id", updatable=false)
	private Curso curso;

    @ManyToOne(optional=false)
    @JoinColumn(name="alumno_id", updatable=false)
	private Alumno alumno;

	private Double nota;

	private String semestre;

	Matricula(){}
    public Matricula(Alumno alumno, Curso curso, String semestre){
	    this.curso = curso;
	    this.alumno = alumno;
	    this.semestre = semestre;
    }

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
