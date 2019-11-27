package stefan.tflc.last.task.mi.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "goods")
@Where(clause = "deleted = 'false'")
public class Goods extends AbstractModel {

	@NotNull
	private String name;
}