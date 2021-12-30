package io.wakelesstuna.moivefederationdemo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oscar.steen.forss
 */
@Service
public class MovieService {

    private final List<Movie> movieList = List.of(
            Movie.builder().id(1).title("Stranger Things").releaseYear(2016).build(),
            Movie.builder().id(2).title("Ozark").releaseYear(2017).build(),
            Movie.builder().id(3).title("The Crown").releaseYear(2016).build(),
            Movie.builder().id(4).title("Dead to Me").releaseYear(2019).build(),
            Movie.builder().id(5).title("Orange is the New Black").releaseYear(2013).build()
    );

    public List<Movie> movies() {
        return movieList;
    }

}
