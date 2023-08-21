package behavioural.templatemethod.client;

import behavioural.templatemethod.AuditTrail;
import behavioural.templatemethod.GenerateReportTask;
import behavioural.templatemethod.Task;
import behavioural.templatemethod.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();
        Task task1 = new GenerateReportTask(auditTrail);
        Task task2 = new TransferMoneyTask(auditTrail);
        task1.execute();
        task2.execute();
    }
}
