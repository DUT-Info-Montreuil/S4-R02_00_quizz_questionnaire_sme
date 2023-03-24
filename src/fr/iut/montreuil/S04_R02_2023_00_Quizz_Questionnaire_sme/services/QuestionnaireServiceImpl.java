package fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.services;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.bo.QuestionFichierBO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.models.IServiceQuestionnaire;
import fr.iut.montreuil.S04_R02_2023_00_Quizz_Questionnaire_sme.utils.constants.ParamConstants;

public final class QuestionnaireServiceImpl implements IServiceQuestionnaire {
	
	private static QuestionnaireServiceImpl instance = null;

	public static QuestionnaireServiceImpl getInstance() {
		if(instance==null)
			instance = new QuestionnaireServiceImpl();
		return instance;
	}
	
	private QuestionnaireServiceImpl() {

	}
	
	@Override
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires() {
		// TODO Auto-generated method stub
	
    	 return null;
	}

	@Override
	public List<QuestionFichierBO> chargementQuestionnaires(String filename) {
		List<QuestionFichierBO> questionnaireBO = new ArrayList<QuestionFichierBO>();

	      try{
	    	  
	    	 QuestionFichierBO nvelleQuestion;
	    	 
	    	 CSVParser csvParser = new CSVParserBuilder()
	    	            .withSeparator(ParamConstants.SEPARATEUR_FIC)
	    	            .withIgnoreQuotations(true)
	    	            .build();
	    	  
	       	 CSVReader csvReader = new CSVReaderBuilder(new FileReader(filename))
	       	        .withSkipLines(0)
	       	        .withCSVParser(csvParser)
	       	        .build();
	       	 
	    	  
	          String[] parseLigne ;
	          while ((parseLigne = csvReader.readNext()) != null) {
	              if (parseLigne != null) {
	        	  
	        	  for(int i=0; i<parseLigne.length;i++)
	        		  System.out.println("argument "+i+"  :#"+ parseLigne[i]+"#");
	        	  
	        	  nvelleQuestion = new QuestionFichierBO(
	        			  Integer.parseInt(parseLigne[0])
	        			  , Integer.parseInt(parseLigne[1])
	        			  , parseLigne[2]
	        			  , parseLigne[3]
	        			  , parseLigne[4]
	        			  , Integer.parseInt(parseLigne[5])
	        			  , parseLigne[6]
	        			  ,parseLigne[7]);
	        	  questionnaireBO.add(nvelleQuestion);
	          }

	      }
	      }

	      catch (FileNotFoundException e) {
	          e.printStackTrace();
	      }
	      catch (IOException e) {
	          e.printStackTrace();
	      } catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      return questionnaireBO;
		
		
	}
}
