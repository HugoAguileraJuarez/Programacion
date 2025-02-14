public class Telefono {
    private String marca;
    private String model;
    private TarjetaSim tarjetaSim;

    public Telefono(String marca, String model){
        this(marca, model, null);
    }

    public Telefono(String marca, String model, TarjetaSim tarjetaSim){
        this.marca = marca;
        this.model = model;
        this.tarjetaSim = tarjetaSim;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TarjetaSim getTarjetaSim() {
        return tarjetaSim;
    }

    public void setTarjetaSim(TarjetaSim tarjetaSim) {
        this.tarjetaSim = tarjetaSim;
        if (tarjetaSim != null){
            tarjetaSim.setTelefono(this); //esto enlaza con telefono, bueno no se muy bien
        }




    }
}
