
package decoratotehtävä;

/**
 *
 * @author ottoj_000
 */

abstract class PizzaDecorator implements Pizza {
    
    protected Pizza pizzaToBeDecorated;
    
    public PizzaDecorator(Pizza pizzaToBeDecorated){
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    
    @Override
    public void luo() {
        pizzaToBeDecorated.luo();
    }
    
    @Override
    public double getPrice() {
        return pizzaToBeDecorated.getPrice();
    }
    
    @Override
    public String getDescription() {
        return pizzaToBeDecorated.getDescription();
    }
    
}
