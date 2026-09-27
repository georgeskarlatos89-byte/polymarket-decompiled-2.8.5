package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yh9 {
    public final Long a;
    public final Long b;
    public final Long c;

    static {
        KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(yh9.class);
        try {
            lvf.a(yh9.class);
        } catch (Throwable unused) {
        }
        orCreateKotlinClass.getClass();
        if (!StringsKt.T("TimeoutConfiguration")) {
            return;
        }
        dmk.v("Name can't be blank");
    }

    public yh9() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yh9.class != obj.getClass()) {
            return false;
        }
        yh9 yh9Var = (yh9) obj;
        if (Intrinsics.areEqual(this.a, yh9Var.a) && Intrinsics.areEqual(this.b, yh9Var.b) && Intrinsics.areEqual(this.c, yh9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Long l = this.a;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l2 = this.b;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l3 = this.c;
        if (l3 != null) {
            i3 = l3.hashCode();
        }
        return i5 + i3;
    }
}
