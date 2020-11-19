package clothes_dryer;

public class ClothesDryer
{
    public void start(Program program)
    {
        // msg about program
        // msg about start
        // close door
        // sound
        startProgram(program);
        // msg about finished
        // sound
        // open door
    }

    private void startProgram(Program program)
    {
        System.out.println("Started " + program.local() + " working time is " + program.hours() + "hours");
    }
}
