/** Edited version of original SolveTowers class
 * 
 * @author Java Foundations
 * @version 4.0
 * 
 * EDITED
 * @author morganhardin
 * @version 4.1
 *
 */
public class SolveTowers_2
{
    /** This main method calls the edited Towers of Hanoi class
     * by creating a new instance of it and solves it. It then
     * prints the number of times the moveTower method was
     * recursively called in the TowersOfHanoi_2 class.
     */
    public static void main(String[] args)
    {
        TowersOfHanoi_2 towers = new TowersOfHanoi_2(12);
        //TowersOfHanoi_2 towers1 = new TowersOfHanoi_2(12);
        //TowersOfHanoi_2 towers2 = new TowersOfHanoi_2(100);
        
        towers.solve();
        //towers1.solve();
        //towers2.solve();
        
        System.out.println("Finished solving Tower of Hanoi with " + towers.level + " levels (recursive calls).");
    }
}

