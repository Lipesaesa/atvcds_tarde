//pubicando a classe de objeto quadrado e falando para o java que esta é uma subclasse
//pois usamos o extends para dizer ao java que Figura é uma Super classe
public class Quadrado extends Figura {
        
    
    //pegando os atributos da Figura aqui nesta classe para que possamos usar;
    public Quadrado(){
        super();
    }
    //pegando os tributos altura e base da classe figura para a formula de calcular area;
    public Quadrado(int altura, int base) {
        super(altura, base);
    }
    //função para calcular a area de um quadrado;
    public void calcularAreaQuadrado(int base, int altura){
        System.out.println("a area do quadrado é " + base * altura);
        
    }

    
}
