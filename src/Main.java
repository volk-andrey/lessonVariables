public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Task 2
        dog = dog * 4;
        cat = cat * 4;
        paper = paper * 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Task 4
        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);
        //Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Task 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var generalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(generalBoxerWeight);
        var differenceBoxWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceBoxWeight);
        //Task 7
        System.out.println(secondBoxerWeight % firstBoxerWeight);
        //Task 8
        var totalWorkHours = 640;
        var oneWorkerHours = 8;
        var wokersNumber = totalWorkHours / oneWorkerHours;
        System.out.println("Всего работников в компании - " + wokersNumber + " человек");
        //Task 8.2
        wokersNumber = wokersNumber + 94;
        totalWorkHours = wokersNumber * oneWorkerHours;
        System.out.println("Если в компании работает " + wokersNumber + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками");

    }
}