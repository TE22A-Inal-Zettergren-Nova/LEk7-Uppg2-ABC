public class App {
    public static void main(String[] args) throws Exception {

        /* Uppgift a*/
        /* Koden funkade inte för att stortTal variabeln inte är utanför if satsen*/
        /*Flyttar stortal så att den är utanför if satsen*/

        int litetTal=10;
        int stortTal=1000;
        if(litetTal<1000)
        {
           
            System.out.println(litetTal +" är mindre än "+stortTal);
        }
        else
        {
            System.out.println(litetTal+" är mindre än "+stortTal);
        }
            System.out.println("litetTal= "+litetTal+",stortTal= "+stortTal);


        /*Uppgift b */
        int tal1=10;
        int tal2=20;

        if(tal2>tal1){
            System.out.println(tal2+" är större än "+tal1);
        }
        else{
            System.out.println(tal2+" är midnre än "+tal1);
        }

    }
}

       