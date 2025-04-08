
//crindo a classe main
public class Main {

    //criando a classe driver;
    public static void main (String [] args){
        //instânciando e criando os objetos;
        Quadrado quad1 = new Quadrado();
        Triangulo tri1 = new Triangulo();
        Figura fig1 = new Figura();



       //colocando o valor das variaveis para poder cumprir a função de calcular a area
        quad1.setBase(4);
        quad1.setAltura(4);
    
        tri1.setAltura(4);
        tri1.setBase(5);
            // chamando a função para printar na tela as formas geometricas que estamos usando;
        fig1.setFormasGeometricas("quadrado e triangulo");

        
        //chamando as funçoes e usando get para nao precisar recolocar o valor da variavel
        //mas para pegar diretamete o valor do set como digitamos assim 
        quad1.calcularAreaQuadrado(quad1.getAltura(), quad1.getBase());
        tri1.calcularAreaTriangulo(tri1.getAltura(), tri1.getBase());
        fig1.ultimoPrint(fig1.getFormasGeometricas());
        
        

        





        
    }
}