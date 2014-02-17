package com.stoicgs.masjidi.common.util.jpa;

import javax.persistence.*;

@Entity(name = "LOOKUP_TYPES")
public class LookupTypePO {
    
    @Column(name = "LOOKUP_TYPE")
    private String lookupType;
    
    @Column(name = "DESCRIPTION")
    private String description;

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

}
