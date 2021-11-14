package sopra.projetF1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projetF1.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Long>{
//findAllCourse
//findCourseById
//findCourseByNom
//findCourseByJoueur
}
