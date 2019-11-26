package stefan.tflc.last.task.mi.app.data;

import javax.transaction.Transactional;

import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import stefan.tflc.last.task.mi.app.entity.AbstractModel;

@NoRepositoryBean
@Where(clause = "deleted = 'false'")
public interface BaseRepository<T extends AbstractModel> extends JpaRepository<T, Long> {

	@Override
	@Query("update #{#entityName} e set e.deleted=true where e.id = :id")
	@Transactional
	@Modifying
	void deleteById(@Param("id") Long id);

	@Override
	@Transactional
	default void delete(T entity) {
		deleteById(entity.getId());
	}

}
