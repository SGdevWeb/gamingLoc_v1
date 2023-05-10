import controllers.LanguageController;
import dto.LanguageDto;

public class Main {
    public static void main(String[] args) {
        LanguageDto languageDto = new LanguageDto("LT", "Latin");
        LanguageController languageController = new LanguageController();
        languageController.createLanguage(languageDto);
    }
}
