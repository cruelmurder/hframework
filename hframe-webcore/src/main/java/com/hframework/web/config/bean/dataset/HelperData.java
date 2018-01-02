package com.hframework.web.config.bean.dataset;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * generated by hframework on 2016.
 */@XStreamAlias("helper-data")
public class HelperData {

    @XStreamImplicit
    @XStreamAlias("helper-label")
    private List<HelperLabel> helpLabels;
    @XStreamAsAttribute
    @XStreamAlias("target-id")
    private String targetId;
    @XStreamAsAttribute
    @XStreamAlias("embed-class")
    private String embedClass;
    @XStreamAsAttribute
    @XStreamAlias("embed-method")
    private String embedMethod;
    @XStreamAsAttribute
    @XStreamAlias("embed-type")
    private String embedType;

    public HelperData() {
    }

    public List<HelperLabel> getHelpLabels() {
        return helpLabels;
    }

    public void setHelpLabels(List<HelperLabel> helpLabels) {
        this.helpLabels = helpLabels;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getEmbedClass() {
        return embedClass;
    }

    public void setEmbedClass(String embedClass) {
        this.embedClass = embedClass;
    }

    public String getEmbedMethod() {
        return embedMethod;
    }

    public void setEmbedMethod(String embedMethod) {
        this.embedMethod = embedMethod;
    }

    public String getEmbedType() {
        return embedType;
    }

    public void setEmbedType(String embedType) {
        this.embedType = embedType;
    }
}