package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionError;", "", "header", "", "restartButton", "android", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionPlatform;", "noniOS", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionSimple;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionPlatform;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionSimple;)V", "getHeader", "()Ljava/lang/String;", "getRestartButton", "getAndroid", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionPlatform;", "getNoniOS", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CameraPermissionSimple;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class CameraPermissionError {
    public static final int $stable = 8;
    private final CameraPermissionPlatform android;
    private final String header;
    private final CameraPermissionSimple noniOS;
    private final String restartButton;

    public CameraPermissionError(String str, String str2, CameraPermissionPlatform cameraPermissionPlatform, CameraPermissionSimple cameraPermissionSimple) {
        this.header = str;
        this.restartButton = str2;
        this.android = cameraPermissionPlatform;
        this.noniOS = cameraPermissionSimple;
    }

    public static /* synthetic */ CameraPermissionError copy$default(CameraPermissionError cameraPermissionError, String str, String str2, CameraPermissionPlatform cameraPermissionPlatform, CameraPermissionSimple cameraPermissionSimple, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraPermissionError.header;
        }
        if ((i & 2) != 0) {
            str2 = cameraPermissionError.restartButton;
        }
        if ((i & 4) != 0) {
            cameraPermissionPlatform = cameraPermissionError.android;
        }
        if ((i & 8) != 0) {
            cameraPermissionSimple = cameraPermissionError.noniOS;
        }
        return cameraPermissionError.copy(str, str2, cameraPermissionPlatform, cameraPermissionSimple);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRestartButton() {
        return this.restartButton;
    }

    /* renamed from: component3, reason: from getter */
    public final CameraPermissionPlatform getAndroid() {
        return this.android;
    }

    /* renamed from: component4, reason: from getter */
    public final CameraPermissionSimple getNoniOS() {
        return this.noniOS;
    }

    public final CameraPermissionError copy(String header, String restartButton, CameraPermissionPlatform android2, CameraPermissionSimple noniOS) {
        return new CameraPermissionError(header, restartButton, android2, noniOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraPermissionError)) {
            return false;
        }
        CameraPermissionError cameraPermissionError = (CameraPermissionError) other;
        if (Intrinsics.areEqual(this.header, cameraPermissionError.header) && Intrinsics.areEqual(this.restartButton, cameraPermissionError.restartButton) && Intrinsics.areEqual(this.android, cameraPermissionError.android) && Intrinsics.areEqual(this.noniOS, cameraPermissionError.noniOS)) {
            return true;
        }
        return false;
    }

    public final CameraPermissionPlatform getAndroid() {
        return this.android;
    }

    public final String getHeader() {
        return this.header;
    }

    public final CameraPermissionSimple getNoniOS() {
        return this.noniOS;
    }

    public final String getRestartButton() {
        return this.restartButton;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.header;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.restartButton;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        CameraPermissionPlatform cameraPermissionPlatform = this.android;
        if (cameraPermissionPlatform == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cameraPermissionPlatform.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        CameraPermissionSimple cameraPermissionSimple = this.noniOS;
        if (cameraPermissionSimple != null) {
            i = cameraPermissionSimple.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.header;
        String str2 = this.restartButton;
        CameraPermissionPlatform cameraPermissionPlatform = this.android;
        CameraPermissionSimple cameraPermissionSimple = this.noniOS;
        StringBuilder r = m51.r("CameraPermissionError(header=", str, ", restartButton=", str2, ", android=");
        r.append(cameraPermissionPlatform);
        r.append(", noniOS=");
        r.append(cameraPermissionSimple);
        r.append(")");
        return r.toString();
    }
}
