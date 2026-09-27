package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import timber.log.Timber;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ava extends xu0 {
    public static final AtomicBoolean c = new AtomicBoolean(false);

    @Override // defpackage.xu0
    public final void c(xua xuaVar, String str) {
        String str2 = this.b;
        d1j d1jVar = Timber.a;
        d1jVar.getClass();
        e1j[] e1jVarArr = Timber.c;
        int length = e1jVarArr.length;
        int i = 0;
        while (i < length) {
            e1j e1jVar = e1jVarArr[i];
            i++;
            e1jVar.a.set(str2);
        }
        int i2 = yua.a[xuaVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    d1jVar.b(str, new Object[0]);
                    return;
                }
                d1jVar.f(str, new Object[0]);
                return;
            }
            d1jVar.c(str, new Object[0]);
            return;
        }
        d1jVar.a(str, new Object[0]);
    }

    @Override // defpackage.vua
    public final boolean o(xua xuaVar) {
        return true;
    }
}
