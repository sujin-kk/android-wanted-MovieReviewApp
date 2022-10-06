package com.preonboarding.moviereview.domain.usecase

import com.preonboarding.moviereview.domain.repository.remote.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class SearchMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    suspend operator fun invoke(movieName: String) =
        movieRepository.getMovieListByMovieName(movieName).flowOn(Dispatchers.Default)
}