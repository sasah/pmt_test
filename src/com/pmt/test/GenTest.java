package com.pmt.test;

import com.google.gwt.core.client.EntryPoint;
import com.pmt.database.Helper;
import com.pmt.sys.reflection.BeanDescriptor;
import com.pmt.sys.reflection.Introspector;
import com.pmt.sys.reflection.Property;
import com.pmt.wrap.titanium.API;

public class GenTest implements EntryPoint {

	public void onModuleLoad() {
		try {
			Info p = new Info();
			p.setId(1);
			p.setKind(1);
			p.setCity("City");
			p.setAddress("Address");
			p.setName("Name");
			p.setLatitude(123.113);
			API.debug(Helper.insert(p));
		} catch (Exception e) {
			API.debug(e.getMessage());
		}
		/*
		 * JSONObject jsonObject = new JSONObject(); jsonObject.put("id", new
		 * JSONNumber(123)); jsonObject.put("name", new JSONString("sasa"));
		 * API.debug(jsonObject.toString());
		 * 
		 * String s = jsonObject.toString(); JSONValue value =
		 * JSONParser.parseStrict(s);
		 * //API.debug(String.valueOf(value.isObject()
		 * .get("id").isNumber().doubleValue())); API.debug(value.toString());
		 * API.debug(String.valueOf(value.isArray() != null));
		 * API.debug(String.valueOf(value.isBoolean() != null));
		 * API.debug(String.valueOf(value.isNull() != null));
		 * API.debug(String.valueOf(value.isNumber() != null));
		 * API.debug(String.valueOf(value.isObject() != null));
		 * API.debug(String.valueOf(value.isString() != null));
		 * 
		 * API.debug(String.valueOf(value.isArray().size())); for (int i = 0; i
		 * < value.isArray().size(); i++) { JSONValue a =
		 * value.isArray().get(i); API.debug(String.valueOf(a.isObject() !=
		 * null)); API.debug(String.valueOf(a.isNumber().doubleValue())); }
		 */
	}
}
