package Alpins;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;
// Класс Группа для восхождения на гору
class ClimbingGroup {
    private boolean openForRecruitment;
    private List<Climber> climbers;
    private Mountain mountain;

    public ClimbingGroup(Mountain mountain) {
        this.openForRecruitment = true;
        this.climbers = new ArrayList<>();
        this.mountain = mountain;
    }

    public void addClimber(Climber climber) {
        if (openForRecruitment) {
            climbers.add(climber);
            System.out.println("Альпинист " + climber.toString() + " добавлен в группу.");
        } else {
            System.out.println("Набор в группу закрыт.");
        }
    }

    // Другие методы (по желанию)

    @Override
    public String toString() {
        return "ClimbingGroup{" +
                "openForRecruitment=" + openForRecruitment +
                ", climbers=" + climbers +
                ", mountain=" + mountain +
                '}';
    }
}
