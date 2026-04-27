package tr.com.huseyinaydin.dto.category;

public class ResultCategoryDto {
    private int categoryID;
    private String categoryName;
    private boolean categoryStatus;

    public ResultCategoryDto() {
    }

    public ResultCategoryDto(int categoryID, String categoryName, boolean categoryStatus) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }
}
