import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Vehicle scooty = new Vehicle("UP65M2341","6G","2wheeler",100000);
       Vehicle auto = new Vehicle("UP65M2342","ev-auto","3wheeler",160000);
       Vehicle scorpio = new Vehicle("UP65M2343","s6","4wheeler",1500000);
       
       System.out.println(scooty.issueLoan());
       System.out.println(scooty.takeInsurance());
       
       System.out.println(auto.issueLoan());
       System.out.println(auto.takeInsurance());
       
       System.out.println(scorpio.issueLoan());
       System.out.println(scorpio.takeInsurance());
    }
}
