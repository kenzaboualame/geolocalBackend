package beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: GpsTracker
 *
 */
@Entity

public class GpsTracker implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String simNumber;

	@Transient
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "GTrackers")
	List<Vehicule> vehicules;



	public GpsTracker(String simNumber) {
		super();
		this.simNumber = simNumber;
	}

	public GpsTracker() {
		super();
	}

	public String getSimNumber() {
		return simNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	@Override
	public String toString() {
		return "GpsTracker [id=" + id + ", simNumber=" + simNumber + ", vehicules=" + vehicules + "]";
	}

}
