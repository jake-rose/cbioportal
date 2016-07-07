package org.cbioportal.persistence.mybatis;

import org.apache.ibatis.annotations.Param;
import org.cbioportal.model.SV;

import java.util.List;
import java.util.Map;
/**
 *
 * @author jake
 */
public interface SVMapper {
        
    List<SV> getSVs(@Param("geneticProfileStableIds")List<Integer> geneticProfileStableIds, 
            @Param("hugoGeneSymbols")List<String> hugoGeneSymbols, 
            @Param("sampleStableIds")List<String> sampleStableIds);
    
    SV insertSV(Map<String, Object> map);
    
}
