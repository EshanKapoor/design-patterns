package behavioural.strategy;

public class HighContrastFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Applying High Contrast Filter");
    }
}
