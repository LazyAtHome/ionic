package com.helloworld;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by peter on 16/11/14.
 */
public class HelloWorld extends CordovaPlugin {
    protected void pluginInitialize() {
        super.pluginInitialize();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("hello")) {
            JSONObject obj = new JSONObject();
            obj.put("msg","android native hello");
            callbackContext.success(obj);
            return true;
        }
        return false;
    }
}
