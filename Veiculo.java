public class Veiculo {

    protected int velocidade;
    protected int qtdePneus;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getQtdePneus() {
        return qtdePneus;
    }

    public void setQtdePneus(int qtdePneus) {
        this.qtdePneus = qtdePneus;
    }
    public int aumentarVelocidade(){
        if(this.velocidade > 0) {
            this.setVelocidade(this.getVelocidade() + 1);
        }
        return this.velocidade;
    }
    public void frear(){
        if(this.velocidade == 0) {
            this.setVelocidade(0);
        }else {
            this.velocidade -= 1;
        }
    }
    public void parar() {
        if(this.velocidade >= 1) {
            this.setVelocidade(0);
        }
    }
    public void moverParaFrente() {
        if(this.velocidade == 0) {
            this.velocidade+= 1;
        }
    }
    protected void mover(){
        if(this.velocidade > 0) {
            this.velocidade++;
        }
    }
    protected boolean estaEmMovimento(){
        if(this.velocidade > 0) {
            return true;
        } else {
            return false;
        }

    }
}
