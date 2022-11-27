public class WashineMachine {

    public static int CountObjectW;
    private  static double ipsos;
    private double mikos, vathos, KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private double SinolikiHoritikotita, KatanalosiNerou;
    private boolean PsifiakiOthoni, WiFi;
    private int ArithmosProgrammaton;


    public String toString(){
        return ipsos + mikos + vathos + KatanalosiEnergias + OnomaKataskevasti + OnomaSiskevis + TiposSiskevis + KatanalosiEnergias +
                SinolikiHoritikotita + KatanalosiNerou + PsifiakiOthoni + WiFi + ArithmosProgrammaton + CountObjectW;
    }

    /*dehete times gia oles tis metavlites tis klasis*/
    public WashineMachine(double ipsos, double mikos, double vathos, double KatanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, double sinolikiHoritikotita, double katanalosiNerou, boolean psifiakiOthoni, boolean wiFi, int arithmosProgrammaton) {
        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = KatanalosiEnergias;
        this.SinolikiHoritikotita = sinolikiHoritikotita;
        this.KatanalosiNerou = katanalosiNerou;
        this.PsifiakiOthoni = psifiakiOthoni;
        this.WiFi = wiFi;
        this.ArithmosProgrammaton = arithmosProgrammaton;
        CountObjectW++;
    }



    public static int Arithmos2 = 0;


    public double getIpsos() {
        return ipsos;
    }

    public void setIpsos(double ipsos) {
        this.ipsos = ipsos;
    }

    public double getMikos() {
        return mikos;
    }

    public void setMikos(double mikos) {
        this.mikos = mikos;
    }

    public double getVathos() {
        return vathos;
    }

    public void setVathos(double vathos) {
        this.vathos = vathos;
    }

    public String getOnomaKataskevasti() {
        return OnomaKataskevasti;
    }

    public void setOnomaKataskevasti(String onomaKataskevasti) {
        OnomaKataskevasti = onomaKataskevasti;
    }

    public String getOnomaSiskevis() {
        return OnomaSiskevis;
    }

    public void setOnomaSiskevis(String onomaSiskevis) {
        OnomaSiskevis = onomaSiskevis;
    }

    public String getTiposSiskevis() {
        return TiposSiskevis;
    }

    public void setTiposSiskevis(String tiposSiskevis) {
        TiposSiskevis = tiposSiskevis;
    }

    public double getKatanalosiEnergias() { return KatanalosiEnergias; }

    public void setKatanalosiEnergias(double katanalosiEnergias) {
        KatanalosiEnergias = KatanalosiEnergias;
    }

    public double getSinolikiHoritikotita() {
        return SinolikiHoritikotita;
    }

    public void setSinolikiHoritikotita(double sinolikiHoritikotita) {
        SinolikiHoritikotita = sinolikiHoritikotita;
    }

    public double getKatanalosiNerou() {
        return KatanalosiNerou;
    }

    public void setKatanalosiNerou(double katanalosiNerou) {
        KatanalosiNerou = katanalosiNerou;
    }

    public boolean isPsifiakiOthoni() {
        return PsifiakiOthoni;
    }

    public void setPsifiakiOthoni(boolean psifiakiOthoni) {
        PsifiakiOthoni = psifiakiOthoni;
    }

    public boolean isWiFi() {
        return WiFi;
    }

    public void setWiFi(boolean wiFi) {
        WiFi = wiFi;
    }

    public int getArithmosProgrammaton() {
        return ArithmosProgrammaton;
    }

    public void setArithmosProgrammaton(int arithmosProgrammaton) {
        ArithmosProgrammaton = arithmosProgrammaton;
    }
    /* den kanei tipota (etsi zitithike)
     */
    public void periodicMantainance(){
    }

}

