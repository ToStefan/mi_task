package stefan.tflc.last.task.mi.app.service;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import stefan.tflc.last.task.mi.app.entity.AbstractModel;

public abstract class BaseService<R extends JpaRepository<E, Long>,E extends AbstractModel> {
	
    @Autowired
    R repo;
    
    public Page<E> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public E findOne(long id){
        return repo.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    public E save(E entity){
        return repo.save(entity);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }


	@SuppressWarnings("unchecked")
	protected String getEntityName() {
        return ((Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1]).getSimpleName();
    }


	@SuppressWarnings("unchecked")
	protected String getRepoName() {
        return ((Class<R>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
    }

}
