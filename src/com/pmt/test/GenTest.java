package com.pmt.test;

import com.google.gwt.core.client.EntryPoint;
import com.pmt.bean.BeanDescriptor;
import com.pmt.bean.Introspector;
import com.pmt.bean.Property;
import com.pmt.wrap.titanium.API;

public class GenTest implements EntryPoint {

	public void onModuleLoad() {
		try {
			Person p = new Person();

			BeanDescriptor bd = Introspector.INSTANCE.getDescriptor(p);
			StringBuilder sb = new StringBuilder();
			sb.append("CREATE TABLE [" + p.getClass().getName() + "] (");
			boolean f = true;
			for (Property pr : bd.getProperties()) {
				if (f) {
					f = false;
				} else {
					sb.append(",");
				}
				sb.append("[" + pr.getName() + "] " + pr.getType().getName());
				// API.debug(pr.getName());
				// API.debug(pr.getType().getName());
				// pr.getMutatorMethod().invoke(p, new Object[] { "sss" });
			}
			sb.append(")");
			API.debug(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
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
