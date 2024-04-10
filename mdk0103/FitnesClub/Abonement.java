package FitnesClub;

import java.time.LocalDate;

class Abonement {
    private LocalDate registrationDate;
    private LocalDate expirationDate;
    private String firstName;
    private String lastName;
    private int birthYear;
    private AbonementType type;

    public Abonement(LocalDate registrationDate, LocalDate expirationDate, String firstName, String lastName, int birthYear, AbonementType type) {
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.type = type;
    }

    public Abonement() {

    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public boolean isAccessAllowed(Area area, LocalDate currentDate) {
        if (this.expirationDate.isBefore(currentDate)) {
            return false;
        }
////        switch (this.type) {
////            case SINGLE ->
////                break;
////            case DAYTIME ->
////                break;
////            case FULL ->
////                break;
//        }
        return true; // Заглушка для примера, замените на реальную логику
    }

    public AbonementType getType() {

        return null;
    }
}
