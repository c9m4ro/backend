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
	// la m�thode va chercher la date du moment lors de l'appel de la m�thode et impl�menter 10 jours de plus pour la limite de rendu.

	
	public LocalDateTime Emprunt () {
		LocalDateTime DateEmprunt=LocalDateTime.now();
		LocalDateTime DateLimite= DateEmprunt.plusDays(10);
		return DateLimite;
	}
	
	// la m�thode renvoie vrai si la date limit� d'emprunt est d�pass�, faux si elle ne l'est pas. 
	// La m�thode compare la date limite de rendu et de la date du moment de l'appel. Elle renvoie vrai si la date de l'appel est supp�rieur � la date limite.
	public boolean EstDepasse(LocalDateTime DateLimite) {
		LocalDateTime comparaison=LocalDateTime.now();
		Depasse = false;
		Depasse= comparaison.isAfter(DateLimite);
		return Depasse;
	}
		
	// Il faudrait v�rifier le retour du document avant de v�rifier la date ( fonction retour ou date retour)
	
	// la m�thode renvoie vrai si le m�dia est empruntable, faux si il ne l'est pas.
	// la m�thode va v�rifier si une date d'emprunt existe. Si elle existe, le m�dia est consid�r� comme d�j� emprunt�.
	
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
	
