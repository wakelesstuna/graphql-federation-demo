package io.wakelesstuna.moivefederationdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * @author oscar.steen.forss
 */
@Builder
@AllArgsConstructor
@Value
public class Movie {

    Integer id;
    String title;
    Integer releaseYear;

}
