package dao.entities;

public class Editor {

    private int editorId;
    private String name;

    public Editor(int editorId, String name) {
        this.editorId = editorId;
        this.name = name;
    }

    //region GETTER/SETTER
    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}
