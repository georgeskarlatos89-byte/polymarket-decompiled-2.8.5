package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oab extends qab {
    public final String a;
    public final gxi b;
    public final ffb c;

    public oab(String str, gxi gxiVar, ffb ffbVar) {
        this.a = str;
        this.b = gxiVar;
        this.c = ffbVar;
    }

    @Override // defpackage.qab
    public final ffb a() {
        return this.c;
    }

    @Override // defpackage.qab
    public final gxi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oabVar = (oab) obj;
        if (Intrinsics.areEqual(this.a, oabVar.a) && Intrinsics.areEqual(this.b, oabVar.b) && Intrinsics.areEqual(this.c, oabVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        gxi gxiVar = this.b;
        if (gxiVar != null) {
            i = gxiVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        ffb ffbVar = this.c;
        if (ffbVar != null) {
            i2 = ffbVar.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return m51.m(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
