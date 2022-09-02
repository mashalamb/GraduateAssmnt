 package com.eviro.assessment.grad001.mahlatsemashala;

 import javax.swing.text.Position;
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
	// write your code here

        int accoN = 0;
        int cid = 0;
        BigDecimal amnt = new BigDecimal(0.0);
        BigDecimal a2w = new BigDecimal(0.0);
        BigDecimal a2d = new BigDecimal(0.0);


        SavingsAccount ss = new SavingsAccount();
        CurrentAccount cc = new CurrentAccount();
        Scanner ck = new Scanner(System.in);
        int inp = ck.nextInt();

        System.out.print("Please enter user account and -1 to exit : ");
        accoN = ck.nextInt();
        while (accoN != -1) {


            System.out.print("Please enter user id : ");
            cid = ck.nextInt();

            for (int i = 0; i < ss.id.length; i++) {

                if (accoN == ss.accN[i] && cid == ss.id[i]) {


                    System.out.println("1 -> To view balance for savings account :");
                    System.out.println("2 -> To with draw from savings account :");
                    System.out.println("3 -> To with deposit money for savings account :");
                    inp = ck.nextInt();

                    switch (inp){
                        case 1:

                            System.out.println("To view your account balance choose 1 for savings ans 2 for current. ");
                            int chss = ck.nextInt();
                            if (chss == 1) {
                                //ss.updateBal(ss.getUpdte(),accoN,cid);

                                System.out.println("Yor current balance is : "+ss.getBalance(accoN,cid));
                            } else if (chss == 2) {
                               // cc.updateBal(cc.getUpdte(), accoN, cid);

                                System.out.println("Yor current balance is : " + cc.getBalance(accoN, cid));
                            }
                            break;
                        case 2:
                            System.out.println("Is your account savings or current choose 1 for savings ans 2 for current. ");
                            int chs = ck.nextInt();
                            if (chs == 1) {
                                System.out.print("Please enter the amount you wish to with draw : ");
                                a2w = ck.nextBigDecimal();
                                ss.withdraw(a2w,accoN,cid);
                                ss.updateBal(ss.getUpdte(),accoN,cid);

                                System.out.println("Yor current balance is : "+ss.getBalance(accoN,cid));
                                //

                            } else if (chs == 2) {
                                System.out.print("Please enter the amount you wish to with draw : ");
                                a2w = ck.nextBigDecimal();
                                cc.curr_withdraw(a2w,accoN,cid);
                                cc.updateBal(cc.getUpdte(),accoN,cid);

                                System.out.println("Yor current balance is : "+cc.getBalance(accoN,cid));
                            }
                            break;
                        case 3:

                            System.out.print("Is your account savings or current choose 1 for savings ans 2 for current. :");
                            int chse = ck.nextInt();
                            if (chse == 1) {
                                System.out.print("Please enter the amount you wish to deposit : ");
                                a2d = ck.nextBigDecimal();
                                ss.deposit(a2d,accoN,cid);
                                ss.updateBal(ss.getUpdte(),accoN,cid);
                                System.out.println("Yor current balance is : "+ss.getBalance(accoN,cid));

                                System.out.println(a2d + " "+ accoN+" "+cid);
                            } else if (chse == 2) {
                                System.out.print("Please enter the amount you wish to deposit : ");
                                a2d = ck.nextBigDecimal();
                                cc.curr_deposit(a2d,accoN,cid);
                                cc.updateBal(cc.getUpdte(),accoN,cid);
                                System.out.println("Yor current balance is : "+cc.getBalance(accoN,cid));

                                System.out.println(a2d + " "+ accoN+" "+cid);
                            }
                            break;
            /*case 4:
                ss.setBalance(accoN,cid);
                System.out.println(ss.getBalance(accoN,cid));
                break;
            case 5:
                System.out.println("Please enter the amount you wish to with draw : ");
                a2w = ck.nextBigDecimal();
                ss.withdraw(a2w,accoN,cid);
                break;
            case 6:
                ss.deposit(a2d,accoN,cid);
                break;*/
                    }

                    /*

                    //System.out.print("Choose account type 1 for Savings and  2 Current : ");
                    //inp = ck.nextInt();

                    System.out.println("1 -> To view balance for savings account :");
                    System.out.println("2 -> To with draw from savings account :");
                    System.out.println("3 -> To with deposit money for savings account :");

                    System.out.println("4 -> To view balance money for current account :");
                    System.out.println("5 -> To with draw for current account :");
                    System.out.println("6 -> To with draw money for current account :");
                    inp = ck.nextInt();*/

                }

            }
            System.out.print("Please enter user account and -1 to exit : ");
            accoN = ck.nextInt();
        }

    }
}


    /*System.out.println("To view your account balance choose 1 for savings ans 2 for current. ");
            int chss = ck.nextInt();
            if (chss == 1) {
            ss.updateBal(ss.getUpdte(),accoN,cid);

            System.out.println("Yor current balance is : "+ss.getBalance(accoN,cid));
            } else if (chss == 2) {
            cc.updateBal(cc.getUpdte(),accoN,cid);

            System.out.println("Yor current balance is : "+cc.getBalance(accoN,cid));
                            /*ss.setBalance(accoN,cid);
                            cc.updateBal(cc.getUpdte(),accoN,cid);
                            cc.updateBal(cc.getUpdte(),accoN,cid);
                            System.out.println(ss.getBalance(accoN,cid));*/