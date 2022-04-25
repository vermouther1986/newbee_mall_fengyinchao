package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.ProductFormula;

public interface ProductFormulaMapper {

	List<ProductFormula> getProductFormula(long goodsId);
	
	
}
