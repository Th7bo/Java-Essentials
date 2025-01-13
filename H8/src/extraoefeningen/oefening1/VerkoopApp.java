package extraoefeningen.oefening1;

import java.time.LocalDate;

public class VerkoopApp {

    public static void main(String[] args) {
        TeVerkopenBouwGrond bouwGrond = new TeVerkopenBouwGrond("12ER", 12.40, "Open Bebouwing");
        bouwGrond.wijsEenNotarisToe("Dirk Peeters", LocalDate.of(2022, 12, 7));
        bouwGrond.doeEenBod(150000, LocalDate.of(2022, 12, 23));
        System.out.println();
        bouwGrond.doeEenBod(175000, LocalDate.of(2023, 1, 4));
    }

}
