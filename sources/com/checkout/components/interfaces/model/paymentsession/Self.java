package com.checkout.components.interfaces.model.paymentsession;

import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/Self;", "", "", "href", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/Self;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getHref", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Self {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final String href;

    public Self(String str) {
        str.getClass();
        this.href = str;
    }

    public static Self copy$default(Self self, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = self.href;
        }
        self.getClass();
        str.getClass();
        return new Self(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    public final Self copy(String href) {
        href.getClass();
        return new Self(href);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Self) && Intrinsics.areEqual(this.href, ((Self) other).href)) {
            return true;
        }
        return false;
    }

    public final String getHref() {
        return this.href;
    }

    public final int hashCode() {
        return this.href.hashCode();
    }

    public final String toString() {
        return sv6.n("Self(href=", this.href, ")");
    }
}
