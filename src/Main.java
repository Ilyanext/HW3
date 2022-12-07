public class Main {
    public static void main(String[] args) {
        //task1
        int age = 26;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " тебе больше 18");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " нужно немного подождать");
        }


        //task2
        int a = 2;
        if (a >= 5) {
        System.out.println("На улице " + a + " градусов.Сегодня тепло, можно идти без шапки");
        if (a < 5) {
            System.out.println("На улице холодно " + a + " градусов, нужно надеть шапку");
        }}

        //task3
        int speed = 77;
        if (speed >=60)
        { System.out.println ("Если скорость равна " +speed+ ", то придется заплатить штраф.");
            if (speed <60) {
                System.out.println("Если скорость равна "+speed+", то можно есздить спокойно");
            }}

        //task4
int men = 20;
        boolean hz = men <2;
        boolean sad = men >=2 && men <=6;
        boolean skool = men >=7 && men <=18;
        boolean university = men >=19 && men <=24;
        boolean work = men >24;
        if (sad) {
            System.out.println("Если возраст человека равен " + men + " , то ему нужно ходить в садик.");
        } if (hz) {
            System.out.println("Еще мал!");}
        if (skool) {
                System.out.println("Если возраст человека равен " + men + " , то ему нужно ходить в школу."  );}
        if (university) {
                    System.out.println("Если возраст человека равен " + men + " , то ему нужно ходить в университет."  );}
        if (work) { System.out.println("Если возраст человека равен " + men + " , то ему нужно ходить на работу.");}

//task5
       int child = 6;
        boolean attraktion = child<=5;
        boolean attraktionAndmen =child>5 && child<=14;
        boolean menStarshiy = true;
        boolean attraktionBigchild = child>14;

        if (attraktion) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему нельзя кататься на аттракционе.");}
        if (attraktionAndmen && menStarshiy) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе в сопровождении взрослого. ");}
        else if (menStarshiy = false) {
            System.out.println( "Без взрослого нельзя на аттракционы. ");}
        if (attraktionBigchild) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе без сопровождения.");}

//task6
        int vagon = 102;
        int sitDownmesto = 60;
        int numberPassahir = 414;
        if (numberPassahir < sitDownmesto) {
            System.out.println("В вагоне есть сидячие метса");
        } else if (numberPassahir>=sitDownmesto && numberPassahir<vagon) {
            System.out.println("В вагоне только стоячие места.");
        }else if (numberPassahir == vagon) {
            System.out.println("В Вагоне нет свободных мест!");
        } else if (numberPassahir>vagon) {
                System.out.println("Вместимость вагона только 102 человека");}
    //task7
        int one =1;
        int two =25;
        int three =3;

        if (one>two && one>three) {
            System.out.println("Первое число больше всех остальных."+one);
        } else if (three>one && three>two) {
            System.out.println("Третье число большее " + three);
        } else if (two>one && two>three) {
            System.out.println("Второе число большее " +two);}
    }}


