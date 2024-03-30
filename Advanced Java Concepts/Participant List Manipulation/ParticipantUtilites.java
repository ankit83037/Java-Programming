import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParticipantUtility {
	List<Participant> participantList = new ArrayList<Participant>();

	public List<Participant> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(List<Participant> participantList) {
		this.participantList = participantList;
	}
	
	public void addParticipant(Participant pObj) {
		// Fill your code here
		participantList.add(pObj);
	}
	
	public Stream<Participant> viewAllParticipants(String departmentName,String collegeName) {
		// Fill your code here
		Stream<Participant> pt = participantList.stream().filter(n->n.getDepartmentName().equals(departmentName) 
		                         && n.getCollegeName().equals(collegeName))
		                         .sorted((p1,p2)->p1.getParticipantName().compareTo(p2.getParticipantName()));
		
		return pt;
	}
}
