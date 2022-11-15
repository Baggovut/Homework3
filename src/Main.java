import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        //Task 1
        Task1 t1 = new Task1();
        for(Field f1 : t1.getClass().getFields()){
            System.out.println("Значение переменной "+f1.getName()+" с типом "+f1.getGenericType()+" равно "+f1.get(t1));
        }

        //Task 2
        float one = 27.12f;
        long two = 987678965549L;
        byte three = 2;
        short four = 786;
        boolean five = false;
        short six = 569;
        short seven = -159;
        short eight = 27897;
        double nine = 67.;

        //Task 3
        short sheetAmount = 480;
        byte class1Pupils = 23;
        byte class2Pupils = 27;
        byte class3Pupils = 30;
        System.out.println("\nНа каждого ученика рассчитано "+(sheetAmount/(class1Pupils+class2Pupils+class3Pupils))+" листов бумаги\n");

        //Task 4
        byte performancePerMin = 8;
        short minutesPerDay = 1440;
        short minutesPer3Days = 1440*3;
        int minutesPerMonth = 1440*31;

        System.out.println("За 20 минут машины произвела бутылок "+(performancePerMin*20)+ " штук");
        System.out.println("За сутки машины произвела бутылок "+(performancePerMin*minutesPerDay)+ " штук");
        System.out.println("За трое суток машины произвела бутылок "+(performancePerMin*minutesPer3Days)+ " штук");
        System.out.println("За месяц машины произвела бутылок "+(performancePerMin*minutesPerMonth)+ " штук");

        //Task 5
        byte totalAmountOfJars = 120;
        byte classrooms = (byte) (totalAmountOfJars/(2+4));
        int whiteJars = classrooms*2;
        int brownJars = classrooms*4;

        System.out.println("\nВ школе, где "+classrooms+" классов, нужно "+whiteJars+" банок белой краски и "+brownJars+" банок коричневой краски");

        //Task 6
        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;

        int breakfastWeight = 5*bananasWeight+2*milkWeight+2*iceCreamWeight+4*eggsWeight;

        System.out.println("\nВес спорт завтрака: "+breakfastWeight+" грамм.\n");

        //Task 7
        int excessWeight = 7000, firstDiet = 250, secondDiet = 500;
        System.out.println("На похудение уйдёт "+(excessWeight/firstDiet)+" дней, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println("На похудение уйдёт "+(excessWeight/secondDiet)+" дней, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println("В среднем может потребоваться "+(((excessWeight/firstDiet)+(excessWeight/secondDiet))/2)+" дней для похудения.\n");

        //Task 8
        int firstEmployeeSalary = 67760, secondEmployeeSalary = 83690, thirdEmployeeSalary = 76230;
        System.out.println("Маша теперь получает "
                +(firstEmployeeSalary+firstEmployeeSalary/10)+" рублей. Годовой доход вырос на "
                +(firstEmployeeSalary/10*12)+" рублей");
        System.out.println("Денис теперь получает "
                +(secondEmployeeSalary+secondEmployeeSalary/10)+" рублей. Годовой доход вырос на "
                +(secondEmployeeSalary/10*12)+" рублей");
        System.out.println("Кристина теперь получает "
                +(thirdEmployeeSalary+thirdEmployeeSalary/10)+" рублей. Годовой доход вырос на "
                +(thirdEmployeeSalary/10*12)+" рублей");
    }
}