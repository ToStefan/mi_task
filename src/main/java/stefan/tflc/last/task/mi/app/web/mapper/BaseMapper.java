package stefan.tflc.last.task.mi.app.web.mapper;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import stefan.tflc.last.task.mi.app.entity.AbstractModel;

public interface BaseMapper<E extends AbstractModel, D> {

	E toEntity(D dto);

	D toDto(E entity);

	default Set<E> toEntity(Collection<D> dtoList) {
		return dtoList.stream().map(this::toEntity).collect(Collectors.toSet());
	}

	default Set<D> toDto(Collection<E> entityList) {
		return entityList.stream().map(this::toDto).collect(Collectors.toSet());
	}
}
