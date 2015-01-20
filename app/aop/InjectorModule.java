package aop;
import services.UserService;
import services.UserServiceImpl;
import utils.NcesEdGovWrapper;
import utils.NcesEdGovWrapperImpl;

import com.google.inject.AbstractModule;

import data.db.dao.UserDao;
import data.db.dao.UserDaoImpl;




public class InjectorModule extends AbstractModule {

	 
	public InjectorModule() { }

	@Override
	protected void configure() {
		
		bind(UserDao.class).to(UserDaoImpl.class);
		bind(UserService.class).to(UserServiceImpl.class);		
		bind(NcesEdGovWrapper.class).to(NcesEdGovWrapperImpl.class);
	}

}
