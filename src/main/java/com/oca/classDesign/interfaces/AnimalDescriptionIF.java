package com.oca.classDesign.interfaces;

/**
 * @author mcrassin
 * @since 17/05/2016
 */
public interface AnimalDescriptionIF {

    /*public static final*/ int animalNumber = 0;

    /*public abstract*/ String getName() throws Exception;

    /*public*/ default double getAge() {
        return 1;
    }

    /*public*/ default int getWeight() {
        return 10;
    }

}
