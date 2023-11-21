public class Vehiculo {
    private String Marca;
    private int cantRuedas;
    protected boolean esDeCompetencia;
    protected boolean  estaLaAlarmaEncendida;
    private  String kmMaximo;
    private String kmMinimo;



    public Vehiculo(String marca, int cantRuedas, boolean esDeCompetencia, Boolean estaLaAlarmaEncendida,
                    String kmMaximo, String kmMinimo) {
        Marca = marca;
        this.cantRuedas = cantRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.estaLaAlarmaEncendida = estaLaAlarmaEncendida;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }
    public Vehiculo(String marca, int cantRuedas, boolean esDeCompetencia, String kmMaximo, String kmMinimo) {
        Marca = marca;
        this.cantRuedas = cantRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public boolean isEsDeCampetencia() {
        return esDeCompetencia;
    }

    public void setEsDeCampetencia(boolean esDeCompetencia) {
        this.esDeCompetencia = esDeCompetencia;
    }

    public  boolean isEstaLaAlarmaEncendida() {
        return estaLaAlarmaEncendida;
    }

    public void setEstaLaAlarmaEncendida(Boolean estaLaAlarmaEncendida) {
        this.estaLaAlarmaEncendida = estaLaAlarmaEncendida;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setkmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }
    public void arrancarVehiculo(){
        if (estaLaAlarmaEncendida){
            System.out.println("Ruido Alarma ");

        }else{
            System.out.println("Arranca el Vehiculo");
        }

    }
}
