package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qnl extends ww8 {
    @Override // defpackage.z81
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        if (queryLocalInterface instanceof gsl) {
            return (gsl) queryLocalInterface;
        }
        return new gsl(iBinder);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return tem.b;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 261200000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // defpackage.z81
    public final boolean usesClientTelemetry() {
        return true;
    }
}
