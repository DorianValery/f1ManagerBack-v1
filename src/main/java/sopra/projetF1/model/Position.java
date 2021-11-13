package sopra.projetF1.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
}
