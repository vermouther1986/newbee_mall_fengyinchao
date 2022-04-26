package ltd.newbee.mail.newbeemail.service;

import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mail.newbeemail.entity.GoodsImage;


public interface GoodsImageService {
List<ArrayList<GoodsImage>> getGoodsImage(long goodsId);
}