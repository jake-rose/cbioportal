package org.cbioportal.service;

import org.cbioportal.model.SV;

import java.util.List;
import java.util.Map;

public interface SVService {
    
    List<SV> getSVs(List<Integer> geneticProfileStableIds, List<String> hugoGeneSymbols, List<String> sampleStableIds);
    
    void insertSV(Map<String, Object> map);
    
}
