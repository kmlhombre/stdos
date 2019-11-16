import java.util.Random;

class Help {
    static void help() {
        /* pamięc ram*/
        //nie korzysta z żadnego innego modułu*/

        System.out.println("     ram_disp_hex                     - wypisuje zawartość ramu w zapisie heksadecymalnym");
        System.out.println("     ram_disp_part                    - wypisuje podzial pamieci ram");
        /* pamięc ram*/

        /* pamięc wirtualna*/
        //korzysta z pamięci fizycznej i operacyjnej

        System.out.println("     vm_ret nazwa_procesu             - zwraca instrukcje dla procesu z pamięci operacyjnej lub fizycznej");
        System.out.println("     vm_erase                         - czysci segmenty pamieci wirtualnej");
        System.out.println("     vm_disp                          - wyswietla aktualna zawartosc pamieci wirtualnej");
        /* pamięc wirtualna*/

        /* semafor*/
        System.out.println("  semafor_disp                        - wyswietla obecny stan semafora");
        /* semafor*/

        /* zarządzanie procesami semafor, pamiec ram, pamiec wirtualna*/
        System.out.println("  cp nazwa_pliku priorytet            - tworzenie procesu");
        System.out.println("  kill nazwa procesu                  - zakonczenie dzialania danego procesu");
        System.out.println("  pr_disp                             - wyswietla liste wszystkich procesow");

        /* zarządzanie procesami*/


        /* procesor  korzysta z zarzadzania procesami*/
        System.out.println("  pr_disp_executing                   - wyswietla wykonywany proces");
        System.out.println("  pr_disp_rdy                         - wyswietla listę gotowych procesow i ich chwilowy priorytet");
        /* procesor*/

    }
//    private static int getRandomToTest(int min, int max) {
//        return  new Random().nextInt((max - min) + 1) + min;
//    }
}
