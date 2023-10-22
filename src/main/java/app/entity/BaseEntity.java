package app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import app.enums.DeleteFlag;
import app.enums.StatusActive;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private StatusActive active;
	
	@Column(name = "delete_flag")
	private DeleteFlag deleteFlag;

}
