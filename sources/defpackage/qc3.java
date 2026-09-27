package defpackage;

import androidx.lifecycle.LifecycleOwner;
import com.socure.docv.capturesdk.feature.utils.a;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qc3 extends gpc {
    public final /* synthetic */ int l;

    public /* synthetic */ qc3(int i) {
        this.l = i;
    }

    @Override // defpackage.olb
    public void e(LifecycleOwner lifecycleOwner, zfd zfdVar) {
        boolean z;
        switch (this.l) {
            case 1:
                lifecycleOwner.getClass();
                if (d() != null) {
                    z = true;
                } else {
                    z = false;
                }
                super.e(lifecycleOwner, new a(z, zfdVar));
                return;
            default:
                super.e(lifecycleOwner, zfdVar);
                return;
        }
    }

    @Override // defpackage.olb
    public void f(zfd zfdVar) {
        boolean z;
        switch (this.l) {
            case 1:
                zfdVar.getClass();
                if (d() != null) {
                    z = true;
                } else {
                    z = false;
                }
                super.f(new a(z, zfdVar));
                return;
            default:
                super.f(zfdVar);
                return;
        }
    }

    @Override // defpackage.olb
    public void h() {
        switch (this.l) {
            case 0:
                l(null);
                return;
            default:
                return;
        }
    }
}
