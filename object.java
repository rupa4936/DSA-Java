class employe {
    int id;
    String name;

}

public class object {

    public static void main(String[] args) {

        employe herry = new employe();
        employe pooja = new employe();

        herry.id = 23;
        herry.name = "herry";

        pooja.id = 43;
        pooja.name = "pooja";

        System.out.println(" employee id is = " + herry.id);
        System.out.println(" employee name is = " + herry.name);
        System.out.println(" employee id is = " + pooja.id);
        System.out.println(" employee name is = " + pooja.name);

    }
}
