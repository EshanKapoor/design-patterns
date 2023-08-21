package structural.decorator.exercise;

public class MainArtefact implements AbstractArtefact {

    private AbstractArtefact abstractArtefact;

    public MainArtefact(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return abstractArtefact.render() + " [Main]";
    }
}
