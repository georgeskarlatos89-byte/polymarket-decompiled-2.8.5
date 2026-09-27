package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w3l extends ww8 {
    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof a3l) {
            return (a3l) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 1);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return q3l.b;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
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
