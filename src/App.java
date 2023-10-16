public class App {
    public static void main(String[] args) throws Exception {

        /* Uppgift a*/
        System.out.println("Koden funkade inte för att stortTal variabeln inte är utanför if statementet");

        int litetTal=10;
        if(litetTal<1000)
        {
            int stortTal=1000;
            System.out.println(litetTal +"är mindre än"+stortTal);
        }
        else
        {
            System.out.println(litetTal+"är mindre än"+stortTal);
        }
            System.out.println("litetTal="+litetTal+",stortTal="+stortTal);

    }
}
