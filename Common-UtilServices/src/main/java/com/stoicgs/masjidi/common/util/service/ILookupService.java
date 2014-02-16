package com.stoicgs.masjidi.common.util.service;

import java.util.List;

import com.stoicgs.masjidi.common.util.core.LookupCode;
import com.stoicgs.masjidi.common.util.core.LookupType;

/**
 * This service interface specifies the methods that can be used
 * in application to perform multiple operations on lookups.
 * 
 * @author Nisar
 *
 */
public interface ILookupService {
    public List<LookupCode> getLookupCodes(String lookupType);
    public LookupType getLookupType(String lookupType);
    public String getLookupMeaning(String lookupType, String lookupCode);
    public boolean createLookupType(LookupType lookupType);
    public boolean updateLookupCode(LookupCode lookupCode);
    
}
