package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2018-09-26 22:31 下午
 */
public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("ImageFile."+name+" killVirus");
    }
}
class DocFile implements AbstractFile{
    private String name;

    public DocFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("DocFile."+name+" killVirus");
    }
}
class Folder implements AbstractFile{
    private String name;
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void add(AbstractFile file){
        list.add(file);
    }
    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile get(int index){
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("Folder."+name+" killVirus");

        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}

