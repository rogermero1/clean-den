package ec.fin.online15.backend.webbanking.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.envers.Audited;

import ec.fin.online15.backend.librerias.entidades.EntidadBasica;
import ec.fin.online15.backend.seguridad.modelo.entidades.TwebUsuario;

@Entity
@Table(name = "TWEB_RESPUESTA_USUARIOS")
@XmlRootElement
public class TwebRespuestasUsuarios extends EntidadBasica<Long> implements
		Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private TwebUsuario usuario;
	private TwebBancoPregunta twebBancoPregunta;
	private String descripcion;

	public TwebRespuestasUsuarios() {
	}

	public TwebRespuestasUsuarios(TwebUsuario usuario,
			TwebBancoPregunta twebBancoPregunta, String descripcion) {
		super();
		this.usuario = usuario;
		this.twebBancoPregunta = twebBancoPregunta;
		this.descripcion = descripcion;
	}

	public TwebRespuestasUsuarios(Long id, TwebUsuario usuario,
			TwebBancoPregunta twebBancoPregunta, String descripcion) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.twebBancoPregunta = twebBancoPregunta;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "RESPUESTAS_ID_RESPUESTA_USUARIO", sequenceName = "SWEB_ID_REPUESTAS_USUARIOS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESPUESTAS_ID_RESPUESTA_USUARIO")
	@Column(name = "ID_RESPUESTA_USUARIO", nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// @XmlTransient
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	public TwebUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(TwebUsuario usuario) {
		this.usuario = usuario;
	}

	// @XmlTransient
	@ManyToOne
	@JoinColumn(name = "ID_BANCO_PREGUNTA")
	public TwebBancoPregunta getBancoPregunta() {
		return twebBancoPregunta;
	}

	public void setBancoPregunta(TwebBancoPregunta twebBancoPregunta) {
		this.twebBancoPregunta = twebBancoPregunta;
	}

	@Column(name = "DESCRIPCION", length = 100)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
