package com.muratyilmaz.EntityModel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bu classı diğer entitylerime extend ederek kullanacağım. Diğer entitylerimde
 * ortak olan alanlarımı tekrar tanımlamak zorunda kalmayacağım
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8457950645504184105L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, updatable = false)
	protected Long id;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE")
    protected Date createDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    protected Date updateDate;

}
