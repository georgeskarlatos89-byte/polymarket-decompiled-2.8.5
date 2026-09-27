package io.intercom.android.sdk.lightcompressor.config;

import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;", "", "subFolderName", "", "<init>", "(Ljava/lang/String;)V", "getSubFolderName", "()Ljava/lang/String;", "setSubFolderName", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AppSpecificStorageConfiguration {
    private String subFolderName;

    public /* synthetic */ AppSpecificStorageConfiguration(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ AppSpecificStorageConfiguration copy$default(AppSpecificStorageConfiguration appSpecificStorageConfiguration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSpecificStorageConfiguration.subFolderName;
        }
        return appSpecificStorageConfiguration.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public final AppSpecificStorageConfiguration copy(String subFolderName) {
        return new AppSpecificStorageConfiguration(subFolderName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof AppSpecificStorageConfiguration) && Intrinsics.areEqual(this.subFolderName, ((AppSpecificStorageConfiguration) other).subFolderName)) {
            return true;
        }
        return false;
    }

    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        String str = this.subFolderName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSubFolderName(String str) {
        this.subFolderName = str;
    }

    public String toString() {
        return m51.m(new StringBuilder("AppSpecificStorageConfiguration(subFolderName="), this.subFolderName, ')');
    }

    public AppSpecificStorageConfiguration(String str) {
        this.subFolderName = str;
    }

    public AppSpecificStorageConfiguration() {
        this(null, 1, null);
    }
}
