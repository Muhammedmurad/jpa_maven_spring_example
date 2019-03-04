package com.muratyilmaz.Model;

public class FilmModel extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1755617065691859986L;

	
	
    private String adi;
	
    private int yili;
	
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
