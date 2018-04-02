/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratotehtävä;

/**
 *
 * @author ottoj_000
 */
class PepperoniDecorator extends PizzaDecorator{
    
    public PepperoniDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void luo() {
        super.luo();
        luoPepperonia();
    }
    
    private void luoPepperonia(){}
    
    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
    
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperonilla";
    }
    
}
