import java.util.Scanner;

public class Employee {
  String name ; 
  Double salary ;
  Double workHours;
  Double hireYear;

  public static void main(String[] args) {
    Scanner konsolVeri = new Scanner(System.in);
    System.out.println("isim giriniz=? ");
    String name = konsolVeri.next();
    System.out.println("maaşı giriniz=? ");
    Double salary = konsolVeri.nextDouble();
    System.out.println("Haftalık çalışma saatini giriniz=? ");
    int workHours = konsolVeri.nextInt();
    System.out.println("İşe giriş yılınızı giriniz=? ");
    int hireYear = konsolVeri.nextInt();
    System.out.println("\nAdı :"  + " " + name);
    System.out.println("Maaşı :"  + " " + salary +" "+"TL");
    System.out.println("Çalışma Saati :"  + " " + workHours +" "+ "saat");
    System.out.println("Başlangıç Yılı :"  + " " + hireYear);
    tax(salary);
    System.out.println("Vergi= "+ " " + tax(salary)+" "+ "TL");
    //Double vergiMiktarı = vergi;
    //Double vergi;
    //System.out.println("deneme :"  + " " + vergi);
    bonus(workHours);
    System.out.println("Bonus=" +" "+ bonus(workHours) +" "+ "TL");
    raiseSalary(hireYear,salary);
    System.out.println("Maaş Artışı=" +" "+ raiseSalary(hireYear,salary) +" "+ "TL");
    Double ekliMaas = salary + bonus(workHours) - tax(salary);
    System.out.println("Vergi ve Bonuslar ile Birlikte Maaş :"  + " " + ekliMaas+" "+ "TL");
    Double toplamMaas = ekliMaas + raiseSalary(hireYear,salary);
    System.out.println("Toplam Maaş :"  + " " + toplamMaas+" "+ "TL");
    
    
    //System.out.println("Vergi= "+ tax()+ "TL");
    //System.out.println("bonus=" + bonus() + "TL");
    //System.out.println("bonus=" + bonus + "TL");
    
  
    //System.out.println("main" + hireYear);

    
  
  }



  public static double tax(Double salary){
    Scanner konsolVeri = new Scanner(System.in);
    //System.out.println("maaşı giriniz=? ");
    //Double salary = konsolVeri.nextDouble();
    if (salary>=1000){
    Double vergi = salary*0.03;
    //System.out.println("Vergi= "+ " " + vergi+ "TL");
    return vergi;
    
    }
    else{
    double vergi = 0.0;
    //System.out.println("Vergi= "+ " " + vergi+ "TL");
    return vergi;  
    }
    
  }
  public static double bonus(int workHours){
    //Scanner konsolVeri = new Scanner(System.in);
    //System.out.println("Haftalık çalışma saatini giriniz=? ");
    //Double workHours = konsolVeri.nextDouble();
    if(workHours>40){

      double bonus= (workHours-40)*30;
      //System.out.println("bonus=" + bonus + "TL");
      return bonus;
    }
    else {
      double bonus = 0;
      //System.out.println("bonus=" + bonus + "TL");
      return bonus;
    }
    
    
  }

  public static double raiseSalary(int hireYear,Double salary){
    //Scanner konsolVeri = new Scanner(System.in);
    //System.out.println("İşe giriş yılınızı giriniz=? ");
    //Double hireYear = konsolVeri.nextDouble();
    if((2021-hireYear)<=9){
      Double maasArtisi= salary*0.05;
      //System.out.println("Maaş Artışı=" + maasArtisi + "TL");
      return maasArtisi;
    }
      if ((2021-hireYear)>19){
      Double maasArtisi= salary*0.15;
      //System.out.println("Maaş Artışı=" + maasArtisi + "TL");
      return maasArtisi;
        
      }
      else if(9<(2021-hireYear) && (2021-hireYear)<20) {
      Double maasArtisi = salary*0.10;
      //System.out.println("Maaş Artışı=" + maasArtisi + "TL");
      return maasArtisi;
    }

  
  return 0.0;
  }

}