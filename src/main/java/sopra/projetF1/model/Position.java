package sopra.projetF1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Position {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="pilote_id")
	private Pilote pilote;
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	private byte position;
	
	public Position(Long id, Pilote pilote, Course course, byte position) {
		super();
		this.id = id;
		this.pilote = pilote;
		this.course = course;
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public byte getPosition() {
		return position;
	}

	public void setPosition(byte position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", pilote=" + pilote + ", course=" + course + ", position=" + position + "]";
	}
	
	
	
}

