package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gg7 {
    public static final hg7 a = new hg7(new mcj((lv7) null, (x9h) null, (re3) null, (rhg) null, (LinkedHashMap) null, 127));

    public final hg7 a(gg7 gg7Var) {
        lv7 lv7Var = ((hg7) gg7Var).b.a;
        if (lv7Var == null) {
            lv7Var = ((hg7) this).b.a;
        }
        mcj mcjVar = ((hg7) gg7Var).b;
        x9h x9hVar = mcjVar.b;
        if (x9hVar == null) {
            x9hVar = ((hg7) this).b.b;
        }
        re3 re3Var = mcjVar.c;
        if (re3Var == null) {
            re3Var = ((hg7) this).b.c;
        }
        rhg rhgVar = mcjVar.d;
        if (rhgVar == null) {
            rhgVar = ((hg7) this).b.d;
        }
        return new hg7(new mcj(lv7Var, x9hVar, re3Var, rhgVar, d1c.j(((hg7) this).b.f, mcjVar.f), 32));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gg7) && Intrinsics.areEqual(((hg7) ((gg7) obj)).b, ((hg7) this).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((hg7) this).b.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual(this, a)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        mcj mcjVar = ((hg7) this).b;
        lv7 lv7Var = mcjVar.a;
        String str4 = null;
        if (lv7Var != null) {
            str = lv7Var.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        x9h x9hVar = mcjVar.b;
        if (x9hVar != null) {
            str2 = x9hVar.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        re3 re3Var = mcjVar.c;
        if (re3Var != null) {
            str3 = re3Var.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        rhg rhgVar = mcjVar.d;
        if (rhgVar != null) {
            str4 = rhgVar.toString();
        }
        sb.append(str4);
        return sb.toString();
    }
}
