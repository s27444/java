public class Main {
    public static void main(String[] args) {
        TestAuthor.main(new String[0]);
    }

    public static class Author{
        private String name;
        private String surname;
        private int age;

        public Author(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public String getSurname(){
            return surname;
        }

        public int getAge(){
            return age;
        }

        public String setSurname(String newSurname){
            this.surname = newSurname;
            return newSurname;
        }

    }
    public static class TestAuthor{
        public static void main(String[] args) {
            Author author1 = new Author("Adrian", " " ,21);
            author1.setSurname("Kemski");

            System.out.println("Author Name: " + author1.getName()  + ", Surname: " + author1.getSurname() + ", age: " + author1.getAge());

        }
    }
}