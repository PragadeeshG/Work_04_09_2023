package com.test1;

public class portfolioPCScrUnitData {
	private int portfolioId;
	private String apUnit;
	private String bizUnit;
	private int deptId;
	private String reportingLocation;
	private int reportingLocationCode;
	private String currency;
	private int costCentreCode;
	private String consCenreName;
	private int errorCode;
	private String errorSevetiry;
	private String entityState;

	public portfolioPCScrUnitData() {

	}

	public portfolioPCScrUnitData(int portfolioId, String apUnit, String bizUnit, int deptId, String reportingLocation,
			int reportingLocationCode, String currency, int costCentreCode, String consCenreName, int errorCode,
			String errorSevetiry, String entityState) {
		super();
		this.portfolioId = portfolioId;
		this.apUnit = apUnit;
		this.bizUnit = bizUnit;
		this.deptId = deptId;
		this.reportingLocation = reportingLocation;
		this.reportingLocationCode = reportingLocationCode;
		this.currency = currency;
		this.costCentreCode = costCentreCode;
		this.consCenreName = consCenreName;
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

	public String getApUnit() {
		return apUnit;
	}

	public void setApUnit(String apUnit) {
		this.apUnit = apUnit;
	}

	public String getBizUnit() {
		return bizUnit;
	}

	public void setBizUnit(String bizUnit) {
		this.bizUnit = bizUnit;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getReportingLocation() {
		return reportingLocation;
	}

	public void setReportingLocation(String reportingLocation) {
		this.reportingLocation = reportingLocation;
	}

	public int getReportingLocationCode() {
		return reportingLocationCode;
	}

	public void setReportingLocationCode(int reportingLocationCode) {
		this.reportingLocationCode = reportingLocationCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getCostCentreCode() {
		return costCentreCode;
	}

	public void setCostCentreCode(int costCentreCode) {
		this.costCentreCode = costCentreCode;
	}

	public String getConsCenreName() {
		return consCenreName;
	}

	public void setConsCenreName(String consCenreName) {
		this.consCenreName = consCenreName;
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
