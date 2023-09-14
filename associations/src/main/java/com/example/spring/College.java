package com.example.spring;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Cycle")
public class College {
	@EmbeddedId
    private Composite compo;
	public Composite getCom() {
		return compo;
	}
	public void setCom(Composite com) {
		this.compo = com;
	}
	private int namet;

	
	public int getName() {
		return namet;
	}
	public void setName(int name) {
		this.namet = name;
	}
	@Override
	public String toString() {
		return "College [com=" + compo + ", namet=" + namet + "]";
	}
	
	

	
}
