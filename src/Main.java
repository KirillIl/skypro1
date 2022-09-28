public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        // Задание 1
        System.out.println("Задание 1");
        int age = 24;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!!! Теперь тебе " + age + " лет");
        } else {
            System.out.println("Твой возрвст совершенолетия не наступил, необходимо немного подождать :(");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу, так как ему " + age + " лет");
        } else if (age >= 18 && age < 24) {
            System.out.println("Закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Закончил университет, теперь можешь работать!");
        }
        //Задание 3
        System.out.println("Задание 3");
        int capacityOneWagon = 102;
        int seatPlace = 60;
        int standingPlace = capacityOneWagon - seatPlace;

        int seatPlaceUsed = 20;
        int standingPlaceUsed = 42;
        int totalSeatsUsed = seatPlaceUsed + standingPlaceUsed; // всего занятых мест

        if (seatPlaceUsed < seatPlace) {
            System.out.println("Осталось сидячих мест " + (seatPlace - seatPlaceUsed));
        }else{
            System.out.println( "Нет сидячих мест!");
        }
        if (standingPlaceUsed < standingPlace) {
            System.out.println("Осталось стоячих мест " + (standingPlace - standingPlaceUsed));

        }else {
            System.out.println("Нет стоячих мест!");
        }
    }
}

