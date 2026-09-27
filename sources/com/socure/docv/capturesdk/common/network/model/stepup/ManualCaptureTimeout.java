package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/ManualCaptureTimeout;", "", "value", "", "<init>", "(I)V", "getValue", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ManualCaptureTimeout {
    public static final int $stable = 0;
    private final int value;

    public ManualCaptureTimeout(int i) {
        this.value = i;
    }

    public static /* synthetic */ ManualCaptureTimeout copy$default(ManualCaptureTimeout manualCaptureTimeout, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = manualCaptureTimeout.value;
        }
        return manualCaptureTimeout.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final ManualCaptureTimeout copy(int value) {
        return new ManualCaptureTimeout(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ManualCaptureTimeout) && this.value == ((ManualCaptureTimeout) other).value) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public String toString() {
        return sv6.j(this.value, "ManualCaptureTimeout(value=", ")");
    }
}
