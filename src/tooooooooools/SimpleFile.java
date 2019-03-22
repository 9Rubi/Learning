package tooooooooools;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-02-17 17:22 下午
 */

public class SimpleFile {
    private int deep;
    private String name;
    private List<SimpleFile> son=new ArrayList<>();
    private boolean directory;
    private boolean lastOne;
    public SimpleFile(String name) {
        name = name;
    }

    public SimpleFile(int deep, String name, List<SimpleFile> son) {
        this.deep = deep;
        this.name = name;
        this.son = son;
    }

    public SimpleFile() {
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SimpleFile> getSon() {
        return son;
    }

    public void setSon(List<SimpleFile> son) {
        this.son = son;
    }

    public boolean isDirectory() {
        return directory;
    }

    public void setDirectory(boolean directory) {
        this.directory = directory;
    }

    public boolean isLastOne() {
        return lastOne;
    }

    public void setLastOne(boolean lastOne) {
        this.lastOne = lastOne;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"deep\":")
                .append(deep);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"son\":")
                .append(son);
        sb.append(",\"directory\":")
                .append(directory);
        sb.append(",\"lastOne\":")
                .append(lastOne);
        sb.append('}');
        return sb.toString();
    }
}
