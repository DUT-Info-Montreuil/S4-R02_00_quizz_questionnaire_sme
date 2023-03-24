package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.bo;



public class QuestionFichierBO {

    private int idQuestionnaire;
    private int idQuestion;
    private String langue;
    private String libQuestion;
    private String reponseQuestion;
    private int difficultQuestion;
    private String explicationQuestion;
    private String refQuestion;
	
    public QuestionFichierBO(int idQuestionnaire, int idQuestion, String langue, String libQuestion,
			String reponseQuestion, int difficultQuestion, String explicationQuestion, String refQuestion) {
		super();
		this.idQuestionnaire = idQuestionnaire;
		this.idQuestion = idQuestion;
		this.langue = langue;
		this.libQuestion = libQuestion;
		this.reponseQuestion = reponseQuestion;
		this.difficultQuestion = difficultQuestion;
		this.explicationQuestion = explicationQuestion;
		this.refQuestion = refQuestion;
	}
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getLibQuestion() {
		return libQuestion;
	}
	public void setLibQuestion(String libQuestion) {
		this.libQuestion = libQuestion;
	}
	public String getReponseQuestion() {
		return reponseQuestion;
	}
	public void setReponseQuestion(String reponseQuestion) {
		this.reponseQuestion = reponseQuestion;
	}
	public int getDifficultQuestion() {
		return difficultQuestion;
	}
	public void setDifficultQuestion(int difficultQuestion) {
		this.difficultQuestion = difficultQuestion;
	}
	public String getExplicationQuestion() {
		return explicationQuestion;
	}
	public void setExplicationQuestion(String explicationQuestion) {
		this.explicationQuestion = explicationQuestion;
	}
	public String getRefQuestion() {
		return refQuestion;
	}
	public void setRefQuestion(String refQuestion) {
		this.refQuestion = refQuestion;
	}
	@Override
	public String toString() {
		return "QuestionFichierBO [idQuestionnaire=" + idQuestionnaire + ", idQuestion=" + idQuestion + ", langue="
				+ langue + ", libQuestion=" + libQuestion + ", reponseQuestion=" + reponseQuestion
				+ ", difficultQuestion=" + difficultQuestion + ", explicationQuestion=" + explicationQuestion
				+ ", refQuestion=" + refQuestion + "]";
	}

    
  
}
