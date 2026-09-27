package com.socure.docv.capturesdk.common.analytics.model;

import defpackage.m51;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Selfie;", "", "captureMode", "", "deviceId", "faces", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getCaptureMode", "()Ljava/lang/String;", "getDeviceId", "getFaces", "()Ljava/util/ArrayList;", "setFaces", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Selfie {
    public static final int $stable = 8;
    private final String captureMode;
    private final String deviceId;
    private ArrayList<Face> faces;

    public /* synthetic */ Selfie(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Selfie copy$default(Selfie selfie, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfie.captureMode;
        }
        if ((i & 2) != 0) {
            str2 = selfie.deviceId;
        }
        if ((i & 4) != 0) {
            arrayList = selfie.faces;
        }
        return selfie.copy(str, str2, arrayList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final ArrayList<Face> component3() {
        return this.faces;
    }

    public final Selfie copy(String captureMode, String deviceId, ArrayList<Face> faces) {
        return new Selfie(captureMode, deviceId, faces);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selfie)) {
            return false;
        }
        Selfie selfie = (Selfie) other;
        if (Intrinsics.areEqual(this.captureMode, selfie.captureMode) && Intrinsics.areEqual(this.deviceId, selfie.deviceId) && Intrinsics.areEqual(this.faces, selfie.faces)) {
            return true;
        }
        return false;
    }

    public final String getCaptureMode() {
        return this.captureMode;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final ArrayList<Face> getFaces() {
        return this.faces;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.captureMode;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.deviceId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ArrayList<Face> arrayList = this.faces;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return i3 + i;
    }

    public final void setFaces(ArrayList<Face> arrayList) {
        this.faces = arrayList;
    }

    public String toString() {
        String str = this.captureMode;
        String str2 = this.deviceId;
        ArrayList<Face> arrayList = this.faces;
        StringBuilder r = m51.r("Selfie(captureMode=", str, ", deviceId=", str2, ", faces=");
        r.append(arrayList);
        r.append(")");
        return r.toString();
    }

    public Selfie(String str, String str2, ArrayList<Face> arrayList) {
        this.captureMode = str;
        this.deviceId = str2;
        this.faces = arrayList;
    }

    public Selfie() {
        this(null, null, null, 7, null);
    }
}
