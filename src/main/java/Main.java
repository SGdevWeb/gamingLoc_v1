import controllers.LanguageController;
import controllers.TypeController;
import dto.LanguageDto;
import dto.TypeDto;

public class Main {
    public static void main(String[] args) {

        /*
        LanguageDto languageDto = new LanguageDto("LT", "Latin");
        LanguageController languageController = new LanguageController();
        languageController.createLanguage(languageDto);
         */
        /*
        TypeDto typeDto = new TypeDto("RPG");
        TypeController typeController = new TypeController();
        typeController.createType(typeDto);
        */

        TypeDto typeDto = new TypeDto("Platform");
        TypeController typeController = new TypeController();
        typeController.createType(typeDto);

        LanguageDto languageDto = new LanguageDto("ES","espagnol");
        LanguageController languageController = new LanguageController();
        //languageController.createLanguage(languageDto);
        //languageController.deleteLanguage(languageDto);
        languageController.updateLanguage(languageDto);
        //LanguageDto languageDto1 = languageController.readLanguage("ES");

    }
}
