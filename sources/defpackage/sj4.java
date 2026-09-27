package defpackage;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sj4 {
    public final Object a;
    public final CancelHandler b;
    public final Function3 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ sj4(Object obj, CancelHandler cancelHandler, Function3 function3, Throwable th, int i) {
        this(obj, cancelHandler, function3, (Object) null, r7);
        Throwable th2;
        cancelHandler = (i & 2) != 0 ? null : cancelHandler;
        function3 = (i & 4) != 0 ? null : function3;
        if ((i & 16) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
    }

    public static sj4 a(sj4 sj4Var, CancelHandler cancelHandler, Throwable th, int i) {
        Object obj = sj4Var.a;
        if ((i & 2) != 0) {
            cancelHandler = sj4Var.b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        Function3 function3 = sj4Var.c;
        Object obj2 = sj4Var.d;
        if ((i & 16) != 0) {
            th = sj4Var.e;
        }
        return new sj4(obj, cancelHandler2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj4)) {
            return false;
        }
        sj4 sj4Var = (sj4) obj;
        if (Intrinsics.areEqual(this.a, sj4Var.a) && Intrinsics.areEqual(this.b, sj4Var.b) && Intrinsics.areEqual(this.c, sj4Var.c) && Intrinsics.areEqual(this.d, sj4Var.d) && Intrinsics.areEqual(this.e, sj4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        CancelHandler cancelHandler = this.b;
        if (cancelHandler == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cancelHandler.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Function3 function3 = this.c;
        if (function3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public sj4(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        this.a = obj;
        this.b = cancelHandler;
        this.c = function3;
        this.d = obj2;
        this.e = th;
    }
}
