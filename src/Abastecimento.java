public class Abastecimento {

    static private int  ultimoId=0;
    private int idAbastecimento;
    private double valorGasolina;
    private double valorEtanol; 
    private double relacao;
    private char CombMaisEconomico;
    private double valorAbastecimento;
    private double autonomiAbastecimento;
    

    private Veiculo veiculo;
    
    public Abastecimento(double valorGasolina, double valorEtanol,Veiculo veiculo){
        this.idAbastecimento= ++ultimoId;
        this.valorGasolina=valorGasolina;
        this.valorEtanol= valorEtanol;
        this.veiculo=veiculo;
        this.obterCombustivelMaisEconomico();
        this.calcularValorAbastecimento();
        this.calcularAutonomiaAbastecimento();
     }
     
     private void caucularRelacao(){
         this.relacao=valorEtanol/valorGasolina;
     }
     
     public void obterCombustivelMaisEconomico(){
         this.caucularRelacao();
         if(this.relacao>=.7){
              this.CombMaisEconomico='G';
         }
         else{
             this.CombMaisEconomico='E';
         }
     }
     
     public void calcularValorAbastecimento(){
         if(this.CombMaisEconomico=='G'){
             this.valorAbastecimento=this.valorGasolina*this.veiculo.getCapacidadeTanque()*.9;
         }
         else{
             this.valorAbastecimento=this.valorEtanol*this.veiculo.getCapacidadeTanque()*.9;
         }
     }
     
     public void calcularAutonomiaAbastecimento(){
         if(this.CombMaisEconomico=='G'){
             this.autonomiAbastecimento= this.veiculo.getCapacidadeTanque()*this.valorGasolina;
         }
           else{
               this.autonomiAbastecimento=this.veiculo.getCapacidadeTanque()*valorEtanol;
           }
     }
    public int getIdAbastecimento() {
        return idAbastecimento;
    }

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public double getValorEtanol() {
        return valorEtanol;
    }

    public void setValorEtanol(double valorEtanol) {
        this.valorEtanol = valorEtanol;
    }

    public double getRelacao() {
        return relacao;
    }

    public char getCombMaisEconomico() {
        return CombMaisEconomico;
    }

    public double getValorAbastecimento() {
        return valorAbastecimento;
    }

    public double getAutonomiAbastecimento() {
        return autonomiAbastecimento;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }


    @Override
    public String toString(){
        return "\nIndentificador : "+this.getIdAbastecimento()+
               "\nPreço Gasolina : R$"+this.getValorGasolina()+
               "\nPreço Etanol   : R$"+this.getValorEtanol()+
               "\nRelação        : "+this.getRelacao()+
               "\nMelhor Opção   : "+this.getCombMaisEconomico()+
               "\nAbastecimento : R$"+this.getValorAbastecimento()+
               "\nAutonomia      : "+this.getAutonomiAbastecimento()+
               "\nVeiculo        : "+this.getVeiculo();

    }
}



