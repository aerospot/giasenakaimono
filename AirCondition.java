public class AirCondition {

        public static int CountObjectAC;
        private double ipsos, mikos, vathos, KatanalosiEnergias;
private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

private boolean WiFi, Ionistis, FiltroAera;
private int IshiPsijis, IshiThermansis;

public String toString(){
        return ipsos + mikos + vathos + OnomaKataskevasti + OnomaSiskevis + TiposSiskevis +
                KatanalosiEnergias + WiFi + Ionistis + FiltroAera + IshiPsijis + IshiThermansis +CountObjectAC;
}
/*dehete times gia oles tis metavlites tis klasis*/
public AirCondition(double ipsos, double mikos, double vathos, double KatanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, boolean wiFi, boolean ionistis, boolean filtroAera, int ishiPsijis, int ishiThermansis) {
        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = KatanalosiEnergias;
        this.WiFi = wiFi;
        this.Ionistis = ionistis;
        this.FiltroAera = filtroAera;
        this.IshiPsijis = ishiPsijis;
        this.IshiThermansis = ishiThermansis;
        CountObjectAC++;
        }



public static int Arithmos4 = 0;


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

public boolean isWiFi() {
        return WiFi;
        }

public void setWiFi(boolean wiFi) {
        WiFi = wiFi;
        }

public boolean isIonistis() {
        return Ionistis;
        }

public void setIonistis(boolean ionistis) {
        Ionistis = ionistis;
        }

public boolean isFiltroAera() {
        return FiltroAera;
        }

public void setFiltroAera(boolean filtroAera) {
        FiltroAera = filtroAera;
        }

public int getIshiPsijis() {
        return IshiPsijis;
        }

public void setIshiPsijis(int ishiPsijis) {
        IshiPsijis = ishiPsijis;
        }

public int getIshiThermansis() {
        return IshiThermansis;
        }

public void setIshiThermansis(int ishiThermansis) {
        IshiThermansis = ishiThermansis;
        }


/* den kanei tipota (etsi zitithike)*/
public void periodicMantainance(){
        }
}
