public class Veiculo {
    private int idVeiculo;
    private double capacidadeTanque;
    private double kmLitroGasolina;
    private double kmLitroEtanol;
   
    public Veiculo(int idVeiculo,double capacidadeTanque, double kmLitroGasolina, double kmLitroEtanol){
        this.idVeiculo=idVeiculo;
        this.capacidadeTanque=capacidadeTanque;
        this.kmLitroGasolina=kmLitroGasolina;
        this.kmLitroEtanol=kmLitroEtanol;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getKmLitroGasolina() {
        return kmLitroGasolina;
    }

    public void setKmLitroGasolina(double kmLitroGasolina) {
        this.kmLitroGasolina = kmLitroGasolina;
    }

    public double getKmLitroEtanol() {
        return kmLitroEtanol;
    }
    
    public void setKmLitroEtanol(double kmLitroEtanol) {
        this.kmLitroEtanol = kmLitroEtanol;
    } 
    
    @Override
    public String toString(){
        return "\nIdentificador Veiculo : "+this.idVeiculo +
                "\nCapacidade do tanque : "+this.capacidadeTanque+
                "\nKm/Litro Gasolina    : "+this.kmLitroGasolina+   
                "\nKm/Litro Etanol      : "+this.kmLitroEtanol;
            
            }

    
}
