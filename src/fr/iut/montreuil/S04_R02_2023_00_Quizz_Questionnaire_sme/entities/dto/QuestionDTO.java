package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto;


public class QuestionDTO {

    private int id;
    private String langue;
    private String lib;
    private String reponse;
    private int difficult;
    private String explication;
    private String ref;
    
    
    public QuestionDTO(int id, String langue, String lib, String reponse, int difficult,
			String explication, String ref) {
		super();
		this.id = id;
		this.langue = langue;
		this.lib = lib;
		this.reponse = reponse;
		this.difficult = difficult;
		this.explication = explication;
		this.ref = ref;
	}
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public int getDifficult() {
		return difficult;
	}
	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}
	public String getExplication() {
		return explication;
	}
	public void setExplication(String explication) {
		this.explication = explication;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "QuestionDTO [id=" + id + ", langue=" + langue + ", lib=" + lib
				+ ", reponse=" + reponse + ", difficult=" + difficult + ", explication=" + explication + ", ref=" + ref
				+ "]";
	}
	

}