package TermProject;
/**
 * Carl Borillo, Justin Miller, Chaz Arvizu, Jereme Howell, Yoosuf Batliwala
 * December 7, 2020
 * Purpose: Decorated class to describe the Spa Amenity as well as the cost
 * Inputs:
 * Output: description, and cost of Spa
 */
public class Spa extends AmenityDecorator {
    /**
     * Default constructor - no body
     */
    public Spa(){}

    /**
     * @return String description of Spa
     */
    public String getDescription(){
        return "Spa";
    }

    /**
     * @return cost of Spa
     */
    public double cost(){
        return 20.00;
    }

    @Override
    public String toString() {
        return "Spa amenity with a cost of " + cost();
    }
}
