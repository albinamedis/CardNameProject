public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account account = new Account("Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        if (result) {
            System.out.println("На банковской карте можно напечатать данные владельца");
        } else {
            System.out.println("На банковской карте НЕЛЬЗЯ напечатать данные владельца");
        }
    }

}