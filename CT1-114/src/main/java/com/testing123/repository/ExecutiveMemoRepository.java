import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing123.model.ExecutiveMemo;

public interface ExecutiveMemoRepository extends JpaRepository<ExecutiveMemo, Long> {

    ExecutiveMemo findByMemo(String memo);

    ExecutiveMemo findByDateCreated(Date dateCreated);

    ExecutiveMemo findByDow(int dow);

    void deleteByMemo(String memo);

    void deleteByDateCreated(Date dateCreated);

    void deleteByDow(int dow);
}