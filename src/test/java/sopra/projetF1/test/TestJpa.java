package sopra.projetF1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.projetF1.config.ApplicationConfig;
import sopra.projetF1.model.Civilite;
import sopra.projetF1.model.Compte;
import sopra.projetF1.model.Ecurie;
import sopra.projetF1.model.Inventaire;
import sopra.projetF1.model.Joueur;
import sopra.projetF1.model.Pilote;
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
	
		compteAdmin = compteRepo.save(compteAdmin);
		
		//Comptes des joueurs
		Compte compteJoueur1= new Compte();
		compteJoueur1.setLogin("Joueur1");
		compteJoueur1.setPassword("Joueur1");
		compteJoueur1.setType(Type.JOUEUR);
		
		compteJoueur1 = compteRepo.save(compteJoueur1);
		
		Compte compteJoueur2= new Compte();
		compteJoueur2.setLogin("Joueur2");
		compteJoueur2.setPassword("Joueur2");
		compteJoueur2.setType(Type.JOUEUR);
		
		compteJoueur2 = compteRepo.save(compteJoueur2);
		
		Compte compteJoueur3= new Compte();
		compteJoueur3.setLogin("Joueur3");
		compteJoueur3.setPassword("Joueur3");
		compteJoueur3.setType(Type.JOUEUR);
		
		compteJoueur3 = compteRepo.save(compteJoueur3);
		
		Compte compteJoueur4= new Compte();
		compteJoueur4.setLogin("Joueur4");
		compteJoueur4.setPassword("Joueur4");
		compteJoueur4.setType(Type.JOUEUR);
		
		compteAdmin = compteRepo.save(compteAdmin);
		
		//Pilotes 1 et 2 etat non possédés
		
		Pilote pilote1false =new Pilote();
		pilote1false.setNom("Pilote1");
		pilote1false.setPrenom("Pilote1");
		pilote1false.setAge(25);
		pilote1false.setNationalite("Française");
		pilote1false.setCiv(Civilite.M);
		pilote1false.setExperience(100);
		pilote1false.setEtat(false);
		pilote1false.setPrix(1);
		
		pilote1false = piloteRepo.save(pilote1false);
		
		Pilote pilote2false =new Pilote();
		pilote2false.setNom("Pilote2");
		pilote2false.setPrenom("Pilote2");
		pilote2false.setAge(25);
		pilote2false.setNationalite("Française");
		pilote2false.setCiv(Civilite.MME);
		pilote2false.setExperience(200);
		pilote2false.setEtat(false);
		pilote2false.setPrix(2);
		
		pilote2false = piloteRepo.save(pilote2false);
		
		//Pilotes 1 et 2 etat possédés
		
		Pilote pilote1true =new Pilote();
		pilote1true.setNom("Pilote1");
		pilote1true.setPrenom("Pilote1");
		pilote1true.setAge(25);
		pilote1true.setNationalite("Française");
		pilote1true.setCiv(Civilite.M);
		pilote1true.setExperience(100);
		pilote1true.setEtat(true);
		pilote1true.setPrix(1);
		
		pilote1true = piloteRepo.save(pilote1true);
		
		Pilote pilote2true =new Pilote();
		pilote2true.setNom("Pilote2");
		pilote2true.setPrenom("Pilote2");
		pilote2true.setAge(25);
		pilote2true.setNationalite("Française");
		pilote2true.setCiv(Civilite.MME);
		pilote2true.setExperience(200);
		pilote2true.setEtat(false);
		pilote2true.setPrix(2);
		
		pilote2true = piloteRepo.save(pilote2true);
		
		//Ecuries
		
		Ecurie ecurieJoueur1 = new Ecurie();
		ecurieJoueur1.setNom("Ecurie1");
		ecurieJoueur1.setArgent(50000);
		ecurieJoueur1.setExperience(500);
		
		ecurieJoueur1 = ecurieRepo.save(ecurieJoueur1);
		
		Ecurie ecurieJoueur2 = new Ecurie();
		ecurieJoueur2.setNom("Ecurie2");
		ecurieJoueur2.setArgent(40000);
		ecurieJoueur2.setExperience(400);
		
		ecurieJoueur2 = ecurieRepo.save(ecurieJoueur2);
		
		Ecurie ecurieJoueur3 = new Ecurie();
		ecurieJoueur3.setNom("Ecurie3");
		ecurieJoueur3.setArgent(30000);
		ecurieJoueur3.setExperience(300);
		
		ecurieJoueur3 = ecurieRepo.save(ecurieJoueur3);
		
		Ecurie ecurieJoueur4 = new Ecurie();
		ecurieJoueur4.setNom("Ecurie4");
		ecurieJoueur4.setArgent(20000);
		ecurieJoueur4.setExperience(200);
		
		ecurieJoueur4 = ecurieRepo.save(ecurieJoueur4);
		
		//Joueurs
		Joueur joueur1=new Joueur();
		joueur1.setPseudo("Joueur1");
		joueur1.setAge(30);
		joueur1.setMail("joueur1@gmail.com");
		joueur1.setTelephone("0606060606");
		joueur1.setCiv(Civilite.M);
		joueur1.setEcurie(ecurieJoueur1);
		
		joueur1 = joueurRepo.save(joueur1);

		Joueur joueur2=new Joueur();
		joueur2.setPseudo("Joueur2");
		joueur2.setAge(27);
		joueur2.setMail("joueur2@gmail.com");
		joueur2.setTelephone("0606060606");
		joueur2.setCiv(Civilite.MME);
		joueur1.setEcurie(ecurieJoueur2);
		
		joueur2 = joueurRepo.save(joueur2);
		
		Joueur joueur3=new Joueur();
		joueur3.setPseudo("Joueur3");
		joueur3.setAge(25);
		joueur3.setMail("joueur3@gmail.com");
		joueur3.setTelephone("0606060606");
		joueur3.setCiv(Civilite.M);
		joueur1.setEcurie(ecurieJoueur3);
		
		joueur3 = joueurRepo.save(joueur3);

		Joueur joueur4=new Joueur();
		joueur4.setPseudo("Joueur4");
		joueur4.setAge(28);
		joueur4.setMail("joueur4@gmail.com");
		joueur4.setTelephone("0606060606");
		joueur4.setCiv(Civilite.MME);
		joueur1.setEcurie(ecurieJoueur4);
		
		joueur4 = joueurRepo.save(joueur4);
		
		
		spring.close();
	}
	
	

}
