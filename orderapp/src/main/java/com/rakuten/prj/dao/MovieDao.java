package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Movie;

public interface MovieDao {
	void addMovie(Movie m);
	List<Movie> getMovies();
	Movie getById(int id);
	void updateMovie(Movie m);
}
