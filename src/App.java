import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Holydays holydays = new Holydays();

        String date = scanDate();

        if (date.length() > 0) {
            System.out.println(verifyDate(date, holydays));
        } else {
            System.out.println(holydays.toString());
        }
        return;

    }

    private static String scanDate() {
        System.out.print("Digite a data deseja consultar ou tecle ENTER para ver a lista de todos os feriados: ");

        try (Scanner scan = new Scanner(System.in)) {
            String date = scan.nextLine();
            return date;
        }
    }

    private static String verifyDate(String date, Holydays holydays) {
        String holyday = holydays.getHolydays().get(date);
        if (holyday != null) {
            return holyday;
        }
        return "Não existe feriado com a data " + date;
    }

}
