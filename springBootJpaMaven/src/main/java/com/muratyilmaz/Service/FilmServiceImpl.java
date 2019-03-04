package com.muratyilmaz.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratyilmaz.EntityModel.FilmEntityModel;
import com.muratyilmaz.Model.FilmModel;
import com.muratyilmaz.ModelMap.FilmModelMapper;
import com.muratyilmaz.Repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private FilmModelMapper filmModelMapper;

	@Override
	public List<FilmModel> movieList() {
		Iterable<FilmEntityModel> movieEntityModelIterable = this.filmRepository.findAllActive();
		Stream<FilmEntityModel> stream = StreamSupport.stream(movieEntityModelIterable.spliterator(), true);
		List<FilmModel> movieList = stream.map(x -> this.filmModelMapper.createFilmModel(x))
				.collect(Collectors.toList());
		return movieList;
	}

	@Override
	public FilmModel findMovie(Long id) {
		if (id != null) {
			FilmEntityModel entityModel = this.filmRepository.findOneActive(id);
			if (entityModel != null) {
				FilmModel model = this.filmModelMapper.createFilmModel(entityModel);
				return model;
			}
		}
		return null;
	}

	@Override
	public Boolean addMovie(FilmEntityModel entityModel) {
		try {
			this.filmRepository.save(entityModel);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public Boolean updateMovie(FilmEntityModel entityModel) {
		try {
			this.filmRepository.save(entityModel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteMovie(Long id) {
		try {
			this.filmRepository.softDelete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
