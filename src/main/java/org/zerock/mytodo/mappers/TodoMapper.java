package org.zerock.mytodo.mappers;

import java.util.List;

import org.zerock.mytodo.dto.TodoDTO;

public interface TodoMapper {
    
    List<TodoDTO> getList();
}
