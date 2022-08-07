public class CabinCrewMember {
    private String name;
    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType) {
        this.name = name;
        this.rankType = rankType;
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

    public String announce(String message) {
        return message;
    }
}
