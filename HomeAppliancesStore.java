public class HomeAppliancesStore {

    public static String name;
    public static String address;
    public static int employee;

    public static int count = 0;

    public void setName(String name){
            this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmployee(int employee){
        this.employee = employee;
    }
    public Integer getEmployee(){
        return employee;
    }

    public static void main(String[] args){



        Fridge psigio = new Fridge(45,234,34,674,"manolis","psigioOLE","PagoniToPagoni",253,true,true,true, true);
        WashineMachine plintirio = new WashineMachine(105,65,845,455,"Maria","Plintirioulis", "AAA+", 455,48,true, false, 6);
        Oven fournos = new Oven(154,45, 455,488,"Dafnh", "two","Psisimatos","matia","AAA","black",true, 456.5 );
        AirCondition ac = new AirCondition(45,58,48,488,"Hlias", "daa", "AAA", true, false, true, 2000, 5000);

        /*tiponi name address kai ergazomenous*/
        HomeAppliancesStore a = new HomeAppliancesStore();
        a.setName(args[0]);
        a.setAddress(args[1]);
        a.setEmployee(Integer.parseInt(args[2]));
        System.out.println("\n\n\n\nName=" + name + "\tAddress=" + address + "\tEmployee=" + employee);



        /*psigio vasika_xaraktiristika*/
        System.out.println("\n\n||PSIGIO||");
        System.out.println("To ipsos einai:" + psigio.getIpsos() + "cm");
        System.out.println("To mikos einai:" + psigio.getMikos() + "cm");
        System.out.println("To vathos einai:" + psigio.getVathos() + "cm");
        System.out.println("To onoma tou kataskevasti einai:" + psigio.getOnomaKataskevasti());
        System.out.println("To onoma tis siskevis einai:" + psigio.getOnomaSiskevis());
        System.out.println("O tipos tis siskevis einai:" + psigio.getTiposSiskevis());
        System.out.println("H katanalosi energias einai:" + psigio.getKatanalosiEnergias() + "kWh/y");
        /*psigio idika_xaraktiristika*/
        System.out.println("NoFrost:" + psigio.isNoFrost());
        System.out.println("Entihizomeno:" + psigio.isEntihizomeno());
        System.out.println("Ejodos gia pagakia:" + psigio.isEjodosGiaPagakia());
        System.out.println("WiFi:" + psigio.isWiFi());
        System.out.println("H sinoliki horitikotita einai:" + psigio.getSinolikiHoritikotita() + "lt");


        /*plintirio vasika_xaraktiristika*/
        System.out.println("\n\n||PLINTIRIO||");
        System.out.println("To ipsos einai:"+ plintirio .getIpsos() +"cm");
        System.out.println("To mikos einai:"+ plintirio.getMikos() +"cm");
        System.out.println("To vathos einai:"+plintirio.getVathos()+"cm");
        System.out.println("To onoma tou kataskevasti einai:"+plintirio.getOnomaKataskevasti());
        System.out.println("To onoma tis siskevis einai:"+plintirio.getOnomaSiskevis());
        System.out.println("O tipos tis siskevis einai:"+plintirio.getOnomaSiskevis());
        System.out.println("H katanalosi energias einai:"+ plintirio.getKatanalosiEnergias()+"kWh/y");
        /*plintirio idika_xaraktiristika*/
        System.out.println("H sinoliki horitikotita einai:" +plintirio.getSinolikiHoritikotita()+"kg");
        System.out.println("I katanalosi nerou einai:"+ plintirio.getKatanalosiNerou()+"lt/year");
        System.out.println("Psifiaki othoni:"+plintirio.isPsifiakiOthoni());
        System.out.println("WiFi:"+ plintirio.isWiFi());
        System.out.println("Arithmos programmaton:"+ plintirio.getArithmosProgrammaton());

        /*fournos vasika_xaraktiristika*/
        System.out.println("\n\n||FOURNOS||");
        System.out.println("To ipsos einai:"+fournos.getIpsos()+"cm");
        System.out.println("To mikos einai:"+fournos.getMikos()+"cm");
        System.out.println("To vathos einai:"+fournos.getVathos()+"cm");
        System.out.println("To onoma tou kataskevasti einai:"+fournos.getOnomaKataskevasti());
        System.out.println("To onoma tis siskevis einai:"+fournos.getOnomaSiskevis());
        System.out.println("I energiaki klasi einai:"+fournos.getTiposSiskevis());
        System.out.println("H katanalosi energias einai:"+ fournos.getKatanalosiEnergias()+"kWh/y");
        /*fournos idika_xaraktiristika*/
        System.out.println("H sinoliki horitikotita einai:" +fournos.getSinolikiHoritikotita()+"lt");
        System.out.println("O tipos estias einai:"+fournos.getTiposEstias());
        System.out.println("Psifiaki othoni:"+fournos.isPsifiakiOthoni());
        System.out.println("To hroma einai:"+ fournos.getHroma());
        System.out.println("O tipos fournou einai:"+ fournos.getTiposFornou());


        /*ac vasika_xaraktiristika*/
        System.out.println("\n\n||AIR_CONDITION||");
        System.out.println("To ipsos einai:"+ac.getIpsos()+"cm");
        System.out.println("To mikos einai:"+ac.getMikos()+"cm");
        System.out.println("To vathos einai:"+ac.getVathos()+"cm");
        System.out.println("To onoma tou kataskevasti einai:"+ac.getOnomaKataskevasti());
        System.out.println("To onoma tis siskevis einai:"+ac.getOnomaSiskevis());
        System.out.println("O tipos tis siskevis einai:"+ac.getTiposSiskevis());
        System.out.println("H katanalosi energias einai:"+ ac.getKatanalosiEnergias()+"kWh/y");
        /*ac idika_xaraktiristika*/
        System.out.println("WiFi:"+ ac.isWiFi());
        System.out.println("Ionistis:"+ ac.isIonistis());
        System.out.println("Filtro aera:"+ ac.isFiltroAera());
        System.out.println("Ishi psijis:"+ac.getIshiPsijis()+"BTU");
        System.out.println("Ishi thermansis:"+ ac.getIshiThermansis() +"BTU");


        /*tiponi to plithos ton siskevon*/
        int count =  Fridge.CountObjectF + WashineMachine.CountObjectW + Oven.CountObjectO + AirCondition.CountObjectAC;
        System.out.println("\n\n>>>>> plithos_siskevon = " + count +" <<<<<"+'\n');

    }
}
