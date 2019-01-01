package com.example.android.germanhelp;

class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** German translation for the word */
    private String mGermanTranslation;

    public Word(String defaultTranslation, String germanTranslation){
        mDefaultTranslation = defaultTranslation;
        mGermanTranslation = germanTranslation;
    }

    public  String getDefaultTranslation()
    {

        return  mDefaultTranslation;
    }

    public  String getGermanTranslation()
    {

        return mGermanTranslation;
    }

}
