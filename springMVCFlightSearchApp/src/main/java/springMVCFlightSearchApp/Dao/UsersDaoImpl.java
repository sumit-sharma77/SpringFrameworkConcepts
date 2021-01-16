package springMVCFlightSearchApp.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springMVCFlightSearchApp.model.Users;

@Repository
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * Validating a valid user
	 */
	public boolean validUser(Users loginUser) {
		
		try{
			Users validUser= this.hibernateTemplate.get(Users.class, loginUser.getUsername());
			return validUser.equals(loginUser);
		}catch (Exception e) {
			return false;
		}
		
		
		
	}

}
