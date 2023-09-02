import static javax.management.Query.and;

public class Account {

    private final String name;
    private int spaceCount = 0;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int str = name.length();
        // проверка длины строки
        if (str >= 3 && str <= 19) {
            // проверка что нет пробела в начале и конце строки
            if (name.charAt(0) != ' ' && name.charAt(str - 1) != ' ') {
                // подсчет количества пробелов в строке
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == ' ') {
                        spaceCount++;}
                    }
                if (spaceCount == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}