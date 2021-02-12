package TermProject;
/**
 * Carl Borillo, Justin Miller, Chaz Arvizu, Jereme Howell, Yoosuf Batliwala
 * December 7, 2020
 * Purpose: A Decorator class to give different descriptions to different Roach Hotel Amenities
 * Inputs: N/A
 * Output: N/A
 */
public abstract class AmenityDecorator extends Room {
    /**
     * Abstract method to get description of the different amenities
     * @return string description of amenity
     */
    public abstract String getDescription();

}
