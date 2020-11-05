public class Main {

    public static void main(String[] args) {
        //Засекаем время
        long start = System.currentTimeMillis();

        Service service = new Service();
        service.setURL("jdbc:postgresql://localhost:5432/postgres");
        service.setUserName("postgres");
        service.setPassword("value1234");
        service.setN((1000000));

        //указываем путь где будет созданы наши XML файлы
        service.setFilePath("D:\\");

        service.ApplicationRun();

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        //Вывод времени в милисекундах
        System.out.println(timeConsumedMillis);
    }
}