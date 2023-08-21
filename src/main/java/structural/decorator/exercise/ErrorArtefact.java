package structural.decorator.exercise;

public class ErrorArtefact implements AbstractArtefact {
    private AbstractArtefact abstractArtefact;

    public ErrorArtefact(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return abstractArtefact.render() + " [Error]";
    }
}
