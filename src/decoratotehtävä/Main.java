
package decoratotehtävä;

/**
 *
 * @author ottoj_000
 */

public class Main {

    public static void main(String[] args) {
        
        //Luodaan kolme suhteellisen yksinkertaista pizzaa
        Pizza pizzakaikillamausteilla =         new ValkosibaleDecorator(
                                                new AnanasDecorator(
                                                new PepperoniDecorator(
                                                new PizzaPohja())));
        
        Pizza pepperonillajavalkosibaleella =   new ValkosibaleDecorator(
                                                new PepperoniDecorator(
                                                new PizzaPohja()));
    
        Pizza ananaksella =                     new AnanasDecorator(
                                                new PizzaPohja());
        
        
        //Tulostetaan menu
        System.out.println(pizzakaikillamausteilla.getDescription() 
                + ", hinta " + pizzakaikillamausteilla.getPrice());
        
        System.out.println(pepperonillajavalkosibaleella.getDescription() 
                + ", hinta " + pepperonillajavalkosibaleella.getPrice());
        
        System.out.println(ananaksella.getDescription() 
                + ", hinta " + ananaksella.getPrice());
        
    }
    
}
