package sopra.projetF1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.projetF1.config.ApplicationConfig;
import sopra.projetF1.model.Civilite;
import sopra.projetF1.model.Compte;
import sopra.projetF1.model.Ecurie;
import sopra.projetF1.model.Inventaire;
import sopra.projetF1.model.Joueur;
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
		
		//Compte Admin
		Compte compteAdmin = new Compte();
		compteAdmin.setLogin("Admin");
		compteAdmin.setPassword("Admin");
		compteAdmin.setType(Type.ADMIN);
		
		//Comptes des joueurs
		Compte compteJoueur1= new Compte();
		compteJoueur1.setLogin("Joueur1");
		compteJoueur1.setPassword("Joueur1");
		compteJoueur1.setType(Type.JOUEUR);
		
		Compte compteJoueur2= new Compte();
		compteJoueur2.setLogin("Joueur2");
		compteJoueur2.setPassword("Joueur2");
		compteJoueur2.setType(Type.JOUEUR);
		
		Compte compteJoueur3= new Compte();
		compteJoueur3.setLogin("Joueur3");
		compteJoueur3.setPassword("Joueur3");
		compteJoueur3.setType(Type.JOUEUR);
		
		Compte compteJoueur4= new Compte();
		compteJoueur4.setLogin("Joueur4");
		compteJoueur4.setPassword("Joueur4");
		compteJoueur4.setType(Type.JOUEUR);
		
		//Joueurs
		Joueur joueur1=new Joueur();
		joueur1.setPseudo("Joueur1");
		joueur1.setAge(30);
		joueur1.setMail("joueur1@gmail.com");
		joueur1.setTelephone("0606060606");
		joueur1.setCiv(Civilite.M);

		Joueur joueur2=new Joueur();
		joueur2.setPseudo("Joueur2");
		joueur2.setAge(27);
		joueur2.setMail("joueur2@gmail.com");
		joueur2.setTelephone("0606060606");
		joueur2.setCiv(Civilite.MME);
		
		Joueur joueur3=new Joueur();
		joueur3.setPseudo("Joueur3");
		joueur3.setAge(25);
		joueur3.setMail("joueur3@gmail.com");
		joueur3.setTelephone("0606060606");
		joueur3.setCiv(Civilite.M);

		Joueur joueur4=new Joueur();
		joueur4.setPseudo("Joueur4");
		joueur4.setAge(28);
		joueur4.setMail("joueur4@gmail.com");
		joueur4.setTelephone("0606060606");
		joueur4.setCiv(Civilite.MME);
		
		
		
		spring.close();
	}
	
	

}
