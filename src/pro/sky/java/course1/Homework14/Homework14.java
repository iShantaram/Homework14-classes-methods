package pro.sky.java.course1.Homework14;
public class Homework14 {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", pushkin, 2010);

        Author heminguej = new Author("  Эрнест   ,    ?Хэмингуэй .");
        Book starikimore = new Book("Старрик и море", heminguej);

        System.out.println("Книга " + onegin.getName() + ", автор " + onegin.getAuthor() +
                ", год издания " + onegin.getYearOfPublishing());

        starikimore.setYearOfPublishing(2002);
        System.out.println(starikimore);
    }
}