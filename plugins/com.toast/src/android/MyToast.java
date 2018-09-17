package com.test.testtoast;

import android.annotation.SuppressLint;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyToast extends CordovaPlugin{
	@Override
	public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub\
		JSONObject json = new JSONObject(args.getString(0));
		if("toast".equals(action)){
			Toast.makeText(cordova.getActivity(), json.getString("message"), Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.execute(action, args, callbackContext);
	}
}
