package io.wakelesstuna.reviewsfederationdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * @author oscar.steen.forss
 */
@Builder
@AllArgsConstructor
@Value
public class Review {
    Integer starRating;
}
