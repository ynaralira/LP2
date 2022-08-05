public class Automovel extends Veiculo{
    protected boolean marchaAFrente;
    private boolean ligado;

    public Automovel() {
    }

    public boolean isMarchaAFrente() {
        return marchaAFrente;
    }

    public void setMarchaAFrente(boolean marchaAFrente) {
        this.marchaAFrente = marchaAFrente;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void moverParaFrente() {
        if(this.velocidade == 0) {
            this.velocidade+= 1;
        }
        this.setMarchaAFrente(true);
        this.setLigado(true);
    }
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
        this.setMarchaAFrente(false);
        this.setVelocidade(0);

    }
    public boolean estaLigado(){
        return this.ligado;
    }
    public boolean estaEmMarchaAFrente(){
        return this.marchaAFrente;
    }

    protected void engatarMarchaAFrente(){
        if(this.getVelocidade() > 0) {
            this.setMarchaAFrente(true);
        }
    }
    @Override
    protected boolean estaEmMovimento(){
        if(this.ligado && this.getVelocidade() > 0) {
            return true;
        } else {
            return false;
        }

    }

}
