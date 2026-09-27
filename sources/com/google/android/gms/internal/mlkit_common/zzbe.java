package com.google.android.gms.internal.mlkit_common;

import com.fingerprintjs.android.fpjs_pro.g;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.dfd;
import defpackage.dmk;
import defpackage.efd;
import defpackage.gy7;
import defpackage.ix2;
import defpackage.n3k;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbe implements efd {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final gy7 zzb;
    private static final gy7 zzc;
    private static final dfd zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final dfd zzh;
    private final zzbi zzi = new zzbi(this);

    static {
        zzbc f = g.f(1);
        HashMap hashMap = new HashMap();
        hashMap.put(f.annotationType(), f);
        zzb = new gy7("key", ix2.u(hashMap));
        zzbc f2 = g.f(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f2.annotationType(), f2);
        zzc = new gy7("value", ix2.u(hashMap2));
        zzd = new dfd() { // from class: com.google.android.gms.internal.mlkit_common.zzbd
            @Override // defpackage.nd7
            public final void encode(Object obj, Object obj2) {
                zzbe.zzg((Map.Entry) obj, (efd) obj2);
            }
        };
    }

    public zzbe(OutputStream outputStream, Map map, Map map2, dfd dfdVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = dfdVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, efd efdVar) {
        efdVar.add(zzb, entry.getKey());
        efdVar.add(zzc, entry.getValue());
    }

    private static int zzh(gy7 gy7Var) {
        zzbc zzbcVar = (zzbc) gy7Var.b(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar.zza();
        }
        dmk.z("Field has no @Protobuf config");
        return 0;
    }

    private final long zzi(dfd dfdVar, Object obj) {
        zzaz zzazVar = new zzaz();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzazVar;
            try {
                dfdVar.encode(obj, this);
                this.zze = outputStream;
                long zza2 = zzazVar.zza();
                zzazVar.close();
                return zza2;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzazVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static zzbc zzj(gy7 gy7Var) {
        zzbc zzbcVar = (zzbc) gy7Var.b(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar;
        }
        dmk.z("Field has no @Protobuf config");
        return null;
    }

    private final zzbe zzk(dfd dfdVar, gy7 gy7Var, Object obj, boolean z) {
        long zzi = zzi(dfdVar, obj);
        if (z && zzi == 0) {
            return this;
        }
        zzn((zzh(gy7Var) << 3) | 2);
        zzo(zzi);
        dfdVar.encode(obj, this);
        return this;
    }

    private final zzbe zzl(n3k n3kVar, gy7 gy7Var, Object obj, boolean z) {
        this.zzi.zza(gy7Var, z);
        n3kVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.zze;
            if (j != 0) {
                outputStream.write(i2 | 128);
                i >>>= 7;
            } else {
                outputStream.write(i2);
                return;
            }
        }
    }

    private final void zzo(long j) {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.zze;
            if (j2 != 0) {
                outputStream.write(i | 128);
                j >>>= 7;
            } else {
                outputStream.write(i);
                return;
            }
        }
    }

    public final efd add(String str, double d) {
        zza(gy7.c(str), d, true);
        return this;
    }

    public final efd inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final efd nested(String str) {
        return nested(gy7.c(str));
    }

    public final efd zza(gy7 gy7Var, double d, boolean z) {
        if (z && d == ConstantsKt.UNSET) {
            return this;
        }
        zzn((zzh(gy7Var) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d).array());
        return this;
    }

    public final efd zzb(gy7 gy7Var, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        zzn((zzh(gy7Var) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final efd zzc(gy7 gy7Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    zzn((zzh(gy7Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(gy7Var, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, gy7Var, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(gy7Var, ((Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(gy7Var, ((Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(gy7Var, ((Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(gy7Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (!z || bArr.length != 0) {
                        zzn((zzh(gy7Var) << 3) | 2);
                        zzn(bArr.length);
                        this.zze.write(bArr);
                        return this;
                    }
                } else {
                    dfd dfdVar = (dfd) this.zzf.get(obj.getClass());
                    if (dfdVar != null) {
                        zzk(dfdVar, gy7Var, obj, z);
                        return this;
                    }
                    n3k n3kVar = (n3k) this.zzg.get(obj.getClass());
                    if (n3kVar != null) {
                        zzl(n3kVar, gy7Var, obj, z);
                        return this;
                    }
                    if (obj instanceof zzba) {
                        zzd(gy7Var, ((zzba) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(gy7Var, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, gy7Var, obj, z);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzbe zzd(gy7 gy7Var, int i, boolean z) {
        if (!z || i != 0) {
            zzbc zzj = zzj(gy7Var);
            int ordinal = zzj.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        zzn((zzj.zza() << 3) | 5);
                        this.zze.write(zzm(4).putInt(i).array());
                        return this;
                    }
                } else {
                    zzn(zzj.zza() << 3);
                    zzn((i + i) ^ (i >> 31));
                    return this;
                }
            } else {
                zzn(zzj.zza() << 3);
                zzn(i);
                return this;
            }
        }
        return this;
    }

    public final zzbe zze(gy7 gy7Var, long j, boolean z) {
        if (!z || j != 0) {
            zzbc zzj = zzj(gy7Var);
            int ordinal = zzj.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        zzn((zzj.zza() << 3) | 1);
                        this.zze.write(zzm(8).putLong(j).array());
                        return this;
                    }
                } else {
                    zzn(zzj.zza() << 3);
                    zzo((j >> 63) ^ (j + j));
                    return this;
                }
            } else {
                zzn(zzj.zza() << 3);
                zzo(j);
                return this;
            }
        }
        return this;
    }

    public final zzbe zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        dfd dfdVar = (dfd) this.zzf.get(obj.getClass());
        if (dfdVar != null) {
            dfdVar.encode(obj, this);
            return this;
        }
        dmk.z("No encoder for ".concat(String.valueOf(obj.getClass())));
        return null;
    }

    public final efd add(gy7 gy7Var, float f) {
        zzb(gy7Var, f, true);
        return this;
    }

    public final efd nested(gy7 gy7Var) {
        throw new RuntimeException("nested() is not implemented for protobuf encoding.");
    }

    @Override // defpackage.efd
    public final /* synthetic */ efd add(gy7 gy7Var, int i) {
        zzd(gy7Var, i, true);
        return this;
    }

    @Override // defpackage.efd
    public final /* synthetic */ efd add(gy7 gy7Var, long j) {
        zze(gy7Var, j, true);
        return this;
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, Object obj) {
        zzc(gy7Var, obj, true);
        return this;
    }

    public final /* synthetic */ efd add(gy7 gy7Var, boolean z) {
        zzd(gy7Var, z ? 1 : 0, true);
        return this;
    }

    public final efd add(gy7 gy7Var, double d) {
        zza(gy7Var, d, true);
        return this;
    }

    public final efd add(String str, int i) {
        zzd(gy7.c(str), i, true);
        return this;
    }

    public final efd add(String str, long j) {
        zze(gy7.c(str), j, true);
        return this;
    }

    public final efd add(String str, Object obj) {
        zzc(gy7.c(str), obj, true);
        return this;
    }

    public final efd add(String str, boolean z) {
        zzd(gy7.c(str), z ? 1 : 0, true);
        return this;
    }
}
