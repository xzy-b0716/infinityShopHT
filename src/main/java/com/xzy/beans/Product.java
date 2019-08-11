package com.xzy.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Product {

    private List<ProductColor> productColor;

    private List<ProductSize> productSize;

    private List<Carousel> carousel;

    private Orderitem orderitem;

    private List<ProductDiscuss> productDiscuss;


    public List<ProductColor> getProductColor() {
        return productColor;
    }

    public List<ProductDiscuss> getProductDiscuss() {
        return productDiscuss;
    }

    public void setProductColor(List<ProductColor> productColor) {
        this.productColor = productColor;
    }

    public List<ProductSize> getProductSize() {
        return productSize;
    }

    public void setProductSize(List<ProductSize> productSize) {
        this.productSize = productSize;
    }

    public List<Carousel> getCarousel() {
        return carousel;
    }

    public void setCarousel(List<Carousel> carousel) {
        this.carousel = carousel;
    }

    public void setProductDiscuss(List<ProductDiscuss> productDiscuss) {
        this.productDiscuss = productDiscuss;
    }

    public Orderitem getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(Orderitem orderitem) {
        this.orderitem = orderitem;
    }


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_id
     *
     * @mbggenerated
     */
    private Integer productId;

    private String productName;

    private String productPicture;

    private Integer productStock;

    private Integer productComNum;

    private Float productPrice;

    private String productDescribe;

    private String productSizePic;

    private String productSuperclass;

    private String productClassId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_createtime
     *
     * @mbggenerated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")

    private Date productCreatetime;

    private String productBrand;

    private String productMaterial;

    private String productVersion;

    private String productStyle;

    private String productThickness;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_id
     *
     * @return the value of product.product_id
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_id
     *
     * @param productId the value for product.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_name
     *
     * @return the value of product.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_name
     *
     * @param productName the value for product.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_picture
     *
     * @return the value of product.product_picture
     *
     * @mbggenerated
     */
    public String getProductPicture() {
        return productPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_picture
     *
     * @param productPicture the value for product.product_picture
     *
     * @mbggenerated
     */
    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture == null ? null : productPicture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_stock
     *
     * @return the value of product.product_stock
     *
     * @mbggenerated
     */
    public Integer getProductStock() {
        return productStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_stock
     *
     * @param productStock the value for product.product_stock
     *
     * @mbggenerated
     */
    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_com_num
     *
     * @return the value of product.product_com_num
     *
     * @mbggenerated
     */
    public Integer getProductComNum() {
        return productComNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_com_num
     *
     * @param productComNum the value for product.product_com_num
     *
     * @mbggenerated
     */
    public void setProductComNum(Integer productComNum) {
        this.productComNum = productComNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_price
     *
     * @return the value of product.product_price
     *
     * @mbggenerated
     */
    public Float getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_price
     *
     * @param productPrice the value for product.product_price
     *
     * @mbggenerated
     */
    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_describe
     *
     * @return the value of product.product_describe
     *
     * @mbggenerated
     */
    public String getProductDescribe() {
        return productDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_describe
     *
     * @param productDescribe the value for product.product_describe
     *
     * @mbggenerated
     */
    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe == null ? null : productDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_size_pic
     *
     * @return the value of product.product_size_pic
     *
     * @mbggenerated
     */
    public String getProductSizePic() {
        return productSizePic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_size_pic
     *
     * @param productSizePic the value for product.product_size_pic
     *
     * @mbggenerated
     */
    public void setProductSizePic(String productSizePic) {
        this.productSizePic = productSizePic == null ? null : productSizePic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_superclass
     *
     * @return the value of product.product_superclass
     *
     * @mbggenerated
     */
    public String getProductSuperclass() {
        return productSuperclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_superclass
     *
     * @param productSuperclass the value for product.product_superclass
     *
     * @mbggenerated
     */
    public void setProductSuperclass(String productSuperclass) {
        this.productSuperclass = productSuperclass == null ? null : productSuperclass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_class_id
     *
     * @return the value of product.product_class_id
     *
     * @mbggenerated
     */
    public String getProductClassId() {
        return productClassId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_class_id
     *
     * @param productClassId the value for product.product_class_id
     *
     * @mbggenerated
     */
    public void setProductClassId(String productClassId) {
        this.productClassId = productClassId == null ? null : productClassId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_createtime
     *
     * @return the value of product.product_createtime
     *
     * @mbggenerated
     */
    public Date getProductCreatetime() {
        return productCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_createtime
     *
     * @param productCreatetime the value for product.product_createtime
     *
     * @mbggenerated
     */
    public void setProductCreatetime(Date productCreatetime) {
        this.productCreatetime = productCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_brand
     *
     * @return the value of product.product_brand
     *
     * @mbggenerated
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_brand
     *
     * @param productBrand the value for product.product_brand
     *
     * @mbggenerated
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_material
     *
     * @return the value of product.product_material
     *
     * @mbggenerated
     */
    public String getProductMaterial() {
        return productMaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_material
     *
     * @param productMaterial the value for product.product_material
     *
     * @mbggenerated
     */
    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial == null ? null : productMaterial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_version
     *
     * @return the value of product.product_version
     *
     * @mbggenerated
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_version
     *
     * @param productVersion the value for product.product_version
     *
     * @mbggenerated
     */
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_style
     *
     * @return the value of product.product_style
     *
     * @mbggenerated
     */
    public String getProductStyle() {
        return productStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_style
     *
     * @param productStyle the value for product.product_style
     *
     * @mbggenerated
     */
    public void setProductStyle(String productStyle) {
        this.productStyle = productStyle == null ? null : productStyle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_thickness
     *
     * @return the value of product.product_thickness
     *
     * @mbggenerated
     */
    public String getProductThickness() {
        return productThickness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_thickness
     *
     * @param productThickness the value for product.product_thickness
     *
     * @mbggenerated
     */
    public void setProductThickness(String productThickness) {
        this.productThickness = productThickness == null ? null : productThickness.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_size
     *
     * @return the value of product.product_size
     *
     * @mbggenerated
     */

}