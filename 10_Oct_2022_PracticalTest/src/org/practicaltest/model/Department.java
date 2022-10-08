package org.practicaltest.model;

import java.util.Objects;

public class Department {

	DepartmentName depName;
	int depId;
	
	public Department(DepartmentName depName, int depId) {
		
		this.depName = depName;
		this.depId = depId;
	}

	public DepartmentName getDepName() {
		return depName;
	}

	public void setDepName(DepartmentName depName) {
		this.depName = depName;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depId, depName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return depId == other.depId && Objects.equals(depName, other.depName);
	}

	@Override
	public String toString() {
		return "Department [depName=" + depName + ", depId=" + depId + "]";
	}
	
	
	
}
