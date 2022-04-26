package ltd.newbee.mail.newbeemail.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mail.newbeemail.dao.GoodsImageMapper;
import ltd.newbee.mail.newbeemail.entity.GoodsImage;
import ltd.newbee.mail.newbeemail.service.GoodsImageService;


@Service
public class GoodsImageServicempl implements GoodsImageService {
	@Resource
	GoodsImageMapper goodsImageMapper;

	@Override
	public List<ArrayList<GoodsImage>>getGoodsImage(long goodsId) {
	List <GoodsImage> entitylist=goodsImageMapper.getGoodsImage(goodsId);
	List <ArrayList<GoodsImage>> volist=new ArrayList<ArrayList<GoodsImage>>();
	
	ArrayList<GoodsImage> tempList= new ArrayList<GoodsImage>();
	for(int i=0; i<entitylist.size();i++) {
		
		if(i==0) {
			tempList= new ArrayList<GoodsImage>();
			
		}
		tempList.add(entitylist.get(i));
		if((i+1)%8==0) {
			
		   volist.add(tempList);
			
		}
		if(i==(entitylist.size()-1)&&(i+1)%8!=0) {
			
			volist.add(tempList);
			
		}
		
		if((i+1)%8 == 0) {
			volist.add(tempList);
			
			tempList= new ArrayList<GoodsImage>();
			
			
			
		}
	
		
	}
		return volist;
	}

}
