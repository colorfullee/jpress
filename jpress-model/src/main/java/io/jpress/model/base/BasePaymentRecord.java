package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePaymentRecord<M extends BasePaymentRecord<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	public void setId(java.lang.Long id) {
		set("id", id);
	}

    /**
     * id
     */
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setProductType(java.lang.String productType) {
		set("product_type", productType);
	}

	public java.lang.String getProductType() {
		return getStr("product_type");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}

	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

    /**
     * 商品名称
     */
	public void setProductName(java.lang.String productName) {
		set("product_name", productName);
	}

    /**
     * 商品名称
     */
	public java.lang.String getProductName() {
		return getStr("product_name");
	}

    /**
     * 产品描述，产品摘要
     */
	public void setProductDesc(java.lang.String productDesc) {
		set("product_desc", productDesc);
	}

    /**
     * 产品描述，产品摘要
     */
	public java.lang.String getProductDesc() {
		return getStr("product_desc");
	}

    /**
     * 支付流水号
     */
	public void setTrxNo(java.lang.String trxNo) {
		set("trx_no", trxNo);
	}

    /**
     * 支付流水号
     */
	public java.lang.String getTrxNo() {
		return getStr("trx_no");
	}

    /**
     * 交易业务类型  ：消费、充值等
     */
	public void setTrxType(java.lang.String trxType) {
		set("trx_type", trxType);
	}

    /**
     * 交易业务类型  ：消费、充值等
     */
	public java.lang.String getTrxType() {
		return getStr("trx_type");
	}

	public void setTrxNonceStr(java.lang.String trxNonceStr) {
		set("trx_nonce_str", trxNonceStr);
	}

	public java.lang.String getTrxNonceStr() {
		return getStr("trx_nonce_str");
	}

    /**
     * 付款人编号
     */
	public void setPayerUserId(java.lang.Long payerUserId) {
		set("payer_user_id", payerUserId);
	}

    /**
     * 付款人编号
     */
	public java.lang.Long getPayerUserId() {
		return getLong("payer_user_id");
	}

    /**
     * 付款人名称
     */
	public void setPayerName(java.lang.String payerName) {
		set("payer_name", payerName);
	}

    /**
     * 付款人名称
     */
	public java.lang.String getPayerName() {
		return getStr("payer_name");
	}

    /**
     * 付款方手续费
     */
	public void setPayerFee(java.math.BigDecimal payerFee) {
		set("payer_fee", payerFee);
	}

    /**
     * 付款方手续费
     */
	public java.math.BigDecimal getPayerFee() {
		return get("payer_fee");
	}

    /**
     * 下单ip(客户端ip,从网关中获取)
     */
	public void setOrderIp(java.lang.String orderIp) {
		set("order_ip", orderIp);
	}

    /**
     * 下单ip(客户端ip,从网关中获取)
     */
	public java.lang.String getOrderIp() {
		return getStr("order_ip");
	}

    /**
     * 从哪个页面链接过来的(可用于防诈骗)
     */
	public void setOrderRefererUrl(java.lang.String orderRefererUrl) {
		set("order_referer_url", orderRefererUrl);
	}

    /**
     * 从哪个页面链接过来的(可用于防诈骗)
     */
	public java.lang.String getOrderRefererUrl() {
		return getStr("order_referer_url");
	}

    /**
     * 订单来源
     */
	public void setOrderFrom(java.lang.String orderFrom) {
		set("order_from", orderFrom);
	}

    /**
     * 订单来源
     */
	public java.lang.String getOrderFrom() {
		return getStr("order_from");
	}

    /**
     * 支付状态
     */
	public void setPayStatus(java.lang.Integer payStatus) {
		set("pay_status", payStatus);
	}

    /**
     * 支付状态
     */
	public java.lang.Integer getPayStatus() {
		return getInt("pay_status");
	}

    /**
     * 支付类型编号
     */
	public void setPayType(java.lang.String payType) {
		set("pay_type", payType);
	}

    /**
     * 支付类型编号
     */
	public java.lang.String getPayType() {
		return getStr("pay_type");
	}

    /**
     * 支付银行类型
     */
	public void setPayBankType(java.lang.String payBankType) {
		set("pay_bank_type", payBankType);
	}

    /**
     * 支付银行类型
     */
	public java.lang.String getPayBankType() {
		return getStr("pay_bank_type");
	}

    /**
     * 订单金额
     */
	public void setPayAmount(java.math.BigDecimal payAmount) {
		set("pay_amount", payAmount);
	}

    /**
     * 订单金额
     */
	public java.math.BigDecimal getPayAmount() {
		return get("pay_amount");
	}

    /**
     * 成功支付金额
     */
	public void setPaySuccessAmount(java.math.BigDecimal paySuccessAmount) {
		set("pay_success_amount", paySuccessAmount);
	}

    /**
     * 成功支付金额
     */
	public java.math.BigDecimal getPaySuccessAmount() {
		return get("pay_success_amount");
	}

    /**
     * 支付成功时间
     */
	public void setPaySuccessTime(java.util.Date paySuccessTime) {
		set("pay_success_time", paySuccessTime);
	}

    /**
     * 支付成功时间
     */
	public java.util.Date getPaySuccessTime() {
		return get("pay_success_time");
	}

    /**
     * 支付证明，手动入账时需要截图
     */
	public void setPaySuccessProof(java.lang.String paySuccessProof) {
		set("pay_success_proof", paySuccessProof);
	}

    /**
     * 支付证明，手动入账时需要截图
     */
	public java.lang.String getPaySuccessProof() {
		return getStr("pay_success_proof");
	}

    /**
     * 支付备注
     */
	public void setPaySuccessRemarks(java.lang.String paySuccessRemarks) {
		set("pay_success_remarks", paySuccessRemarks);
	}

    /**
     * 支付备注
     */
	public java.lang.String getPaySuccessRemarks() {
		return getStr("pay_success_remarks");
	}

    /**
     * 完成时间
     */
	public void setPayCompleteTime(java.util.Date payCompleteTime) {
		set("pay_complete_time", payCompleteTime);
	}

    /**
     * 完成时间
     */
	public java.util.Date getPayCompleteTime() {
		return get("pay_complete_time");
	}

    /**
     * 退款流水号
     */
	public void setRefundNo(java.lang.String refundNo) {
		set("refund_no", refundNo);
	}

    /**
     * 退款流水号
     */
	public java.lang.String getRefundNo() {
		return getStr("refund_no");
	}

    /**
     * 退款金额
     */
	public void setRefundAmount(java.lang.Integer refundAmount) {
		set("refund_amount", refundAmount);
	}

    /**
     * 退款金额
     */
	public java.lang.Integer getRefundAmount() {
		return getInt("refund_amount");
	}

    /**
     * 退款描述
     */
	public void setRefundDesc(java.lang.String refundDesc) {
		set("refund_desc", refundDesc);
	}

    /**
     * 退款描述
     */
	public java.lang.String getRefundDesc() {
		return getStr("refund_desc");
	}

    /**
     * 退款时间
     */
	public void setRefundTime(java.util.Date refundTime) {
		set("refund_time", refundTime);
	}

    /**
     * 退款时间
     */
	public java.util.Date getRefundTime() {
		return get("refund_time");
	}

    /**
     * 微信appid 或者 支付宝的appid，thirdparty 指的是支付的第三方比如微信、支付宝、PayPal等
     */
	public void setThirdpartyAppid(java.lang.String thirdpartyAppid) {
		set("thirdparty_appid", thirdpartyAppid);
	}

    /**
     * 微信appid 或者 支付宝的appid，thirdparty 指的是支付的第三方比如微信、支付宝、PayPal等
     */
	public java.lang.String getThirdpartyAppid() {
		return getStr("thirdparty_appid");
	}

    /**
     * 商户号
     */
	public void setThirdpartyMchId(java.lang.String thirdpartyMchId) {
		set("thirdparty_mch_id", thirdpartyMchId);
	}

    /**
     * 商户号
     */
	public java.lang.String getThirdpartyMchId() {
		return getStr("thirdparty_mch_id");
	}

    /**
     * 交易类型
     */
	public void setThirdpartyTradeType(java.lang.String thirdpartyTradeType) {
		set("thirdparty_trade_type", thirdpartyTradeType);
	}

    /**
     * 交易类型
     */
	public java.lang.String getThirdpartyTradeType() {
		return getStr("thirdparty_trade_type");
	}

	public void setThirdpartyTransactionId(java.lang.String thirdpartyTransactionId) {
		set("thirdparty_transaction_id", thirdpartyTransactionId);
	}

	public java.lang.String getThirdpartyTransactionId() {
		return getStr("thirdparty_transaction_id");
	}

	public void setThirdpartyUserOpenid(java.lang.String thirdpartyUserOpenid) {
		set("thirdparty_user_openid", thirdpartyUserOpenid);
	}

	public java.lang.String getThirdpartyUserOpenid() {
		return getStr("thirdparty_user_openid");
	}

    /**
     * 备注
     */
	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

    /**
     * 备注
     */
	public java.lang.String getRemark() {
		return getStr("remark");
	}

    /**
     * 状态(支付中、支持成功、支付失败、退款中、退款成功)
     */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 状态(支付中、支持成功、支付失败、退款中、退款成功)
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setOptions(java.lang.String options) {
		set("options", options);
	}

	public java.lang.String getOptions() {
		return getStr("options");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return get("modified");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

}
