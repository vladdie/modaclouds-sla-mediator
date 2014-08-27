/**
 * Copyright 2014 Atos
 * Contact: Atos <roman.sosa@atos.net>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.11 at 02:23:53 PM BST 
//


package eu.modaclouds.sla.mediator.model.monitoringrules;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.modaclouds.sla.mediator.model.monitoringrules package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.modaclouds.sla.mediator.model.monitoringrules
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MonitoringRules }
     * 
     */
    public MonitoringRules createMonitoringRules() {
        return new MonitoringRules();
    }

    /**
     * Create an instance of {@link MonitoringRule }
     * 
     */
    public MonitoringRule createMonitoringRule() {
        return new MonitoringRule();
    }

    /**
     * Create an instance of {@link MonitoredTargets }
     * 
     */
    public MonitoredTargets createMonitoredTargets() {
        return new MonitoredTargets();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link MonitoredTarget }
     * 
     */
    public MonitoredTarget createMonitoredTarget() {
        return new MonitoredTarget();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link MonitoringMetricAggregation }
     * 
     */
    public MonitoringMetricAggregation createMonitoringMetricAggregation() {
        return new MonitoringMetricAggregation();
    }

    /**
     * Create an instance of {@link Actions }
     * 
     */
    public Actions createActions() {
        return new Actions();
    }

    /**
     * Create an instance of {@link CollectedMetric }
     * 
     */
    public CollectedMetric createCollectedMetric() {
        return new CollectedMetric();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

}