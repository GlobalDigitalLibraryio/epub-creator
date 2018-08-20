package coza.opencollab.epub.creator.model.contributor;

public class Contributor {

    private final String name;
    private final ContributorType type;
    private final boolean primaryContributor;
    private String id;

    public Contributor(String name) {
        this(name, null);
    }

    public Contributor(String name, ContributorType type) {
        this(name, type, type == ContributorType.Author);
    }

    public Contributor(String name, ContributorType type, boolean primaryContributor) {
        this(null, name, type, primaryContributor);
    }

    public Contributor(String id, String name, ContributorType type, boolean primaryContributor) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.primaryContributor = primaryContributor;
    }

    public String getName() {
        return name;
    }

    public ContributorType getType() {
        return type;
    }

    public String getNodeType() {
        if(primaryContributor) {
            return "dc:creator";
        } else {
            return "dc:contributor";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
