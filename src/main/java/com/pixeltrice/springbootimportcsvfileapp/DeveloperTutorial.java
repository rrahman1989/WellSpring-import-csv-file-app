package com.pixeltrice.springbootimportcsvfileapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "csvdata")
public class DeveloperTutorial {

	  @Id
	  @Column(name = "id")
	  private long id;

	  @Column(name = "train_line")
	  private String trainLine;

	  @Column(name = "route_name")
	  private String routeName;

	  @Column(name = "run_number")
	  private String runNumber;
	  
	  @Column(name = "operator_id")
	  private String operatorId;

	  public DeveloperTutorial() {

	  }

	public DeveloperTutorial(long id, String trainLine, String routeName, String runNumber, String operatorId) {
		this.id = id;
		this.trainLine = trainLine;
		this.routeName = routeName;
		this.runNumber = runNumber;
		this.operatorId = operatorId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTrainLine() {
		return trainLine;
	}

	public void setTrainLine(String trainLine) {
		this.trainLine = trainLine;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRunNumber() {
		return runNumber;
	}

	public void setRunNumber(String runNumber) {
		this.runNumber = runNumber;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	@Override
	public String toString() {
		return "DeveloperTutorial [id=" + id + ", trainLine=" + trainLine + ", routeName=" + routeName + ", runNumber="
				+ runNumber + ", operatorId=" + operatorId + "]";
	}
	  
	
	
	  
	  
	  

//	  public DeveloperTutorial(long id, String trainLine, String routeName, String runNumber) {
//	    this.id = id;
//	    this.title = title;
//	    this.description = description;
//	    this.published = published;
//	  }
//
//	  public long getId() {
//	    return id;
//	  }
//
//	  public void setId(long id) {
//	    this.id = id;
//	  }
//
//	  public String getTitle() {
//	    return title;
//	  }
//
//	  public void setTitle(String title) {
//	    this.title = title;
//	  }
//
//	  public String getDescription() {
//	    return description;
//	  }
//
//	  public void setDescription(String description) {
//	    this.description = description;
//	  }
//
//	  public boolean isPublished() {
//	    return published;
//	  }
//
//	  public void setPublished(boolean isPublished) {
//	    this.published = isPublished;
//	  }
//
//	  @Override
//	  public String toString() {
//	    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
//	  }
	}
