import java.util.Scanner;

public class Kdv {
    public static void main(String[] args){

        double tutar,KdvOranı=0.18,KdvliTutar,Kdvsi;
        Boolean kdvDurumu;


        Scanner input=new Scanner(System.in);
        System.out.print("Bir tutar giriniz:");
        tutar=input.nextDouble();

        kdvDurumu=(0<tutar)&&(1000>tutar);
        KdvOranı=kdvDurumu?0.18:0.08;


        Kdvsi=tutar*KdvOranı;
        KdvliTutar=tutar+Kdvsi;

        System.out.println("Kdv Orani:"+KdvOranı);
        System.out.println("Kdv'si:"+Kdvsi);
        System.out.println("Kdv'li Tutar:"+KdvliTutar);









    }



}
