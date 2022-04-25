package ltd.newbee.mail.newbeemail.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallCarousel {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.337881+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_id")
	private Integer carouselId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338201+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_url")
	private String carouselUrl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338396+09:00", comments = "Source field: tb_newbee_mall_carousel.redirect_url")
	private String redirectUrl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338577+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_rank")
	private Integer carouselRank;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338755+09:00", comments = "Source field: tb_newbee_mall_carousel.is_deleted")
	private Byte isDeleted;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.339786+09:00", comments = "Source field: tb_newbee_mall_carousel.create_time")
	private Date createTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.339975+09:00", comments = "Source field: tb_newbee_mall_carousel.create_user")
	private Integer createUser;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340162+09:00", comments = "Source field: tb_newbee_mall_carousel.update_time")
	private Date updateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340334+09:00", comments = "Source field: tb_newbee_mall_carousel.update_user")
	private Integer updateUser;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338032+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_id")
	public Integer getCarouselId() {
		return carouselId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.33814+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_id")
	public void setCarouselId(Integer carouselId) {
		this.carouselId = carouselId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338264+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_url")
	public String getCarouselUrl() {
		return carouselUrl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338342+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_url")
	public void setCarouselUrl(String carouselUrl) {
		this.carouselUrl = carouselUrl == null ? null : carouselUrl.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338454+09:00", comments = "Source field: tb_newbee_mall_carousel.redirect_url")
	public String getRedirectUrl() {
		return redirectUrl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338521+09:00", comments = "Source field: tb_newbee_mall_carousel.redirect_url")
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338639+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_rank")
	public Integer getCarouselRank() {
		return carouselRank;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.338701+09:00", comments = "Source field: tb_newbee_mall_carousel.carousel_rank")
	public void setCarouselRank(Integer carouselRank) {
		this.carouselRank = carouselRank;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.339511+09:00", comments = "Source field: tb_newbee_mall_carousel.is_deleted")
	public Byte getIsDeleted() {
		return isDeleted;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.339715+09:00", comments = "Source field: tb_newbee_mall_carousel.is_deleted")
	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.339853+09:00", comments = "Source field: tb_newbee_mall_carousel.create_time")
	public Date getCreateTime() {
		return createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.339915+09:00", comments = "Source field: tb_newbee_mall_carousel.create_time")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340036+09:00", comments = "Source field: tb_newbee_mall_carousel.create_user")
	public Integer getCreateUser() {
		return createUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340093+09:00", comments = "Source field: tb_newbee_mall_carousel.create_user")
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340227+09:00", comments = "Source field: tb_newbee_mall_carousel.update_time")
	public Date getUpdateTime() {
		return updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.3403+09:00", comments = "Source field: tb_newbee_mall_carousel.update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340369+09:00", comments = "Source field: tb_newbee_mall_carousel.update_user")
	public Integer getUpdateUser() {
		return updateUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-25T19:57:34.340414+09:00", comments = "Source field: tb_newbee_mall_carousel.update_user")
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}
}