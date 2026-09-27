package com.socure.idplus.device.internal.behavior.model;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/Metadata;", "", "osVersion", "", "socureSdkVersion", "platform", "navigationContext", "Lcom/socure/idplus/device/internal/behavior/model/NavigationContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/idplus/device/internal/behavior/model/NavigationContext;)V", "getNavigationContext", "()Lcom/socure/idplus/device/internal/behavior/model/NavigationContext;", "getOsVersion", "()Ljava/lang/String;", "getPlatform", "getSocureSdkVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Metadata {

    @SerializedName("navigationContext")
    private final NavigationContext navigationContext;

    @SerializedName("osVersion")
    private final String osVersion;

    @SerializedName("platform")
    private final String platform;

    @SerializedName("socureSdkVersion")
    private final String socureSdkVersion;

    public Metadata(String str, String str2, String str3, NavigationContext navigationContext) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        navigationContext.getClass();
        this.osVersion = str;
        this.socureSdkVersion = str2;
        this.platform = str3;
        this.navigationContext = navigationContext;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, NavigationContext navigationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.osVersion;
        }
        if ((i & 2) != 0) {
            str2 = metadata.socureSdkVersion;
        }
        if ((i & 4) != 0) {
            str3 = metadata.platform;
        }
        if ((i & 8) != 0) {
            navigationContext = metadata.navigationContext;
        }
        return metadata.copy(str, str2, str3, navigationContext);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSocureSdkVersion() {
        return this.socureSdkVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component4, reason: from getter */
    public final NavigationContext getNavigationContext() {
        return this.navigationContext;
    }

    public final Metadata copy(String osVersion, String socureSdkVersion, String platform, NavigationContext navigationContext) {
        osVersion.getClass();
        socureSdkVersion.getClass();
        platform.getClass();
        navigationContext.getClass();
        return new Metadata(osVersion, socureSdkVersion, platform, navigationContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) other;
        if (Intrinsics.areEqual(this.osVersion, metadata.osVersion) && Intrinsics.areEqual(this.socureSdkVersion, metadata.socureSdkVersion) && Intrinsics.areEqual(this.platform, metadata.platform) && Intrinsics.areEqual(this.navigationContext, metadata.navigationContext)) {
            return true;
        }
        return false;
    }

    public final NavigationContext getNavigationContext() {
        return this.navigationContext;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSocureSdkVersion() {
        return this.socureSdkVersion;
    }

    public int hashCode() {
        return this.navigationContext.hashCode() + a.a(this.platform, a.a(this.socureSdkVersion, this.osVersion.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.osVersion;
        String str2 = this.socureSdkVersion;
        String str3 = this.platform;
        NavigationContext navigationContext = this.navigationContext;
        StringBuilder r = m51.r("Metadata(osVersion=", str, ", socureSdkVersion=", str2, ", platform=");
        r.append(str3);
        r.append(", navigationContext=");
        r.append(navigationContext);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ Metadata(String str, String str2, String str3, NavigationContext navigationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "android" : str, (i & 2) != 0 ? "4.10.3" : str2, (i & 4) != 0 ? "android" : str3, navigationContext);
    }
}
