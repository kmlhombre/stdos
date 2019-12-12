package stdos.Interface;

import stdos.CPU.CPU;
import stdos.Processes.ProcessManager;
import stdos.Semaphore.JPmetody;
import stdos.Semaphore.semafor;
import stdos.VM.VirtualMemory;

class SwitchInput {

        static boolean exitFlag = false;

        static void inputSwitch(String komunikat) throws Exception {
            String[] arguments =  komunikat.split("\\s+"); //one or more space space after (splits)

            switch (arguments[0]) {
                /*pamięć RAM*/
                case "ram_hex":
                    VirtualMemory.displayRAM();
                    break;
                case "ram_part":
                    VirtualMemory.displayBinaryTree();
                    break;
                /*pamięć RAM*/

                /*pamięć wirtualna*/

                case "erasevm":
                    VirtualMemory.erase();
                    break;
                case "dvm":
                    VirtualMemory.display();
                    break;
                /*pamięć wirtualna*/

                /*semafor*/
//                case "semstate":
//                    JPmetody.JPwypisz(PLIK Plik); //String.valueOf(arguments[1])
//                    break;
//                case "queue":
//                    JPmetody.JPwypiszKolejke(PLIK Plik);
//                    break;
                /*semafor*/

                    /*zarządzanie procesami*/
                case "taskcreate":
                    ProcessManager.KM_CreateProcess(String.valueOf(arguments[1]), String.valueOf(arguments[2]), Integer.parseInt(arguments[3]));
                    break;
                case "kill":
                    ProcessManager.KM_TerminateProcess(String.valueOf(arguments[1]));
                    break;
                case "rtasklist":
                    ProcessManager.KM_getReadyProcessListPrint();
                    break;
                case "tasklist":
                    ProcessManager.KM_getAllProcessListPrint();
                    break;
                /*zarządzanie procesami*/

                /*procesor*/
                case "task_exec":
                    CPU.MM_show_running();
                    break;

                case "prior_tasklist" :
                    CPU.MM_show_actual_priority();
                    break;

                    /*procesor*/

                /*interpreter*/
                case "step":
                    CPU.MM_go();
                    break;
                    /* wyświetlaj krokowo*/

                    /*wyświetlenie aktualnych procesów */
                case "register":
                    ProcessManager.KM_printRunningRegisters();
                    break;

//
//                /*zarządzanie plikami i katalogami*/
//                case "mkfile": //file create
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_utwP(String.valueOf(arguments[1], Integer.parseInt(arguments[2]);
//                    break;
//                case "opnfile ":
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_pobP(String.valueOf(arguments[1]);
//                    break;
//                case "dir":
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_pokP();
//                    break;
//                case "erase":
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_usunP(arguments[1]);
//                    break;
//                case "mkdir":
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_utwK(String.valueOf(arguments[1]);
//                    break;
//                case "rmdir":
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_usunK(String.valueOf(arguments[1]);
//                    break;
//                case "move":
//                    ZARZADZANIE_PLIKAMI_I_KATALOGAMI.KP_pP(String.valueOf(arguments[1], Integer.parseInt(arguments[2]);
//                    break;
//                /*zarządzanie plikami i katalogami*/
//
//                /*funkcje interfejsu*/
                case "exit":
                    exitFlag = true;
                    break;
                case "help":
                    Help.help();
                    break;
                /*funkcje interfejsu*/

              default:
                    System.out.println("[Shell]: Niepoprawna komenda");
                    break;
            }

            System.out.println();
        }


}
