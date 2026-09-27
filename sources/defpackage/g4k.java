package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g4k {
    public final f4k a;
    public final h4k b;
    public final boolean c;

    public g4k(f4k f4kVar, h4k h4kVar, boolean z) {
        f4kVar.getClass();
        h4kVar.getClass();
        this.a = f4kVar;
        this.b = h4kVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g4k) {
                g4k g4kVar = (g4k) obj;
                if (!Intrinsics.areEqual(this.a, g4kVar.a) || this.b != g4kVar.b || this.c != g4kVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VariantAndSource(variant=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", hasDefaultVariant=");
        return hdi.t(sb, this.c, ')');
    }

    public /* synthetic */ g4k() {
        this(new f4k(), h4k.FALLBACK_CONFIG, false);
    }
}
