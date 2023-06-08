package org.zerock.mytodo.dto;

import java.util.List;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;

// @AllArgsConstructor
@Data
public class PageResponseDTO<E> {
    
    private List<E> list;
    private long total;

    @Builder(buildMethodName = "withAll")
    public PageResponseDTO(List<E> list, long total) {
        
        this.list = list;
        this.total = total;
    }


}
