package controllers;

import dto.LanguageDto;
import services.LanguageService;

import java.sql.ResultSet;
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
        try {
            service.updateLanguage(languageDto);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteLanguage(LanguageDto languageDto){
        //verifier DTO
        try {
            service.deleteLanguage(languageDto);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public LanguageDto readLanguage(String languageAcronyme){
        //verifier DTO
        try {
            return service.readLanguage(languageAcronyme);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
