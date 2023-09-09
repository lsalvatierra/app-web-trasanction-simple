package pe.edu.cibertec.appwebtrasanctionsimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appwebtrasanctionsimple.model.bd.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Integer> {

}
