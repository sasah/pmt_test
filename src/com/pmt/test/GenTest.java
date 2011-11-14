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
			for (Property pr : bd.getProperties()) {
				API.debug(pr.getName());
				API.debug(pr.getType().getName());
				pr.getMutatorMethod().invoke(p, new Object[] { "sss" });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
