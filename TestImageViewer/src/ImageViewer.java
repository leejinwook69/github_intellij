public class ImageViewer {
    private final static int MAX_PLUGINS = 100;
    private int i=0;

    ImageViewerInterface[] arr = new ImageViewerInterface[MAX_PLUGINS];

    void addPlugin(ImageViewerInterface ivi) {
        this.arr[i] = ivi;
        i++;
    }

    void show(String fileName, String ext) {
        for(int k= 0; k<i; k++) {
            if(ext.equals(arr[k].getExtension())) {
                System.out.printf("Using %s\n", arr[k].getExtension());
                arr[k].show(fileName);
                System.out.println();
                return;
            }
        }
        System.out.printf("Image viewer plugins for the extension, %s, is not registered", ext);
    }

}

