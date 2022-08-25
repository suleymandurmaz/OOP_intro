package day18;

public class Araba {
    //araba skobunun içinde oluşturulan nesnelere membership denir.
    String marka;// prıvate yapıldıgı zaman ulasmak
    //için public yöntemler geliştirilir yani get ve set
    int yas;
    double motorHacmi;



    void bilgileriGoster() {//göstertmek istediğimizde ayrı ayrı sout yazmayacagız.
        System.out.println(marka);
        System.out.println(motorHacmi);
        System.out.println(yas);

    }
}
