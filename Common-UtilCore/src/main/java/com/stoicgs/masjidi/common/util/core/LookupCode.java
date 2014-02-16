package com.stoicgs.masjidi.common.util.core;

/**
 * Refer to documentation of LookupType. LookupType is the type that holds
 * multiple lookupCodes.
 * 
 * @author Nisar
 * 
 */
public class LookupCode {
    String lookupType;
    String lookupCode;
    String language;
    String meaning;
    String description;

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public String getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
