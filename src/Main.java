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
byte classes = 120/(4+2);
int whitePaint = classes*2;
int brownPaint =classes*4;
System.out.println("В школе,где "+classes+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");
short bananas = 80*5;
short milk = 105*2;
short icecreamSundae = 2*100;
short rawEggs = 4*70;
float sportsBreakfast = bananas+milk+icecreamSundae+rawEggs;
float sportsBreakfast_kg = sportsBreakfast/1000;
System.out.println("Вес спортзавтрака в граммах "+sportsBreakfast+", в киллограммах "+sportsBreakfast_kg);
int kg_g = 7*1000;
int planOne = kg_g/250;
int planTwo = kg_g/500;
System.out.println(+planOne+" дней потребуется, если спортсмен будет худеть по 250 грамм ежедневно и "+planTwo+" дней если по 500 грамм ежедневно.");
float percentMashca = 67760*0.10f+67760;
float percentDenis = 83690*0.10f+83690;
float percentKristina = 76230*0.10f+76230;
float annualincomeMashca = percentMashca*12;
float annualincomeDenis = percentDenis*12;
float annualincomeKristina = percentKristina*12;
float differenceMashca = annualincomeMashca-67760*12;
float differenceDenis = annualincomeDenis-83690*12;
float differenceKristina = annualincomeKristina-76230*12;
        System.out.println("  Маша теперь получает "+percentMashca+" рублей. Годовой доход вырос на "+differenceMashca+" рублей.");
        System.out.println("  Денис теперь получает "+percentDenis+" рублей. Годовой доход вырос на "+differenceDenis+" рублей.");
        System.out.println("  Кристина теперь получает "+percentKristina+" рублей. Годовой доход вырос на "+differenceKristina+" рублей.");




    }
}