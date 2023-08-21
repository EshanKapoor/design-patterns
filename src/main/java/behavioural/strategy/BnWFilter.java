package behavioural.strategy;

public class BnWFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Applying Black and White Filter");
    }
}
