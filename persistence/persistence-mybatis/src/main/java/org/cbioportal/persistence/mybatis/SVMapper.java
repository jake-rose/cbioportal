package org.cbioportal.persistence.mybatis;

import org.apache.ibatis.annotations.Param;
import org.cbioportal.model.SV;

import java.util.List;
/**
 *
 * @author jake
 */
public interface SVMapper {
        
    List<SV> getSVs(@Param("geneticProfileStableIds")List<String> geneticProfileStableIds, 
            @Param("hugoGeneSymbols")List<String> hugoGeneSymbols, 
            @Param("sampleStableIds")List<String> sampleStableIds);
}
