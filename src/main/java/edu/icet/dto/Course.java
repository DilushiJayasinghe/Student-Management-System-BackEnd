package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Course {
    private String description;
    private String code;
    private String fee;
    private String duration;
    private String institute;

}
