package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ape {
    public final woe a;
    public final poe b;

    public ape(boolean z) {
        this(null, new poe(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ape)) {
            return false;
        }
        ape apeVar = (ape) obj;
        if (Intrinsics.areEqual(this.b, apeVar.b) && Intrinsics.areEqual(this.a, apeVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        woe woeVar = this.a;
        if (woeVar != null) {
            i = woeVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        poe poeVar = this.b;
        if (poeVar != null) {
            i2 = poeVar.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public ape(woe woeVar, poe poeVar) {
        this.a = woeVar;
        this.b = poeVar;
    }
}
