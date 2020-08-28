// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package communitycommons.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the CommunityCommons module
	public static void assertTrue(IContext context, boolean _valueToAssert)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("valueToAssert", _valueToAssert);
			Core.execute(context, "CommunityCommons.AssertTrue", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void assertTrue_2(IContext context, boolean _valueToAssert, java.lang.String _message)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("valueToAssert", _valueToAssert);
			params.put("message", _message);
			Core.execute(context, "CommunityCommons.AssertTrue_2", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void createUserIfNotExists(IContext context, java.lang.String _username, java.lang.String _role, java.lang.String _password, boolean _webserviceUser)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Username", _username);
			params.put("Role", _role);
			params.put("Password", _password);
			params.put("WebserviceUser", _webserviceUser);
			Core.execute(context, "CommunityCommons.CreateUserIfNotExists", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void updateUserHelper(IContext context, java.lang.String _username, java.lang.String _role, java.lang.String _password, boolean _webserviceUser, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Username", _username);
			params.put("Role", _role);
			params.put("Password", _password);
			params.put("WebserviceUser", _webserviceUser);
			params.put("User", _user == null ? null : _user.getMendixObject());
			Core.execute(context, "CommunityCommons.UpdateUserHelper", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}