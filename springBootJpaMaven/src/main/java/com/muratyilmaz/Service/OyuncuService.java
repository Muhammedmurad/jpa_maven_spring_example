package com.muratyilmaz.Service;

import java.util.List;

import com.muratyilmaz.EntityModel.OyuncuEntityModel;
import com.muratyilmaz.Model.OyuncuModel;

public interface OyuncuService {
	
	List<OyuncuModel> performerList();
	
	List<OyuncuModel> performerListByMovie(long movieId);
	
	OyuncuModel findPerformer(long id);
	
	Boolean addPerformer(OyuncuEntityModel entityModel);
	
	Boolean updatePerformer(OyuncuEntityModel entityModel);
	
	Boolean deletePerformer(Long id);

}
