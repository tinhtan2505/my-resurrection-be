package nqt.my_resurrection_be.enums;

public enum ProjectCardStatus {
    PROCESSING("Processing"),
    NEEDCHECK("Need check"),
    CHECKED("Checked"),
    CANCEL("Cancel"),
    PENDING("Pending"),
    DRAFT("Draft"),
    COMPLETED("Completed");

    private final String displayName;

    ProjectCardStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

