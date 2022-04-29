package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallOrder {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.977537+09:00", comments = "Source field: tb_newbee_mall_order.order_id")
	private Long orderId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.977774+09:00", comments = "Source field: tb_newbee_mall_order.order_no")
	private String orderNo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.978929+09:00", comments = "Source field: tb_newbee_mall_order.user_id")
	private Long userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979299+09:00", comments = "Source field: tb_newbee_mall_order.total_price")
	private Integer totalPrice;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979431+09:00", comments = "Source field: tb_newbee_mall_order.pay_status")
	private Byte payStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979559+09:00", comments = "Source field: tb_newbee_mall_order.pay_type")
	private Byte payType;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979685+09:00", comments = "Source field: tb_newbee_mall_order.pay_time")
	private Date payTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979834+09:00", comments = "Source field: tb_newbee_mall_order.order_status")
	private Byte orderStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979959+09:00", comments = "Source field: tb_newbee_mall_order.extra_info")
	private String extraInfo;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980128+09:00", comments = "Source field: tb_newbee_mall_order.user_name")
	private String userName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980275+09:00", comments = "Source field: tb_newbee_mall_order.user_phone")
	private String userPhone;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980436+09:00", comments = "Source field: tb_newbee_mall_order.user_address")
	private String userAddress;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980596+09:00", comments = "Source field: tb_newbee_mall_order.is_deleted")
	private Byte isDeleted;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980749+09:00", comments = "Source field: tb_newbee_mall_order.create_time")
	private Date createTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980892+09:00", comments = "Source field: tb_newbee_mall_order.update_time")
	private Date updateTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.977649+09:00", comments = "Source field: tb_newbee_mall_order.order_id")
	public Long getOrderId() {
		return orderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.977703+09:00", comments = "Source field: tb_newbee_mall_order.order_id")
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.977837+09:00", comments = "Source field: tb_newbee_mall_order.order_no")
	public String getOrderNo() {
		return orderNo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.977891+09:00", comments = "Source field: tb_newbee_mall_order.order_no")
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo == null ? null : orderNo.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979175+09:00", comments = "Source field: tb_newbee_mall_order.user_id")
	public Long getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979252+09:00", comments = "Source field: tb_newbee_mall_order.user_id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979345+09:00", comments = "Source field: tb_newbee_mall_order.total_price")
	public Integer getTotalPrice() {
		return totalPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979391+09:00", comments = "Source field: tb_newbee_mall_order.total_price")
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979474+09:00", comments = "Source field: tb_newbee_mall_order.pay_status")
	public Byte getPayStatus() {
		return payStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979519+09:00", comments = "Source field: tb_newbee_mall_order.pay_status")
	public void setPayStatus(Byte payStatus) {
		this.payStatus = payStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979601+09:00", comments = "Source field: tb_newbee_mall_order.pay_type")
	public Byte getPayType() {
		return payType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979646+09:00", comments = "Source field: tb_newbee_mall_order.pay_type")
	public void setPayType(Byte payType) {
		this.payType = payType;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979749+09:00", comments = "Source field: tb_newbee_mall_order.pay_time")
	public Date getPayTime() {
		return payTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979795+09:00", comments = "Source field: tb_newbee_mall_order.pay_time")
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979878+09:00", comments = "Source field: tb_newbee_mall_order.order_status")
	public Byte getOrderStatus() {
		return orderStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.979921+09:00", comments = "Source field: tb_newbee_mall_order.order_status")
	public void setOrderStatus(Byte orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980038+09:00", comments = "Source field: tb_newbee_mall_order.extra_info")
	public String getExtraInfo() {
		return extraInfo;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980088+09:00", comments = "Source field: tb_newbee_mall_order.extra_info")
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo == null ? null : extraInfo.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980168+09:00", comments = "Source field: tb_newbee_mall_order.user_name")
	public String getUserName() {
		return userName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980213+09:00", comments = "Source field: tb_newbee_mall_order.user_name")
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980318+09:00", comments = "Source field: tb_newbee_mall_order.user_phone")
	public String getUserPhone() {
		return userPhone;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980389+09:00", comments = "Source field: tb_newbee_mall_order.user_phone")
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone == null ? null : userPhone.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980478+09:00", comments = "Source field: tb_newbee_mall_order.user_address")
	public String getUserAddress() {
		return userAddress;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.98055+09:00", comments = "Source field: tb_newbee_mall_order.user_address")
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress == null ? null : userAddress.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980659+09:00", comments = "Source field: tb_newbee_mall_order.is_deleted")
	public Byte getIsDeleted() {
		return isDeleted;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980707+09:00", comments = "Source field: tb_newbee_mall_order.is_deleted")
	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980798+09:00", comments = "Source field: tb_newbee_mall_order.create_time")
	public Date getCreateTime() {
		return createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980847+09:00", comments = "Source field: tb_newbee_mall_order.create_time")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.980952+09:00", comments = "Source field: tb_newbee_mall_order.update_time")
	public Date getUpdateTime() {
		return updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-29T15:28:59.981001+09:00", comments = "Source field: tb_newbee_mall_order.update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}