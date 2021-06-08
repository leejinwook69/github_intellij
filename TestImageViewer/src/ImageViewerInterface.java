public interface ImageViewerInterface {
    //구현하는 클래스 모듈의 이름을 반환 ex) JPG Module
    String getName();

    //해당 확장자 가진 파일 보이는 함수
    // 로딩표시만 해줌 ex)JPG image loading : fileName
    void show(String fileName);

    //처리 가능한 이미지 확장자를 문자열 형태로 반환  ex)JPG or PNG
    String getExtension();
}
