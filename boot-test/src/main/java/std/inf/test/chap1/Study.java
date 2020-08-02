package std.inf.test.chap1;

import lombok.Getter;
import lombok.Setter;


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
	
}
