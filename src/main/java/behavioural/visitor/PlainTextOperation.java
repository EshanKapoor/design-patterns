package behavioural.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("plainText-heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("plainText-anchor");
    }
}
