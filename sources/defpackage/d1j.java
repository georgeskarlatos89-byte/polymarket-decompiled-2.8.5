package defpackage;

import java.util.Arrays;
import timber.log.Timber;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class d1j extends e1j {
    @Override // defpackage.e1j
    public final void a(String str, Object... objArr) {
        for (e1j e1jVar : Timber.c) {
            e1jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.e1j
    public final void b(String str, Object... objArr) {
        for (e1j e1jVar : Timber.c) {
            e1jVar.b(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.e1j
    public final void c(String str, Object... objArr) {
        for (e1j e1jVar : Timber.c) {
            e1jVar.c(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.e1j
    public final void d(String str, String str2) {
        str2.getClass();
        throw new AssertionError();
    }

    @Override // defpackage.e1j
    public final void f(String str, Object... objArr) {
        for (e1j e1jVar : Timber.c) {
            e1jVar.f(str, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
