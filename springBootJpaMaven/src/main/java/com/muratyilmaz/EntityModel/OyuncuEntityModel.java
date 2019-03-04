package com.muratyilmaz.EntityModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Oyuncular tablosunun entity model karşılığıdır. OyuncularEntityModel.
 */

@Entity
@Table(name = "PERFORMERS")
public class OyuncuEntityModel extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5602663249618931875L;

	@Column(name = "NAME", nullable = false)
	private String adi;

	@Column(name = "SURNAME", nullable = false)
	private String soyadi;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "MOVIE_ID")
	private FilmEntityModel film;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public FilmEntityModel getFilm() {
		return film;
	}

	public void setFilm(FilmEntityModel film) {
		this.film = film;
	}

	/*
	 * Ad Soyad, isteğe bağlı rol
	 */

}
