//pubicando a classe de objeto triangulo e falando para o java que esta é uma subclasse
//pois usamos o extends para dizer ao java que Figura é uma Super classe 
public class Triangulo extends Figura {
    
    
    //pegando os atributos da Figura aqui nesta classe para que possamos usar;
    public Triangulo(){
        super();
    }
    //função para calcular a area de um quadrado;
    public void calcularAreaTriangulo(int base, int altura){
        System.out.println("a area do triangulo é " + (base * altura) / 2);
    }

 }

    

