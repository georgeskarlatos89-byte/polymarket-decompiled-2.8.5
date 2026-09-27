package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import defpackage.bxf;
import defpackage.ix2;
import defpackage.k84;
import defpackage.mr9;
import defpackage.tr9;
import defpackage.tuj;
import defpackage.vt1;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzzn implements zzaal {
    private final UUID zza;
    private final String zzb;
    private final String zzc;
    private Thread zzd;

    public zzzn(String str, UUID uuid, String str2, zzaaj zzaajVar) {
        str.getClass();
        this.zzc = str;
        this.zza = uuid;
        this.zzb = str2;
        zzaau zzaauVar = zzaajVar.zzc;
        this.zzd = Thread.currentThread();
    }

    public static String zzf(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzaaj zzd = zzzx.zzd();
        zzaal zzaalVar = zzd.zzb;
        if (zzaalVar != null) {
            if (this == zzaalVar) {
                zzzx.zzc(zzd, null);
                this.zzd = null;
                return;
            }
            String zze = zze();
            String zze2 = zzaalVar.zze();
            StringBuilder sb = new StringBuilder(String.valueOf(zze).length() + 79 + String.valueOf(zze2).length() + 1);
            k84.q(sb, "Tried to end span ", zze, ", but that span is not the current span. The current span is ", zze2);
            sb.append(".");
            throw new zzzv(sb.toString());
        }
        String zze3 = zze();
        throw new zzzu(ix2.p(new StringBuilder(String.valueOf(zze3).length() + 101), "Tried to end [", zze3, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (((r1.zzb - r1.zza) * r1.zzc) < r7) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        zzaah zzd;
        String str;
        int i = zzzx.zzb;
        int i2 = 0;
        int i3 = 0;
        for (zzzn zzznVar = this; zzznVar != null; zzznVar = null) {
            i3 += zzznVar.zze().length();
            i2++;
        }
        if (i2 > 250) {
            int i4 = i2 - 1;
            String[] strArr = new String[i2];
            zzzn zzznVar2 = this;
            while (i4 >= 0) {
                strArr[i4] = zzznVar2.zze();
                zzznVar2.zzb();
                i4--;
                zzznVar2 = null;
            }
            vt1 a = mr9.a();
            tuj i5 = tr9.m(strArr).i();
            int i6 = 0;
            while (i5.hasNext()) {
                a.w(i5.next(), Integer.valueOf(i6));
                i6++;
            }
            bxf f = a.f(true);
            int i7 = f.f;
            int i8 = i2 >> 2;
            if (i7 <= i8) {
                int[] iArr = new int[i2 + 1];
                for (int i9 = 0; i9 < i2; i9++) {
                    iArr[i9] = ((Integer) f.get(strArr[i9])).intValue();
                }
                iArr[i2] = i7;
                zzd = zzaai.zza(iArr).zzd();
            }
            zzd = null;
            String str2 = "";
            if (zzd != null) {
                int i10 = zzd.zza;
                if (i10 <= 0) {
                    str = "";
                } else {
                    str = String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i10))).concat(" -> ");
                }
                int i11 = zzd.zzb;
                int i12 = zzd.zzc;
                int i13 = ((i11 - i10) * i12) + i10;
                if (i13 < i2) {
                    str2 = " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i13, i2))));
                }
                String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i10, i11));
                Locale locale = Locale.US;
                str2 = str + "{" + join + "}x" + i12 + str2;
            }
            if (!str2.isEmpty()) {
                return str2;
            }
        }
        char[] cArr = new char[i3];
        while (this != null) {
            String zze = this.zze();
            i3 -= zze.length();
            zze.getChars(0, zze.length(), cArr, i3);
            this = null;
        }
        return new String(cArr);
    }

    @Override // com.google.android.libraries.places.internal.zzaal
    public final Thread zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzaal
    public final zzaal zzb() {
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzaal
    public final UUID zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaal
    public final String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzaal
    public final String zze() {
        return this.zzc;
    }
}
