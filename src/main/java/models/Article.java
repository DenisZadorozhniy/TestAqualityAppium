package models;

public class Article {

    private String title;
    private String fundingPercentage;
    private String backers;
    private String daysToGo;

    public Article(String title, String fundingPercentage, String backers, String daysToGo) {
        this.title = title;
        this.fundingPercentage = fundingPercentage;
        this.backers = backers;
        this.daysToGo = daysToGo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundingPercentage() {
        return fundingPercentage;
    }

    public void setFundingPercentage(String fundingPercentage) {
        this.fundingPercentage = fundingPercentage;
    }

    public String getBackers() {
        return backers;
    }

    public void setBackers(String backers) {
        this.backers = backers;
    }

    public String getDaysToGo() {
        return daysToGo;
    }

    public void setDaysToGo(String daysToGo) {
        this.daysToGo = daysToGo;
    }
}
