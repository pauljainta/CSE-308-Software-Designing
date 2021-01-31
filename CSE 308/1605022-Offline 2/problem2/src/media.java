public class media {

    String name,type;
    double duration;

    public String getName() {
        return name;
    }

    public media(String name, String type, double duration) {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
