package Lesson20_3;

public enum Seasons {
    WINTER("Зима", -9),
    SPRING("Весна", 8),
    SUMMER("Лето", "Июнь, Июль, Август", 92, 20) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень", 5);

    private String nameOfSeason;
    private String namesOfMonth;
    private int amountOfDays;
    private int averageTemp;

    Seasons(String nameOfSeason, String namesOfMonth, int amountOfDays, int averageTemp) {
        this.nameOfSeason = nameOfSeason;
        this.namesOfMonth = namesOfMonth;
        this.amountOfDays = amountOfDays;
        this.averageTemp = averageTemp;
    }

    Seasons(String nameOfSeason, int averageTemp) {
        this.nameOfSeason = nameOfSeason;
        this.averageTemp = averageTemp;
    }

    Seasons() {
    }

    public String getNameOfSeason() {
        return nameOfSeason;
    }

    public String getNamesOfMonth() {
        return namesOfMonth;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    void favouriteSeason(Seasons favSeason) {
        System.out.println("Название месяцев: " + namesOfMonth);
        System.out.println("Количество дней: " + amountOfDays);
        System.out.println("Средняя температура: " + averageTemp);
        System.out.println();
    }

    void whatASeason(Seasons favSeason) {
        switch (favSeason) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
        System.out.println();
    }

    public String getDescription() {
        return "Холодное время года";
    }

    void printAllSeasons(Seasons[] seasonArr) {
        for (Seasons element : seasonArr) {
            System.out.println(element.nameOfSeason + ", средняя температура: " + element.averageTemp + ", " + element.getDescription());
        }
        System.out.println();
    }
}
