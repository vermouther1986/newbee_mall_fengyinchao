package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RunRecommendApiHistory {
	private long goodsId;

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public Date getRunDate() {
		return runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date runDate;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RunRecommendApiHistory [goodsId=");
		builder.append(goodsId);
		builder.append(", runDate=");
		builder.append(runDate);
		builder.append("]");
		return builder.toString();
	}


}
