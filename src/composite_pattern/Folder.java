package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{

    List<AbstractFile> listFile = new ArrayList<>();

    public Folder(String name, String createdDate) {
        super(name, createdDate);
    }

    @Override
    public void add(AbstractFile item) {
        if(!listFile.contains(item)) {
            listFile.add(item);
            item.path = this.path + "\\" + item.path;
            item.prefix = this.prefix + "---";
        }
    }

    @Override
    public void remove(AbstractFile item) {
        if(listFile.contains(item)) {
            listFile.remove(item);
            return;
        }
        listFile.forEach((folder)->{
            folder.remove(item);
        });
    }

    @Override
    public String getTreeFolder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefix).append(name);
        for(AbstractFile folder: listFile) {
            stringBuilder.append("\n").append(folder.getTreeFolder());
        }
        return stringBuilder.toString(); 
    }
}