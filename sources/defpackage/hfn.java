package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hfn extends ww8 {
    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof rpn) {
            return (rpn) queryLocalInterface;
        }
        return new rpn(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return new gw7[]{c5l.b, c5l.a};
    }

    @Override // defpackage.z81
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // defpackage.z81
    public final boolean usesClientTelemetry() {
        return true;
    }
}
