package controllers;

import dto.TagDto;
import services.TagService;

public class TagController {

    private TagService service = new TagService();

    public void createTag(TagDto tagDto) {
        // verify DTO
        service.createTag(tagDto);
    }
}
