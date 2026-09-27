package com.checkout.components.rememberme.model;

import defpackage.sv6;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/rememberme/model/TokenData;", "", "", "cvv", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/checkout/components/rememberme/model/TokenData;", "a", "Ljava/lang/String;", "getCvv", "()Ljava/lang/String;", "getCvv$annotations", "()V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TokenData {

    /* renamed from: a, reason: from kotlin metadata */
    public final String cvv;

    public TokenData(@zca(name = "cvv") String str) {
        str.getClass();
        this.cvv = str;
    }

    public final TokenData copy(@zca(name = "cvv") String cvv) {
        cvv.getClass();
        return new TokenData(cvv);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TokenData) && Intrinsics.areEqual(this.cvv, ((TokenData) obj).cvv)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.cvv.hashCode();
    }

    public final String toString() {
        return sv6.n("TokenData(cvv=", this.cvv, ")");
    }

    @zca(name = "cvv")
    public static /* synthetic */ void getCvv$annotations() {
    }
}
