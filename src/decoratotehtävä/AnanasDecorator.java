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
class AnanasDecorator extends PizzaDecorator{
    
    public AnanasDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void luo() {
        super.luo();
        luoAnanasta();
    }
    
    private void luoAnanasta(){}
    
    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
    
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", ananaksella";
    }
    
}
