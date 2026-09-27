package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dcj implements ccj {
    public final Object a;
    public final Object b;

    public dcj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.ccj
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.ccj
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ccj) {
            ccj ccjVar = (ccj) obj;
            if (Intrinsics.areEqual(this.a, ccjVar.c()) && Intrinsics.areEqual(this.b, ccjVar.a())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
