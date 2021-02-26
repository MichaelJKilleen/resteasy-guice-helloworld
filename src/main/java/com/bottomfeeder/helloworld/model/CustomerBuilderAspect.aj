package com.bottomfeeder.helloworld.model;

public aspect CustomerBuilderAspect {
    pointcut callSetCustomerName(String customerName, CustomerBuilder customerBuilder):
            call(CustomerBuilder CustomerBuilder.setCustomerName(String)) && args(customerName) && target(customerBuilder);

    before(String customerName, CustomerBuilder customerBuilder): callSetCustomerName(customerName, customerBuilder) {
        System.out.println("Aspect Before Builder");
    }

    CustomerBuilder around(String customerName, CustomerBuilder customerBuilder): callSetCustomerName(customerName, customerBuilder) {
        System.out.println("We're all good in the builder");
        return proceed(customerName, customerBuilder);
    }

    after(String customerName, CustomerBuilder customerBuilder): callSetCustomerName(customerName, customerBuilder) {
        System.out.println("On our way out");
    }
}
