package TermProject;
/**
 * Carl Borillo, Justin Miller, Chaz Arvizu, Jereme Howell, Yoosuf Batliwala
 * December 7, 2020
 * Purpose: This class represents an Observer, that observes a Subject
 * Inputs: N/A
 * Output: N/A
 */
public interface Observer {
    /**
     * Updates the state of the observer, when the Subject calls this method
     */
    void update();
}
