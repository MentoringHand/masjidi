package com.stoicgs.masjidi.common.util.serviceImpl;

import java.util.List;

import com.stoicgs.masjidi.common.util.core.LookupCode;
import com.stoicgs.masjidi.common.util.core.LookupType;
import com.stoicgs.masjidi.common.util.repo.ILookupRepository;
import com.stoicgs.masjidi.common.util.service.ILookupService;

public class LookupService implements ILookupService {
    
    ILookupRepository lookupRepo;

    public List<LookupCode> getLookupCodes(String lookupType) {
        // TODO Auto-generated method stub
        return null;
    }

    public LookupType getLookupType(String lookupType) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getLookupMeaning(String lookupType, String lookupCode) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean createLookupType(LookupType lookupType) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean updateLookupCode(LookupCode lookupCode) {
        // TODO Auto-generated method stub
        return false;
    }

}
