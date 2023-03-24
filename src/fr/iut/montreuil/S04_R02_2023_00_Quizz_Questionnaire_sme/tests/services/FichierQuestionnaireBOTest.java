package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.tests.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.bo.QuestionFichierBO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.models.IServiceQuestionnaire;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.services.QuestionnaireServiceImpl;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.tests.mocks.ChargementFichierBOTestOkMock;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FichierQuestionnaireBOTest {
	 IServiceQuestionnaire qsi;

    @BeforeEach
    public void init(TestInfo testInfo) {
        System.out.println("Appel du test"+testInfo.getDisplayName());
        qsi = QuestionnaireServiceImpl.getInstance();
    }

    @Test
    public void fichierQuestionnaireChargementCorrectLecture2emeQuestionTest() {
    	//MOCK a débouchonner après insert du code
    	qsi = new ChargementFichierBOTestOkMock();
    			
    			
    	QuestionFichierBO reponseAttendu = new QuestionFichierBO(1, 2, "fr", "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?", "Badminton", 1, "Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.", "https://fr.wikipedia.org/wiki/Badminton");
    	
    	
    	List<QuestionFichierBO> lqfbo = qsi.chargementQuestionnaires("src/fr/iut/montreuil/S04_R02_2023_00_Quizz_Questionnaire_sme/tests/resources/test_questionsQuizz_V1.1_Complet.csv");
    	
    	QuestionFichierBO quest02Fic= lqfbo.get(1);
    	
    	assertEquals(reponseAttendu.getDifficultQuestion(), quest02Fic.getDifficultQuestion());
    	assertEquals(reponseAttendu.getExplicationQuestion(), quest02Fic.getExplicationQuestion());
    	assertEquals(reponseAttendu.getIdQuestion(), quest02Fic.getIdQuestion());
    	assertEquals(reponseAttendu.getIdQuestionnaire(), quest02Fic.getIdQuestionnaire());
    	assertEquals(reponseAttendu.getLangue(), quest02Fic.getLangue());
    	assertEquals(reponseAttendu.getLibQuestion(), quest02Fic.getLibQuestion());
    	assertEquals(reponseAttendu.getRefQuestion(), quest02Fic.getRefQuestion());
    	assertEquals(reponseAttendu.getReponseQuestion(), quest02Fic.getReponseQuestion());
    	
    	
    }

}