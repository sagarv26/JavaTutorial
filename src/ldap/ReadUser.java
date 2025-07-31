package ldap;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class ReadUser {

	public static final String LDAPctxfactory = "com.sun.jndi.ldap.LdapCtxFactory";
	public static final String UserName = "uid=admin,ou=system";
	public static final String Password = "secret";
	public static final String LDAPURL = "ldap://localhost:10389";

	public static DirContext getConnection() throws NamingException {
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, LDAPctxfactory);
		env.put(Context.PROVIDER_URL, LDAPURL);
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, UserName);
		env.put(Context.SECURITY_CREDENTIALS, Password);

		return new InitialDirContext(env);
	}

	public static String getUserInfo(String uid, String baseDN, DirContext dctx) {
		String employeeNumber = "", title = "", cn = "";
		String filter = "(uid=" + uid + "*)";
		SearchControls sc = new SearchControls();

		try {
			sc.setReturningAttributes(new String[] { "employeeNumber", "title", "cn", "givenName" });
			sc.setSearchScope(2);
			NamingEnumeration<?> answer = dctx.search(baseDN, filter, sc);

			if (answer.hasMoreElements()) {
				SearchResult sr = (SearchResult) answer.next();
				Attributes entryAttrs = sr.getAttributes();
				employeeNumber = entryAttrs.get("employeeNumber") != null
						? entryAttrs.get("employeeNumber").get().toString()
						: "";
				title = entryAttrs.get("title") != null ? entryAttrs.get("title").get().toString() : "";
				cn = entryAttrs.get("cn") != null ? entryAttrs.get("cn").get().toString() : "";

				System.out.println("Name: " + cn + "\nEmployee Number: " + employeeNumber + "\nTitle: " + title + "\n");
			} else {
				System.out.println("User is not present\n");
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return employeeNumber;

	}

	public static String getGroupInfo(String cn, String baseDN, DirContext dctx) {
		String members = "";
		String filter = "(cn=" + cn + "*)";
		SearchControls sc = new SearchControls();

		try {
			sc.setReturningAttributes(new String[] { "uniquemember"});
			sc.setSearchScope(2);
			NamingEnumeration<?> answer = dctx.search(baseDN, filter, sc);

			if (answer.hasMoreElements()) {
				SearchResult sr = (SearchResult) answer.next();
				Attributes entryAttrs = sr.getAttributes();
				/**
				Attribute memAttr = entryAttrs.get("uniqueMember");

				NamingEnumeration<?> allMembers = memAttr.getAll();
				if (allMembers.hasMore()) {
					System.out.println("Members: " + allMembers.next() + "\n");
				}
				**/
				members = entryAttrs.get("uniquemember") != null ? entryAttrs.get("uniquemember").get().toString() : "";

				System.out.println("Name: " + cn + "\nMembers: " + members + "\n");
			} else {
				System.out.println("group is not present\n");
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return members;

	}
	
	public static void main(String[] args) {
		DirContext dctx = null;

		try {
			dctx = getConnection();
			String baseDN = "ou=user,o=Company";
			String uid = "RDra303";
			getUserInfo(uid, baseDN, dctx);
			
			String groupBaseDN = "ou=group,o=Company";
			String cn = "admin";
			getGroupInfo(cn, groupBaseDN, dctx);

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
