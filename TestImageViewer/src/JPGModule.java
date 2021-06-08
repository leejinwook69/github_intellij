public class JPGModule implements ImageViewerInterface {
    public String getName() {
        return "JPGModule";
    }

    public void show(String fileName) {
        System.out.printf("JPG image loading : %s", fileName);
    }

    public String getExtension() {
        return "JPG";
    }
}
