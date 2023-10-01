public class Main {
    public static void main(String[] args) {
        SeasonContext winterContext = new SeasonContext(new Winter());
        SeasonContext springContext = new SeasonContext(new Spring());
        SeasonContext summerContext = new SeasonContext(new Summer());
        SeasonContext autumnContext = new SeasonContext(new Autumn());

        winterContext.displaySeason();
        springContext.displaySeason();
        summerContext.displaySeason();
        autumnContext.displaySeason();
    }
}





