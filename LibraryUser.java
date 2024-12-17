public class LibraryUser {
    private String name;
    private int userId;

    // Конструктор
    public LibraryUser(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    // Метод для вывода информации
    public void displayUser() {
        System.out.println("Пользователь: " + name + ", ID: " + userId);
    }
}
