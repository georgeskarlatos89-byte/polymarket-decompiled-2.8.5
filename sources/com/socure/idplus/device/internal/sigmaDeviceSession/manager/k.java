package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.SigmaDeviceOptions;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k {
    public final com.socure.idplus.device.internal.api.b a;
    public final com.socure.idplus.device.internal.sharedPrefs.a b;
    public final SigmaDeviceOptions c;
    public final com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c d;
    public final com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.c e;
    public com.socure.idplus.device.internal.sigmaDeviceSession.a f;
    public final ArrayList g;
    public String h;
    public String i;

    public k(com.socure.idplus.device.internal.api.b bVar, com.socure.idplus.device.internal.sharedPrefs.a aVar, SigmaDeviceOptions sigmaDeviceOptions) {
        com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c cVar = new com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c();
        bVar.getClass();
        aVar.getClass();
        sigmaDeviceOptions.getClass();
        this.a = bVar;
        this.b = aVar;
        this.c = sigmaDeviceOptions;
        this.d = cVar;
        this.e = new com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.c();
        this.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.INIT;
        this.g = new ArrayList();
    }
}
