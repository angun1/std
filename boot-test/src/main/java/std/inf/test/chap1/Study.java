package std.inf.test.chap1;

import lombok.Getter;
import lombok.Setter;
import std.inf.test.chap2.study.domain.Member;


public class Study {

	private StudyStatus studyStatus = StudyStatus.DRAFT;
	
	@Getter @Setter
	private int limit;

	public Study(int limit) {
		if(limit < 0 ) {
			throw new IllegalArgumentException("인원은 0 보다 커야 한다.");
		}
		this.limit = limit;
	}
	public StudyStatus getStatus() {
		return this.studyStatus;
	}
	
	public void setOwner(Member member) {
		// TODO Auto-generated method stub
		
	}
	
}
