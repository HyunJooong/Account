package org.example.account.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class AccountDto {

    private String accountNum;
    private String nickname;
    private LocalDateTime registerdAt;
}
