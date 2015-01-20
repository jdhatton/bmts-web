/**
 * 
 */
package controllers;

import play.mvc.Controller;
import services.UserService;
import services.UserServiceImpl;
import utils.NcesEdGovWrapper;
import utils.NcesEdGovWrapperImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

import data.db.dao.UserDao;
import data.db.dao.UserDaoImpl;

/**
 * @author jdhatton
 * 
 */
public abstract class InjectAwareController extends Controller {

	protected static UserService userService;
	protected static UserDao userDao;
	protected static NcesEdGovWrapper searchWrapper;

	public InjectAwareController() {
		//
		// - Wire up guice injection
		//
		System.out.println(" INJECTING ");
		Injector injector = Guice.createInjector(new aop.InjectorModule());
		userService = injector.getInstance(UserServiceImpl.class);
		userDao = injector.getInstance(UserDaoImpl.class);

	}

	static {
		//
		// - Wire up guice injection
		//
		System.out.println(" INJECTING - static ");
		Injector injector = Guice.createInjector(new aop.InjectorModule());
		userService = injector.getInstance(UserServiceImpl.class);
		userDao = injector.getInstance(UserDaoImpl.class);
		searchWrapper = injector.getInstance(NcesEdGovWrapperImpl.class);
	}

}
