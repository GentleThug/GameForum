package com.sea.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer UserID;
    private String UserName;
    private String Pwd;
    private String Phone;
    private String Email;
    private Integer UserRole;
}
