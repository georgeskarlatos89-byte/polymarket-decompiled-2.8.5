package defpackage;

import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y5g extends a6g {
    public final CheckoutErrorCode a;
    public final String b;
    public final KClass c;
    public final Integer d;
    public final List e;
    public final ErrorResponse f;

    public y5g(CheckoutErrorCode checkoutErrorCode, String str, KClass kClass, Integer num, List list, ErrorResponse errorResponse) {
        checkoutErrorCode.getClass();
        kClass.getClass();
        this.a = checkoutErrorCode;
        this.b = str;
        this.c = kClass;
        this.d = num;
        this.e = list;
        this.f = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5g)) {
            return false;
        }
        y5g y5gVar = (y5g) obj;
        if (this.a == y5gVar.a && Intrinsics.areEqual(this.b, y5gVar.b) && Intrinsics.areEqual(this.c, y5gVar.c) && Intrinsics.areEqual(this.d, y5gVar.d) && Intrinsics.areEqual(this.e, y5gVar.e) && Intrinsics.areEqual(this.f, y5gVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.c.hashCode() + hdi.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        List list = this.e;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ErrorResponse errorResponse = this.f;
        if (errorResponse != null) {
            i = errorResponse.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "Error(code=" + this.a + ", message=" + this.b + ", checkoutErrorClass=" + this.c + ", httpStatusCode=" + this.d + ", stacktrace=" + this.e + ", errorResponse=" + this.f + ")";
    }
}
