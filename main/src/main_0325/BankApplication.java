package main_0325;

import java.util.Scanner;


public class BankApplication {
    //static으로 선언한 이유 - main이 static이니 main에서 바로 사용할 수있도록
    private static Account[] accountsArray = new Account[100];
    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean run = true;
        while(run){
            System.out.println("-------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1){
                creatAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4){
                withdraw();
            } else if (selectNo == 5){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //계좌생성하기
    private static void creatAccount(){
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
        //생성자에 입력받은 ano, owner, balance가 들어간다. = > newAccount
        Account newAccount = new Account(ano,owner,balance);
        //accountsArray라는 빈 배열에 index마다 newAccount가 통째로 담긴다. [즉, 계좌정보가 담긴다는 것]
        for(int i =0; i <accountsArray.length; i++){
            if(accountsArray[i] == null){
                accountsArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다");
                break;
            }
        }
    }

    //계좌목록보기
    private static void accountList(){
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");
        //변수 account = accountArray에 있던 계좌  (대입)
        for(int i =0; i <accountsArray.length; i++){
         Account account = accountsArray[i];
            //account가 null이 아닐때 [즉 계좌가 있을때]
            //계좌정보를 print해준다.
             if(account != null){
             System.out.print(account.getAno());
             System.out.print("  ");
             System.out.print(account.getOwner());
             System.out.print("  ");
             System.out.print(account.getBalance());
             System.out.println();
         }
        }
    }
    //예금
    private static void deposit(){
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        //계좌번호 매개로받은 findAccount를 account변수에 대입
        Account account = findAccount(ano);
        //아래에서 찾은 값(동일한 계좌번호)가 없을때, 계좌가없습니다가 뜨고
        if(account == null){
            System.out.println("결과 : 계좌가없습니다");
            return;
        }
        // 동일한 계좌번호가 있을때에는 계좌금액인 Balance에 입금액을 더해 setBalance에 매개하여 저장한다.
        account.setBalance(account.getBalance()+money);
        System.out.println("결과: 입금이 성공되었습니다");
    }

    //ano라는 계좌번호를 매개로 받는 findAccount
    private static Account findAccount(String ano) {
        Account account = null;
        for(int i =0; i <accountsArray.length; i++){
            //배열에 계좌정보가 들어있을때,
            if(accountsArray[i] != null){
                //배열에있는 ano값을 dbAno에 대입해준다.
                String dbAno = accountsArray[i].getAno();
                //dbAno에 있는 ano가 매개로 받는 ano와 동일할때
                if(dbAno.equals(ano)){
                    //account라는 변수에 해당 인덱스를 대입한다.
                    account = accountsArray[i];
                    break;
                }
            }
        }
        return account;
    }
    
    //출금
    private static void withdraw(){
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        if(account == null){
            System.out.println("결과 : 계좌가없습니다");
            return;
        }
        //위와 전부 동일하고 이것은 출금이니 기존 금액에서 출금액을 빼준다.
        account.setBalance(account.getBalance()-money);
        System.out.println("결과: 입금이 성공되었습니다");
    }


}