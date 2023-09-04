package com.test1;

public class portfolioPCScrData {
	private int portfolioId;
	private String sourceSystem;
	private String uniqueNae;
	private String productControlOwnerRole;
	private int productControlOwnerId;
	private String pcApprovalGroup;
	private String dlInclusion;
	private String esrInclusion;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public portfolioPCScrData() {

	}

	public portfolioPCScrData(int portfolioId, String sourceSystem, String uniqueNae, String productControlOwnerRole,
			int productControlOwnerId, String pcApprovalGroup, String dlInclusion, String esrInclusion, int errorCode,
			String errorSevetiry, String entityState) {
		super();
		this.portfolioId = portfolioId;
		this.sourceSystem = sourceSystem;
		this.uniqueNae = uniqueNae;
		this.productControlOwnerRole = productControlOwnerRole;
		this.productControlOwnerId = productControlOwnerId;
		this.pcApprovalGroup = pcApprovalGroup;
		this.dlInclusion = dlInclusion;
		this.esrInclusion = esrInclusion;
		this.errorCode = errorCode;
		this.errorSevetiry = errorSevetiry;
		this.entityState = entityState;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getUniqueNae() {
		return uniqueNae;
	}

	public void setUniqueNae(String uniqueNae) {
		this.uniqueNae = uniqueNae;
	}

	public String getProductControlOwnerRole() {
		return productControlOwnerRole;
	}

	public void setProductControlOwnerRole(String productControlOwnerRole) {
		this.productControlOwnerRole = productControlOwnerRole;
	}

	public int getProductControlOwnerId() {
		return productControlOwnerId;
	}

	public void setProductControlOwnerId(int productControlOwnerId) {
		this.productControlOwnerId = productControlOwnerId;
	}

	public String getPcApprovalGroup() {
		return pcApprovalGroup;
	}

	public void setPcApprovalGroup(String pcApprovalGroup) {
		this.pcApprovalGroup = pcApprovalGroup;
	}

	public String getDlInclusion() {
		return dlInclusion;
	}

	public void setDlInclusion(String dlInclusion) {
		this.dlInclusion = dlInclusion;
	}

	public String getEsrInclusion() {
		return esrInclusion;
	}

	public void setEsrInclusion(String esrInclusion) {
		this.esrInclusion = esrInclusion;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSevetiry() {
		return errorSevetiry;
	}

	public void setErrorSevetiry(String errorSevetiry) {
		this.errorSevetiry = errorSevetiry;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
