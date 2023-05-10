package controllers;

import dto.EditorDto;
import services.EditorService;

public class EditorController {

    private EditorService service = new EditorService();

    public void createEditor(EditorDto editorDto){
        service.createEditor(editorDto);
    }

}
