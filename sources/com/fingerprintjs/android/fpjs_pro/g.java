package com.fingerprintjs.android.fpjs_pro;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzbc;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzai;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzby;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzcc;
import com.google.android.libraries.places.internal.zzbra;
import defpackage.fgn;
import defpackage.hll;
import defpackage.rgl;
import defpackage.sr8;
import defpackage.t7l;
import defpackage.ucl;
import defpackage.wll;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static int A(int i, int i2, int i3) {
        return t7l.a(i) + i2 + i3;
    }

    public static int B(int i, int i2, int i3, int i4) {
        return t7l.a(i) + i2 + i3 + i4;
    }

    public static int C(int i, int i2, int i3) {
        return zzbra.zzF(i) + i2 + i3;
    }

    public static int D(int i, int i2, int i3, int i4) {
        return zzbra.zzF(i) + i2 + i3 + i4;
    }

    public static int a(int i, int i2, int i3) {
        int i4 = (i * i2) + i3;
        return i4 * i4;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) - i4;
    }

    public static int c(int i, int i2, int i3, int i4, int i5) {
        int i6 = (i * i2) + i3;
        return (i6 * i6 * i4) + i5;
    }

    public static int d(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static long e(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static zzbc f(int i) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static zzbc g(zzbc zzbcVar, HashMap hashMap, zzbc zzbcVar2, HashMap hashMap2, int i) {
        hashMap.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static zzai h(int i) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        return zzaeVar.zzb();
    }

    public static zzcc i(int i) {
        zzby zzbyVar = new zzby();
        zzbyVar.zza(i);
        return zzbyVar.zzb();
    }

    public static zzcc j(zzcc zzccVar, HashMap hashMap, zzcc zzccVar2, HashMap hashMap2, int i) {
        hashMap.put(zzccVar.annotationType(), zzccVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
        zzby zzbyVar = new zzby();
        zzbyVar.zza(i);
        return zzbyVar.zzb();
    }

    public static Object k(int i, sr8 sr8Var, boolean z) {
        sr8Var.s(z);
        sr8Var.e0(i);
        return sr8Var.Q();
    }

    public static Object l(String str, Object obj, String str2) {
        return Class.forName(str).getField(str2).get(obj);
    }

    public static Object m(String str, String str2, Class[] clsArr, Object obj, Object[] objArr) {
        return Class.forName(str).getDeclaredMethod(str2, clsArr).invoke(obj, objArr);
    }

    public static Object n(rgl rglVar, int i, ArrayList arrayList, int i2) {
        fgn.c(i, rglVar.name(), arrayList);
        return arrayList.get(i2);
    }

    public static String o(String str, boolean z) {
        return str + z;
    }

    public static String p(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder q(String str) {
        str.getClass();
        return new StringBuilder();
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static HashMap s(Class cls, ucl uclVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, uclVar);
        return hashMap;
    }

    public static HashMap t(Class cls, hll hllVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, hllVar);
        return hashMap;
    }

    public static HashMap u(Class cls, wll wllVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, wllVar);
        return hashMap;
    }

    public static void v(zzbc zzbcVar, HashMap hashMap, zzbc zzbcVar2, HashMap hashMap2) {
        hashMap.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
    }

    public static void w(zzcc zzccVar, HashMap hashMap, zzcc zzccVar2, HashMap hashMap2) {
        hashMap.put(zzccVar.annotationType(), zzccVar2);
        Collections.unmodifiableMap(new HashMap(hashMap2));
    }

    public static void x(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void y(HashMap hashMap, String str, io.sentry.internal.debugmeta.c cVar, String str2, x0 x0Var) {
        Object obj = hashMap.get(str);
        cVar.u(str2);
        cVar.A(x0Var, obj);
    }

    public static void z(ConcurrentHashMap concurrentHashMap, String str, io.sentry.internal.debugmeta.c cVar, String str2, x0 x0Var) {
        Object obj = concurrentHashMap.get(str);
        cVar.u(str2);
        cVar.A(x0Var, obj);
    }
}
