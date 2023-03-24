package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.models;


import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.bo.QuestionFichierBO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto.QuestionnaireDTO;

public interface IServiceQuestionnaire {
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires();
    public List<QuestionFichierBO> chargementQuestionnaires(String filename);
}
