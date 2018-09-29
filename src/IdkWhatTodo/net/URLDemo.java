package IdkWhatTodo.net;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 *
 * @author : Rubi
 * @version : 2018-09-29 22:02 下午
 */
public class URLDemo {
    public static void main(String[] args)throws Exception {
        String ur="http://www.baidu.com";
        String urr="http://www.rubi.ink:80/Nooooob/index.do?username=123&password=123";
        URL url = new URL(ur);
       /* InputStream is =url.openStream();
        byte[] flush= new byte[1024];
        int length=0;
        StringBuffer sb= new StringBuffer();
        while ((length=is.read(flush))!=-1) {
            System.out.println(new String(flush,0,length));
        }
        is.close();*/
        BufferedReader br =  new BufferedReader(new InputStreamReader(url.openStream()));
        String ms= null;
        while ((ms=br.readLine())!=null){
            System.out.println(ms);
        }
        br.close();


        //System.out.println(url.getQuery());
    }

}
