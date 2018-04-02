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
public class ValkosibaleDecorator extends PizzaDecorator{
    
    public ValkosibaleDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void luo() {
        super.luo();
        luoValkosibaletta();
    }
    
    private void luoValkosibaletta(){}
    
    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
    
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", valkosipulilla";
    }
    
}
