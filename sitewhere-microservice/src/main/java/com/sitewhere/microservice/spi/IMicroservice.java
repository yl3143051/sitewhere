package com.sitewhere.microservice.spi;

import com.sitewhere.spi.server.lifecycle.ILifecycleComponent;

/**
 * Functionality common to all SiteWhere microservices.
 * 
 * @author Derek
 */
public interface IMicroservice extends ILifecycleComponent {

    /**
     * Get instance id service is associated with.
     * 
     * @return
     */
    public String getInstanceId();

    /**
     * Get name shown for microservice.
     * 
     * @return
     */
    public String getName();

    /**
     * Get Zookeeper configuration manager.
     * 
     * @return
     */
    public IZookeeperConfigurationManager getZookeeperConfigurationManager();
}