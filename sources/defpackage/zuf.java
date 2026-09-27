package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class zuf implements taa {
    @Override // defpackage.taa
    public cuf a(xl8 xl8Var) {
        Object obj;
        xl8Var.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(buf.a(vzm.m(vzm.l(((cuf) obj).a))).a(), xl8Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (cuf) obj;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        if ((obj instanceof zuf) && Intrinsics.areEqual(b(), ((zuf) obj).b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
