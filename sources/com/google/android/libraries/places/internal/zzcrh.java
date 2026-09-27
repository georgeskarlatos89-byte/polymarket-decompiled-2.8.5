package com.google.android.libraries.places.internal;

import defpackage.qp7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzcrh {
    public static final Logger zza = Logger.getLogger(zzcrh.class.getName());
    private static final String[] zzb = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    private static final zzcrh zzc = zzh();
    private final Provider zzd;

    public zzcrh(Provider provider) {
        this.zzd = provider;
    }

    public static zzcrh zze() {
        return zzc;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object] */
    public static byte[] zzg(List list) {
        ?? obj = new Object();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzcri zzcriVar = (zzcri) list.get(i);
            if (zzcriVar != zzcri.HTTP_1_0) {
                obj.i0(zzcriVar.toString().length());
                obj.E0(zzcriVar.toString());
            }
        }
        return obj.Z(obj.b);
    }

    private static zzcrh zzh() {
        Method method;
        Provider provider;
        Provider provider2;
        Method method2;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            method = null;
            if (i < length) {
                Provider provider3 = providers[i];
                String[] strArr = zzb;
                int length2 = strArr.length;
                for (int i2 = 0; i2 < 5; i2++) {
                    String str = strArr[i2];
                    if (str.equals(provider3.getClass().getName())) {
                        zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                        provider = provider3;
                        break loop0;
                    }
                }
                i++;
            } else {
                provider = null;
                break;
            }
        }
        if (provider != null) {
            zzcrc zzcrcVar = new zzcrc(null, "setUseSessionTickets", Boolean.TYPE);
            zzcrc zzcrcVar2 = new zzcrc(null, "setHostname", String.class);
            zzcrc zzcrcVar3 = new zzcrc(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            zzcrc zzcrcVar4 = new zzcrc(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method2 = cls.getMethod("tagSocket", Socket.class);
                try {
                    method = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
            }
            Method method3 = method2;
            Method method4 = method;
            int i3 = 1;
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    zzcrh.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
                    try {
                        zzcrh.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i3 = 2;
                    } catch (ClassNotFoundException e2) {
                        zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e2);
                        i3 = 3;
                    }
                }
            }
            return new zzcrd(zzcrcVar, zzcrcVar2, method3, method4, zzcrcVar3, zzcrcVar4, provider, i3);
        }
        try {
            Provider provider4 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new zzcre(provider4, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null), null);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("org.eclipse.jetty.alpn.ALPN");
                    sb.append("$Provider");
                    Class<?> cls3 = Class.forName(sb.toString());
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("org.eclipse.jetty.alpn.ALPN");
                    sb2.append("$ClientProvider");
                    Class<?> cls4 = Class.forName(sb2.toString());
                    StringBuilder sb3 = new StringBuilder(42);
                    sb3.append("org.eclipse.jetty.alpn.ALPN");
                    sb3.append("$ServerProvider");
                    try {
                        return new zzcrf(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), cls4, Class.forName(sb3.toString()), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        return new zzcrh(provider2);
                    }
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                provider2 = provider4;
                return new zzcrh(provider2);
            }
        } catch (NoSuchAlgorithmException e3) {
            qp7.n(e3);
            return null;
        }
    }

    public String zzb(SSLSocket sSLSocket) {
        return null;
    }

    public int zzc() {
        return 3;
    }

    public final Provider zzf() {
        return this.zzd;
    }

    public void zzd(SSLSocket sSLSocket) {
    }

    public void zza(SSLSocket sSLSocket, String str, List list) {
    }
}
