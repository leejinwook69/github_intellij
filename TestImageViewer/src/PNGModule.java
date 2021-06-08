public class PNGModule implements ImageViewerInterface {
    public String getName() {
        return "PNGModule";
    }

    public void show(String fileName) {
        System.out.printf("PNG image loading : %s", fileName);
    }

    public String getExtension() {
        return "PNG";
    }
}

