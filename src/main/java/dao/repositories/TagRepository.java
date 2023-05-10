package dao.repositories;

import dao.entities.Tag;

public class TagRepository {

    public Tag findById(int id) {
        return new Tag(id, "fake");
    }

    public void update(int id) {
        // ...
    }

    public void insert(Tag tag) {
        // JDBC
    }
}
