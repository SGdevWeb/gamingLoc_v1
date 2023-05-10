package dao.entities;

public class Languages {

    private String acronym;
    private String name;

    public Languages(String acronym, String name) {
        this.acronym = acronym;
        this.name = name;
    }

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
}
