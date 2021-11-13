package com.gmail.mateendev3.androidcomponents;

public class SpinnerItems {
    private final String mProgrammingLanguage;
    private final int mLanguageLogo;

    public SpinnerItems (String programmingLanguage, int languageLogo) {
        mProgrammingLanguage = programmingLanguage;
        mLanguageLogo = languageLogo;
    }

    public String getProgrammingLanguage () {
        return mProgrammingLanguage;
    }

    public int getLanguageLogo () {
        return mLanguageLogo;
    }
}
