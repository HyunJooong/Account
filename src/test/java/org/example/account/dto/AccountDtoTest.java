package org.example.account.dto;

import org.junit.jupiter.api.Test;

class AccountDtoTest {

    @Test
    void testAccountDto(){
        //given
        //when
        //then

        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNum("계좌번호 ");

        System.out.println(accountDto.getAccountNum());

    }

}