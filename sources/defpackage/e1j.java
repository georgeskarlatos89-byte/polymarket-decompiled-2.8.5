package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class e1j {
    public final ThreadLocal a = new ThreadLocal();

    public abstract void a(String str, Object... objArr);

    public abstract void b(String str, Object... objArr);

    public abstract void c(String str, Object... objArr);

    public abstract void d(String str, String str2);

    public final void e(int i, String str, Object... objArr) {
        ThreadLocal threadLocal = this.a;
        String str2 = (String) threadLocal.get();
        if (str2 != null) {
            threadLocal.remove();
        }
        if (str != null && str.length() != 0) {
            if (objArr.length != 0) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            }
            d(str2, str);
        }
    }

    public abstract void f(String str, Object... objArr);
}
