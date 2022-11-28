package day0822;

public class ColumnVO {
	
	private String columnName, dataType;
	private int dataLength;
	
	public ColumnVO() {
		super();
	}

	public ColumnVO(String columnName, String dataType, int dataLength) {
		super();
		this.columnName = columnName;
		this.dataType = dataType;
		this.dataLength = dataLength;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public int getDataLength() {
		return dataLength;
	}

	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}
	
}//class
