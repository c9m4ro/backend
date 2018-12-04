package backend;
import java.time.*;

public class FicheEmprunt {

	private LocalDateTime DateEmprunt; 
	private LocalDateTime DateLimite;
	private Boolean Depasse;
	private Boolean Empruntable;
	

	public FicheEmprunt() {
		
	}
	
	public LocalDateTime getDateEmprunt() {
		return DateEmprunt;
	}
	public void setDateEmprunt(LocalDateTime dateEmprunt) {
		DateEmprunt = dateEmprunt;
	}
	public LocalDateTime getDateLimite() {
		return DateLimite;
	}
	public void setDateLimite(LocalDateTime dateLimite) {
		DateLimite = dateLimite;
	}
	public Boolean getDepasse() {
		return Depasse;
	}
	public void setDepasse(Boolean depasse) {
		Depasse = depasse;
	}
	
	
	
	// Methode emprunt 
	// limite de la date d'emprunt : 10 jours.
	// la méthode va chercher la date du moment lors de l'appel de la méthode et implémenter 10 jours de plus pour la limite de rendu.

	
	public LocalDateTime Emprunt () {
		LocalDateTime DateEmprunt=LocalDateTime.now();
		LocalDateTime DateLimite= DateEmprunt.plusDays(10);
		return DateLimite;
	}
	
	// la méthode renvoie vrai si la date limité d'emprunt est dépassé, faux si elle ne l'est pas. 
	// La méthode compare la date limite de rendu et de la date du moment de l'appel. Elle renvoie vrai si la date de l'appel est suppérieur à la date limite.
	public boolean EstDepasse(LocalDateTime DateLimite) {
		LocalDateTime comparaison=LocalDateTime.now();
		Depasse = false;
		Depasse= comparaison.isAfter(DateLimite);
		return Depasse;
	}
		
	// Il faudrait vérifier le retour du document avant de vérifier la date ( fonction retour ou date retour)
	
	// la méthode renvoie vrai si le média est empruntable, faux si il ne l'est pas.
	// la méthode va vérifier si une date d'emprunt existe. Si elle existe, le média est considéré comme déjà emprunté.
	
	public boolean Emprunter(LocalDateTime DateEmprunt) {
		Empruntable=true;
		LocalDateTime DateDuJour=LocalDateTime.now();
		if (DateEmprunt!=null) {
			Empruntable =false;
		}else if (DateEmprunt.isEqual(DateDuJour)==true);
		{
			Empruntable=false;
		}
		return Empruntable;
		}
	
	public LocalDateTime Rendu () {
		LocalDateTime DateEmprunt=null;
		return DateEmprunt;
	}
		 
}
	
