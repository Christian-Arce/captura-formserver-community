package py.com.sodep.mobileforms.api.entities.forms;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "forms", name = "forms_last_version_view")
public class FormLastVersionView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long version;
	private Form root;

	@Column(name = "version")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Id
	@OneToOne
	@JoinColumn(name = "root_id")
	public Form getRoot() {
		return root;
	}

	public void setRoot(Form root) {
		this.root = root;
	}

}
