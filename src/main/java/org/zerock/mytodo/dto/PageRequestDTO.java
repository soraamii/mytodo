package org.zerock.mytodo.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class PageRequestDTO {

@Builder.Default
private int page = 1;
@Builder.Default
private int size = 10;
    
}
