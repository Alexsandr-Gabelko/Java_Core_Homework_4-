import data.Buyer;
import data.Gender;
import data.Holidays;

import java.time.LocalDate;

public interface Congratulations {
    public static void сongratulations(Buyer[] buyers){
          LocalDate today = LocalDate.now();
        // LocalDate today = LocalDate.of(2024, 3, 8);
        // LocalDate today = LocalDate.of(2024, 2, 23);
        // LocalDate today = LocalDate.of(2025, 1, 1);
        for (Buyer buyer : buyers){
            if (buyer.getGender() == Gender.MALE &&
            today.getMonthValue() == 2 && today.getDayOfMonth() == 23) {
                // Получаем полное имя покупателя
                String fullName = buyer.getName();
                // Разбиваем строку на слова
                String[] words = fullName.split(" ");
                //Первые три слова
                String firstThreeWords = String.join(" ",
                        words.length > 0 ? words[0] : "",
                        words.length > 1 ? words[1] : "",
                        words.length > 2 ? words[2] : "");
                System.out.printf("%s поздравляем с 23 февраля!%n", firstThreeWords);
            }
            else if (buyer.getGender() == Gender.FEMALE &&
                today.getMonthValue() == 3 && today.getDayOfMonth() == 8) {
                String fullName = buyer.getName();
                String[] words = fullName.split(" ");
                String firstThreeWords = String.join(" ",
                        words.length > 0 ? words[0] : "",
                        words.length > 1 ? words[1] : "",
                        words.length > 2 ? words[2] : "");
                System.out.printf("%s поздравляем с 8 марта!%n", firstThreeWords);
            }
            else if (today.getMonthValue() == 1 && today.getDayOfMonth() == 1) {
                String fullName = buyer.getName();
                String[] words = fullName.split(" ");
                String firstThreeWords = String.join(" ",
                        words.length > 0 ? words[0] : "",
                        words.length > 1 ? words[1] : "",
                        words.length > 2 ? words[2] : "");
                System.out.printf("%s поздравляем с Новым годом!%n", firstThreeWords);
            }
            else {System.out.println(Holidays.NO_HOLIDAY);
            break;
            }
        }

    }
}
