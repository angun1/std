package std.inf.test.chap1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import std.inf.test.chap2.study.domain.Member;
import std.inf.test.chap2.study.study.StudyStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
@Getter @Setter @NoArgsConstructor
public class Study {

	@Id 	@GeneratedValue
	private Long id;
	private StudyStatus status = StudyStatus.DRAFT;
	private int limitCount;
	private String name;
	private LocalDateTime openedDateTime;
	private Long ownerId;

	public Study(int limit, String name) {
		this.limitCount = limit;
		this.name = name;
	}

	public Study(int limit) {
		if (limit < 0) {
			throw new  IllegalArgumentException("limit은 0보다 커야 한다.");
		}
		this.limitCount = limit;
	}

	public void open() {
		this.openedDateTime = LocalDateTime.now();
		this.status = StudyStatus.OPENED;

	}


	public void setOwner(Member member) {

	}


}
