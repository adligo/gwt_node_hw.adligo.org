package org.adligo.gwt_node_hw.client;

import com.google.gwt.core.client.EntryPoint;
import org.adligo.gwt_node_hw.shared.HelloNode;

public class HelloNodeEntryPoint implements EntryPoint {
	
	public void onModuleLoad() {
		new HelloNode();
	}
}
