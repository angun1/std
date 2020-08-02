package std.inf.test.chap2.study;

import org.springframework.data.jpa.repository.JpaRepository;

import std.inf.test.chap1.Study;

public interface StudyRepository extends JpaRepository<Study, Long>{

}
