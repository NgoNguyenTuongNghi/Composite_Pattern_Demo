package composite_pattern;

public class File extends AbstractFile {

    public File(final String name, final String createdDate) {
        super(name, createdDate);
    }

    @Override
    public void add(AbstractFile item) {}

    @Override
    public void remove(AbstractFile item) {}

    @Override
    public String getTreeFolder() {
        return this.prefix + this.name;
    }
}