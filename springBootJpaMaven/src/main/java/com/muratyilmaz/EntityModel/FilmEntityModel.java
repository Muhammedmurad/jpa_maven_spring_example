package com.muratyilmaz.EntityModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Filmlerin tutulacağı db karşılığı entity model
 */

@Entity
@Table(name="MOVIES")
public class FilmEntityModel extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8253378513832498014L;

    @Column(name = "NAME")
    private String adi;
	
    @Column(name = "YEAR")
    private int yili;
	
    @Column(name = "DESCRIPTION")
    private String aciklama;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getYili() {
		return yili;
	}

	public void setYili(int yili) {
		this.yili = yili;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}	
	
	
	
}
