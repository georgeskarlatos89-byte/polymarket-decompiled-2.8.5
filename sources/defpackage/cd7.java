package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cd7 implements wud {
    public static final cd7 c = new Object();

    @Override // defpackage.f2i
    public final void a(Function2 function2) {
        sql.d(this, function2);
    }

    @Override // defpackage.f2i
    public final boolean b() {
        return true;
    }

    @Override // defpackage.f2i
    public final Set entries() {
        return fd7.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wud) && ((wud) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f2i
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + fd7.a;
    }
}
