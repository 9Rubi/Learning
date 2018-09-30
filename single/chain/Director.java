package chain;

/**
 * 主任
 *
 * @author : Administrator
 * @version : 2018-09-27 11:06
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<3){
            System.out.println("Director.handleRequest");
        }else {
            if(nextLeader!=null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }

}
