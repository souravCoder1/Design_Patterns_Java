package behavioral_design_pattern.Chain_of_Responsibility;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole();
}
