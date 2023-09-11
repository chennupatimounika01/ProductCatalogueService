package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-11T04:57:47.513473429Z[GMT]")


public class Product   {
  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("productPrice")
  private BigDecimal productPrice = null;

  @JsonProperty("productDetails")
  private String productDetails = null;

  public Product productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   **/
  @Schema(example = "198772", description = "")
  
    public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
   **/
  @Schema(example = "Mouni", description = "")
  
    public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Product productPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * Get productPrice
   * @return productPrice
   **/
  @Schema(example = "45.2", description = "")
  
    @Valid
    public BigDecimal getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
  }

  public Product productDetails(String productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
   **/
  @Schema(example = "Brand Name", description = "")
  
    public String getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(String productDetails) {
    this.productDetails = productDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productPrice, product.productPrice) &&
        Objects.equals(this.productDetails, product.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, productPrice, productDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
