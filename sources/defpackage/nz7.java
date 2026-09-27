package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface nz7 {
    int a();

    List b();

    default il9 c() {
        Object[] objArr;
        List b = b();
        if (b == null || (objArr = b.toArray(new Object[0])) == null) {
            objArr = new Object[0];
        }
        return xun.f(a(), Arrays.copyOf(objArr, objArr.length));
    }
}
