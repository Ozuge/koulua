
package decoratotehtävä;

/**
 *
 * @author ottoj_000
 */
public class PizzaPohja implements Pizza{
    
    @Override
    public void luo() {
        
    }

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }
    
}
