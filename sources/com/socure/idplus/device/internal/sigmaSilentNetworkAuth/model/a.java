package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model;

import com.socure.idplus.device.error.SilentNetworkAuthError;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends SNAOutcome {
    public final SilentNetworkAuthError a;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SilentNetworkAuthError silentNetworkAuthError, String str) {
        super(null);
        silentNetworkAuthError.getClass();
        this.a = silentNetworkAuthError;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && Intrinsics.areEqual(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", message=" + this.b + ")";
    }
}
