package defpackage;

import androidx.fragment.app.b0;
import androidx.lifecycle.ViewModelProvider$Factory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ym8 implements ViewModelProvider$Factory {
    public final /* synthetic */ int a;

    public /* synthetic */ ym8(int i) {
        this.a = i;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final dak create(Class cls) {
        switch (this.a) {
            case 0:
                return new b0(true);
            default:
                return new dob();
        }
    }
}
