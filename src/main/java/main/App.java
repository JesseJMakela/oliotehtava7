package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Tervetuloa Gifu-järjestelmään" );
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String käyttäjä = sc.nextLine();

        Gifu gifu = new Gifu();
        String a;
        boolean exit = false;
        
        while(!exit)
        {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            if (sc.hasNext()){
                int i = 0;
                String input = sc.nextLine();
                i = Integer.parseInt(input);
                switch (i) 
                {
                    case 1:
                    System.out.println("Anna kurssin nimi:");
                    String kurssi = sc.nextLine();
                    System.out.println("Anna kurssin ID:");
                    String kurssiID = sc.nextLine();
                    System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                    a = sc.nextLine();
                    int maksimiOppilaat = Integer.parseInt(a);
                    gifu.addCourse(kurssi, kurssiID, maksimiOppilaat);
                    break;

                    case 2:
                    System.out.println("Anna opiskelijan nimi:");
                    String nimi = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String opiskelijaNumero = sc.nextLine();
                    gifu.addStudent(nimi, opiskelijaNumero);

                    break;

                    case 3:
                    gifu.listCourses();
                    break;

                    case 4:
                    gifu.listStudents();
                    break;

                    case 5:
                    gifu.listCourses();
                    System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                    a = sc.nextLine();
                    int kurId = Integer.parseInt(a);
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                    a = sc.nextLine();
                    int opId = Integer.parseInt(a);
                    gifu.courses.get(kurId).addenrollment(gifu.students.get(opId));
                    break;

                    case 9:

                    gifu.listEnrolled();
                    
                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;

                    break;

                    default:
                    System.out.println("Syöte oli väärä");
                    break;
                }
            }
        }
    } 
}
