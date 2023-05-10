package controllers;

import dto.LanguageDto;
import services.LanguageService;

import java.sql.SQLException;

public class LanguageController {
    private LanguageService service = new LanguageService();

    public void createLanguage(LanguageDto languageDto){
        //verifier DTO
        try {
            service.createLanguage(languageDto);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void updateLanguage(LanguageDto languageDto){
        //verifier DTO
        service.updateLanguage(languageDto);
    }

    public void deleteLanguage(LanguageDto languageDto){
        try {
            service.deleteLanguage(languageDto);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
