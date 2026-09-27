package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;", "", "submit", "", "retake", "processing", "success", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubmit", "()Ljava/lang/String;", "getRetake", "getProcessing", "getSuccess", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SubmitButtonMessages {
    public static final int $stable = 0;
    private final String processing;
    private final String retake;
    private final String submit;
    private final String success;

    public SubmitButtonMessages(String str, String str2, String str3, String str4) {
        this.submit = str;
        this.retake = str2;
        this.processing = str3;
        this.success = str4;
    }

    public static /* synthetic */ SubmitButtonMessages copy$default(SubmitButtonMessages submitButtonMessages, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitButtonMessages.submit;
        }
        if ((i & 2) != 0) {
            str2 = submitButtonMessages.retake;
        }
        if ((i & 4) != 0) {
            str3 = submitButtonMessages.processing;
        }
        if ((i & 8) != 0) {
            str4 = submitButtonMessages.success;
        }
        return submitButtonMessages.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubmit() {
        return this.submit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRetake() {
        return this.retake;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProcessing() {
        return this.processing;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    public final SubmitButtonMessages copy(String submit, String retake, String processing, String success) {
        return new SubmitButtonMessages(submit, retake, processing, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitButtonMessages)) {
            return false;
        }
        SubmitButtonMessages submitButtonMessages = (SubmitButtonMessages) other;
        if (Intrinsics.areEqual(this.submit, submitButtonMessages.submit) && Intrinsics.areEqual(this.retake, submitButtonMessages.retake) && Intrinsics.areEqual(this.processing, submitButtonMessages.processing) && Intrinsics.areEqual(this.success, submitButtonMessages.success)) {
            return true;
        }
        return false;
    }

    public final String getProcessing() {
        return this.processing;
    }

    public final String getRetake() {
        return this.retake;
    }

    public final String getSubmit() {
        return this.submit;
    }

    public final String getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.submit;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.retake;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.processing;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.success;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.submit;
        String str2 = this.retake;
        return sv6.p(m51.r("SubmitButtonMessages(submit=", str, ", retake=", str2, ", processing="), this.processing, ", success=", this.success, ")");
    }
}
