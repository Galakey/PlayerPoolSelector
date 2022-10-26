public class Player {
    private int userID;
    private String userName;
    private int rank;
    private int qualifierRank;
    private Map[] playerMaps;

    public Player(int userID, String userName, int rank, int qualifierRank){
        this.userID = userID;
        this.userName = userName;
        this.rank = rank;
        this.qualifierRank = qualifierRank;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getQualifierRank() {
        return qualifierRank;
    }

    public void setQualifierRank(int qualifierRank) {
        this.qualifierRank = qualifierRank;
    }

    public Map[] getPlayerMaps() {
        return playerMaps;
    }

    public void setPlayerMaps(Map[] playerMaps) {
        this.playerMaps = playerMaps;
    }
}
