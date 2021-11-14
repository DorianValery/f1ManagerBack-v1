package sopra.projetF1.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.projetF1.config.ApplicationConfig;
import sopra.projetF1.model.Civilite;
import sopra.projetF1.model.Compte;
import sopra.projetF1.model.Course;
import sopra.projetF1.model.Ecurie;
import sopra.projetF1.model.Infrastructure;
import sopra.projetF1.model.Inventaire;
import sopra.projetF1.model.Joueur;
import sopra.projetF1.model.Pilote;
import sopra.projetF1.model.Type;
import sopra.projetF1.model.Voiture;
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
		pilote1false.setPrix(1000);
		
		pilote1false = piloteRepo.save(pilote1false);
		
		Pilote pilote2false =new Pilote();
		pilote2false.setNom("Pilote2");
		pilote2false.setPrenom("Pilote2");
		pilote2false.setAge(25);
		pilote2false.setNationalite("Anglaise");
		pilote2false.setCiv(Civilite.MME);
		pilote2false.setExperience(200);
		pilote2false.setEtat(false);
		pilote2false.setPrix(2000);
		
		pilote2false = piloteRepo.save(pilote2false);
		
		//Pilotes 1 et 2 etat possédés
		
		Pilote pilote3true =new Pilote();
		pilote3true.setNom("Pilote3");
		pilote3true.setPrenom("Pilote3");
		pilote3true.setAge(25);
		pilote3true.setNationalite("Espagnole");
		pilote3true.setCiv(Civilite.M);
		pilote3true.setExperience(100);
		pilote3true.setEtat(true);
		pilote3true.setPrix(3000);
		
		pilote3true = piloteRepo.save(pilote3true);
		
		Pilote pilote4true =new Pilote();
		pilote4true.setNom("Pilote4");
		pilote4true.setPrenom("Pilote4");
		pilote4true.setAge(25);
		pilote4true.setNationalite("Suedoise");
		pilote4true.setCiv(Civilite.MME);
		pilote4true.setExperience(200);
		pilote4true.setEtat(false);
		pilote4true.setPrix(4000);
		
		pilote4true = piloteRepo.save(pilote4true);
		
		List <Pilote> listPilote = new ArrayList();
		listPilote.add(pilote1false);
		listPilote.add(pilote3true);
		listPilote.add(pilote2false);
		listPilote.add(pilote4true);
		
		//Voitures
		
		Voiture voiture1 = new Voiture();
		voiture1.setMarque("BMW");
		voiture1.setManiabilite(8);
		voiture1.setPoids(1500);
		voiture1.setVitesse(50);
		voiture1.setPrix(500000);
		voiture1.setEtat(false);

		voiture1 = voitureRepo.save(voiture1);

		Voiture voiture2 = new Voiture();
		voiture2.setMarque("MERCEDES");
		voiture2.setManiabilite(8);
		voiture2.setPoids(1500);
		voiture2.setVitesse(50);
		voiture2.setPrix(500000);
		voiture2.setEtat(false);
		
		voiture2 = voitureRepo.save(voiture2);
			
		
		Voiture voiture3 = new Voiture();
		voiture3.setMarque("FERRARI");
		voiture3.setManiabilite(8);
		voiture3.setPoids(1500);
		voiture3.setVitesse(50);
		voiture3.setPrix(500000);
		voiture3.setEtat(true);
		
		voiture3 = voitureRepo.save(voiture3);
		
		Voiture voiture4= new Voiture();
		voiture4.setMarque("RENAULT");
		voiture4.setManiabilite(8);
		voiture4.setPoids(1500);
		voiture4.setVitesse(50);
		voiture4.setPrix(500000);
		voiture4.setEtat(true);
	
		voiture4 = voitureRepo.save(voiture4);
		
		//Infrastructures
		
		Infrastructure infrastructure1 = new Infrastructure();
		infrastructure1.setExperience(0);
		infrastructure1.setNom("infrastructure1");
		infrastructure1.setNbingenieurs(5);
		infrastructure1.setPitStop(15);
		infrastructure1.setPrix(50000);
		infrastructure1.setPrix(15);
		infrastructure1.setEtat(true);
		infrastructure1.setType("mecano");
		
		infrastructure1 = infrastructureRepo.save(infrastructure1);
		

		Infrastructure infrastructure2 = new Infrastructure();
		infrastructure2.setExperience(0);
		infrastructure2.setNom("infrastructure2");
		infrastructure2.setNbingenieurs(5);
		infrastructure2.setPitStop(15);
		infrastructure2.setPrix(50000);
		infrastructure2.setPrix(15);
		infrastructure2.setEtat(true);
		infrastructure2.setType("mecano");
		
		infrastructure2 = infrastructureRepo.save(infrastructure2);
		

		Infrastructure infrastructure3 = new Infrastructure();
		infrastructure3.setExperience(0);
		infrastructure3.setNom("infrastructure3");
		infrastructure3.setNbingenieurs(5);
		infrastructure3.setPitStop(15);
		infrastructure3.setPrix(50000);
		infrastructure3.setPrix(15);
		infrastructure3.setEtat(false);
		infrastructure3.setType("mecano");
		
		infrastructure3 = infrastructureRepo.save(infrastructure3);
		

		Infrastructure infrastructure4 = new Infrastructure();
		infrastructure4.setExperience(0);
		infrastructure4.setNom("infrastructure4");
		infrastructure4.setNbingenieurs(5);
		infrastructure4.setPitStop(15);
		infrastructure4.setPrix(50000);
		infrastructure4.setPrix(15);
		infrastructure4.setEtat(false);
		infrastructure4.setType("mecano");
		
		infrastructure4 = infrastructureRepo.save(infrastructure4);
		
		
		
		
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
		
		//Inventaires
		
		Inventaire inventaire1 = new Inventaire(0);
		Inventaire inventaire2 = new Inventaire(0);
		Inventaire inventaire3 = new Inventaire(0);
		Inventaire inventaire4 = new Inventaire(0);
		
		inventaire1.setPilotes(listPilote);
		
		
		
		inventaire1 = inventaireRepo.save(inventaire1);
		inventaire2 = inventaireRepo.save(inventaire2);
		inventaire3 = inventaireRepo.save(inventaire3);
		inventaire4 = inventaireRepo.save(inventaire4);
	
		//Course
		
		Course course1 = new Course();
		course1.setNom("course1");
		course1.setNombreTour(35);
		course1.setPopularite(45);
		course1.setTempsRef(null);
		course1.setCashPrize(150000);	
		
		course1 = courseRepo.save(course1);

		Course course2 = new Course();
		course2.setNom("course2");
		course2.setNombreTour(45);
		course2.setPopularite(45);
		course2.setTempsRef(null);
		course2.setCashPrize(180000);
		
		course2 = courseRepo.save(course2);
		
		Course course3 = new Course();
		course3.setNom("course3");
		course3.setNombreTour(50);
		course3.setPopularite(45);
		course3.setTempsRef(null);
		course3.setCashPrize(100000);
		
		course3 = courseRepo.save(course3);

		Course course4 = new Course();
		course4.setNom("course4");
		course4.setNombreTour(65);
		course4.setPopularite(25);
		course4.setTempsRef(null);
		course4.setCashPrize(250000);
		
		course4 = courseRepo.save(course4);
		
		//Joueurs
		Joueur joueur1=new Joueur();
		joueur1.setPseudo("Joueur1");
		joueur1.setAge(30);
		joueur1.setMail("joueur1@gmail.com");
		joueur1.setTelephone("0606060606");
		joueur1.setCiv(Civilite.M);
		joueur1.setEcurie(ecurieJoueur1);
		joueur1.setInventaire(inventaire1);
		
		joueur1 = joueurRepo.save(joueur1);
		compteJoueur1.setJoueur(joueur1);
		compteJoueur1 = compteRepo.save(compteJoueur1);

		Joueur joueur2=new Joueur();
		joueur2.setPseudo("Joueur2");
		joueur2.setAge(27);
		joueur2.setMail("joueur2@gmail.com");
		joueur2.setTelephone("0606060606");
		joueur2.setCiv(Civilite.MME);
		joueur2.setEcurie(ecurieJoueur2);
		joueur2.setInventaire(inventaire2);
		
		joueur2 = joueurRepo.save(joueur2);
		compteJoueur2.setJoueur(joueur2);
		compteJoueur2 = compteRepo.save(compteJoueur2);
		
		Joueur joueur3=new Joueur();
		joueur3.setPseudo("Joueur3");
		joueur3.setAge(25);
		joueur3.setMail("joueur3@gmail.com");
		joueur3.setTelephone("0606060606");
		joueur3.setCiv(Civilite.M);
		joueur3.setEcurie(ecurieJoueur3);
		joueur3.setInventaire(inventaire3);
		
		joueur3 = joueurRepo.save(joueur3);
		compteJoueur3.setJoueur(joueur3);
		compteJoueur3 = compteRepo.save(compteJoueur3);

		Joueur joueur4=new Joueur();
		joueur4.setPseudo("Joueur4");
		joueur4.setAge(28);
		joueur4.setMail("joueur4@gmail.com");
		joueur4.setTelephone("0606060606");
		joueur4.setCiv(Civilite.MME);
		joueur4.setEcurie(ecurieJoueur4);
		joueur4.setInventaire(inventaire4);
		
		joueur4 = joueurRepo.save(joueur4);
		compteJoueur4.setJoueur(joueur4);
		compteJoueur4 = compteRepo.save(compteJoueur4);
		
		pilote1false.setEcurie(ecurieJoueur1);
		pilote2false.setEcurie(ecurieJoueur2);
		pilote3true.setEcurie(ecurieJoueur3);
		pilote4true.setEcurie(ecurieJoueur4);
		
		pilote1false.setInventaire(inventaire1);
		pilote2false.setInventaire(inventaire1);
		pilote3true.setInventaire(inventaire1);
		pilote4true.setInventaire(inventaire1);
		
		pilote1false = piloteRepo.save(pilote1false);
		pilote2false = piloteRepo.save(pilote2false);
		pilote3true = piloteRepo.save(pilote3true);
		pilote4true = piloteRepo.save(pilote4true);
		

		spring.close();
	}
	
	

}
