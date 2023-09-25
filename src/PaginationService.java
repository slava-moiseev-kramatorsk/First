public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }

    public int getElementsCount(){
        return data.length;
//        return 5;
    }

    // create getPageNumberByElementIndex(int index) method
}