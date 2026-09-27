package com.checkout.components.interfaces.model;

import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState;", "", "Default", "Completed", "Declined", "InProgress", "Lcom/checkout/components/interfaces/model/PaymentState$Completed;", "Lcom/checkout/components/interfaces/model/PaymentState$Declined;", "Lcom/checkout/components/interfaces/model/PaymentState$Default;", "Lcom/checkout/components/interfaces/model/PaymentState$InProgress;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PaymentState {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$Completed;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Completed extends PaymentState {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Completed)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return -2041112156;
        }

        public final String toString() {
            return "Completed";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$Declined;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PaymentState$Declined;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getReason", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Declined extends PaymentState {
        public static final int $stable = 0;

        /* renamed from: a, reason: from kotlin metadata */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Declined(String str) {
            super(null);
            str.getClass();
            this.reason = str;
        }

        public static Declined copy$default(Declined declined, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = declined.reason;
            }
            declined.getClass();
            str.getClass();
            return new Declined(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Declined copy(String reason) {
            reason.getClass();
            return new Declined(reason);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Declined) && Intrinsics.areEqual(this.reason, ((Declined) other).reason)) {
                return true;
            }
            return false;
        }

        public final String getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return sv6.n("Declined(reason=", this.reason, ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$Default;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Default extends PaymentState {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Default)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 2075982810;
        }

        public final String toString() {
            return "Default";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$InProgress;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class InProgress extends PaymentState {
        public static final int $stable = 0;
        public static final InProgress INSTANCE = new InProgress();

        private InProgress() {
            super(null);
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof InProgress)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 344229433;
        }

        public final String toString() {
            return "InProgress";
        }
    }

    public PaymentState(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
