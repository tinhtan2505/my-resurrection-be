package nqt.my_resurrection_be.entity.enums;

public enum CategoryType {
    PROJECT_PRIORITY("Project Priority"),
    PROJECT_TYPE("Project Type"),
    FILE_TYPE("File Type"),
    PROJECT_STATUS("Project Status"),
    EDITOR_STATUS("Editor Status"),
    CUSTOMER_STATUS("Customer Status"),
    CUSTOMER_SERVICE("Customer Service"),
    CUSTOMER_SOURCE("Customer Source"),
    PAYMENT_METHOD("Payment Method");

    private final String displayName;

    CategoryType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

