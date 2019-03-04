package com.muratyilmaz.Model;

public class OyuncuModel extends BaseModel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8197892955313725191L;

	private String adi;

	private String soyadi;

	private String filmAdi;
	
	private long filmId;

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

	public String getFilmAdi() {
		return filmAdi;
	}

	public void setFilmAdi(String filmAdi) {
		this.filmAdi = filmAdi;
	}

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}
	
	
}
