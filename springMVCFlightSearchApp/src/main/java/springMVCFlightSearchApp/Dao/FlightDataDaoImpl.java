package springMVCFlightSearchApp.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMVCFlightSearchApp.model.FlightData;

@Repository
public class FlightDataDaoImpl implements FlightDataDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * Inserting Flight Data from CSV to Database
	 */
	@Transactional
	public void insertFlightData(FlightData flightdata) {
		
	/*	List<FlightData> isAvalableFlights = hibernateTemplate.execute(session -> {
			Query query = session.createQuery("from FlightData where flightNo=:no and date=:date");
			query.setParameter("no", flightdata.getFlightNo());
			query.setParameter("date", flightdata.getDate());
			return query.list();
		});
		if(isAvalableFlights.size() == 0) {*/
		SessionFactory sessionFactory=hibernateTemplate.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			Query query = session.createQuery("from FlightData where flightNo=:no and date=:date");
			query.setParameter("no", flightdata.getFlightNo());
			query.setParameter("date", flightdata.getDate());
			
			if(query.list().size() == 0) {
	
			
				this.hibernateTemplate.saveOrUpdate(flightdata);
				
			}
		}catch(DataIntegrityViolationException e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * getting flight data from database
	 */
	public List<FlightData> getAllAvailableFlights() {
		try{
			
		List<FlightData> flightDataList = this.hibernateTemplate.loadAll(FlightData.class);
		return flightDataList;
		}catch(Exception e){
			return null;
		}
	}

}
