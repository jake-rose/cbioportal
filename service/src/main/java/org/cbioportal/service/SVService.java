package org.cbioportal.service;

import org.cbioportal.model.SV;

import java.util.List;

public interface SVService {
    
    List<SV> getSVs(List<Integer> geneticProfileStableIds, List<String> hugoGeneSymbols, List<String> sampleStableIds);
    
}
