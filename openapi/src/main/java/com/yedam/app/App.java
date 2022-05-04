package com.yedam.app;

import java.util.List;

import com.yedam.movie.vo.MovieInfo;

import co.yedam.movie.service.MovieService;

public class App {

	public static void main(String[] args) {
		List<MovieInfo> list = MovieService.getDailyBoxofficeResult();
		for(MovieInfo info : list) {
			System.out.println(info);
		}

	}

}
