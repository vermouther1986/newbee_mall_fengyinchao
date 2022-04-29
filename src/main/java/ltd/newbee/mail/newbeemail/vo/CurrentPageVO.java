package ltd.newbee.mail.newbeemail.vo;

import java.util.List;

import javax.annotation.Generated;

public class CurrentPageVO {
      
	 @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108134+09:00", comments="Source field: qa_like.user_id")
	    private int totalCount;
	
	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108181+09:00", comments="Source field: qa_like.like_date")
	    private int totalpage;
	    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T11:26:37.108181+09:00", comments="Source field: qa_like.like_date")
	    private int currentpage;
	    
		public int getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}
		public int getTotalpage() {
			return totalpage;
		}
		public void setTotalpage(int totalpage) {
			this.totalpage = totalpage;
		}
		public int getCurrentpage() {
			return currentpage;
		}
		public void setCurrentpage(int currentpage) {
			this.currentpage = currentpage;
		}
	
}
