package services;

import dao.entities.Languages;
import dao.repositories.LanguageRepository;
import dto.LanguageDto;

import java.sql.SQLException;

public class LanguageService {
    private LanguageRepository languageRepository = new LanguageRepository();
    public void createLanguage(LanguageDto languageDto) throws SQLException {
        Languages language =new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.create(language);
    }
}
