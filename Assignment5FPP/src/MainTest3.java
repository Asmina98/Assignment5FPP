public class MainTest3 {
    public static void main(String[] args) {
        Figure[] fig = new Figure[]{
                new UpwardHat(),
                new UpwardHat(),
                new DownWardHat(),
                new FaceMaker(),
                new Vertical()
        };
        printFigures(fig);

        System.out.println("**********************************************");

        printFiguresWithClassName(fig);

    }
    public static void printFigures(Figure[] fig) {
        for (Figure f: fig) {
            f.getFigure();
        }
        System.out.println();
    }
    public static void printFiguresWithClassName(Figure[] fig) {
        for (Figure f : fig) {
            System.out.print(fig.getClass().getSimpleName() + ": ");
            f.getFigure();
            System.out.println();
        }
    }
}
