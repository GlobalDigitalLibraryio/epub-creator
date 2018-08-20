package coza.opencollab.epub.creator.model.contributor;

public enum ContributorType {
    Author("aut"),
    Illustrator("ill"),
    Translator("trl");

    private final String marcRelatorsIdentifier;

    ContributorType(String marcRelatorsIdentifier) {
        this.marcRelatorsIdentifier = marcRelatorsIdentifier;
    }

    @Override
    public String toString() {
        return marcRelatorsIdentifier;
    }

}
