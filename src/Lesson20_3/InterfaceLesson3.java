package Lesson20_3;

public class InterfaceLesson3 {
    public static void main(String[] args) {
        Seasons favSeason = Seasons.SUMMER;
        favSeason.favouriteSeason(favSeason);
        favSeason.whatASeason(favSeason);

        Seasons[] seasonArr = new Seasons[4];
        seasonArr[0] = Seasons.WINTER;
        seasonArr[1] = Seasons.SPRING;
        seasonArr[2] = Seasons.SUMMER;
        seasonArr[3] = Seasons.AUTUMN;

        favSeason.printAllSeasons(seasonArr);
    }
}
