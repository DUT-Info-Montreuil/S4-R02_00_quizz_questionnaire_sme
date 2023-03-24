package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.tests.mocks;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.bo.QuestionFichierBO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.models.IServiceQuestionnaire;

public class ChargementFichierBOTestOkMock implements IServiceQuestionnaire {

	@Override
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionFichierBO> chargementQuestionnaires(String filename) {
		// TODO Auto-generated method stub
		List<QuestionFichierBO> res = new ArrayList<QuestionFichierBO>();
		res.add(new QuestionFichierBO(1, 1, "non utilisé", "non utilisé", "non utilisé", 0, "non utilisé", "non utilisé"));
		res.add(new QuestionFichierBO(1, 2, "fr", "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?", "Badminton", 1, "Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.", "https://fr.wikipedia.org/wiki/Badminton"));
		return res;
	}

	
	
	
}
