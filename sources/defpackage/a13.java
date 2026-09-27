package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface a13 extends oz2, jyj {
    @Override // defpackage.oz2
    default p03 a() {
        return f();
    }

    @Override // defpackage.oz2
    default x03 b() {
        return j();
    }

    tfd c();

    p03 f();

    default h03 h() {
        return k03.a;
    }

    x03 j();

    default boolean k() {
        if (b().i() == 0) {
            return true;
        }
        return false;
    }

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    default boolean q() {
        return true;
    }

    ujb release();

    default void o() {
    }

    default void d(h03 h03Var) {
    }

    default void i(boolean z) {
    }

    default void r(boolean z) {
    }
}
