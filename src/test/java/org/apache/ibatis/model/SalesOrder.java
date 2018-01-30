/*
 * Powered By [fanli]
 * Since 2014 - 2017
 */

package org.apache.ibatis.model;


import java.io.Serializable;

public class SalesOrder implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;


	//columns START

	private Long id;           //"id";

	private Integer userId;           //"买家ID";

	private String userOrigin;           //"用户来源：空和FANLI代表返利用户";

	private String userName;           //"买家真实姓名";

	private String userCode;           //"买家账号";

	private String userPhone;           //"买家联系电话";

	private String userEmail;           //"买家邮箱";

	private Integer sellerId;           //"卖家ID";

	private String orderCode;           //"订单编号";

	private Integer orderType;           //"订单类型：0:普通订单;1:虚拟订单;2:海淘订单 7 外部商城海淘订单";

	private Integer orderStatus;           //"订单状态:0待付款;1待发货;2待收货(已发货),3待退款,4交易取消，5交易成功  6 退款成功 7 已付款(拼团)";

	private Integer orderSource;           //"订单来源，1:PC订单;2:移动订单(安卓\IOS)";

	private java.math.BigDecimal orderAmount;           //"订单总额=产品总额+配送费-减免金额-积分金额（应付金额）";

	private java.math.BigDecimal orderPoint;           //"订单积分（获取的积分）";

	private String orderRemark;           //"订单备注";

	private java.util.Date orderCreateTime;           //"创建时间";

	private java.util.Date orderConfirmTime;           //"订单确认时间";

	private java.util.Date orderPaymentTime;           //"订单支付时间";

	private java.util.Date orderDeliveryTime;           //"订单发货时间";

	private java.util.Date orderReceiveTime;           //"订单收货时间";

	private Integer orderBusinessType;           //"订单业务类型，例如0:普通订单；1:超级返利订单; 2:九块九订单；3:团购订单;4:国际订单5：母婴订单6：F币兑换商城";

	private Integer orderProductNum;           //"订单产品数量";

	private java.math.BigDecimal orderProductFee;           //"订单产品金额";

	private java.math.BigDecimal rebateFee;           //"订单返利金额";

	private java.math.BigDecimal couponFee;           //"订单抵用券金额？";

	private java.math.BigDecimal deliveryFee;           //"配送费用";

	private java.math.BigDecimal discountFee;           //"减免金额：促销折扣金额";

	private java.math.BigDecimal pointFee;           //"积分抵扣费用";

	private java.math.BigDecimal paymentFee;           //"支付费用(用户实际支付金额)";

	private Integer paymentMethod;           //"支付方式 0:账户支付,1:网上支付,2:货到付款,3:邮局汇款,4:银行转账,5:pos机,6:万里通,7:分期付款,8:合同账期,9:货到转账,10:货到付支票,11:礼品卡促销领用,12:货到刷支付宝";

	private Integer paymentGatewayId;           //"支付网关ID；10;阿里手机网页支付.11;阿里手机控件支付12;阿里PC网页支付20;银联手机网页支付21;银联手机控件支付22;银联PC网页支付30;微信支付;F币手机支付40";

	private Long paymentCode;           //"支付流水号";

	private Integer paymentStatus;           //"支付状态             1. 完全支付              2. 未支付              3.部分支付              4.待审核";

	private Integer receiverId;           //"收货人ID";

	private String receiverName;           //"收货人名称";

	private Integer receiverCountryId;           //"收货人国家";

	private Integer receiverProvinceId;           //"收货人省份";

	private Integer receiverCityId;           //"收货人城市";

	private Integer receiverCountyId;           //"收货人区县";

	private Integer receiverTownId;           //"收货人乡镇";

	private String receiverAddress;           //"收货人地址";

	private String receiverPostCode;           //"收货人邮编";

	private String receiverPhone;           //"收货人电话";

	private String receiverMobile;           //"收货人手机号";

	private Integer deliveryMethod;           //"配送方式";

	private Integer deliveryCompanyId;           //"配送公司ID";

	private String deliveryCompanyName;           //"配送公司名称";

	private String deliveryCode;           //"配送订单号";

	private String deliveryCompanyUrl;           //"配送公司URL";

	private String deliveryRemark;           //"配送备注";

	private Integer invoiceId;           //"发票ID";

	private java.util.Date createTime;           //"创建时间";

	private java.util.Date updateTime;           //"更新时间";

	private String batchOrderCode;           //"订单批次号:开头PC订单为(P);移动订单(M)";

	private Integer isDeleted;           //"是否删除 0：未删除，1：已删除";

	private java.util.Date orderFinanceTime;           //"财务退款时间";

	private java.util.Date orderCancelTime;           //"订单取消时间";

	private Integer isBatch;           //"是否是批量付款(0,批次付款 1单个付款)";

	private Integer newUser;           //"是否是新用户提交的订单：0不是，1是";

	private Integer subSellerId;           //"子商家帐号";

	private Integer pushStatus;           //"订单推送状态：10推单失败，11推单成功，12推单重复，20推返利失败，21推返利成功，22-推返利重复";

	private Integer huodongId;           //"关联活动ID";

	private String xunleiId;           //"迅雷用户id";

	private Integer exceptionType;           //"1.全家活动异常订单";

	private Integer statementStatus;           //"结算状态(0,不可结算;1,可结算)";

	private java.util.Date statementTime;           //"可结算时间";

	private String outCode;           //"返利网用于跟踪状态的outcode";

	private Integer tuanId;           //"拼团ID";

	private java.util.Date orderTuanTime;           //"订单成团时间";

	private Integer orderRefundStatus;           //"订单退款详细状态  0 不是退款订单  1 订单全额退款  2 订单交易成功部分退款 3 订单已发货(部分退款)   4(待发货部分退款)   11 全额退款成功  12 部分退款成功 13 已发货(部分退款成功)";

	private Integer isReviewed;           //"订单是否已评价：0-未评价，1-已评价";

	private java.math.BigDecimal totalTax;           //"总税费";

	private String sellerRemark;           //"卖家备注";

	private Integer lotterySucFlag;           //"0:未中奖   1:中奖";

	private java.util.Date lotteryOpenTime;           //"开奖时间";

	private Integer userCouponId;           //"user_coupon表（买家优惠券）ID";

	private String sellerComments;           //"商家对订单的备注，自营订单买家不可见，海淘订单备注对买家可见";

	private String remarkMsp;           //"运营平台操作记录";

	private java.util.Date orderStatusUnshipTime;           //"订单置为待发货的时间";

	private Integer orderFreeType;           //"订单免单类型 0：默认值，1：普通团团长免单";

	private Integer appMessageStatus;           //"0：未发送消息，1：已发送提醒支付消息，2：已发送邀请好友参团消息  12/21：1,2都已发送";

	private Integer outBuyStatus;           //"海淘订单购买情况";

	private String identityCardFront;           //"身份证正面";

	private String identityCardBack;           //"身份证背面";

	private java.math.BigDecimal totalWeight;           //"商品总重量";

	private String receiverIdentityCardNo;           //"收货人身份证号";

	private String sellerShopName;           //"商家店铺名称";

	private String sellerShopLogo;           //"商家店铺Logo";

	private String shopHeadPic;           //"店铺头图";

	private String haitaoLocal;           //"海淘商家国家";

	private java.math.BigDecimal mulitiplyDiscountFee;           //"多买优惠金额";

	private Integer otherPushStatus;           //"向第三方推单状态，-1：虚拟商品订单失败、1：虚拟商品订单成功；-2：海淘商品订单失败，2：海淘商品订单成功";

	private java.math.BigDecimal haitaoOtherfee;           //"海淘商品其它费用";

	private java.math.BigDecimal haitaoPromotionAmount;           //"海淘订单优惠金额";

	private Integer haitaoPlatform;           //"海淘平台，用于支付完成推单";

	private Integer inSure;           //"是否投退货险 0不投  1订单部分商品投 2订单全部商品投 4订单预投宝";

	private String page;           //"商品渠道来源页面";

	private String module;           //"商品渠道来源模块";

	private Integer haitaoPushStatus;           //"向第三方海淘推单支付成功状态，-2：失败，2：成功";

	private Long freeReceiveId;           //"0元领活动ID";

	private java.math.BigDecimal taxDiscountFee;           //"taxDiscountFee";

	private java.util.Date haitaoOrderBuyTime;           //"海淘采购时间";

	private Integer fenmiSysId;           //"关联第三方订单记录id";

	private String orderComment;           //"后台对订单的备注，用户前台也可以显示";

	private Integer haitaoTaxChannelType;           //"转运路线标识,1-行邮，4-BC";
	//columns END


	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	public void setUserOrigin(String value) {
		this.userOrigin = value;
	}
	
	public String getUserOrigin() {
		return this.userOrigin;
	}
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserCode(String value) {
		this.userCode = value;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserPhone(String value) {
		this.userPhone = value;
	}
	
	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserEmail(String value) {
		this.userEmail = value;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}
	public void setSellerId(Integer value) {
		this.sellerId = value;
	}
	
	public Integer getSellerId() {
		return this.sellerId;
	}
	public void setOrderCode(String value) {
		this.orderCode = value;
	}
	
	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderType(Integer value) {
		this.orderType = value;
	}
	
	public Integer getOrderType() {
		return this.orderType;
	}
	public void setOrderStatus(Integer value) {
		this.orderStatus = value;
	}
	
	public Integer getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderSource(Integer value) {
		this.orderSource = value;
	}
	
	public Integer getOrderSource() {
		return this.orderSource;
	}
	public void setOrderAmount(java.math.BigDecimal value) {
		this.orderAmount = value;
	}
	
	public java.math.BigDecimal getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderPoint(java.math.BigDecimal value) {
		this.orderPoint = value;
	}
	
	public java.math.BigDecimal getOrderPoint() {
		return this.orderPoint;
	}
	public void setOrderRemark(String value) {
		this.orderRemark = value;
	}
	
	public String getOrderRemark() {
		return this.orderRemark;
	}
	public void setOrderCreateTime(java.util.Date value) {
		this.orderCreateTime = value;
	}
	
	public java.util.Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderConfirmTime(java.util.Date value) {
		this.orderConfirmTime = value;
	}
	
	public java.util.Date getOrderConfirmTime() {
		return this.orderConfirmTime;
	}
	public void setOrderPaymentTime(java.util.Date value) {
		this.orderPaymentTime = value;
	}
	
	public java.util.Date getOrderPaymentTime() {
		return this.orderPaymentTime;
	}
	public void setOrderDeliveryTime(java.util.Date value) {
		this.orderDeliveryTime = value;
	}
	
	public java.util.Date getOrderDeliveryTime() {
		return this.orderDeliveryTime;
	}
	public void setOrderReceiveTime(java.util.Date value) {
		this.orderReceiveTime = value;
	}
	
	public java.util.Date getOrderReceiveTime() {
		return this.orderReceiveTime;
	}
	public void setOrderBusinessType(Integer value) {
		this.orderBusinessType = value;
	}
	
	public Integer getOrderBusinessType() {
		return this.orderBusinessType;
	}
	public void setOrderProductNum(Integer value) {
		this.orderProductNum = value;
	}
	
	public Integer getOrderProductNum() {
		return this.orderProductNum;
	}
	public void setOrderProductFee(java.math.BigDecimal value) {
		this.orderProductFee = value;
	}
	
	public java.math.BigDecimal getOrderProductFee() {
		return this.orderProductFee;
	}
	public void setRebateFee(java.math.BigDecimal value) {
		this.rebateFee = value;
	}
	
	public java.math.BigDecimal getRebateFee() {
		return this.rebateFee;
	}
	public void setCouponFee(java.math.BigDecimal value) {
		this.couponFee = value;
	}
	
	public java.math.BigDecimal getCouponFee() {
		return this.couponFee;
	}
	public void setDeliveryFee(java.math.BigDecimal value) {
		this.deliveryFee = value;
	}
	
	public java.math.BigDecimal getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDiscountFee(java.math.BigDecimal value) {
		this.discountFee = value;
	}
	
	public java.math.BigDecimal getDiscountFee() {
		return this.discountFee;
	}
	public void setPointFee(java.math.BigDecimal value) {
		this.pointFee = value;
	}
	
	public java.math.BigDecimal getPointFee() {
		return this.pointFee;
	}
	public void setPaymentFee(java.math.BigDecimal value) {
		this.paymentFee = value;
	}
	
	public java.math.BigDecimal getPaymentFee() {
		return this.paymentFee;
	}
	public void setPaymentMethod(Integer value) {
		this.paymentMethod = value;
	}
	
	public Integer getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentGatewayId(Integer value) {
		this.paymentGatewayId = value;
	}
	
	public Integer getPaymentGatewayId() {
		return this.paymentGatewayId;
	}
	public void setPaymentCode(Long value) {
		this.paymentCode = value;
	}
	
	public Long getPaymentCode() {
		return this.paymentCode;
	}
	public void setPaymentStatus(Integer value) {
		this.paymentStatus = value;
	}
	
	public Integer getPaymentStatus() {
		return this.paymentStatus;
	}
	public void setReceiverId(Integer value) {
		this.receiverId = value;
	}
	
	public Integer getReceiverId() {
		return this.receiverId;
	}
	public void setReceiverName(String value) {
		this.receiverName = value;
	}
	
	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverCountryId(Integer value) {
		this.receiverCountryId = value;
	}
	
	public Integer getReceiverCountryId() {
		return this.receiverCountryId;
	}
	public void setReceiverProvinceId(Integer value) {
		this.receiverProvinceId = value;
	}
	
	public Integer getReceiverProvinceId() {
		return this.receiverProvinceId;
	}
	public void setReceiverCityId(Integer value) {
		this.receiverCityId = value;
	}
	
	public Integer getReceiverCityId() {
		return this.receiverCityId;
	}
	public void setReceiverCountyId(Integer value) {
		this.receiverCountyId = value;
	}
	
	public Integer getReceiverCountyId() {
		return this.receiverCountyId;
	}
	public void setReceiverTownId(Integer value) {
		this.receiverTownId = value;
	}
	
	public Integer getReceiverTownId() {
		return this.receiverTownId;
	}
	public void setReceiverAddress(String value) {
		this.receiverAddress = value;
	}
	
	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverPostCode(String value) {
		this.receiverPostCode = value;
	}
	
	public String getReceiverPostCode() {
		return this.receiverPostCode;
	}
	public void setReceiverPhone(String value) {
		this.receiverPhone = value;
	}
	
	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverMobile(String value) {
		this.receiverMobile = value;
	}
	
	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setDeliveryMethod(Integer value) {
		this.deliveryMethod = value;
	}
	
	public Integer getDeliveryMethod() {
		return this.deliveryMethod;
	}
	public void setDeliveryCompanyId(Integer value) {
		this.deliveryCompanyId = value;
	}
	
	public Integer getDeliveryCompanyId() {
		return this.deliveryCompanyId;
	}
	public void setDeliveryCompanyName(String value) {
		this.deliveryCompanyName = value;
	}
	
	public String getDeliveryCompanyName() {
		return this.deliveryCompanyName;
	}
	public void setDeliveryCode(String value) {
		this.deliveryCode = value;
	}
	
	public String getDeliveryCode() {
		return this.deliveryCode;
	}
	public void setDeliveryCompanyUrl(String value) {
		this.deliveryCompanyUrl = value;
	}
	
	public String getDeliveryCompanyUrl() {
		return this.deliveryCompanyUrl;
	}
	public void setDeliveryRemark(String value) {
		this.deliveryRemark = value;
	}
	
	public String getDeliveryRemark() {
		return this.deliveryRemark;
	}
	public void setInvoiceId(Integer value) {
		this.invoiceId = value;
	}
	
	public Integer getInvoiceId() {
		return this.invoiceId;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	public void setBatchOrderCode(String value) {
		this.batchOrderCode = value;
	}
	
	public String getBatchOrderCode() {
		return this.batchOrderCode;
	}
	public void setIsDeleted(Integer value) {
		this.isDeleted = value;
	}
	
	public Integer getIsDeleted() {
		return this.isDeleted;
	}
	public void setOrderFinanceTime(java.util.Date value) {
		this.orderFinanceTime = value;
	}
	
	public java.util.Date getOrderFinanceTime() {
		return this.orderFinanceTime;
	}
	public void setOrderCancelTime(java.util.Date value) {
		this.orderCancelTime = value;
	}
	
	public java.util.Date getOrderCancelTime() {
		return this.orderCancelTime;
	}
	public void setIsBatch(Integer value) {
		this.isBatch = value;
	}
	
	public Integer getIsBatch() {
		return this.isBatch;
	}
	public void setNewUser(Integer value) {
		this.newUser = value;
	}
	
	public Integer getNewUser() {
		return this.newUser;
	}
	public void setSubSellerId(Integer value) {
		this.subSellerId = value;
	}
	
	public Integer getSubSellerId() {
		return this.subSellerId;
	}
	public void setPushStatus(Integer value) {
		this.pushStatus = value;
	}
	
	public Integer getPushStatus() {
		return this.pushStatus;
	}
	public void setHuodongId(Integer value) {
		this.huodongId = value;
	}
	
	public Integer getHuodongId() {
		return this.huodongId;
	}
	public void setXunleiId(String value) {
		this.xunleiId = value;
	}
	
	public String getXunleiId() {
		return this.xunleiId;
	}
	public void setExceptionType(Integer value) {
		this.exceptionType = value;
	}
	
	public Integer getExceptionType() {
		return this.exceptionType;
	}
	public void setStatementStatus(Integer value) {
		this.statementStatus = value;
	}
	
	public Integer getStatementStatus() {
		return this.statementStatus;
	}
	public void setStatementTime(java.util.Date value) {
		this.statementTime = value;
	}
	
	public java.util.Date getStatementTime() {
		return this.statementTime;
	}
	public void setOutCode(String value) {
		this.outCode = value;
	}
	
	public String getOutCode() {
		return this.outCode;
	}
	public void setTuanId(Integer value) {
		this.tuanId = value;
	}
	
	public Integer getTuanId() {
		return this.tuanId;
	}
	public void setOrderTuanTime(java.util.Date value) {
		this.orderTuanTime = value;
	}
	
	public java.util.Date getOrderTuanTime() {
		return this.orderTuanTime;
	}
	public void setOrderRefundStatus(Integer value) {
		this.orderRefundStatus = value;
	}
	
	public Integer getOrderRefundStatus() {
		return this.orderRefundStatus;
	}
	public void setIsReviewed(Integer value) {
		this.isReviewed = value;
	}
	
	public Integer getIsReviewed() {
		return this.isReviewed;
	}
	public void setTotalTax(java.math.BigDecimal value) {
		this.totalTax = value;
	}
	
	public java.math.BigDecimal getTotalTax() {
		return this.totalTax;
	}
	public void setSellerRemark(String value) {
		this.sellerRemark = value;
	}
	
	public String getSellerRemark() {
		return this.sellerRemark;
	}
	public void setLotterySucFlag(Integer value) {
		this.lotterySucFlag = value;
	}
	
	public Integer getLotterySucFlag() {
		return this.lotterySucFlag;
	}
	public void setLotteryOpenTime(java.util.Date value) {
		this.lotteryOpenTime = value;
	}
	
	public java.util.Date getLotteryOpenTime() {
		return this.lotteryOpenTime;
	}
	public void setUserCouponId(Integer value) {
		this.userCouponId = value;
	}
	
	public Integer getUserCouponId() {
		return this.userCouponId;
	}
	public void setSellerComments(String value) {
		this.sellerComments = value;
	}
	
	public String getSellerComments() {
		return this.sellerComments;
	}
	public void setRemarkMsp(String value) {
		this.remarkMsp = value;
	}
	
	public String getRemarkMsp() {
		return this.remarkMsp;
	}
	public void setOrderStatusUnshipTime(java.util.Date value) {
		this.orderStatusUnshipTime = value;
	}
	
	public java.util.Date getOrderStatusUnshipTime() {
		return this.orderStatusUnshipTime;
	}
	public void setOrderFreeType(Integer value) {
		this.orderFreeType = value;
	}
	
	public Integer getOrderFreeType() {
		return this.orderFreeType;
	}
	public void setAppMessageStatus(Integer value) {
		this.appMessageStatus = value;
	}
	
	public Integer getAppMessageStatus() {
		return this.appMessageStatus;
	}
	public void setOutBuyStatus(Integer value) {
		this.outBuyStatus = value;
	}
	
	public Integer getOutBuyStatus() {
		return this.outBuyStatus;
	}
	public void setIdentityCardFront(String value) {
		this.identityCardFront = value;
	}
	
	public String getIdentityCardFront() {
		return this.identityCardFront;
	}
	public void setIdentityCardBack(String value) {
		this.identityCardBack = value;
	}
	
	public String getIdentityCardBack() {
		return this.identityCardBack;
	}
	public void setTotalWeight(java.math.BigDecimal value) {
		this.totalWeight = value;
	}
	
	public java.math.BigDecimal getTotalWeight() {
		return this.totalWeight;
	}
	public void setReceiverIdentityCardNo(String value) {
		this.receiverIdentityCardNo = value;
	}
	
	public String getReceiverIdentityCardNo() {
		return this.receiverIdentityCardNo;
	}
	public void setSellerShopName(String value) {
		this.sellerShopName = value;
	}
	
	public String getSellerShopName() {
		return this.sellerShopName;
	}
	public void setSellerShopLogo(String value) {
		this.sellerShopLogo = value;
	}
	
	public String getSellerShopLogo() {
		return this.sellerShopLogo;
	}
	public void setShopHeadPic(String value) {
		this.shopHeadPic = value;
	}
	
	public String getShopHeadPic() {
		return this.shopHeadPic;
	}
	public void setHaitaoLocal(String value) {
		this.haitaoLocal = value;
	}
	
	public String getHaitaoLocal() {
		return this.haitaoLocal;
	}
	public void setMulitiplyDiscountFee(java.math.BigDecimal value) {
		this.mulitiplyDiscountFee = value;
	}
	
	public java.math.BigDecimal getMulitiplyDiscountFee() {
		return this.mulitiplyDiscountFee;
	}
	public void setOtherPushStatus(Integer value) {
		this.otherPushStatus = value;
	}
	
	public Integer getOtherPushStatus() {
		return this.otherPushStatus;
	}
	public void setHaitaoOtherfee(java.math.BigDecimal value) {
		this.haitaoOtherfee = value;
	}
	
	public java.math.BigDecimal getHaitaoOtherfee() {
		return this.haitaoOtherfee;
	}
	public void setHaitaoPromotionAmount(java.math.BigDecimal value) {
		this.haitaoPromotionAmount = value;
	}
	
	public java.math.BigDecimal getHaitaoPromotionAmount() {
		return this.haitaoPromotionAmount;
	}
	public void setHaitaoPlatform(Integer value) {
		this.haitaoPlatform = value;
	}
	
	public Integer getHaitaoPlatform() {
		return this.haitaoPlatform;
	}
	public void setInSure(Integer value) {
		this.inSure = value;
	}
	
	public Integer getInSure() {
		return this.inSure;
	}
	public void setPage(String value) {
		this.page = value;
	}
	
	public String getPage() {
		return this.page;
	}
	public void setModule(String value) {
		this.module = value;
	}
	
	public String getModule() {
		return this.module;
	}
	public void setHaitaoPushStatus(Integer value) {
		this.haitaoPushStatus = value;
	}
	
	public Integer getHaitaoPushStatus() {
		return this.haitaoPushStatus;
	}
	public void setFreeReceiveId(Long value) {
		this.freeReceiveId = value;
	}
	
	public Long getFreeReceiveId() {
		return this.freeReceiveId;
	}
	public void setTaxDiscountFee(java.math.BigDecimal value) {
		this.taxDiscountFee = value;
	}
	
	public java.math.BigDecimal getTaxDiscountFee() {
		return this.taxDiscountFee;
	}
	public void setHaitaoOrderBuyTime(java.util.Date value) {
		this.haitaoOrderBuyTime = value;
	}
	
	public java.util.Date getHaitaoOrderBuyTime() {
		return this.haitaoOrderBuyTime;
	}
	public void setFenmiSysId(Integer value) {
		this.fenmiSysId = value;
	}
	
	public Integer getFenmiSysId() {
		return this.fenmiSysId;
	}
	public void setOrderComment(String value) {
		this.orderComment = value;
	}
	
	public String getOrderComment() {
		return this.orderComment;
	}
	public void setHaitaoTaxChannelType(Integer value) {
		this.haitaoTaxChannelType = value;
	}
	
	public Integer getHaitaoTaxChannelType() {
		return this.haitaoTaxChannelType;
	}


}

