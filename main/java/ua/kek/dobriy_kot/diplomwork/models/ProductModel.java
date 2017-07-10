package ua.kek.dobriy_kot.diplomwork.models;

import java.util.List;



public class ProductModel  {
    private String companyManufacturer;
    private int iconProduct;
    private String nameProduct;
//    private double ratingProduct;
    private String deskription;
    private double averagePrice;
    private List<ShopModel> shopModels;
    private String status;

    public ProductModel() {
    }

    public ProductModel(String companyManufacturer, int iconProduct, String nameProduct,
                        String deskription, double averagePrice, List<ShopModel> shopModel, String status) {
        this.companyManufacturer = companyManufacturer;
        this.iconProduct = iconProduct;
        this.nameProduct = nameProduct;
//        this.ratingProduct = ratingProduct;
        this.deskription = deskription;
        this.averagePrice = averagePrice;
        this.shopModels = shopModel;
        this.status = status;
    }

    public String getCompanyManufacturer() {
        return companyManufacturer;
    }

    public void setCompanyManufacturer(String companyManufacturer) {
        this.companyManufacturer = companyManufacturer;
    }

    public int getIconProduct() {
        return iconProduct;
    }

    public void setIconProduct(int icon) {
        this.iconProduct = iconProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

//    public double getRatingProduct() {
//        return ratingProduct;
//    }
//
//    public void setRatingProduct(double ratingProduct) {
//        this.ratingProduct = ratingProduct;
//    }

    public String getDeskription() {
        return deskription;
    }

    public void setDeskription(String deskription) {
        this.deskription = deskription;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public List<ShopModel> getShopModels() {
        return shopModels;
    }

    public void setShopModels(List<ShopModel> shopModels) {
        this.shopModels = shopModels;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
