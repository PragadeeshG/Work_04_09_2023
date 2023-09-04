package com.test1;

public class portfolioPCscrMeasure {
	private int portfolioId;
	private String accMeasure;
	private String accClass;
	private String accClassLsfr;
	private String accClassLadp;
	private int tpInstanceCode;
	private String remarks;
	private int noTrades;
	private String errorSevetiry;
	private String entityState;

	public portfolioPCscrMeasure() {

	}

	public portfolioPCscrMeasure(int portfolioId, String accMeasure, String accClass, String accClassLsfr,
			String accClassLadp, int tpInstanceCode, String remarks, int noTrades, String errorSevetiry,
			String entityState) {
		super();
		this.portfolioId = portfolioId;
		this.accMeasure = accMeasure;
		this.accClass = accClass;
		this.accClassLsfr = accClassLsfr;
		this.accClassLadp = accClassLadp;
		this.tpInstanceCode = tpInstanceCode;
		this.remarks = remarks;
		this.noTrades = noTrades;
		this.errorSevetiry = errorSevetiry;
		this.entityState = entityState;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getAccMeasure() {
		return accMeasure;
	}

	public void setAccMeasure(String accMeasure) {
		this.accMeasure = accMeasure;
	}

	public String getAccClass() {
		return accClass;
	}

	public void setAccClass(String accClass) {
		this.accClass = accClass;
	}

	public String getAccClassLsfr() {
		return accClassLsfr;
	}

	public void setAccClassLsfr(String accClassLsfr) {
		this.accClassLsfr = accClassLsfr;
	}

	public String getAccClassLadp() {
		return accClassLadp;
	}

	public void setAccClassLadp(String accClassLadp) {
		this.accClassLadp = accClassLadp;
	}

	public int getTpInstanceCode() {
		return tpInstanceCode;
	}

	public void setTpInstanceCode(int tpInstanceCode) {
		this.tpInstanceCode = tpInstanceCode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getNoTrades() {
		return noTrades;
	}

	public void setNoTrades(int noTrades) {
		this.noTrades = noTrades;
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
