package behavioural.templatemethod;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
       auditTrail.record();
       doExecute();//also read about hook methods.
    }

    protected abstract void doExecute();
}
