package com.example.student.student.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    public Long id;
    public String name;
    public String organization;
}
