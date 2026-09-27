package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ltm extends ww8 {
    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof gtm) {
            return (gtm) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 9);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return enm.d;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 9410000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
