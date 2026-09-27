package com.google.android.libraries.places.internal;

import defpackage.k84;
import java.security.cert.Certificate;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyv {
    public zzbyv(SSLSession sSLSession) {
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            int i = zzbyw.zza;
            zzbyw.zzh().logp(Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", k84.g("Peer cert not available for peerHost=", sSLSession.getPeerHost()), (Throwable) e);
        }
    }
}
