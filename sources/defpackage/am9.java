package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class am9 extends ww8 {
    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        iBinder.getClass();
        int i = hj9.g;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof ij9) {
            return (ij9) queryLocalInterface;
        }
        return new gj9(iBinder);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        gw7[] gw7VarArr = hsl.c;
        gw7VarArr.getClass();
        return gw7VarArr;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // defpackage.z81
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // defpackage.z81
    public final boolean usesClientTelemetry() {
        return true;
    }
}
