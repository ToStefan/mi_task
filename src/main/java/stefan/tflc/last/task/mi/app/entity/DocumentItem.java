package stefan.tflc.last.task.mi.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "document_items")
@Where(clause = "deleted = 'false'")
public class DocumentItem extends AbstractModel {

	@NotNull
	private Integer quantity;

	@NotNull
	private Integer price;

	@OneToOne(targetEntity = Goods.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "goods_id", nullable = false)
	public Goods goods;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "document_id", nullable = false)
	public Document document;

}