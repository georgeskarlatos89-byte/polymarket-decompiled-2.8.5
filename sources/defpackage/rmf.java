package defpackage;

import io.radar.sdk.RadarBeaconManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class rmf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RadarBeaconManager b;

    public /* synthetic */ rmf(RadarBeaconManager radarBeaconManager, int i) {
        this.a = i;
        this.b = radarBeaconManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RadarBeaconManager radarBeaconManager = this.b;
        switch (i) {
            case 0:
                RadarBeaconManager.a(radarBeaconManager);
                return;
            default:
                RadarBeaconManager.b(radarBeaconManager);
                return;
        }
    }
}
