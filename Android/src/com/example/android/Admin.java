package com.example.android;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 * @author FOKO
 *
 */
public class Admin {

	public String login;
	public String password;
	public String nom;
	public Admin(String username, String userpassword) {
		super();
		this.login= username;
		this.password = userpassword;
	}


	public Admin(JSONObject jsonObject) throws Exception {
		if(jsonObject.get("statut").equals("oui")){
			this.login=jsonObject.getString("login");
			this.password= jsonObject.getString("password");
			this.nom=jsonObject.getString("nom");
		}
	}
}