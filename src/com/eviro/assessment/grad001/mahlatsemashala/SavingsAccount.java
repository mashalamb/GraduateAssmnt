package com.eviro.assessment.grad001.mahlatsemashala;

import java.math.BigDecimal;

public class SavingsAccount extends SystemDB{
    public BigDecimal update_cust_money = new BigDecimal(0);

    public BigDecimal withdraw(BigDecimal amt2withdraw,int acc,int withcust_id){

        BigDecimal w_money = new BigDecimal(0);
        BigDecimal w_amt = amt2withdraw;


        BigDecimal less  =new BigDecimal(1000);
        BigDecimal balnce = getBalance(acc,withcust_id);


        BigDecimal num2compre = new BigDecimal(1);
        BigDecimal compare = BigDecimal.valueOf(balnce.compareTo(amt2withdraw));


        if (compare.equals(num2compre)) {

            for (int i =0;i < id.length;i++ ){

                if (acc == accN[i] && withcust_id == id[i]){ //get back

                    w_money = balnce.subtract(w_amt);
                    setUpdte(w_money);

                }else {

                    w_money = balnce.subtract(w_amt);
                    setUpdte(w_money);
                    break;
                }

            }

        }else {
            System.out.println("Over the current amount.. or the account has no money..");
            System.out.println("BALANCE :-> " + balnce);
        }

        return w_money;
    }

    public BigDecimal deposit(BigDecimal amt2Deposit, int acc, int withcust_id){


        for (int i = 0; i < id.length; i++) {
            if (acc == accN[i] && withcust_id == id[i] ){

                update_cust_money = balance[i].add(amt2Deposit);
                setUpdte(update_cust_money);
            }
        }

        return update_cust_money;

    }

    BigDecimal updte = new BigDecimal(0);

    public void setUpdte(BigDecimal up) {
        this.updte = up;
    }

    public BigDecimal getUpdte() {
        return updte;
    }

    @Override
    public void updateBal(BigDecimal bal, int updAcc, int upcst_id) {
        super.updateBal(bal, updAcc, upcst_id);
    }

    @Override
    public void setBalance(int cc,int id) {
        super.setBalance(cc,id);
    }

    @Override
    public BigDecimal getBalance(int accNumber, int cid) {
        return super.getBalance(accNumber,cid);
    }

    public  BigDecimal getbal(int cNumber,int cId){
        return getBalance(cNumber,cId);
    }
}
