package prototype;

import org.junit.Test;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        Sheep s1= new Sheep("喜羊羊",new Date());
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        s1.setName("美羊羊");
       // s1.getBirthday();
        System.out.println(s2);
        System.out.println(s1);

    }
    /**
     * Sheep{name='喜羊羊', birthday=Sat Feb 14 07:31:31 GMT+08:00 2009}
     * Sheep{name='喜羊羊', birthday=Sun May 01 09:28:30 GMT+08:00 2044}
     * Sheep{name='喜羊羊', birthday=Sun May 01 09:28:30 GMT+08:00 2044}
     *
     * Sheep{name='喜羊羊', birthday=Sat Feb 14 07:31:31 GMT+08:00 2009}
     * Sheep{name='喜羊羊', birthday=Sat Feb 14 07:31:31 GMT+08:00 2009}  深复制
     * Sheep{name='喜羊羊', birthday=Sun May 01 09:28:30 GMT+08:00 2044}
     *
     * Sheep{name='喜羊羊', birthday=Wed Sep 26 18:55:38 GMT+08:00 2018}
     * Sheep{name='喜羊羊', birthday=Wed Sep 26 18:55:38 GMT+08:00 2018}
     * Sheep{name='美羊羊', birthday=Wed Sep 26 18:55:38 GMT+08:00 2018}
     */
    @Test
    public void 测试(){
        StringBuffer str= new StringBuffer("喜羊羊");
        Sheep s1 = new Sheep(str.toString(),new Date());
        System.out.println(s1);
        str.setLength(0);
        str.append("fuckme");
        s1.getName();
        System.out.println(s1);

    }
}
