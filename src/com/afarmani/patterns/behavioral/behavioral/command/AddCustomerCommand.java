package com.afarmani.patterns.behavioral.behavioral.command;

import com.afarmani.patterns.behavioral.behavioral.command.framework.Command;

public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        //delegating the actual work to this service.
        customerService.addCustomer();
    }
}
