package todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.model.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section,String> {
}
