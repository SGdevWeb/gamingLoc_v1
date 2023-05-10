package services;

import dao.entities.Tag;
import dao.repositories.TagRepository;
import dto.TagDto;

public class TagService {

    private TagRepository tagRepository = new TagRepository();

    public void createTag(TagDto tagDto) {
        Tag tag = new Tag(0, tagDto.getTag());

        tagRepository.insert(tag);
    }
}
