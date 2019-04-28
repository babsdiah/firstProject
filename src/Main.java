public class Main {

    public static void main(String[] args) {
//System.out.println("Hello Mahmoud \nHello Elhadj");
        //String Name1 ="Samba";
        //String Name2 = "Demba";
        //String Name3 = "Alassane";
        //
        //System.out.println("Hello "+Name1+ " and "+Name2+ " and "+Name3 );

        Person person1 = new Person("Elhadj","Dia", 42);
        Person person2 = new Person("Mahmoud","Toure", 44);
        person1.affiche();
        person2.affiche();
        Person person3 = new Person("Samba","Diallo",32,false);
        Person person4 = new Person("ousmane", "Diop", 45, true);
        person3.status();
        person4.status();
        person1.status();
        person2.status();

    }
}
