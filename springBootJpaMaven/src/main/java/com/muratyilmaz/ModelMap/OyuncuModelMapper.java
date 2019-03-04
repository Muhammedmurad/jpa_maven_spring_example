package com.muratyilmaz.ModelMap;

import org.mapstruct.AfterMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.muratyilmaz.EntityModel.FilmEntityModel;
import com.muratyilmaz.EntityModel.OyuncuEntityModel;
import com.muratyilmaz.Model.OyuncuModel;

@Mapper(componentModel = "spring")
public interface OyuncuModelMapper {

	OyuncuEntityModel createOyuncuEntityModel(OyuncuModel model, @Context FilmEntityModel filmEntityModel);

	OyuncuModel createOyuncuModel(OyuncuEntityModel entityModel);

	// createOyuncuEntityModel
	@AfterMapping
	default void afterMapping(OyuncuModel model, @MappingTarget OyuncuEntityModel entityModel,
			@Context FilmEntityModel filmEntityModel) {
		entityModel.setFilm(filmEntityModel);
	}

	// createOyuncuModel
	@AfterMapping
	default void afterMapping(OyuncuEntityModel entityModel, @MappingTarget OyuncuModel model) {
		if (entityModel != null) {
			if (entityModel.getFilm() != null) {
				model.setFilmAdi(entityModel.getFilm().getAdi());
				model.setFilmId(entityModel.getFilm().getId());
			}

		}
	}
}
