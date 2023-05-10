package services;

import dao.entities.Editor;
import dao.repositories.EditorRepository;
import dto.EditorDto;

public class EditorService {

    private EditorRepository repository = new EditorRepository();

    public void createEditor(EditorDto editorDto){
        Editor editor = new Editor(1, editorDto.getName());
        repository.insert(editor);
    }

}
