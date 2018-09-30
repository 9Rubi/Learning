package danli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @description: 测试反射
 * @author: wangyijie
 * @create: 2018-09-26 09:37
 */
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)throws Exception {
        Dan1 a =Dan1.getInstance();
        Dan1 b =Dan1.getInstance();
        System.out.println(a);
        System.out.println(b);
       /* Object clazz= Class.forName("danli.Dan1");

        Constructor<Dan1> c = ((Class) clazz).getDeclaredConstructor(new  Class[0]);
        c.setAccessible(true);
        System.out.println(c.newInstance());
        System.out.println(c.newInstance());
        System.out.println(c.newInstance());
        System.out.println(c.newInstance());*/
        {
            FileOutputStream fos = new FileOutputStream("d:/a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();
            fos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
            Dan1 c = (Dan1) ois.readObject();
            System.out.println(c);
        }
        {
            FileOutputStream fos =new FileOutputStream("d:/a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();
            fos.close();
            ObjectInputStream ois =new ObjectInputStream(new FileInputStream("d:/a.txt"));
            Dan1 c= (Dan1) ois.readObject();
            System.out.println(c);
        }

    }
}
