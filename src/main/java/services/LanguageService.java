package services;

import dao.entities.Languages;
import dao.repositories.LanguageRepository;
import dto.LanguageDto;
import org.intellij.lang.annotations.Language;

import java.sql.SQLException;

public class LanguageService {
    private LanguageRepository languageRepository = new LanguageRepository();
    public void createLanguage(LanguageDto languageDto) throws SQLException {
        Languages language =new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.create(language);
    }

    public void updateLanguage(LanguageDto languageDto) {
        Languages language = new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.update(language);
    }

    public void deleteLanguage(LanguageDto languageDto) throws SQLException {
        Languages language = new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.delete(language);
    }
}