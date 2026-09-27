package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.fingerprintjs.android.fpjs_pro.g;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.api.a;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeImage;", "", Keys.KEY_NAME, "", "fileName", "captureTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getFileName", "getCaptureTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class MultiframeImage {
    public static final int $stable = 0;
    private final String captureTime;
    private final String fileName;
    private final String name;

    public MultiframeImage(String str, String str2, String str3) {
        g.x(str, str2, str3);
        this.name = str;
        this.fileName = str2;
        this.captureTime = str3;
    }

    public static /* synthetic */ MultiframeImage copy$default(MultiframeImage multiframeImage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiframeImage.name;
        }
        if ((i & 2) != 0) {
            str2 = multiframeImage.fileName;
        }
        if ((i & 4) != 0) {
            str3 = multiframeImage.captureTime;
        }
        return multiframeImage.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCaptureTime() {
        return this.captureTime;
    }

    public final MultiframeImage copy(String name, String fileName, String captureTime) {
        name.getClass();
        fileName.getClass();
        captureTime.getClass();
        return new MultiframeImage(name, fileName, captureTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiframeImage)) {
            return false;
        }
        MultiframeImage multiframeImage = (MultiframeImage) other;
        if (Intrinsics.areEqual(this.name, multiframeImage.name) && Intrinsics.areEqual(this.fileName, multiframeImage.fileName) && Intrinsics.areEqual(this.captureTime, multiframeImage.captureTime)) {
            return true;
        }
        return false;
    }

    public final String getCaptureTime() {
        return this.captureTime;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.captureTime.hashCode() + a.a(this.fileName, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.fileName;
        return woa.r(m51.r("MultiframeImage(name=", str, ", fileName=", str2, ", captureTime="), this.captureTime, ")");
    }
}
