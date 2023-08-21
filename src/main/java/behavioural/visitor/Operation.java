package behavioural.visitor;

//This is Visitor
public interface Operation {
    //These are like visit methods
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
