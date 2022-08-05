public class Moto extends Automovel{


    public Moto() {
        this.setQtdePneus(2);
    }

    public Moto moto(){
        Moto moto = new Moto();
        this.setQtdePneus(2);
        return moto;
    }
}
