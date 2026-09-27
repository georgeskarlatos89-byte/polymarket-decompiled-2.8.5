package defpackage;

import com.polymarket.usviewmodels.AppViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class jfi extends dak {
    public final Object b;

    public jfi(Object obj) {
        obj.getClass();
        this.b = obj;
    }

    @Override // defpackage.dak
    public final void onCleared() {
        AppViewModel appViewModel;
        Object obj = this.b;
        if (obj instanceof AppViewModel) {
            appViewModel = (AppViewModel) obj;
        } else {
            appViewModel = null;
        }
        if (appViewModel != null) {
            appViewModel.cancelWork();
        }
        obj.getClass();
    }
}
