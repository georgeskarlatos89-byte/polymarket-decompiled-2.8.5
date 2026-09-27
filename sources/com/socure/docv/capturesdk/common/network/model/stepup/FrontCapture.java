package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontCapture;", "", "header", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;", "keepSteadyText", "errorMessageSecondaryText", "manualCapturePrimaryText", "manualCaptureSecondaryText", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;)V", "getHeader", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Label;", "getKeepSteadyText", "getErrorMessageSecondaryText", "getManualCapturePrimaryText", "getManualCaptureSecondaryText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class FrontCapture {
    public static final int $stable = 0;
    private final Label errorMessageSecondaryText;
    private final Label header;
    private final Label keepSteadyText;
    private final Label manualCapturePrimaryText;
    private final Label manualCaptureSecondaryText;

    public FrontCapture(Label label, Label label2, Label label3, Label label4, Label label5) {
        label.getClass();
        label2.getClass();
        label3.getClass();
        label4.getClass();
        label5.getClass();
        this.header = label;
        this.keepSteadyText = label2;
        this.errorMessageSecondaryText = label3;
        this.manualCapturePrimaryText = label4;
        this.manualCaptureSecondaryText = label5;
    }

    public static /* synthetic */ FrontCapture copy$default(FrontCapture frontCapture, Label label, Label label2, Label label3, Label label4, Label label5, int i, Object obj) {
        if ((i & 1) != 0) {
            label = frontCapture.header;
        }
        if ((i & 2) != 0) {
            label2 = frontCapture.keepSteadyText;
        }
        if ((i & 4) != 0) {
            label3 = frontCapture.errorMessageSecondaryText;
        }
        if ((i & 8) != 0) {
            label4 = frontCapture.manualCapturePrimaryText;
        }
        if ((i & 16) != 0) {
            label5 = frontCapture.manualCaptureSecondaryText;
        }
        Label label6 = label5;
        Label label7 = label3;
        return frontCapture.copy(label, label2, label7, label4, label6);
    }

    /* renamed from: component1, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final Label getKeepSteadyText() {
        return this.keepSteadyText;
    }

    /* renamed from: component3, reason: from getter */
    public final Label getErrorMessageSecondaryText() {
        return this.errorMessageSecondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final Label getManualCapturePrimaryText() {
        return this.manualCapturePrimaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final Label getManualCaptureSecondaryText() {
        return this.manualCaptureSecondaryText;
    }

    public final FrontCapture copy(Label header, Label keepSteadyText, Label errorMessageSecondaryText, Label manualCapturePrimaryText, Label manualCaptureSecondaryText) {
        header.getClass();
        keepSteadyText.getClass();
        errorMessageSecondaryText.getClass();
        manualCapturePrimaryText.getClass();
        manualCaptureSecondaryText.getClass();
        return new FrontCapture(header, keepSteadyText, errorMessageSecondaryText, manualCapturePrimaryText, manualCaptureSecondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrontCapture)) {
            return false;
        }
        FrontCapture frontCapture = (FrontCapture) other;
        if (Intrinsics.areEqual(this.header, frontCapture.header) && Intrinsics.areEqual(this.keepSteadyText, frontCapture.keepSteadyText) && Intrinsics.areEqual(this.errorMessageSecondaryText, frontCapture.errorMessageSecondaryText) && Intrinsics.areEqual(this.manualCapturePrimaryText, frontCapture.manualCapturePrimaryText) && Intrinsics.areEqual(this.manualCaptureSecondaryText, frontCapture.manualCaptureSecondaryText)) {
            return true;
        }
        return false;
    }

    public final Label getErrorMessageSecondaryText() {
        return this.errorMessageSecondaryText;
    }

    public final Label getHeader() {
        return this.header;
    }

    public final Label getKeepSteadyText() {
        return this.keepSteadyText;
    }

    public final Label getManualCapturePrimaryText() {
        return this.manualCapturePrimaryText;
    }

    public final Label getManualCaptureSecondaryText() {
        return this.manualCaptureSecondaryText;
    }

    public int hashCode() {
        return this.manualCaptureSecondaryText.hashCode() + ((this.manualCapturePrimaryText.hashCode() + ((this.errorMessageSecondaryText.hashCode() + ((this.keepSteadyText.hashCode() + (this.header.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "FrontCapture(header=" + this.header + ", keepSteadyText=" + this.keepSteadyText + ", errorMessageSecondaryText=" + this.errorMessageSecondaryText + ", manualCapturePrimaryText=" + this.manualCapturePrimaryText + ", manualCaptureSecondaryText=" + this.manualCaptureSecondaryText + ")";
    }
}
