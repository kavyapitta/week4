public class MaterialFactory {
    private Stuffing stuffing;
    private Cover cover;

    public MaterialFactory(String stuffing, String cover) {
        this.stuffing = Stuffing.valueOf(stuffing);
        this.cover = Cover.valueOf(cover);
    }
    public String getStuffing(){
        return stuffing.toString();
    }
    public String getCover(){
        return cover.toString();
    }
}
