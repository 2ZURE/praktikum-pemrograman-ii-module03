package module03.problem02;

import java.util.HashMap;

public class Country {
    private String countryName;
    private String leadershipType;
    private String leaderName;
    private int independenceDate;
    private int independenceMonth;
    private int independenceYear;

    public Country(String countryName, String leadershipType, String leaderName,
                   int independenceDate, int independenceMonth, int independenceYear) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String countryName, String leadershipType, String leaderName) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public void printInfo() {
        HashMap<Integer, String> monthNames = new HashMap<>();
        monthNames.put(1, "Januari");
        monthNames.put(2, "Februari");
        monthNames.put(3, "Maret");
        monthNames.put(4, "April");
        monthNames.put(5, "Mei");
        monthNames.put(6, "Juni");
        monthNames.put(7, "Juli");
        monthNames.put(8, "Agustus");
        monthNames.put(9, "September");
        monthNames.put(10, "Oktober");
        monthNames.put(11, "November");
        monthNames.put(12, "Desember");

        String leaderTitle = switch (this.leadershipType.toLowerCase()) {
            case "monarki" -> "Raja";
            case "presiden" -> "Presiden";
            case "perdana menteri" -> "Perdana Menteri";
            default -> this.leadershipType;
        };

        System.out.println("Negara " + this.countryName
                + " mempunyai " + leaderTitle
                + " bernama " + this.leaderName
        );

        if (!this.leadershipType.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                    + this.independenceDate + " "
                    + monthNames.get(independenceMonth) + " "
                    + this.independenceYear
            );
        }
    }
}