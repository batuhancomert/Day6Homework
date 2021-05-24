package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobPositionService;
import kodlama.io.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlama.io.HRMS.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		
		
		return this.jobPositionDao.findAll();
	}

}
