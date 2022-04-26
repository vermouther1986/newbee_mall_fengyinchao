package ltd.newbee.mail.newbeemail.vo;

import java.io.Serializable;

public class ProductFormulaVO implements Serializable{

	private Long goodsId;
	private String color;
	private String size;
	private String material;
	private String wrapSize;
	private String warrantyYears;
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getWrapSize() {
		return wrapSize;
	}
	public void setWrapSize(String wrapSize) {
		this.wrapSize = wrapSize;
	}
	public String getWarrantyYears() {
		return warrantyYears;
	}
	public void setWarrantyYears(String warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductFormulaVO [goodsId=");
		builder.append(goodsId);
		builder.append(", color=");
		builder.append(color);
		builder.append(", size=");
		builder.append(size);
		builder.append(", material=");
		builder.append(material);
		builder.append(", wrapSize=");
		builder.append(wrapSize);
		builder.append(", warrantyYears=");
		builder.append(warrantyYears);
		builder.append("]");
		return builder.toString();
	}
	
	
}
