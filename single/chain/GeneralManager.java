package chain;

/**
 * @author : Administrator
 * @version : 2018-09-27 11:20
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<30){
            System.out.println("GeneralManager.handleRequest");
        }else {
            System.out.println("fired");
        }
    }

}