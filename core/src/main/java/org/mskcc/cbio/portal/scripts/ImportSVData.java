/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mskcc.cbio.portal.scripts;

import org.mskcc.cbio.portal.dao.*;
import org.mskcc.cbio.portal.util.*;
import org.cbioportal.service.SVService;
import org.cbioportal.model.SV;
import org.cbioportal.persistence.mybatis.SVMapper;

import java.io.*;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jake
 */
public class ImportSVData {
    @Autowired
    private SVMapper svMapper;
    
    @Autowired
    private SVService svService;
    
    @Transactional
    public SV insertSV(String sampleId, String annotation, String breakpoint_type, String comments,
            String confidence_class, String conn_type, String connection_type, String event_info, 
            String mapq, Integer normal_read_count, Integer normal_variant_count, Integer paired_end_read_support,
            String site1_chrom, String site1_desc, String site1_gene, Integer site1_pos, String site2_chrom,
            String site2_desc, String site2_gene, Integer site2_pos, Integer split_read_support, 
            String sv_class_name, String sv_desc, Integer sv_length, Integer sv_variant_id, 
            Integer tumor_read_count, Integer tumor_variant_count, String variant_status_name, 
            String geneticProfile){
        SV sv = new SV();
        
        Map<String, Object> map = new HashMap<>();
        map.put("sampleId", sampleId);
        map.put("annotation", annotation);
        map.put("breakpoint_type", breakpoint_type);
        map.put("comments", comments);
        map.put("confidence_class", confidence_class);
        map.put("conn_type", conn_type);
        map.put("connection_type", connection_type);
        map.put("event_info", event_info);
        map.put("mapq", mapq);
        map.put("normal_read_count", normal_read_count);
        map.put("normal_variant_count", normal_variant_count);
        map.put("paired_end_read_support", paired_end_read_support);
        map.put("site1_chrom", site1_chrom);
        map.put("site1_desc", site1_desc);
        map.put("site1_gene", site1_gene);
        map.put("site1_pos", site1_pos);
        map.put("site2_chrom", site2_chrom);
        map.put("site2_desc", site2_desc);
        map.put("site2_gene", site2_gene);
        map.put("site2_pos", site2_pos);
        map.put("split_read_support", split_read_support);
        map.put("sv_class_name", sv_class_name);
        map.put("sv_desc", sv_desc);
        map.put("sv_length", sv_length);
        map.put("sv_variant_id", sv_variant_id);
        map.put("tumor_read_count", tumor_read_count);
        map.put("tumor_variant_count", tumor_variant_count);
        map.put("variant_status_name", variant_status_name);
        map.put("geneticProfile", geneticProfile);
        
        svMapper.insertSV(map);
        
        sv.setSampleId(sampleId);
        sv.setAnnotation(annotation);
        sv.setBreakpoint_type(breakpoint_type);
        sv.setComments(comments);
        sv.setConfidence_class(confidence_class);
        sv.setConn_type(conn_type);
        sv.setConnection_type(connection_type);
        sv.setEvent_info(event_info);
        sv.setMapq(mapq);
        sv.setNormal_read_count(normal_read_count);
        sv.setNormal_variant_count(normal_variant_count);
        sv.setPaired_end_read_support(paired_end_read_support);
        sv.setSite1_chrom(site1_chrom);
        sv.setSite1_desc(site1_desc);
        sv.setSite1_gene(site1_gene);
        sv.setSite1_pos(site1_pos);
        sv.setSite2_chrom(site2_chrom);
        sv.setSite2_desc(site2_desc);
        sv.setSite2_gene(site2_gene);
        sv.setSite2_pos(site2_pos);
        sv.setSplit_read_support(split_read_support);
        sv.setSv_class_name(sv_class_name);
        sv.setSv_desc(sv_desc);
        sv.setSv_length(sv_length);
        sv.setSv_variant_id(sv_variant_id);
        sv.setTumor_read_count(tumor_read_count);
        sv.setTumor_variant_count(tumor_variant_count);
        sv.setVariant_status_name(variant_status_name);
        sv.setGeneticProfile(geneticProfile);
        
        return sv;
    }
}
