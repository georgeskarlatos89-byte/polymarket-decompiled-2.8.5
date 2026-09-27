package defpackage;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nfi implements ViewModelStoreOwner {
    public final ViewModelStore a;

    public nfi(ViewModelStore viewModelStore) {
        this.a = viewModelStore;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.a;
    }
}
