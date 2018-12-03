package backend;

public class Livre {
  private Integer nbPage;
	private Integer Emprunts_total;
	private String classification;
	
	
	
	
	public Livre(Integer emprunts_total) {
		super();
		Emprunts_total = emprunts_total;
	}
	public Livre(Integer nbPage, Integer emprunts_total, String classification) {
		super();
		this.nbPage = nbPage;
		Emprunts_total = emprunts_total;
		this.classification = classification;
	}
	public Integer getNbPage() {
		return nbPage;
	}
	public void setNbPage(Integer nbPage) {
		this.nbPage = nbPage;
	}
	public Integer getEmprunts_total() {
		return Emprunts_total;
	}
	public void setEmprunts_total(Integer emprunts_total) {
		Emprunts_total = emprunts_total;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}

}
