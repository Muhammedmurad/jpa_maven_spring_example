package com.muratyilmaz.Service;

import java.util.List;

import com.muratyilmaz.EntityModel.FilmEntityModel;
import com.muratyilmaz.Model.FilmModel;

public interface FilmService {
	
	List<FilmModel> movieList();
	
	FilmModel findMovie(Long id);
	
	Boolean addMovie(FilmEntityModel entityModel);
	
	Boolean updateMovie(FilmEntityModel entityModel);
	
	Boolean deleteMovie(Long id);

}
