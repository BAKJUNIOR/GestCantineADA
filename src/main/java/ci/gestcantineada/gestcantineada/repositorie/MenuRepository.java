package ci.gestcantineada.gestcantineada.repositorie;

import ci.gestcantineada.gestcantineada.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}