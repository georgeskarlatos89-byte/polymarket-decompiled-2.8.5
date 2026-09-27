package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.brn;
import defpackage.qp7;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcsh implements zzcaw {
    private static final ThreadLocal zza = new ThreadLocal();
    private final zzbth zzb;
    private final zzbsz zzc;

    public zzcsh(zzbsz zzbszVar, int i) {
        brn.m(zzbszVar, "defaultInstance cannot be null");
        this.zzc = zzbszVar;
        this.zzb = zzbszVar.zzby();
    }

    @Override // com.google.android.libraries.places.internal.zzcau
    public final /* bridge */ /* synthetic */ InputStream zza(Object obj) {
        return new zzcsg((zzbsz) obj, this.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[Catch: IOException -> 0x003e, TryCatch #3 {IOException -> 0x003e, blocks: (B:13:0x0019, B:15:0x001e, B:19:0x0028, B:21:0x0032, B:23:0x003a, B:28:0x004e, B:30:0x0058, B:34:0x005c, B:50:0x0061, B:51:0x0090, B:53:0x0041, B:55:0x0093), top: B:12:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c A[Catch: IOException -> 0x003e, TryCatch #3 {IOException -> 0x003e, blocks: (B:13:0x0019, B:15:0x001e, B:19:0x0028, B:21:0x0032, B:23:0x003a, B:28:0x004e, B:30:0x0058, B:34:0x005c, B:50:0x0061, B:51:0x0090, B:53:0x0041, B:55:0x0093), top: B:12:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061 A[Catch: IOException -> 0x003e, TryCatch #3 {IOException -> 0x003e, blocks: (B:13:0x0019, B:15:0x001e, B:19:0x0028, B:21:0x0032, B:23:0x003a, B:28:0x004e, B:30:0x0058, B:34:0x005c, B:50:0x0061, B:51:0x0090, B:53:0x0041, B:55:0x0093), top: B:12:0x0019 }] */
    @Override // com.google.android.libraries.places.internal.zzcau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        zzbqu zzbquVar;
        byte[] bArr;
        int i;
        if (inputStream instanceof zzcsg) {
            zzcsg zzcsgVar = (zzcsg) inputStream;
            if (zzcsgVar.zzc() == this.zzb) {
                try {
                    return zzcsgVar.zzb();
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            try {
                try {
                    if (inputStream instanceof zzbzl) {
                        int available = inputStream.available();
                        if (available > 0 && available <= 4194304) {
                            ThreadLocal threadLocal = zza;
                            Reference reference = (Reference) threadLocal.get();
                            if (reference != null) {
                                bArr = (byte[]) reference.get();
                                if (bArr != null) {
                                    if (bArr.length < available) {
                                    }
                                    i = available;
                                    while (i > 0) {
                                        int read = inputStream.read(bArr, available - i, i);
                                        if (read == -1) {
                                            break;
                                        }
                                        i -= read;
                                    }
                                    if (i != 0) {
                                        zzbquVar = zzbqu.zzI(bArr, 0, available);
                                        if (zzbquVar == null) {
                                            zzbquVar = zzbqu.zzH(inputStream, 4096);
                                        }
                                        zzbquVar.zzN(bd0.API_PRIORITY_OTHER);
                                        zzbsz zzbszVar = (zzbsz) this.zzb.zza(zzbquVar, zzcsi.zza);
                                        zzbquVar.zzb(0);
                                        return zzbszVar;
                                    }
                                    int i2 = available - i;
                                    StringBuilder sb = new StringBuilder(String.valueOf(available).length() + 21 + String.valueOf(i2).length());
                                    sb.append("size inaccurate: ");
                                    sb.append(available);
                                    sb.append(" != ");
                                    sb.append(i2);
                                    throw new RuntimeException(sb.toString());
                                }
                            }
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                            i = available;
                            while (i > 0) {
                            }
                            if (i != 0) {
                            }
                        } else if (available == 0) {
                            return this.zzc;
                        }
                    }
                    zzbquVar.zzb(0);
                    return zzbszVar;
                } catch (zzbsm e) {
                    throw e;
                }
                zzbsz zzbszVar2 = (zzbsz) this.zzb.zza(zzbquVar, zzcsi.zza);
            } catch (zzbsm e2) {
                throw new zzccg(zzccd.zzh.zze("Invalid protobuf byte sequence").zzd(e2), null);
            }
            zzbquVar = null;
            if (zzbquVar == null) {
            }
            zzbquVar.zzN(bd0.API_PRIORITY_OTHER);
        } catch (IOException e3) {
            qp7.n(e3);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcaw
    public final Class zzc() {
        return this.zzc.getClass();
    }
}
