package com.eviro.assessment.grad001.mahlatsemashala;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SystemDB {

    /*Savings account (id=101, accountNum=1, balance = R2000)
b. Savings account (id=102, accountNum=2, balance = R5000)
c. Current account (id=103, accountNum=3, balance = R1000,
overdraft = R10000):
d. Current account (id=104, accountNum=4, balance = -R5000,
overdraft = R20000) (NOTE : Negative balance for this account)*/

    BigDecimal cust_amnt = new BigDecimal(0.0);

    int[] id = {101,102,103,104};
    int[] accN = {1,2,3,4};

   BigDecimal[] balance = {new BigDecimal(2000.00),new BigDecimal(5000),new BigDecimal(1000),new BigDecimal(5000)};
   BigDecimal[] overtdraft  = {new BigDecimal(00),new BigDecimal(00),new BigDecimal(-10000),new BigDecimal(-20000)};

   public BigDecimal getBalance(int accNumber,int c_id){

        BigDecimal current_balance = new BigDecimal(0.2);
        for (int i = 0; i < id.length ; i++) {
            if (accNumber == accN[i] && c_id == id[i]) {
                current_balance = balance[i];
            }
        }
        return current_balance;
    }


    public void setBalance(int cc,int id) {

        BigDecimal b = getBalance(cc,id);
        this.cust_amnt = b;
    }

    public void updateBal(BigDecimal bal,int updAcc,int upcst_id){

        for (int i = 0; i < id.length; i++) {
            if (updAcc == accN[i] && upcst_id == id[i] ) {
                this.balance[i] = bal;
            }
        }
    }

}
