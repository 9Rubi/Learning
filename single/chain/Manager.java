package chain;

/**
 * @author : Administrator
 * @version : 2018-09-27 11:12
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<10){
            System.out.println("Manager.handleRequest");
        }else {
            if(nextLeader!=null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }

}
