package tooooooooools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-02-17 17:14 下午
 */
public class FileUtil {

    // private static SimpleFile files = new SimpleFile();

    static SimpleFile showFiles(File file, int deep, boolean isLast) {
        SimpleFile files = new SimpleFile();
        files.setName(file.getName());
        files.setDeep(deep);
        files.setLastOne(isLast);
        if (!file.isDirectory()) {
            files.setDirectory(false);
            return files;
        }
        List<File> children = new ArrayList<>();
        if (file.listFiles() != null) {
            children = Arrays.asList(file.listFiles());
        }

        if (children.isEmpty()) {
            return files;
        }
//        List<SimpleFile> childrenList = Stream.of(children).map(file1 -> {
//            return new SimpleFile(deep,file1.getName(),new ArrayList<>());
//        }).collect(Collectors.toList());
//
//        files.setSon(childrenList);
        //files.setSon();
        for (int i = 0; i < children.size(); i++) {
            if(i == children.size()-1){
                files.getSon().add(showFiles(children.get(i),deep + 1, true));
            }else {
                files.getSon().add(showFiles(children.get(i),deep + 1, false));
            }
        }
        return files;
    }

//    └──
//            ├──
//            │

    public static void main(String[] args) {
        File file = new File("C:\\Users\\13447\\Documents\\新建文件夹");
        SimpleFile files = showFiles(file, 0, true);
        log(files,true);
    }

    private static void log(SimpleFile files ,boolean isLastDirectory) {
        boolean last = false;
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < files.getDeep() - 1; i++) {
            buffer.append("│   ");
          /*  if (isLastDirectory){
                buffer.append("    ");
            }else {
                buffer.append("│   ");
            }
          */

        }
        if (files.getDeep() != 0) {
            buffer.append("├──");
            /*if (files.isLastOne()){
                buffer.append("└──");
                last=true;
            }else {
                buffer.append("├──");
            }*/

        }
        System.out.println(buffer.append(files.getName()));


        for (SimpleFile simpleFile : files.getSon()) {
            log(simpleFile,last);
        }
//        System.out.println(files);

    }

}
