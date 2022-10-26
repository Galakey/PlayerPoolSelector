public class Map {
    private int mapID;
    private String name;
    private float starRating;
    private float length;
    private String bpm;
    private float cs;
    private float od;
    private float hp;
    private String slot;

    public Map(int mapID, String name, float starRating, float length, String bpm, float cs, float od, float hp, String slot) {
        this.mapID = mapID;
        this.name = name;
        this.starRating = starRating;
        this.length = length;
        this.bpm = bpm;
        this.cs = cs;
        this.od = od;
        this.hp = hp;
        this.slot = slot;
    }

    public int getMapID() {
        return mapID;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    public float getCs() {
        return cs;
    }

    public void setCs(float cs) {
        this.cs = cs;
    }

    public float getOd() {
        return od;
    }

    public void setOd(float od) {
        this.od = od;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}

