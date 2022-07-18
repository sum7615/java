package co.suman.entity;

public class Manager extends Employee {
	private String degnation;
	private String reportTo;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public String getDegnation() {
		return degnation;
	}
	public void setDegnation(String degnation) {
		this.degnation = degnation;
	}
	public String getReportTo() {
		return reportTo;
	}
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}
	@Override
	public String toString() {
		return "Manager [degnation=" + degnation + ", reportTo=" + reportTo + "]";
	}
	
}
