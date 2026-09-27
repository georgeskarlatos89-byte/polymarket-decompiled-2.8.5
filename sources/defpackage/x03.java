package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface x03 {
    olb c();

    Set d();

    int e();

    String f();

    Rect g();

    default void h(fyg fygVar) {
        fygVar.getClass();
        n0n.c = fygVar;
    }

    int i();

    Object j();

    c80 k();

    List l(int i);

    Set m();

    void n(qz2 qz2Var);

    void o(Executor executor, mx2 mx2Var);

    String p();

    int q(int i);

    olb r();

    Set s();

    default x03 getImplementation() {
        return this;
    }
}
