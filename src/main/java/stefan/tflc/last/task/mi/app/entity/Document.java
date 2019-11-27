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

	@OneToMany(mappedBy = "document", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	public Set<DocumentItem> documentItems;

}