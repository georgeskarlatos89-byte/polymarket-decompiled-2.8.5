package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rwi {
    public final swi a;
    public final owi b;

    public rwi(swi swiVar, owi owiVar) {
        swiVar.getClass();
        owiVar.getClass();
        this.a = swiVar;
        this.b = owiVar;
    }

    public static rwi a(rwi rwiVar, owi owiVar, int i) {
        swi swiVar = rwiVar.a;
        if ((i & 2) != 0) {
            owiVar = rwiVar.b;
        }
        rwiVar.getClass();
        swiVar.getClass();
        owiVar.getClass();
        return new rwi(swiVar, owiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwi)) {
            return false;
        }
        rwi rwiVar = (rwi) obj;
        if (Intrinsics.areEqual(this.a, rwiVar.a) && Intrinsics.areEqual(this.b, rwiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextLabelViewItem(style=" + this.a + ", state=" + this.b + ")";
    }
}
