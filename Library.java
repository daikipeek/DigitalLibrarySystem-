public class Library {
    private String libraryName;
    private String address;

    // Конструктор
    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
    }

    // Геттеры и сеттеры
    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) { this.libraryName = libraryName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Метод для вывода информации
    public void displayLibrary() {
        System.out.println("Библиотека: " + libraryName + ", Адрес: " + address);
    }
}
