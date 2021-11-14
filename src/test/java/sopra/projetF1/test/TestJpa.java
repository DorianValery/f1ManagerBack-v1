package sopra.projetF1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.projetF1.config.ApplicationConfig;
import sopra.projetF1.model.Compte;
import sopra.projetF1.model.Type;
import sopra.projetF1.repository.ICompteRepository;
import sopra.projetF1.repository.ICourseRepository;
import sopra.projetF1.repository.IEcurieRepository;
import sopra.projetF1.repository.IInfrastructureRepository;
import sopra.projetF1.repository.IInventaireRepository;
import sopra.projetF1.repository.IJoueurRepository;
import sopra.projetF1.repository.IPiloteRepository;
import sopra.projetF1.repository.IPositionRepository;
import sopra.projetF1.repository.IVoitueRepository;

public class TestJpa {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		spring.close();
	
		ICompteRepository compteRepo = spring.getBean(ICompteRepository.class);
		ICourseRepository courseRepo = spring.getBean(ICourseRepository.class);
		IEcurieRepository ecurieRepo = spring.getBean(IEcurieRepository.class);
		IInfrastructureRepository infrastructureRepo = spring.getBean(IInfrastructureRepository.class);
		IInventaireRepository inventaireRepo = spring.getBean(IInventaireRepository.class);
		IJoueurRepository joueurRepo = spring.getBean(IJoueurRepository.class);
		IPiloteRepository piloteRepo = spring.getBean(IPiloteRepository.class);
		IPositionRepository positionRepo = spring.getBean(IPositionRepository.class);
		IVoitueRepository voitureRepo = spring.getBean(IVoitueRepository.class);
		
		Compte compteJane = new Compte();
		compteJane.setLogin("JaneAdmin");
		compteJane.setPassword("JaneAdmin");
		compteJane.setType(Type.ADMIN);
		
		Compte compteJohn = new Compte();
		compteJohn.setLogin("Joueur1");
		compteJohn.setPassword("Joueur1");
		compteJohn.setType(Type.JOUEUR);
		
		
		
	}
	
	

}
