package com.stoicgs.masjidi.common.util.core;

import java.util.List;

/**
 * This class represents a lookup type. Each lookup type represents a set of
 * codes and values that can be used in application. For any lookup type there
 * will be its corresponding lookup codes.
 * 
 * For example we can create a lookup type - 'Gender' And it can have lookup
 * codes 'M' - 'Male' 'F' - 'Female' 'U' - 'Unknown'
 * 
 * @author Nisar
 * 
 */
public class LookupType {
    String lookupType;
    String description;

    List<LookupCode> lookupCodes;

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

    public List<LookupCode> getLookupCodes() {
        return lookupCodes;
    }

    public void setLookupCodes(List<LookupCode> lookupCodes) {
        this.lookupCodes = lookupCodes;
    }

}
