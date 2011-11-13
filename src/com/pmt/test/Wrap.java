package com.pmt.test;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.pmt.network.Request;
import com.pmt.network.RequestBuilder;
import com.pmt.network.RequestCallback;
import com.pmt.network.Response;
import com.pmt.wrap.titanium.API;
import com.pmt.wrap.titanium.UI;
import com.pmt.wrap.titanium.sys.events.TitaniumUIButtonClickHandler;
import com.pmt.wrap.titanium.ui.Button;
import com.pmt.wrap.titanium.ui.Label;
import com.pmt.wrap.titanium.ui.Tab;
import com.pmt.wrap.titanium.ui.TabGroup;
import com.pmt.wrap.titanium.ui.Window;

public class Wrap implements EntryPoint {

	private TabGroup tabGroup;
	private RequestBuilder xhr;

	@Override
	public void onModuleLoad() {
		// this sets the background color of the master UIView (when there are
		// no windows/tab groups on it)
		UI.setBackgroundColor("#000");

		// create tab group
		tabGroup = new TabGroup(UI.createTabGroup(null));

		//
		// create base UI tab and root window
		//
		Window win1 = new Window(UI.createWindow(null));
		win1.setTitle("Win 1");
		win1.setBackgroundColor("#ff0");

		Tab tab1 = new Tab(UI.createTab(null));
		tab1.setIcon("KS_nav_views.png");
		tab1.setTitle("Tab 1");
		tab1.setWindow(win1.getHandler());

		Label label1 = new Label(UI.createLabel(null));
		label1.setColor("#999");
		label1.setText("Clicl me!");
		// label1.setFont({fontSize:20,fontFamily:'Helvetica Neue'},
		label1.setTextAlign("center");
		label1.setWidth("auto");

		win1.add(label1.getHandler());

		//
		// create controls tab and root window
		//
		Window win2 = new Window(UI.createWindow(null));
		win2.setTitle("Win 2");
		win2.setBackgroundColor("#f0f");

		Tab tab2 = new Tab(UI.createTab(null));
		tab2.setIcon("KS_nav_ui.png");
		tab2.setTitle("Http request");
		tab2.setWindow(win2.getHandler());

		Label label2 = new Label(UI.createLabel(null));
		label2.setColor("#999");
		label2.setText("Label");
		// label2.setFont({fontSize:20,fontFamily:'Helvetica Neue'},
		label2.setTextAlign("center");
		label2.setWidth("auto");

		Button button = new Button(UI.createButton(null));
		button.setTitle("WWW");
		button.addClick(new TitaniumUIButtonClickHandler() {

			@Override
			public void click(JavaScriptObject source, JavaScriptObject type,
					JavaScriptObject globalPoint, JavaScriptObject y,
					JavaScriptObject x) {
				API.debug("click");
				API.debug("");
				xhr = new RequestBuilder(RequestBuilder.Method.GET,
						"http://www.appcelerator.com/");

				// send the data
				xhr.doSend(null, new RequestCallback() {

					@Override
					public void onSendStream(Request request, double progress) {
					}

					@Override
					public void onReadyStateChange(Request request) {
						API.debug("readyStateChange");
						API.debug(String.valueOf(request.getConnected()));
						API.debug(request.getReadyState().toString());
						API.debug(request.getLocation());
						API.debug(request.getConnectionType().toString());
						API.debug("");
					}

					@Override
					public void onLoad(Request request, Response response) {
						API.debug("load");
						API.debug(String.valueOf(request.getConnected()));
						API.debug(request.getReadyState().toString());
						API.debug(request.getLocation());
						API.debug(request.getConnectionType().toString());
						API.debug("");								
						API.debug(String.valueOf(response.getStatus()));
						API.debug(String.valueOf(response.getText().length()));
						API.debug("");
					}

					@Override
					public void onError(Request request, String error) {
						API.debug("readyStateChange");
						API.debug(error);
						API.debug(String.valueOf(request.getConnected()));
						API.debug(request.getReadyState().toString());
						API.debug(request.getLocation());
						API.debug(request.getConnectionType().toString());
						API.debug("");
					}

					@Override
					public void onDataStream(int contentLength,
							int downloadLength, int chunkLength,
							JavaScriptObject blob, double progress) {
						/*
						 * API.debug("dataStream");
						 * API.debug(String.valueOf(contentLength));
						 * API.debug(String.valueOf(downloadLength));
						 * API.debug(String.valueOf(chunkLength));
						 * API.debug(String.valueOf(progress));
						 */
					}
				});
			}
		});

		win2.add(label2.getHandler());
		win2.add(button.getHandler());

		//
		// add tabs
		//
		tabGroup.addTab(tab1.getHandler());
		tabGroup.addTab(tab2.getHandler());

		// open tab group
		tabGroup.open();
	}
}
