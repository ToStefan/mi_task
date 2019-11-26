package stefan.tflc.last.task.mi.app.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "documents")
@Where(clause = "deleted = 'false'")
public class Document extends AbstractModel {

	@NotNull
	private String name;

	@NotNull
	private Integer amount;

	@OneToMany(mappedBy = "id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public Set<DocumentItem> documentItem;

}