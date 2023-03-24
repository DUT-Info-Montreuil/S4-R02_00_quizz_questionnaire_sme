package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
    private ArrayList<QuestionDTO> questions;
    private int idQuestionnaire;
    
	public QuestionnaireDTO(ArrayList<QuestionDTO> questions, int idQuestionnaire) {
		super();
		this.questions = questions;
		this.idQuestionnaire = idQuestionnaire;
	}
	
    
	public QuestionnaireDTO() {
		super();
	}


	public ArrayList<QuestionDTO> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<QuestionDTO> questions) {
		this.questions = questions;
	}

	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}

	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}

	@Override
	public String toString() {
		return "QuestionnaireDTO [questions=" + questions + ", idQuestionnaire=" + idQuestionnaire + "]";
	}

}
