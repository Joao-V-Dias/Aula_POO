package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
/*
Escreva um programa que converta uma temperatura de Fahrenheit para Celsius. 
O sistema deve informar a temperatura em Fahrenheit e o programa deve calcular e 
exibir a temperatura correspondente em Celsius utilizando a fórmula: C = (F - 32) * 5/9.
*/

public class Conversao {
    
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temperatura){
        this.temperatura = 1;
        if(temperatura > 0.0) this.temperatura = temperatura;
    }
    
    //Converter temperatura
    public double calcularTemperatura(){
        return (temperatura - 32) * 5 / 9;
    }

     /*essa classe recebe um número double;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é maior que zero
    */
    
}
