package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CheckDate {
	
	 	private Integer userId;

	    private long goodsId;


	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	    private Date checkDate;


		public Integer getUserId() {
			return userId;
		}


		public void setUserId(Integer userId) {
			this.userId = userId;
		}


		public Long getGoodsId() {
			return goodsId;
		}


		public void setGoodsId(Integer goodsId) {
			this.goodsId = goodsId;
		}


		public Date getCheckDate() {
			return checkDate;
		}


		public void setCheckDate(Date checkDate) {
			this.checkDate = checkDate;
		}


		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("CheckDate [userId=");
			builder.append(userId);
			builder.append(", goodsId=");
			builder.append(goodsId);
			builder.append(", checkDate=");
			builder.append(checkDate);
			builder.append("]");
			return builder.toString();
		}
	    
	    
}
