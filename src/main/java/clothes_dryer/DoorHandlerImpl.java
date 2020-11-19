package clothes_dryer;

public class DoorHandlerImpl implements DoorHandler
{
    boolean isOpen;

    public void isOpen()
    {
        this.isOpen = !isOpen;
    }
}
