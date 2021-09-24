public class Pillow {
    private MaterialFactory materialFactory;
    private String name;
    private PillowType type;
    private Size size;
    public Pillow(String stuffing, String name, String cover, String size, String pillowType) {
        this.name = name;
        createPillow(stuffing, cover, size, pillowType);
    }
    public void createPillow(String stuffing, String cover, String size, String type) {
        this.materialFactory = new MaterialFactory(stuffing,cover);
        this.type = PillowType.valueOf(type);
        this.size = Size.valueOf(size);
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Stuffing " + materialFactory.getStuffing()+" into pillow cover.");
        System.out.println("Stitching " + materialFactory.getCover() + " pillow cover.");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " with " + materialFactory.getStuffing() + " stuffing in " + materialFactory.getCover() + " pillow cover for " + this.type.toString() + "of "+ this.size.toString()+".";
    }
}
