public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;

    public Person (String fName, String lName, int age) {

        firstName=fName;
        lastName=lName;
        this.age=age;

    }
    public Person (String fName, String lName, int age, boolean married)
    {

        firstName=fName;
        lastName=lName;
        this.age=age;
        this.isMarried=married;

    }
    public void affiche ()
    {
        System.out.println(firstName+ " "+ lastName+ " "+ this.age);
    }

    public void status ()
    {
        System.out.println(firstName+ " "+ lastName+ " marriage status: "+ this.isMarried);
    }


}
