package io.wakelesstuna.moivefederationdemo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oscar.steen.forss
 */
@Service
public class MovieService {

    private final List<Movie> movieList = List.of(
            Movie.builder().id(1).title("The Lord of the Rings: The Fellowship of the Ring").releaseYear(2001).build(),
            Movie.builder().id(2).title("Harry Potter and the Order of the Phoenix").releaseYear(2007).build(),
            Movie.builder().id(3).title("The Avengers").releaseYear(2012).build(),
            Movie.builder().id(4).title("Star Wars: Episode IV - A New Hope").releaseYear(1977).build(),
            Movie.builder().id(5).title("Star Wars: Episode I – The Phantom Menace").releaseYear(1999).build()
    );

    public List<Movie> movies() {
        return movieList;
    }

}
