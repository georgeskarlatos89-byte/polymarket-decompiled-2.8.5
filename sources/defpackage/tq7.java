package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class tq7 {
    public static final uq7 a = new uq7(new mcj((lv7) null, (x9h) null, (re3) null, (rhg) null, (LinkedHashMap) null, 127));
    public static final uq7 b = new uq7(new mcj((lv7) null, (x9h) null, (re3) null, (rhg) null, (LinkedHashMap) null, 95));

    public final uq7 a(tq7 tq7Var) {
        boolean z;
        lv7 lv7Var = ((uq7) tq7Var).c.a;
        if (lv7Var == null) {
            lv7Var = ((uq7) this).c.a;
        }
        mcj mcjVar = ((uq7) tq7Var).c;
        x9h x9hVar = mcjVar.b;
        if (x9hVar == null) {
            x9hVar = ((uq7) this).c.b;
        }
        re3 re3Var = mcjVar.c;
        if (re3Var == null) {
            re3Var = ((uq7) this).c.c;
        }
        rhg rhgVar = mcjVar.d;
        if (rhgVar == null) {
            rhgVar = ((uq7) this).c.d;
        }
        boolean z2 = mcjVar.e;
        mcj mcjVar2 = ((uq7) this).c;
        if (!z2 && !mcjVar2.e) {
            z = false;
        } else {
            z = true;
        }
        return new uq7(new mcj(lv7Var, x9hVar, re3Var, rhgVar, z, d1c.j(mcjVar2.f, mcjVar.f)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tq7) && Intrinsics.areEqual(((uq7) ((tq7) obj)).c, ((uq7) this).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((uq7) this).c.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual(this, a)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.areEqual(this, b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        mcj mcjVar = ((uq7) this).c;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(mcjVar.e);
        return sb.toString();
    }
}
