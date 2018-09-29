package composite;

/**
 * @author : Rubi
 * @version : 2018-09-26 22:42 下午
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5,f6;
        Folder f1= new Folder("我的收藏");
        f2= new ImageFile("f2.jpg");
        f3= new DocFile("f3.txt");

        Folder f11 = new Folder("电影");
        f4=new ImageFile("f4.jpg");
        f5=new ImageFile("f5.jpg");
        f6=new ImageFile("f6.jpg");
        f11.add(f4);
        f11.add(f5);
        f11.add(f6);

        f1.add(f11);
        f1.add(f2);
        f1.add(f3);



        f1.killVirus();
    }
}
