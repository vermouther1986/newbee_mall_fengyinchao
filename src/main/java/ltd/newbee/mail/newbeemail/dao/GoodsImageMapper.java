package ltd.newbee.mail.newbeemail.dao;

import java.util.List;

import ltd.newbee.mail.newbeemail.entity.GoodsImage;

public interface GoodsImageMapper {
List<GoodsImage> getGoodsImage(long goodsId);
}
