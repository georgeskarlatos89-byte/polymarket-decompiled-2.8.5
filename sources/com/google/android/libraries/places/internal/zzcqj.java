package com.google.android.libraries.places.internal;

import defpackage.bd9;
import defpackage.brn;
import defpackage.nu9;
import defpackage.qp7;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcqj extends zzcqk {
    private static final zzcrc zzb;
    private static final zzcrc zzc;
    private static final zzcrc zzd;
    private static final zzcrc zze;
    private static final zzcrc zzf;
    private static final zzcrc zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static final Method zzj;
    private static final Method zzk;
    private static final Method zzl;
    private static final Method zzm;
    private static final Constructor zzn;

    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        ClassNotFoundException classNotFoundException;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Method method9;
        Method method10;
        Class<?> cls;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        zzb = new zzcrc(null, "setUseSessionTickets", cls2);
        zzc = new zzcrc(null, "setHostname", String.class);
        zzd = new zzcrc(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        zze = new zzcrc(null, "setAlpnProtocols", byte[].class);
        zzf = new zzcrc(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        zzg = new zzcrc(null, "setNpnProtocols", byte[].class);
        try {
            method5 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method6 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method8 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        method9 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                    } catch (ClassNotFoundException e) {
                        classNotFoundException = e;
                        method4 = null;
                        method = method5;
                        method2 = method6;
                        method3 = method8;
                        zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                        method5 = method;
                        method6 = method2;
                        method7 = null;
                        method8 = method3;
                        method9 = method4;
                        zzj = method5;
                        zzk = method6;
                        zzl = method8;
                        zzh = method9;
                        zzi = method7;
                        method10 = SSLParameters.class.getMethod("setServerNames", List.class);
                        try {
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        } catch (ClassNotFoundException e2) {
                            e = e2;
                            zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
                            zzm = method10;
                            zzn = constructor;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
                            zzm = method10;
                            zzn = constructor;
                        }
                        zzm = method10;
                        zzn = constructor;
                    } catch (NoSuchMethodException e4) {
                        noSuchMethodException = e4;
                        method4 = null;
                        method = method5;
                        method2 = method6;
                        method3 = method8;
                        zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                        method5 = method;
                        method6 = method2;
                        method7 = null;
                        method8 = method3;
                        method9 = method4;
                        zzj = method5;
                        zzk = method6;
                        zzl = method8;
                        zzh = method9;
                        zzi = method7;
                        method10 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        zzm = method10;
                        zzn = constructor;
                    }
                    try {
                        method7 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                    } catch (ClassNotFoundException e5) {
                        method2 = method6;
                        method3 = method8;
                        method4 = method9;
                        classNotFoundException = e5;
                        method = method5;
                        zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                        method5 = method;
                        method6 = method2;
                        method7 = null;
                        method8 = method3;
                        method9 = method4;
                        zzj = method5;
                        zzk = method6;
                        zzl = method8;
                        zzh = method9;
                        zzi = method7;
                        method10 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        zzm = method10;
                        zzn = constructor;
                    } catch (NoSuchMethodException e6) {
                        method2 = method6;
                        method3 = method8;
                        method4 = method9;
                        noSuchMethodException = e6;
                        method = method5;
                        zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                        method5 = method;
                        method6 = method2;
                        method7 = null;
                        method8 = method3;
                        method9 = method4;
                        zzj = method5;
                        zzk = method6;
                        zzl = method8;
                        zzh = method9;
                        zzi = method7;
                        method10 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        zzm = method10;
                        zzn = constructor;
                    }
                } catch (ClassNotFoundException e7) {
                    classNotFoundException = e7;
                    method3 = null;
                    method4 = null;
                    method = method5;
                    method2 = method6;
                } catch (NoSuchMethodException e8) {
                    noSuchMethodException = e8;
                    method3 = null;
                    method4 = null;
                    method = method5;
                    method2 = method6;
                }
            } catch (ClassNotFoundException e9) {
                classNotFoundException = e9;
                method2 = null;
                method3 = null;
                method4 = null;
            } catch (NoSuchMethodException e10) {
                noSuchMethodException = e10;
                method2 = null;
                method3 = null;
                method4 = null;
            }
        } catch (ClassNotFoundException e11) {
            classNotFoundException = e11;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
        } catch (NoSuchMethodException e12) {
            noSuchMethodException = e12;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        zzj = method5;
        zzk = method6;
        zzl = method8;
        zzh = method9;
        zzi = method7;
        try {
            method10 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e13) {
            e = e13;
            method10 = null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            method10 = null;
        }
        zzm = method10;
        zzn = constructor;
    }

    public zzcqj(zzcrh zzcrhVar) {
        super(zzcrhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcqk
    public final String zza(SSLSocket sSLSocket, String str, List list) {
        String zzc2 = zzc(sSLSocket);
        if (zzc2 == null) {
            return super.zza(sSLSocket, str, list);
        }
        return zzc2;
    }

    @Override // com.google.android.libraries.places.internal.zzcqk
    public final void zzb(SSLSocket sSLSocket, String str, List list) {
        boolean z;
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcri) it.next()).toString());
        }
        boolean z2 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            if (zzchn.zzb(str).getAuthority().indexOf(64) == -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            brn.e(str, "Userinfo must not be present on authority: '%s'", z);
                            Method method2 = zzh;
                            if (method2 != null && ((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                zzi.invoke(null, sSLSocket, Boolean.TRUE);
                            } else {
                                zzb.zzb(sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = zzm;
                            if (method3 != null && (constructor = zzn) != null && nu9.b(bd9.a(str).a, null) == null) {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                            zzc.zzb(sSLSocket, str);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e) {
                    qp7.n(e);
                    return;
                }
            } catch (IllegalAccessException e2) {
                qp7.n(e2);
                return;
            } catch (InstantiationException e3) {
                qp7.n(e3);
                return;
            }
        }
        Method method4 = zzl;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                zzj.invoke(sSLParameters, strArr);
                z2 = true;
            } catch (InvocationTargetException e4) {
                if (e4.getTargetException() instanceof UnsupportedOperationException) {
                    zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
                } else {
                    throw e4;
                }
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z2 && (method = zzk) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {zzcrh.zzg(list)};
        zzcrh zzcrhVar = this.zza;
        if (zzcrhVar.zzc() == 1) {
            zze.zzc(sSLSocket, objArr);
        }
        if (zzcrhVar.zzc() != 3) {
            zzg.zzc(sSLSocket, objArr);
        } else {
            qp7.p("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcqk
    public final String zzc(SSLSocket sSLSocket) {
        Method method = zzl;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                qp7.n(e);
                return null;
            } catch (InvocationTargetException e2) {
                if (e2.getTargetException() instanceof UnsupportedOperationException) {
                    zzcqk.zze().logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    qp7.n(e2);
                    return null;
                }
            }
        }
        if (this.zza.zzc() == 1) {
            try {
                byte[] bArr = (byte[]) zzd.zzc(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, zzcrk.zzb);
                }
            } catch (Exception e3) {
                zzcqk.zze().logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (this.zza.zzc() != 3) {
            try {
                byte[] bArr2 = (byte[]) zzf.zzc(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, zzcrk.zzb);
                }
            } catch (Exception e4) {
                zzcqk.zze().logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }
}
