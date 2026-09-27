package com.checkout.components.interfaces.model.paymentsession;

import defpackage.m51;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/Risk;", "", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/paymentsession/Risk;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getEnabled", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Risk {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    public Risk(boolean z) {
        this.enabled = z;
    }

    public static Risk copy$default(Risk risk, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = risk.enabled;
        }
        risk.getClass();
        return new Risk(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Risk copy(boolean enabled) {
        return new Risk(enabled);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Risk) && this.enabled == ((Risk) other).enabled) {
            return true;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return m51.l("Risk(enabled=", ")", this.enabled);
    }
}
