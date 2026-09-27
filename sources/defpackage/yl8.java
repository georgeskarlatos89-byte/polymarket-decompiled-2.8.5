package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yl8 {
    public static final csc e = csc.g("<root>");
    public final String a;
    public transient xl8 b;
    public transient yl8 c;
    public transient csc d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public yl8(xl8 xl8Var, String str) {
        str.getClass();
        this.a = str;
        this.b = xl8Var;
    }

    public static final List f(yl8 yl8Var) {
        if (yl8Var.c()) {
            return new ArrayList();
        }
        List f = f(yl8Var.e());
        f.add(yl8Var.g());
        return f;
    }

    public final yl8 a(csc cscVar) {
        String str;
        cscVar.getClass();
        if (c()) {
            str = cscVar.b();
        } else {
            str = this.a + '.' + cscVar.b();
        }
        str.getClass();
        return new yl8(str, this, cscVar);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt == '.' && !z) {
                    break;
                }
                if (charAt == '`') {
                    z = !z;
                } else if (charAt == '\\') {
                    length--;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length >= 0) {
            this.d = csc.d(str.substring(length + 1));
            this.c = new yl8(str.substring(0, length));
        } else {
            this.d = csc.d(str);
            this.c = xl8.c.a;
        }
    }

    public final boolean c() {
        if (this.a.length() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.b == null && StringsKt.Q(this.a, '<', 0, 6) >= 0) {
            return false;
        }
        return true;
    }

    public final yl8 e() {
        yl8 yl8Var = this.c;
        if (yl8Var != null) {
            return yl8Var;
        }
        if (!c()) {
            b();
            yl8 yl8Var2 = this.c;
            yl8Var2.getClass();
            return yl8Var2;
        }
        dmk.n("root");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl8)) {
            return false;
        }
        if (Intrinsics.areEqual(this.a, ((yl8) obj).a)) {
            return true;
        }
        return false;
    }

    public final csc g() {
        csc cscVar = this.d;
        if (cscVar != null) {
            return cscVar;
        }
        if (!c()) {
            b();
            csc cscVar2 = this.d;
            cscVar2.getClass();
            return cscVar2;
        }
        dmk.n("root");
        return null;
    }

    public final boolean h(csc cscVar) {
        cscVar.getClass();
        if (!c()) {
            String str = this.a;
            int Q = StringsKt.Q(str, '.', 0, 6);
            if (Q == -1) {
                Q = str.length();
            }
            int i = Q;
            String b = cscVar.b();
            b.getClass();
            if (i == b.length() && e.p(this.a, 0, b, 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final xl8 i() {
        xl8 xl8Var = this.b;
        if (xl8Var == null) {
            xl8 xl8Var2 = new xl8(this);
            this.b = xl8Var2;
            return xl8Var2;
        }
        return xl8Var;
    }

    public final String toString() {
        if (c()) {
            String b = e.b();
            b.getClass();
            return b;
        }
        return this.a;
    }

    public yl8(String str) {
        this.a = str;
    }

    public yl8(String str, yl8 yl8Var, csc cscVar) {
        this.a = str;
        this.c = yl8Var;
        this.d = cscVar;
    }
}
