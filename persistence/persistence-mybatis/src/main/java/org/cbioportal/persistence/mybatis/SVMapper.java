package org.cbioportal.persistence.mybatis;

import org.apache.ibatis.annotations.Param;
import org.cbioportal.model.SV;

import java.util.List;
import java.util.*;
/**
 *
 * @author jake
 */
public interface SVMapper {
        
    List<SV> getSVs(@Param("geneticProfileStableIds")List<Integer> geneticProfileStableIds, 
            @Param("hugoGeneSymbols")List<String> hugoGeneSymbols, 
            @Param("sampleStableIds")List<String> sampleStableIds);
    
    void insertSV(@Param("sv")Map<String, Object> map);
}
