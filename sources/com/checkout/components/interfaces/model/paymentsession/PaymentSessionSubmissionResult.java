package com.checkout.components.interfaces.model.paymentsession;

import com.fingerprintjs.android.fpjs_pro.g;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.c8n;
import defpackage.m51;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\f¨\u0006("}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "type", "status", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "action", "declineReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getType", "c", "getStatus", d.d, "Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "getAction", "e", "getDeclineReason", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PaymentSessionSubmissionResult {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: from kotlin metadata */
    private final String type;

    /* renamed from: c, reason: from kotlin metadata */
    private final String status;

    /* renamed from: d, reason: from kotlin metadata */
    private final PaymentAction action;

    /* renamed from: e, reason: from kotlin metadata */
    private final String declineReason;

    public PaymentSessionSubmissionResult(String str, String str2, String str3, PaymentAction paymentAction, String str4) {
        g.x(str, str2, str3);
        this.id = str;
        this.type = str2;
        this.status = str3;
        this.action = paymentAction;
        this.declineReason = str4;
    }

    public static /* synthetic */ PaymentSessionSubmissionResult copy$default(PaymentSessionSubmissionResult paymentSessionSubmissionResult, String str, String str2, String str3, PaymentAction paymentAction, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentSessionSubmissionResult.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentSessionSubmissionResult.type;
        }
        if ((i & 4) != 0) {
            str3 = paymentSessionSubmissionResult.status;
        }
        if ((i & 8) != 0) {
            paymentAction = paymentSessionSubmissionResult.action;
        }
        if ((i & 16) != 0) {
            str4 = paymentSessionSubmissionResult.declineReason;
        }
        String str5 = str4;
        String str6 = str3;
        return paymentSessionSubmissionResult.copy(str, str2, str6, paymentAction, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentAction getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    public final PaymentSessionSubmissionResult copy(String id, String type, String status, PaymentAction action, String declineReason) {
        id.getClass();
        type.getClass();
        status.getClass();
        return new PaymentSessionSubmissionResult(id, type, status, action, declineReason);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionSubmissionResult)) {
            return false;
        }
        PaymentSessionSubmissionResult paymentSessionSubmissionResult = (PaymentSessionSubmissionResult) other;
        if (Intrinsics.areEqual(this.id, paymentSessionSubmissionResult.id) && Intrinsics.areEqual(this.type, paymentSessionSubmissionResult.type) && Intrinsics.areEqual(this.status, paymentSessionSubmissionResult.status) && Intrinsics.areEqual(this.action, paymentSessionSubmissionResult.action) && Intrinsics.areEqual(this.declineReason, paymentSessionSubmissionResult.declineReason)) {
            return true;
        }
        return false;
    }

    public final PaymentAction getAction() {
        return this.action;
    }

    public final String getDeclineReason() {
        return this.declineReason;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode;
        int b = c8n.b(c8n.b(this.id.hashCode() * 31, this.type), this.status);
        PaymentAction paymentAction = this.action;
        int i = 0;
        if (paymentAction == null) {
            hashCode = 0;
        } else {
            hashCode = paymentAction.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str = this.declineReason;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.status;
        PaymentAction paymentAction = this.action;
        String str4 = this.declineReason;
        StringBuilder r = m51.r("PaymentSessionSubmissionResult(id=", str, ", type=", str2, ", status=");
        r.append(str3);
        r.append(", action=");
        r.append(paymentAction);
        r.append(", declineReason=");
        return woa.r(r, str4, ")");
    }

    public /* synthetic */ PaymentSessionSubmissionResult(String str, String str2, String str3, PaymentAction paymentAction, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : paymentAction, (i & 16) != 0 ? null : str4);
    }
}
