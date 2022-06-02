
import java.util.Scanner;
import  java.util.List;
import java.util.ArrayList;


public class App {

   
    public static void main(String[] args) throws Exception {
       try (Scanner read = new Scanner(System.in)) {
        //car
           System.out.println("Indentificador do Veiculo: ");
           int idVeiculo=read.nextInt();

           System.out.println("Capacidade do Veiculo: ");
           double capacidadeTanque=read.nextInt();

           System.out.println("Km/Litro da Gasolina: ");
           double kmLitroGasolina=read.nextDouble();

           System.out.println("Km/Litro do Etanol: ");
           double kmLitroEtanol=read.nextDouble();
           
           Veiculo veiculo = new Veiculo( idVeiculo, capacidadeTanque, kmLitroEtanol, kmLitroGasolina);
          
           System.out.println("Veiculo:"+veiculo);

           //To fill up 
           List<Abastecimento> listaAbastecimentos=new ArrayList<Abastecimento>();
           do{
            System.out.println("***Abastecimento***");
            
            System.out.println("Preço Gasolina 0 para finalizar: R$");
            double valorGasolina=read.nextDouble();
            if(valorGasolina==0){
                System.out.println("Finalizando programa!!!");
                break;
            }
            System.out.println("Preço Etanol: R$");
            double valorEtanol=read.nextDouble();
            listaAbastecimentos.add(new Abastecimento(valorGasolina, valorEtanol, veiculo));

            for (Abastecimento  abastecimento:listaAbastecimentos){
                System.out.println(abastecimento);
            }
            
            }while(true);
    }
    
    }
         
    
}
