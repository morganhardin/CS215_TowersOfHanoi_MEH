/** Edited version of TowersOfHanoi class that represents
 * the classic Towers of Hanoi puzzle. It includes print
 * statements to detail what is happening at certain times
 * and a level integer that will keep track of the
 * recursive calls.
 *
 * @author Java Foundations
 * @version 4.0
 * 
 * EDITED
 * @author morganhardin
 * @version 4.1
 * 
 */
public class TowersOfHanoi_2
{
	/** These variables create two integer types of totalDisks
	 * and level. TotalDisks keeps track of the total number
	 * of disks that need to be moved and level keeps track
	 * of the number of times moveTower is recursively called.
	 * 
	 */
    private int totalDisks;
    int level;

    /** This preferred constructor method take the integer
     * disks and passes it through as the total number of 
     * disks in the problem (totalDisks).
     * 
     * @param disks
     */
    public TowersOfHanoi_2(int disks)
    {
        totalDisks = disks;
        level = 0;
    }

    /** This void method solves the Tower of Hanoi puzzle.
     * It does this by calling the moveTower method and
     * by passing through the appropriate integers and
     * variables.
     * 
     */
    public void solve()
    {
        moveTower(totalDisks, 1, 3, 2);
    }	
    
    /** This void method is where the movement takes place. It 
     * moves the specified number of disks from one tower to 
     * another. It moves n-1 disks out of the way onto the 
     * temporary peg, another disk into the correct spot, and 
     * then moves the disk on the temporary peg back to its
     * spot. It continues until it eventually reaches the base
     * case. It does this by continuously calling its
     * method until the base case of 1 is reached. 
     * 
     * @param numDisks
     * @param start
     * @param end
     * @param temp
     */
    private void moveTower(int numDisks, int start, int end, int temp)
    {
        if (numDisks == 1)
            moveOneDisk(start, end);
        else
        {
        	level++;
        	System.out.println("------------------------------------------------------------------------------------------------------------------");
        	System.out.println("When this is run, the moveTower is being recursively called. This function has the parameters in different spots,\nallowing the disks to efficiently manuever into the correct spots. This is done by moving a disk to a temporary\npeg. Each time this returns represents the moveTower method calling itself. This is seen through the increase in\nthe number of levels.");
        	System.out.println("------------------------------------------------------------------------------------------------------------------");
        	
            moveTower(numDisks-1, start, temp, end);
            
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("This means that a disk is being moved from its starting spot to the end spot. Each time this is seen the level\nwill stay the same. It is also calling a different method, showing that this is not a recursive function.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            
            moveOneDisk(start, end);
            
            level++;
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("The moveTower method has called itself again, this time with the parameters in different places than originally\nand the previous recursive function. This allows the disks on the temporary peg to be moved a different peg, but\nnot the starting peg. The level will also increase here.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            
            moveTower(numDisks-1, temp, end, start);
        }
    }
    
    /** This void method takes two parameters, the start and end
     * that will print out where the disk is moving from and
     * which peg it has been moved to. It also prints out the
     * current level at that specific moment in time.
     * 
     * @param start
     * @param end
     */
    private void moveOneDisk(int start, int end)
    {
    	System.out.println("Level: " + level);
        System.out.println("Move one disk from " + start + " to " + end + "\n");
    }
}	

