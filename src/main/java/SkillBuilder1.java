import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String ans = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double ans3 = (4.0/3.0)*Math.pow(2, (Math.sqrt(5)/(Math.pow(spice,3))) );
        System.out.println("Well " + ans + ", the spice value resulted in " + ans3);
        System.out.printf("And the converted value is %.2f",ans3);
    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n",gallonsPaintNeeded);

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        cansNeeded = (int) Math.ceil(gallonsPaintNeeded /gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + "can(s)");

    }
}
