package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x3d extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final z3d a;

    public x3d(z3d z3dVar) {
        this.a = z3dVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 10;
        }
        this.a.c(i);
    }
}
