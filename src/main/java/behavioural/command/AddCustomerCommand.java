package behavioural.command;

import behavioural.command.fx.Command;

public class AddCustomerCommand implements Command {
    CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
