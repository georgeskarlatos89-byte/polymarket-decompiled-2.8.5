package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aci extends sp9 {
    public final Drawable a;
    public final ip9 b;
    public final cp5 c;
    public final s9c d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public aci(Drawable drawable, ip9 ip9Var, cp5 cp5Var, s9c s9cVar, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = ip9Var;
        this.c = cp5Var;
        this.d = s9cVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.sp9
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.sp9
    public final ip9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aci) {
            aci aciVar = (aci) obj;
            if (Intrinsics.areEqual(this.a, aciVar.a) && Intrinsics.areEqual(this.b, aciVar.b) && this.c == aciVar.c && Intrinsics.areEqual(this.d, aciVar.d) && Intrinsics.areEqual(this.e, aciVar.e) && this.f == aciVar.f && this.g == aciVar.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i2 = 0;
        s9c s9cVar = this.d;
        if (s9cVar != null) {
            i = s9cVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.g) + hdi.g((i3 + i2) * 31, 31, this.f);
    }
}
