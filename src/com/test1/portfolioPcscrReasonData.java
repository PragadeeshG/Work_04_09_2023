package com.test1;

public class portfolioPcscrReasonData {
	private int portfolioId;
	private String dlInclusion;
	private String esrInclusion;
	private String dlExcludeReason;
	private String krInclusion;
	private String igdpInclusion;
	private String krExcludeReason;
	private String igdpExcludeReason;
	private int errorCode;
	private String errorsevetiry;
	private String entityState;

	public portfolioPcscrReasonData() {

	}

	public portfolioPcscrReasonData(int portfolioId, String dlInclusion, String esrInclusion, String dlExcludeReason,
			String krInclusion, String igdpInclusion, String krExcludeReason, String igdpExcludeReason, int errorCode,
			String errorsevetiry, String entityState) {
		super();
		this.portfolioId = portfolioId;
		this.dlInclusion = dlInclusion;
		this.esrInclusion = esrInclusion;
		this.dlExcludeReason = dlExcludeReason;
		this.krInclusion = krInclusion;
		this.igdpInclusion = igdpInclusion;
		this.krExcludeReason = krExcludeReason;
		this.igdpExcludeReason = igdpExcludeReason;
		this.errorCode = errorCode;
		this.errorsevetiry = errorsevetiry;
		this.entityState = entityState;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
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

	public String getDlExcludeReason() {
		return dlExcludeReason;
	}

	public void setDlExcludeReason(String dlExcludeReason) {
		this.dlExcludeReason = dlExcludeReason;
	}

	public String getKrInclusion() {
		return krInclusion;
	}

	public void setKrInclusion(String krInclusion) {
		this.krInclusion = krInclusion;
	}

	public String getIgdpInclusion() {
		return igdpInclusion;
	}

	public void setIgdpInclusion(String igdpInclusion) {
		this.igdpInclusion = igdpInclusion;
	}

	public String getKrExcludeReason() {
		return krExcludeReason;
	}

	public void setKrExcludeReason(String krExcludeReason) {
		this.krExcludeReason = krExcludeReason;
	}

	public String getIgdpExcludeReason() {
		return igdpExcludeReason;
	}

	public void setIgdpExcludeReason(String igdpExcludeReason) {
		this.igdpExcludeReason = igdpExcludeReason;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorsevetiry() {
		return errorsevetiry;
	}

	public void setErrorsevetiry(String errorsevetiry) {
		this.errorsevetiry = errorsevetiry;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
