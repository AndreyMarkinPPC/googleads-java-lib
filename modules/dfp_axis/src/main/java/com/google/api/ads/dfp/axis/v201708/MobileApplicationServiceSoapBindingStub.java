// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * MobileApplicationServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201708;

public class MobileApplicationServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfp.axis.v201708.MobileApplicationServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMobileApplications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "mobileApplications"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplication"), com.google.api.ads.dfp.axis.v201708.MobileApplication[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplication"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201708.MobileApplication[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201708.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMobileApplicationsByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "Statement"), com.google.api.ads.dfp.axis.v201708.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationPage"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201708.MobileApplicationPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201708.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performMobileApplicationAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "mobileApplicationAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationAction"), com.google.api.ads.dfp.axis.v201708.MobileApplicationAction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "Statement"), com.google.api.ads.dfp.axis.v201708.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "UpdateResult"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201708.UpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201708.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMobileApplications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "mobileApplications"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplication"), com.google.api.ads.dfp.axis.v201708.MobileApplication[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplication"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201708.MobileApplication[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201708.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public MobileApplicationServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MobileApplicationServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MobileApplicationServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiVersionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ApiVersionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApiVersionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ApiVersionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ArchiveMobileApplications");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ArchiveMobileApplications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "CommonError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.CommonError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "CommonError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.CommonErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "Date");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DateTime");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.DateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DateTimeValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.DateTimeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DateValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.DateValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "FeatureError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.FeatureError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "FeatureError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.FeatureErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplication");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationActionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationActionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationActionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationActionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationPlatform");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationPlatform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "MobileApplicationStore");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.MobileApplicationStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "NotNullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.NotNullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "NotNullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.NotNullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ObjectValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ObjectValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ParseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ParseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ParseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ParseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "PermissionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.PermissionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "PermissionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.PermissionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "PublisherQueryLanguageContextError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.PublisherQueryLanguageContextError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "PublisherQueryLanguageContextError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.PublisherQueryLanguageContextErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "PublisherQueryLanguageSyntaxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.PublisherQueryLanguageSyntaxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "PublisherQueryLanguageSyntaxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.PublisherQueryLanguageSyntaxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "QuotaError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.QuotaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "QuotaError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.QuotaErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "RequiredCollectionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.RequiredCollectionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "RequiredCollectionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.RequiredCollectionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ServerError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ServerError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ServerError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.ServerErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "SetValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.SetValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "SoapRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.SoapRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "Statement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.Statement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "StatementError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.StatementError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "StatementError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.StatementErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "String_ValueMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.String_ValueMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "UnarchiveMobileApplications");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.UnarchiveMobileApplications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "UniqueError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.UniqueError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "UpdateResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.UpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201708.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.google.api.ads.dfp.axis.v201708.MobileApplication[] createMobileApplications(com.google.api.ads.dfp.axis.v201708.MobileApplication[] mobileApplications) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201708.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "createMobileApplications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mobileApplications});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201708.MobileApplication[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201708.MobileApplication[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201708.MobileApplication[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201708.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201708.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201708.MobileApplicationPage getMobileApplicationsByStatement(com.google.api.ads.dfp.axis.v201708.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201708.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "getMobileApplicationsByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201708.MobileApplicationPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201708.MobileApplicationPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201708.MobileApplicationPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201708.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201708.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201708.UpdateResult performMobileApplicationAction(com.google.api.ads.dfp.axis.v201708.MobileApplicationAction mobileApplicationAction, com.google.api.ads.dfp.axis.v201708.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201708.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "performMobileApplicationAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mobileApplicationAction, filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201708.UpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201708.UpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201708.UpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201708.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201708.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201708.MobileApplication[] updateMobileApplications(com.google.api.ads.dfp.axis.v201708.MobileApplication[] mobileApplications) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201708.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "updateMobileApplications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mobileApplications});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201708.MobileApplication[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201708.MobileApplication[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201708.MobileApplication[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201708.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201708.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}