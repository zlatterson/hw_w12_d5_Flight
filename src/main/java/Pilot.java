public class Pilot {
    private String name;
    private RankType rankType;
    private String licence;

    public Pilot(String name, RankType rankType, String licence) {
        this.name = name;
        this.rankType = rankType;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
    public String fly(){
        return "Roger, Roger";
    }
}
