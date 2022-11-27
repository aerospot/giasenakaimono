public class Fridge {
    public static int CountObjectF;
    private static double ipsos;
    private double mikos;
    private double vathos;
    private double KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private double SinolikiHoritikotita;
    private boolean NoFrost, Entihizomeno, EjodosGiaPagakia, WiFi;



    public String toString(){
        return ipsos + mikos + vathos + KatanalosiEnergias + OnomaKataskevasti + OnomaSiskevis + TiposSiskevis + KatanalosiEnergias +
                SinolikiHoritikotita + NoFrost + Entihizomeno + EjodosGiaPagakia + WiFi + CountObjectF;

    }

    /*dehete times gia oles tis metavlites tis klasis*/
    public Fridge(double ipsos, double mikos, double vathos, double katanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, double sinolikiHoritikotita, boolean noFrost, boolean entihizomeno, boolean ejodosGiaPagakia, boolean WiFi) {

        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = katanalosiEnergias;
        this.SinolikiHoritikotita = sinolikiHoritikotita;
        this.NoFrost = noFrost;
        this.Entihizomeno = entihizomeno;
        this.EjodosGiaPagakia = ejodosGiaPagakia;
        this.WiFi = WiFi;
        CountObjectF++;
    }




    public static int Arithmos1 = 0;




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

    public double getKatanalosiEnergias() {
        return KatanalosiEnergias;
    }

    public void setKatanalosiEnergias(double katanalosiEnergias) {
        KatanalosiEnergias = katanalosiEnergias;
    }

    public double getSinolikiHoritikotita() {
        return SinolikiHoritikotita;
    }

    public void setSinolikiHoritikotita(double sinolikiHoritikotita) {
        SinolikiHoritikotita = sinolikiHoritikotita;
    }

    public boolean isNoFrost() {
        return NoFrost;
    }

    public void setNoFrost(boolean noFrost) {
        NoFrost = noFrost;
    }

    public boolean isEntihizomeno() {
        return Entihizomeno;
    }

    public void setEntihizomeno(boolean entihizomeno) {
        Entihizomeno = entihizomeno;
    }

    public boolean isEjodosGiaPagakia() {
        return EjodosGiaPagakia;
    }

    public void setEjodosGiaPagakia(boolean ejodosGiaPagakia) {
        EjodosGiaPagakia = ejodosGiaPagakia;
    }

    public boolean isWiFi() {
        return WiFi;
    }

    public void setWiFi(boolean wiFi) {
        WiFi = wiFi;
    }

    /* den kanei tipota (etsi zitithike)*/
    public void periodicMantainance() {
    }

}

