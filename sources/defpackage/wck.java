package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wck {
    public final String a;
    public final boolean b;

    public wck(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public Integer a(wck wckVar) {
        wckVar.getClass();
        xzb xzbVar = sck.a;
        if (this == wckVar) {
            return 0;
        }
        xzb xzbVar2 = sck.a;
        Integer num = (Integer) xzbVar2.get(this);
        Integer num2 = (Integer) xzbVar2.get(wckVar);
        if (num != null && num2 != null && !Intrinsics.areEqual(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public String b() {
        return this.a;
    }

    public final String toString() {
        return b();
    }

    public wck c() {
        return this;
    }
}
