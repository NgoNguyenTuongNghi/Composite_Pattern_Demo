package composite_pattern;

public abstract class AbstractFile {
    String name, createdDate;
    String path;
    String prefix = "";

    public AbstractFile(String name, String createdDate) {
        this.name = name;
        this.createdDate = createdDate;
        this.path = name;
    }

    public abstract void add(AbstractFile item);
    public abstract void remove(AbstractFile item);
    public abstract String getTreeFolder();
    public String getName() {
        return name;
    }

    public String getCreatedDate() {
        return createdDate;
    }
}