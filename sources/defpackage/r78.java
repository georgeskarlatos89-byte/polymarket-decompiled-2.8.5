package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r78 extends f3 {
    public final f3 b;
    public final f3 c;
    public final boolean d;

    public r78(f3 f3Var, f3 f3Var2, boolean z, Function0 function0) {
        super(function0);
        this.b = f3Var;
        this.c = f3Var2;
        this.d = z;
    }

    @Override // defpackage.wka
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.f3
    public final wka b() {
        return null;
    }

    @Override // defpackage.wka
    public final tja c() {
        return this.b.c();
    }

    @Override // defpackage.wka
    public final List d() {
        return this.b.d();
    }

    @Override // defpackage.f3
    public final KClass e() {
        return this.b.e();
    }

    @Override // defpackage.f3
    public final boolean f() {
        return false;
    }

    @Override // defpackage.f3
    public final boolean g() {
        return false;
    }

    @Override // defpackage.kja
    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // defpackage.f3
    public final boolean h() {
        return this.d;
    }

    @Override // defpackage.f3
    public final boolean i() {
        return false;
    }

    @Override // defpackage.f3
    public final f3 j() {
        return this.b;
    }

    @Override // defpackage.f3
    public final f3 k(boolean z) {
        f3 k = this.b.k(z);
        f3 k2 = this.c.k(z);
        k.getClass();
        k2.getClass();
        if (Intrinsics.areEqual(k, k2)) {
            return k;
        }
        return new r78(k, k2, this.d, null);
    }

    @Override // defpackage.f3
    public final f3 l(boolean z) {
        f3 l = this.b.l(z);
        f3 l2 = this.c.l(z);
        l.getClass();
        l2.getClass();
        if (Intrinsics.areEqual(l, l2)) {
            return l;
        }
        return new r78(l, l2, this.d, null);
    }

    @Override // defpackage.f3
    public final f3 m() {
        return this.c;
    }
}
