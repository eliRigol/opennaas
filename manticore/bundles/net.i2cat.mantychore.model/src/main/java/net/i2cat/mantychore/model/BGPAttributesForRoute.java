/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class BGPAttributesForRoute as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the
 * BGPAttributesForRouteBean Interface. The CIM class BGPAttributesForRoute
 * is described as follows:
 *
 * This defines the attributes that are transmitted between BGP peers on a
 * per-route basis.
 */
public class BGPAttributesForRoute extends Dependency implements Serializable
    {

    /**
     * This constructor creates a BGPAttributesForRouteBeanImpl Class which
     * implements the BGPAttributesForRouteBean Interface, and encapsulates
     * the CIM class BGPAttributesForRoute in a Java Bean. The CIM class
     * BGPAttributesForRoute is described as follows:
     *
     * This defines the attributes that are transmitted between BGP peers on a
     * per-route basis.
     */
    public BGPAttributesForRoute(){};
    /**
     * This method create an Association of the type BGPAttributesForRoute
     * between one BGPPathAttributes object and BGPIPRoute object
     */
    public static BGPAttributesForRoute link(BGPPathAttributes
	antecedent,BGPIPRoute dependent){

    return (BGPAttributesForRoute)
	Association.link(BGPAttributesForRoute.class,antecedent,dependent);
    }//link
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property pathAttrPeer.
     */
    private String pathAttrPeer;
    /**
     * This method returns the BGPAttributesForRoute.pathAttrPeer property
     * value. This property is described as follows:
     *
     * This defines the IP address of the peer where the path information was
     * learned.
     *
     * @return	String	current pathAttrPeer property value
     * @exception	Exception
     */
    public String getPathAttrPeer(){

    return this.pathAttrPeer;
    } // getPathAttrPeer

    /**
     * This method sets the BGPAttributesForRoute.pathAttrPeer property value.
     * This property is described as follows:
     *
     * This defines the IP address of the peer where the path information was
     * learned.
     *
     * @param	String	new pathAttrPeer property value
     * @exception	Exception
     */
    public void setPathAttrPeer(String pathAttrPeer) {

    this.pathAttrPeer = pathAttrPeer;
    } // setPathAttrPeer


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property pathAttrIPAddrPrefixLen.
     */
    private short pathAttrIPAddrPrefixLen;
    /**
     * This method returns the BGPAttributesForRoute.pathAttrIPAddrPrefixLen
     * property value. This property is described as follows:
     *
     * This defines the length in bits of the IP address prefix for the
     * property, PathAttrPeer. The range is 0 to 32.
     *
     * @return	short	current pathAttrIPAddrPrefixLen property
     * value
     * @exception	Exception
     */
    public short getPathAttrIPAddrPrefixLen(){

    return this.pathAttrIPAddrPrefixLen;
    } // getPathAttrIPAddrPrefixLen

    /**
     * This method sets the BGPAttributesForRoute.pathAttrIPAddrPrefixLen
     * property value. This property is described as follows:
     *
     * This defines the length in bits of the IP address prefix for the
     * property, PathAttrPeer. The range is 0 to 32.
     *
     * @param	short	new pathAttrIPAddrPrefixLen property value
     * @exception	Exception
     */
    public void setPathAttrIPAddrPrefixLen(short pathAttrIPAddrPrefixLen) {

    this.pathAttrIPAddrPrefixLen = pathAttrIPAddrPrefixLen;
    } // setPathAttrIPAddrPrefixLen


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property pathAttrIPAddrPrefix.
     */
    private String pathAttrIPAddrPrefix;
    /**
     * This method returns the BGPAttributesForRoute.pathAttrIPAddrPrefix
     * property value. This property is described as follows:
     *
     * The IP address prefix of the property, PathAttrPeer. Its length is
     * specified by the property, PathAttrIpAddrPrefixLen.
     *
     * @return	String	current pathAttrIPAddrPrefix property
     * value
     * @exception	Exception
     */
    public String getPathAttrIPAddrPrefix(){

    return this.pathAttrIPAddrPrefix;
    } // getPathAttrIPAddrPrefix

    /**
     * This method sets the BGPAttributesForRoute.pathAttrIPAddrPrefix
     * property value. This property is described as follows:
     *
     * The IP address prefix of the property, PathAttrPeer. Its length is
     * specified by the property, PathAttrIpAddrPrefixLen.
     *
     * @param	String	new pathAttrIPAddrPrefix property value
     * @exception	Exception
     */
    public void setPathAttrIPAddrPrefix(String pathAttrIPAddrPrefix) {

    this.pathAttrIPAddrPrefix = pathAttrIPAddrPrefix;
    } // setPathAttrIPAddrPrefix



} // Class BGPAttributesForRoute