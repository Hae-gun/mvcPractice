package com.example.demo.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    @Size(min = 2, message = "Name 은 두글자 이상 입력해 주세요.")
    private String name;
    @Past
    private Date joinDate;

    @JsonIgnore
    private String password;
    @JsonIgnore
    private String ssn;
}
