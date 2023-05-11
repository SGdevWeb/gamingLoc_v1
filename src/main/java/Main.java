import controllers.LanguageController;
import dto.LanguageDto;

public class Main {
    public static void main(String[] args) {
        LanguageDto languageDto = new LanguageDto("ES","espagnol");
        LanguageController languageController = new LanguageController();
        //languageController.createLanguage(languageDto);
        //languageController.deleteLanguage(languageDto);
        languageController.updateLanguage(languageDto);
        //LanguageDto languageDto1 = languageController.readLanguage("ES");

    }
}
