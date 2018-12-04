import java.time.LocalDateTime;

public class Media {
	
private String title;
private String creator;
private String CreationYear;
private boolean availability;
private int nbAccess;

public Media() {
}

public Media(String title, String creator, String creationYear, boolean availability) {
	this.title = title;
	this.creator = creator;
	CreationYear = creationYear;
	this.availability = availability;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getCreator() {
	return creator;
}

public void setCreator(String creator) {
	this.creator = creator;
}

public String getCreationYear() {
	return CreationYear;
}

public void setCreationYear(String creationYear) {
	CreationYear = creationYear;
}

public boolean isAvailability(LocalDateTime DateEmprunt) {
	// pomper la date
	availability=FicheEmprunt.Emprunter(DateEmprunt);
	return availability;
}

public void setAvailability(boolean availability) {
	this.availability = availability;
}

public int getNbAccess() {
	return nbAccess;
}

public void setNbAccess(int nbAccess) {
	this.nbAccess = nbAccess;
}

public boolean reserve(Media m)
{
	boolean result=false;
	if (m.availability==true) 
	{
		// pomper la date 
		FicheEmprunt.Emprunt();
		m.setAvailability(false);
		result=true;
	}
		
	return result;
}
}