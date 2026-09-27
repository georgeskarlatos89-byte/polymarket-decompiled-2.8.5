package defpackage;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oak {
    public static final fgj b = new fgj(3);
    public final rwh a;

    public oak(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras) {
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        this.a = new rwh(viewModelStore, viewModelProvider$Factory, creationExtras);
    }

    public final dak a(KClass kClass) {
        kClass.getClass();
        kClass.getClass();
        String a = xkn.a(kClass);
        if (a != null) {
            return this.a.d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a), kClass);
        }
        dmk.v("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public /* synthetic */ oak(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, viewModelProvider$Factory, (i & 4) != 0 ? CreationExtras.Empty.b : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oak(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory) {
        this(viewModelStore, viewModelProvider$Factory, null, 4, null);
        viewModelStore.getClass();
    }
}
