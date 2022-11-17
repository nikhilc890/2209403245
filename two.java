import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
class bank{
 int accno=5001;
 int bal;
bank(int accno,int bal){
    this.accno=accno;
    this.bal=bal;
}
void deposit(int a){
     bal=bal+a;
    //  System.out.println("balance ++" + bal);    

}
void withdraw(int b){
    if(b<bal){
        bal=b-bal;
        System.out.println("done");
    } 
    else{ 
   
    System.out.println("eroor");
    }

}

void show(){
    System.out.println("ACC_NO "+" "+ accno);

    System.out.println("balance is "+"  "+bal);
   

}

}
public class two {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        bank b1=new bank(50,5000);
        System.out.println("gareeb bank");
        char operation;
        System.out.println("gareeb bannk \nselect operation \n1 deposit  \n2 withdraw");
        operation=input.next().charAt(0);




        switch(operation){
            case '1':
            System.out.println("deposit");
            int d=input.nextInt();
            b1.deposit(d);
            break;
            case '2':
            System.out.println("withdraw if u want or blank");
            int x=input.nextInt();
            b1.withdraw(x);
            break;

        }
        b1.show();


      
    
        // System.out.println("deposit");
        // int d=input.nextInt();
        // System.out.println("withdraw if u want or blank");
        // int x=input.nextInt();
        // // b1.deposit(d);
        // b1.withdraw(x);
       
       
    }
    
}
