package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务器
 * @author : Administrator
 * @version : 2018-09-28 9:38
 */
public class Subject {
    private List<Observer> list= new ArrayList<>();

    public void register(Observer obs){
        list.add(obs);
    }
    public void remove(Observer obs){
        list.remove(obs);
    }
    //通知更新状态
    public void notifyAllObserver(){
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
