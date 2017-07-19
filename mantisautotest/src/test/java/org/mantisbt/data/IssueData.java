package org.mantisbt.data;

public class IssueData {
    private final String category;
    private final String reproducibility;
    private final String severity;
    private final String priority;
    private final String platform;
    private final String assignee;
    private final String summary;
    private final String description;

    public IssueData(String category, String reproducibility, String severity, String priority, String platform, String assignee, String summary, String description) {
        this.category = category;
        this.reproducibility = reproducibility;
        this.severity = severity;
        this.priority = priority;
        this.platform = platform;
        this.assignee = assignee;
        this.summary = summary;
        this.description = description;
    }
    public String getPlatform() {
        return platform;
    }

    public String getPriority() {
        return priority;
    }

    public String getSeverity() {
        return severity;
    }

    public String getCategory_id() {
        return category;
    }

    public String getReproducibility() {
        return reproducibility;
    }

    public String getHandler_id() {
        return assignee;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }
}
