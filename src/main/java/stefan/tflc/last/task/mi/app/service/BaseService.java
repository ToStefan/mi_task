package stefan.tflc.last.task.mi.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import stefan.tflc.last.task.mi.app.entity.AbstractModel;
import stefan.tflc.last.task.mi.app.exception.EntityNotFoundException;

public abstract class BaseService<R extends JpaRepository<E, Long>,E extends AbstractModel> {
	
    @Autowired
    R repo;
    
    public Page<E> findAll(Pageable pageable) {
    	return repo.findAll(pageable);
    }

    public E findOne(Long id){
    	return repo.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

    public E save(E entity){
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
