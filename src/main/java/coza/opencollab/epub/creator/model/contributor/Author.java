package coza.opencollab.epub.creator.model.contributor;

public class Author extends Contributor {
    public Author(String name) {
        this(null, name);
    }

    public Author(String id, String name) {
        super(id, name, ContributorType.Author, true);
    }
}
