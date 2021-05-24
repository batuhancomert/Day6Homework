package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
