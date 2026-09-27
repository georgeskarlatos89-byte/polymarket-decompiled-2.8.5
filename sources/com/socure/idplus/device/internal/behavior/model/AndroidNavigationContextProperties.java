package com.socure.idplus.device.internal.behavior.model;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import defpackage.woa;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;", "", "contextType", "", "parentContext", "contextAlias", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContextAlias", "()Ljava/lang/String;", "getContextType", "getParentContext", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AndroidNavigationContextProperties {

    @SerializedName("contextAlias")
    private final String contextAlias;

    @SerializedName("contextType")
    private final String contextType;

    @SerializedName("parentContext")
    private final String parentContext;

    public /* synthetic */ AndroidNavigationContextProperties(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ AndroidNavigationContextProperties copy$default(AndroidNavigationContextProperties androidNavigationContextProperties, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidNavigationContextProperties.contextType;
        }
        if ((i & 2) != 0) {
            str2 = androidNavigationContextProperties.parentContext;
        }
        if ((i & 4) != 0) {
            str3 = androidNavigationContextProperties.contextAlias;
        }
        return androidNavigationContextProperties.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContextType() {
        return this.contextType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParentContext() {
        return this.parentContext;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContextAlias() {
        return this.contextAlias;
    }

    public final AndroidNavigationContextProperties copy(String contextType, String parentContext, String contextAlias) {
        return new AndroidNavigationContextProperties(contextType, parentContext, contextAlias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidNavigationContextProperties)) {
            return false;
        }
        AndroidNavigationContextProperties androidNavigationContextProperties = (AndroidNavigationContextProperties) other;
        if (Intrinsics.areEqual(this.contextType, androidNavigationContextProperties.contextType) && Intrinsics.areEqual(this.parentContext, androidNavigationContextProperties.parentContext) && Intrinsics.areEqual(this.contextAlias, androidNavigationContextProperties.contextAlias)) {
            return true;
        }
        return false;
    }

    public final String getContextAlias() {
        return this.contextAlias;
    }

    public final String getContextType() {
        return this.contextType;
    }

    public final String getParentContext() {
        return this.parentContext;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.contextType;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.parentContext;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.contextAlias;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.contextType;
        String str2 = this.parentContext;
        return woa.r(m51.r("AndroidNavigationContextProperties(contextType=", str, ", parentContext=", str2, ", contextAlias="), this.contextAlias, ")");
    }

    public AndroidNavigationContextProperties(String str, String str2, String str3) {
        this.contextType = str;
        this.parentContext = str2;
        this.contextAlias = str3;
    }

    public AndroidNavigationContextProperties() {
        this(null, null, null, 7, null);
    }
}
