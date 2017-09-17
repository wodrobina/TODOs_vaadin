package eu.wodrobina.Todos_vaadin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface TodoRepository extends JpaRepository<Todo, Long>{

    @Transactional
    void deleteByDone(boolean done);
}
