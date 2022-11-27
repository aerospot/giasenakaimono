public class Oven {
    public static int CountObjectO;
    private double ipsos, mikos, vathos, KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private String TiposEstias, TiposFournou, Hroma;
    private boolean PsifiakiOthoni;
    private double SinolikiHoritikotita;

    public String toString(){
        return ipsos + mikos + vathos + OnomaKataskevasti + OnomaSiskevis + TiposSiskevis + KatanalosiEnergias + TiposEstias +
                TiposFournou + Hroma + PsifiakiOthoni + SinolikiHoritikotita + CountObjectO;
    }
    /*dehete times gia oles tis metavlites tis klasis*/
    public Oven(double ipsos, double mikos, double vathos, double KatanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, String tiposEstias, String tiposFornou, String hroma, boolean psifiakiOthoni, double sinolikiHoritikotita) {
        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = KatanalosiEnergias;
        this.TiposEstias = tiposEstias;
        this.TiposFournou = tiposFornou;
        this.Hroma = hroma;
        this.PsifiakiOthoni = psifiakiOthoni;
        this.SinolikiHoritikotita = sinolikiHoritikotita;
        CountObjectO++;
    }





    public static int Arithmos3 = 0;


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

    public void setKatanalosiEnergias(double KatanalosiEnergias) { KatanalosiEnergias = KatanalosiEnergias;}

    public String getTiposEstias() { return TiposEstias; }

    public void setTiposEstias(String tiposEstias) { TiposEstias = tiposEstias; }

    public String getTiposFornou() { return TiposFournou; }

    public void setTiposFornou(String tiposFornou) { TiposFournou = TiposFournou; }

    public String getHroma() { return Hroma; }

    public void setHroma(String hroma) { Hroma = hroma; }

    public boolean isPsifiakiOthoni() { return PsifiakiOthoni; }

    public void setPsifiakiOthoni(boolean psifiakiOthoni) { PsifiakiOthoni = psifiakiOthoni; }

    public double getSinolikiHoritikotita() { return SinolikiHoritikotita; }

    public void setSinolikiHoritikotita(double sinolikiHoritikotita) { SinolikiHoritikotita = sinolikiHoritikotita; }

    /* den kanei tipota (etsi zitithike)*/
    public void periodicMantainance(){
    }
}

