package io.wakelesstuna.reviewsfederationdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
 * @author oscar.steen.forss
 */
@Builder
@AllArgsConstructor
@Value
public class Movie {
    String id;
    List<Review> reviews;
}
