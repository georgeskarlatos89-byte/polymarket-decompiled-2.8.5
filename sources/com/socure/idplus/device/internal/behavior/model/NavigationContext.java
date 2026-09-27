package com.socure.idplus.device.internal.behavior.model;

import com.google.gson.annotations.SerializedName;
import defpackage.woa;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006\""}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/NavigationContext;", "", "", "context", "", "clientTime", "Lcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;", "android", "<init>", "(Ljava/lang/String;JLcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;", "copy", "(Ljava/lang/String;JLcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;)Lcom/socure/idplus/device/internal/behavior/model/NavigationContext;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContext", "J", "getClientTime", "Lcom/socure/idplus/device/internal/behavior/model/AndroidNavigationContextProperties;", "getAndroid", "Companion", "com/socure/idplus/device/internal/behavior/model/b", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NavigationContext {
    public static final b Companion = new b();
    public static final String UNSET = "unset";

    @SerializedName("android")
    private final AndroidNavigationContextProperties android;

    @SerializedName("clientTime")
    private final long clientTime;

    @SerializedName("context")
    private final String context;

    public NavigationContext(String str, long j, AndroidNavigationContextProperties androidNavigationContextProperties) {
        str.getClass();
        this.context = str;
        this.clientTime = j;
        this.android = androidNavigationContextProperties;
    }

    public static /* synthetic */ NavigationContext copy$default(NavigationContext navigationContext, String str, long j, AndroidNavigationContextProperties androidNavigationContextProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationContext.context;
        }
        if ((i & 2) != 0) {
            j = navigationContext.clientTime;
        }
        if ((i & 4) != 0) {
            androidNavigationContextProperties = navigationContext.android;
        }
        return navigationContext.copy(str, j, androidNavigationContextProperties);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component3, reason: from getter */
    public final AndroidNavigationContextProperties getAndroid() {
        return this.android;
    }

    public final NavigationContext copy(String context, long clientTime, AndroidNavigationContextProperties android2) {
        context.getClass();
        return new NavigationContext(context, clientTime, android2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationContext)) {
            return false;
        }
        NavigationContext navigationContext = (NavigationContext) other;
        if (Intrinsics.areEqual(this.context, navigationContext.context) && this.clientTime == navigationContext.clientTime && Intrinsics.areEqual(this.android, navigationContext.android)) {
            return true;
        }
        return false;
    }

    public final AndroidNavigationContextProperties getAndroid() {
        return this.android;
    }

    public long getClientTime() {
        return this.clientTime;
    }

    public final String getContext() {
        return this.context;
    }

    public int hashCode() {
        int hashCode;
        int d = woa.d(this.context.hashCode() * 31, 31, this.clientTime);
        AndroidNavigationContextProperties androidNavigationContextProperties = this.android;
        if (androidNavigationContextProperties == null) {
            hashCode = 0;
        } else {
            hashCode = androidNavigationContextProperties.hashCode();
        }
        return d + hashCode;
    }

    public String toString() {
        return "NavigationContext(context=" + this.context + ", clientTime=" + this.clientTime + ", android=" + this.android + ")";
    }

    public /* synthetic */ NavigationContext(String str, long j, AndroidNavigationContextProperties androidNavigationContextProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : androidNavigationContextProperties);
    }
}
