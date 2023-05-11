package dto;

public class LanguageDto {
    private String acronym;
    private String name;

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LanguageDto(String acronym, String name) {
        this.acronym = acronym;
        this.name = name;
    }

    public LanguageDto(String acronym) {
        this.acronym = acronym;
    }
}
