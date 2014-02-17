package com.stoicgs.masjidi.common.util.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "LOOKUP_CODES")
public class LookupCodePO {
    
    @Column(name = "LOOKUP_TYPE")
    private String lookupType;

    @Column(name = "LOOKUP_CODE")
    private String lookupCode;

    @Column(name = "LOOKUP_LANGUAGE")
    private String lookupLanguage;
    
    @Column(name = "LOOKUP_MEANING")
    private String lookupMeaning;
    
    @Column(name = "DESCRIPTION")
    private String description;

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

    public String getLookupLanguage() {
        return lookupLanguage;
    }

    public void setLookupLanguage(String lookupLanguage) {
        this.lookupLanguage = lookupLanguage;
    }

    public String getLookupMeaning() {
        return lookupMeaning;
    }

    public void setLookupMeaning(String lookupMeaning) {
        this.lookupMeaning = lookupMeaning;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
