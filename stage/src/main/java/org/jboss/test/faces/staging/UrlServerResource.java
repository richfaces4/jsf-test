/**
 * 
 */
package org.jboss.test.faces.staging;

import java.net.URL;
import java.util.logging.Logger;


/**
 * This class represent file-like virtual web application object, loaded from the any URL.
 * @author asmirnov
 *
 */
public class UrlServerResource extends AbstractServerResource {

	/**
	 * Resource target URL
	 */
	private final URL resource;
	
	static final Logger log = ServerLogger.RESOURCE.getLogger();

	/**
	 * @param resource url to the resource content.
	 */
	public UrlServerResource(URL resource) {
		this.resource = resource;
	}

	public URL getURL() {
		return resource;
	}

}
