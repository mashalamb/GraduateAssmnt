package com.eviro.assessment.grad001.mahlatsemashala;

import java.math.BigDecimal;

public class CurrentAccount extends SystemDB {

    public BigDecimal update_cust_money = new BigDecimal(0);

    public BigDecimal curr_withdraw(BigDecimal amt2withdraw,int acc,int withcust_id){

        BigDecimal w_money = new BigDecimal(0);
        BigDecimal chkbal = new BigDecimal(0);
        boolean bll = true;
        BigDecimal w_amt = amt2withdraw;


        BigDecimal less  =new BigDecimal(1000);
        BigDecimal balnce = getBalance(acc,withcust_id);


        BigDecimal num2compre = new BigDecimal(-1);

        for (int j = 0; j < id.length; j++) {
            /*_------------------------------------------------------------------------------*/
            // check the compare later
            if (id[j] == 104  && accN[j] == 4 || id[j] == 103 && accN[j] == 3 ) {
                BigDecimal compare = BigDecimal.valueOf(balance[j].compareTo(overtdraft[j]));
                BigDecimal n = new BigDecimal(-1);
                if (compare == n) {
                    System.out.println("Exceeded yor limit..");
                    w_money = balance[j];
                    setUpdte(w_money);
                    break;
                }

                bll = getBalance(acc, withcust_id).equals(overtdraft[j]);
                if (bll == false) {
                    for (int i = 0; i < id.length; i++) {

                        if (acc == accN[i] && withcust_id == id[i]) { //get back

                            w_money = balnce.subtract(w_amt);
                            setUpdte(w_money);

                        } else {

                            w_money = balnce.subtract(w_amt);
                            setUpdte(w_money);
                            break;
                        }
                    }
                }

            }

            /*--------------------------------------------------------------------------------*/
        }

        return w_money;
    }

    public BigDecimal curr_deposit(BigDecimal amt2Deposit, int acc, int withcust_id){


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
