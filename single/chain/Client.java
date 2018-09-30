package chain;

/**
 * @author : Administrator
 * @version : 2018-09-27 11:23
 */
public class Client {
    public static void main(String[] args) {
        Leader zhang = new Director("张主任");             //0~3
        Leader li = new Manager("李经理");                 //3~10
        Leader wang = new GeneralManager("王总经理");      //10~30
        zhang.setNextLeader(li);
        li.setNextLeader(wang);
        LeaveRequest request = new LeaveRequest("Tom",0,"回老家结婚");
        for (int i = 0; i < 50; i++) {
            request.setLeaveDays(i);
            zhang.handleRequest(request);
            System.out.println(i);
        }



    }
}
