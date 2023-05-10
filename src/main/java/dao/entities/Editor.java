package dao.entities;

public class Editor {

    private int editor_id;
    private String name;

    public Editor(int editor_id, String name) {
        this.editor_id = editor_id;
        this.name = name;
    }

    public int getEditor_id() {
        return editor_id;
    }

    public void setEditor_id(int editor_id) {
        this.editor_id = editor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
