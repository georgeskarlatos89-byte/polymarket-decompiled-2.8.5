package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c44 {
    public final xl8 a;
    public final xl8 b;
    public final boolean c;

    public c44(xl8 xl8Var, xl8 xl8Var2, boolean z) {
        xl8Var.getClass();
        xl8Var2.getClass();
        this.a = xl8Var;
        this.b = xl8Var2;
        this.c = z;
        xl8Var2.a.c();
    }

    public static final String c(xl8 xl8Var) {
        String str = xl8Var.a.a;
        if (StringsKt.M(str, '/')) {
            return hdi.o("`", str, '`');
        }
        return str;
    }

    public final xl8 a() {
        xl8 xl8Var = this.a;
        boolean c = xl8Var.a.c();
        xl8 xl8Var2 = this.b;
        if (c) {
            return xl8Var2;
        }
        return new xl8(xl8Var.a.a + '.' + xl8Var2.a.a);
    }

    public final String b() {
        xl8 xl8Var = this.a;
        boolean c = xl8Var.a.c();
        xl8 xl8Var2 = this.b;
        if (c) {
            return c(xl8Var2);
        }
        return e.r(xl8Var.a.a, '.', '/') + AgentHeaderCreator.AGENT_DIVIDER + c(xl8Var2);
    }

    public final c44 d(csc cscVar) {
        cscVar.getClass();
        return new c44(this.a, this.b.a(cscVar), this.c);
    }

    public final c44 e() {
        xl8 b = this.b.b();
        if (!b.a.c()) {
            return new c44(this.a, b, this.c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c44)) {
            return false;
        }
        c44 c44Var = (c44) obj;
        if (Intrinsics.areEqual(this.a, c44Var.a) && Intrinsics.areEqual(this.b, c44Var.b) && this.c == c44Var.c) {
            return true;
        }
        return false;
    }

    public final csc f() {
        return this.b.a.g();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean c = this.a.a.c();
        String b = b();
        if (c) {
            return AgentHeaderCreator.AGENT_DIVIDER.concat(b);
        }
        return b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c44(xl8 xl8Var, csc cscVar) {
        this(xl8Var, xpl.b(cscVar), false);
        xl8Var.getClass();
        cscVar.getClass();
        xl8 xl8Var2 = xl8.c;
    }
}
