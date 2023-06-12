package model;

public class ChronicDisease {
    private String diseaseName;
    private String description;

    public String getDiseaseName() {
        return diseaseName;
    }

    public ChronicDisease(String diseaseName, String description) {
        this.diseaseName = diseaseName;
        this.description = description;
    }

    public ChronicDisease() {
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
