package services;

import dao.entities.Languages;
import dao.repositories.LanguageRepository;
import dto.LanguageDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LanguageService {
    private LanguageRepository languageRepository = new LanguageRepository();
    public void createLanguage(LanguageDto languageDto) throws SQLException {
        Languages language =new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.create(language);
    }

    public void updateLanguage(LanguageDto languageDto) throws SQLException {
        Languages language = new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.update(language);
    }

    public void deleteLanguage(LanguageDto languageDto) throws SQLException {
        Languages language = new Languages(languageDto.getAcronym(), languageDto.getName());

        languageRepository.delete(language);
    }

    public LanguageDto readLanguage(String languageAcronyme) throws SQLException {
        Languages language = new Languages(languageAcronyme);
        ResultSet resultSet =  languageRepository.read(language);
        resultSet.next();
        return new LanguageDto(resultSet.getString("acronym"),resultSet.getString("name"));
    }
}