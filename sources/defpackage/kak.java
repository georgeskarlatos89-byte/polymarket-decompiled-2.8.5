package defpackage;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kak {
    public static oak a(ViewModelStoreOwner viewModelStoreOwner, ViewModelProvider$Factory viewModelProvider$Factory, int i) {
        CreationExtras creationExtras;
        if ((i & 2) != 0) {
            viewModelStoreOwner.getClass();
            if (viewModelStoreOwner instanceof i49) {
                viewModelProvider$Factory = ((i49) viewModelStoreOwner).getDefaultViewModelProviderFactory();
            } else {
                viewModelProvider$Factory = ci6.b;
            }
        }
        viewModelStoreOwner.getClass();
        if (viewModelStoreOwner instanceof i49) {
            creationExtras = ((i49) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.b;
        }
        viewModelStoreOwner.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        return new oak(viewModelStoreOwner.getViewModelStore(), viewModelProvider$Factory, creationExtras);
    }
}
