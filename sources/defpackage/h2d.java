package defpackage;

import com.checkout.components.card.operations.network.model.ErrorResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h2d extends i2d {
    public final ErrorResponse a;
    public final int b;

    public h2d(ErrorResponse errorResponse, int i) {
        this.a = errorResponse;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2d)) {
            return false;
        }
        h2d h2dVar = (h2d) obj;
        if (Intrinsics.areEqual(this.a, h2dVar.a) && this.b == h2dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ErrorResponse errorResponse = this.a;
        if (errorResponse == null) {
            hashCode = 0;
        } else {
            hashCode = errorResponse.hashCode();
        }
        return Integer.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "ServerError(body=" + this.a + ", code=" + this.b + ")";
    }
}
