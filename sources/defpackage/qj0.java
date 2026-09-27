package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface qj0 {
    void b(int i, int i2, int i3);

    void c(int i, int i2);

    default void e(Object obj, Function2 function2) {
        function2.invoke(h(), obj);
    }

    void f(int i, Object obj);

    Object h();

    void m(int i, Object obj);

    void n(Object obj);

    void o();

    void q();

    default void g() {
    }
}
