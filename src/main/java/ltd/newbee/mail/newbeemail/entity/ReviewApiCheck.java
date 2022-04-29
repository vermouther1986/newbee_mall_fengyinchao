package ltd.newbee.mail.newbeemail.entity;

import javax.annotation.Generated;

public class ReviewApiCheck {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.701051+09:00", comments="Source field: Review_api_check.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.703304+09:00", comments="Source field: Review_api_check.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.7035+09:00", comments="Source field: Review_api_check.order_id")
    private Long orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.703084+09:00", comments="Source field: Review_api_check.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.70322+09:00", comments="Source field: Review_api_check.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.703375+09:00", comments="Source field: Review_api_check.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.703447+09:00", comments="Source field: Review_api_check.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.70356+09:00", comments="Source field: Review_api_check.order_id")
    public Long getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-29T21:04:31.70362+09:00", comments="Source field: Review_api_check.order_id")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}