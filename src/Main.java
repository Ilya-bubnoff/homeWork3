public class Main {
    public static void main(String[] args) {
        int a = 5000;
        System.out.println("Значение переменной а с типом int равно " +a);
  byte b = 125;
        System.out.println("Значение переменной b с типом byte равно " +b);
 short c = -32300;
        System.out.println("Значение переменной c с типом short равно " +c);
 long d = 999999998;
        System.out.println("Значение переменной c с типом long равно " +d);
float e = 3.14f;
        System.out.println("Значение переменной e с типом float равно " +e);
double f = 31.5897;
        System.out.println("Значение переменной f с типом double равно " +f);
float cat = 27.12f;
long horse = 987678965549L;
double dog = 2.786;
short dolphin = 569;
char came = 569;
int pressure = -159;
short money = 27897;
byte cow = 67;
byte classA = 23;
byte classB = 27;
byte classD = 30;
int sheetsofPaper = 480;
int sheet = sheetsofPaper/(classA+classB+classD);
System.out.println("На каждого ученика расчитано " +sheet+ " листов бумаги");
byte bottles = 16;
byte time = 2;
int productivity1 = bottles/time;
int productivity20 = productivity1*20;
System.out.println("За 20 минут машина произвела "+productivity20+ " штук бутылок");
int productivityDay = productivity1*24*60;
        System.out.println("За сутки машина произвела "+productivityDay+ " штук бутылок");
int productivityDay_3 = productivity1*24*60*3;
        System.out.println("За трое сутк машина произвела "+productivityDay_3+ " штук бутылок");
long productivityMonth = productivity1*24*60*31;
        System.out.println("За месяц машина произвела "+productivityMonth+ " штук бутылок");

    }
}