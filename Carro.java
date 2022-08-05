public class Carro extends Automovel{

    public Carro() {
        this.setQtdePneus(4);
    }

    public Carro carro(){
        Carro carro = new Carro();
        return carro;
    }
    public void moverParaTras() {
        if(this.getVelocidade() > 1) {
            this.setVelocidade(this.getVelocidade() - 1);
            this.setMarchaAFrente(false);
        }
    }
    protected void engatarMarchaARe() {
        this.setMarchaAFrente(false);
    }
    @Override
    public int getQtdePneus() {
        return qtdePneus;
    }
}
