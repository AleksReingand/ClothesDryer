package clothes_dryer;

public class ClothesDryer
{
        private Message messager = new ConsoleMessageImpl();
        private DoorHandler doorHandler = new DoorHandlerImpl();
        private Sounder beep = new BeepSounderImpl();
        private Sounder melody = new MelodySounderImpl();

        public void start(ProgramEnum program)
    {
        messager.message("Choosing the " + program.getProgram() + " program");
        doorHandler.isOpen();
        beep.sound();
        startProgram(program);
        messager.message("Done");
        melody.sound();
        doorHandler.isOpen();
    }

    private void startProgram(ProgramEnum programEnum)
    {
        System.out.println("Started program: " + programEnum.getProgram() + ", the working time is " + programEnum.getHour() + " hours");
    }
}
