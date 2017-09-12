package com.example.android.miwok;

/**
 * Created by marka on 9/12/2017. {@link Word} class defines a custom Word class to be used in populating
 * data in the translation pages of the Miwok application.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiworkTranslation;

    /**
     * Default constructor which creates the miwok and translation word pairs
     *
     * @param defaultTranslation is the word from the language the user speaks translated from Miwok
     * @param miwokTranslation   is the Miwok word from which the translation occurs
     **/

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miwokTranslation;
    }

    /**
     * Get the user's default language word for the translation pair
     **/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok word for the translation pair
     **/
    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }

}
