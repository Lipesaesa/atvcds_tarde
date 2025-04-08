public class Figura {
    private int base; //publicando variavel
    private int altura;//publicando variavel
    private String formasGeometricas;//publicando variavel
    private int numeroDeLados;//publicando variavel

    //inicializando o metodo construtor de Figura;
    public Figura(){};  

    //metodo construtor
    //todo .this serve para diferenciar a variavel do parametro
    public Figura(int altura, int base) {
        this.altura = altura; //falando que esta variavel altura é a mesma variavel que a linha 3;
        this.base = base;
    }
    //metodo construtor
    public Figura(String formasGeometricas){
        this.formasGeometricas = formasGeometricas;
    };


    //publicando todos os getters e setters;
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getFormasGeometricas() {
        return formasGeometricas;
    }

    public void setFormasGeometricas(String formasGeometricas) {
        this.formasGeometricas = formasGeometricas;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    };
        //criando uma função para poder printas as formulas geometricas que estamos 
        //usando para poder usar como um objeto;
    public void ultimoPrint(String formasGeometricas){
        this.formasGeometricas = formasGeometricas;
        System.out.println(formasGeometricas);
    }

    
    


    


    
    


}