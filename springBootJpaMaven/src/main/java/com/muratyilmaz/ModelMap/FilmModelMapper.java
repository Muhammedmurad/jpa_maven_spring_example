package com.muratyilmaz.ModelMap;

import org.mapstruct.Mapper;

import com.muratyilmaz.EntityModel.FilmEntityModel;
import com.muratyilmaz.Model.FilmModel;

@Mapper(componentModel = "spring")
public interface FilmModelMapper {

   FilmEntityModel createFilmEntityModel(FilmModel model);
   
   FilmModel createFilmModel(FilmEntityModel entityModel);
}
