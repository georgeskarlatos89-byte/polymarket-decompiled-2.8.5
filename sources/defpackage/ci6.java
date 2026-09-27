package defpackage;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ci6 implements ViewModelProvider$Factory {
    public static final ci6 b = new ci6(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ci6(int i) {
        this.a = i;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final dak create(KClass kClass, CreationExtras creationExtras) {
        int i = this.a;
        kClass.getClass();
        switch (i) {
            case 0:
                return n0n.b(vzm.m(kClass));
            default:
                return new igg();
        }
    }
}
