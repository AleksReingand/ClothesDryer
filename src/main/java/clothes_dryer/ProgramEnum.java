package clothes_dryer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProgramEnum
{
    NORMAL("Normal", 8),
    FAST("Fast", 4);

    private String program;
    private double hour;
}
