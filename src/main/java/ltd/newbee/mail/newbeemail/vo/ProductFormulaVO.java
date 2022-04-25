package ltd.newbee.mail.newbeemail.vo;

import java.io.Serializable;

public class ProductFormulaVO implements Serializable{

	private Long goodsId;
	private String color;
	private String size;
	private String material;
	private String waapSize;
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
	public String getWaapSize() {
		return waapSize;
	}
	public void setWaapSize(String waapSize) {
		this.waapSize = waapSize;
	}
	public String getWarrantyYears() {
		return warrantyYears;
	}
	public void setWarrantyYears(String warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	
	
}
