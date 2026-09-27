package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.dmk;
import defpackage.woa;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzckz implements zzchd {
    private final zzcky zza;
    private zzcpc zzc;
    private int zzd;
    private final zzcpd zzh;
    private final zzcoo zzi;
    private boolean zzj;
    private int zzk;
    private long zzm;
    private int zzb = -1;
    private zzbxr zze = zzbxp.zza;
    private final zzckx zzf = new zzckx(this, null);
    private final ByteBuffer zzg = ByteBuffer.allocate(5);
    private int zzl = -1;

    public zzckz(zzcky zzckyVar, zzcpd zzcpdVar, zzcoo zzcooVar) {
        brn.m(zzckyVar, "sink");
        this.zza = zzckyVar;
        brn.m(zzcpdVar, "bufferAllocator");
        this.zzh = zzcpdVar;
        brn.m(zzcooVar, "statsTraceCtx");
        this.zzi = zzcooVar;
    }

    private final void zzi(zzckw zzckwVar, boolean z) {
        int zza = zzckwVar.zza();
        int i = this.zzb;
        if (i >= 0 && zza > i) {
            zzccd zzccdVar = zzccd.zzf;
            Locale locale = Locale.US;
            throw new zzccg(zzccdVar.zze("message too large " + zza + " > " + this.zzb), null);
        }
        ByteBuffer byteBuffer = this.zzg;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(zza);
        zzcpc zza2 = this.zzh.zza(5);
        zza2.zza(byteBuffer.array(), 0, byteBuffer.position());
        if (zza == 0) {
            this.zzc = zza2;
            return;
        }
        zzcky zzckyVar = this.zza;
        zzckyVar.zzj(zza2, false, false, this.zzk - 1);
        this.zzk = 1;
        List zzb = zzckwVar.zzb();
        for (int i2 = 0; i2 < zzb.size() - 1; i2++) {
            zzckyVar.zzj((zzcpc) zzb.get(i2), false, false, 0);
        }
        this.zzc = (zzcpc) zzb.get(zzb.size() - 1);
        this.zzm = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zzj(InputStream inputStream, OutputStream outputStream) {
        return ((zzbyh) inputStream).zza(outputStream);
    }

    private final void zzk(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            zzcpc zzcpcVar = this.zzc;
            boolean z = false;
            if (zzcpcVar != null && zzcpcVar.zzc() == 0) {
                zzl(false, false);
            }
            if (this.zzc == null) {
                if (this.zzd > 0) {
                    z = true;
                }
                brn.r("knownLengthPendingAllocation reached 0", z);
                zzcpc zza = this.zzh.zza(this.zzd);
                this.zzc = zza;
                int i3 = this.zzd;
                this.zzd = i3 - Math.min(i3, zza.zzc());
            }
            int min = Math.min(i2, this.zzc.zzc());
            this.zzc.zza(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    private final void zzl(boolean z, boolean z2) {
        zzcpc zzcpcVar = this.zzc;
        this.zzc = null;
        this.zza.zzj(zzcpcVar, z, z2, this.zzk);
        this.zzk = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzchd
    public final void zza(InputStream inputStream) {
        int zzj;
        if (!this.zzj) {
            this.zzk++;
            int i = this.zzl + 1;
            this.zzl = i;
            this.zzm = 0L;
            this.zzi.zzf(i);
            zzbxr zzbxrVar = this.zze;
            zzbxq zzbxqVar = zzbxp.zza;
            try {
                int available = inputStream.available();
                if (available != 0 && zzbxrVar != zzbxqVar) {
                    zzckw zzckwVar = new zzckw(this, null);
                    OutputStream zzb = this.zze.zzb(zzckwVar);
                    try {
                        zzj = zzj(inputStream, zzb);
                        zzb.close();
                        int i2 = this.zzb;
                        if (i2 >= 0 && zzj > i2) {
                            zzccd zzccdVar = zzccd.zzf;
                            Locale locale = Locale.US;
                            throw new zzccg(zzccdVar.zze("message too large " + zzj + " > " + this.zzb), null);
                        }
                        zzi(zzckwVar, true);
                    } catch (Throwable th) {
                        zzb.close();
                        throw th;
                    }
                } else if (available != -1) {
                    this.zzm = available;
                    int i3 = this.zzb;
                    if (i3 >= 0 && available > i3) {
                        zzccd zzccdVar2 = zzccd.zzf;
                        Locale locale2 = Locale.US;
                        throw new zzccg(zzccdVar2.zze("message too large " + available + " > " + this.zzb), null);
                    }
                    ByteBuffer byteBuffer = this.zzg;
                    byteBuffer.clear();
                    byteBuffer.put((byte) 0).putInt(available);
                    this.zzd = available + 5;
                    zzk(byteBuffer.array(), 0, byteBuffer.position());
                    zzj = zzj(inputStream, this.zzf);
                } else {
                    zzckw zzckwVar2 = new zzckw(this, null);
                    zzj = zzj(inputStream, zzckwVar2);
                    zzi(zzckwVar2, false);
                }
                if (available != -1 && zzj != available) {
                    throw new zzccg(zzccd.zzh.zze(woa.l(zzj, available, "Message length inaccurate ", " != ")), null);
                }
                zzcoo zzcooVar = this.zzi;
                long j = zzj;
                zzcooVar.zzj(j);
                zzcooVar.zzk(this.zzm);
                zzcooVar.zzh(this.zzl, this.zzm, j);
                return;
            } catch (zzccg e) {
                throw e;
            } catch (IOException e2) {
                throw new zzccg(zzccd.zzh.zze("Failed to frame message").zzd(e2), null);
            } catch (RuntimeException e3) {
                throw new zzccg(zzccd.zzh.zze("Failed to frame message").zzd(e3), null);
            }
        }
        dmk.n("Framer already closed");
    }

    @Override // com.google.android.libraries.places.internal.zzchd
    public final void zzb() {
        zzcpc zzcpcVar = this.zzc;
        if (zzcpcVar != null && zzcpcVar.zzd() > 0) {
            zzl(false, true);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzchd
    public final boolean zzc() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzchd
    public final void zzd() {
        if (!this.zzj) {
            this.zzj = true;
            zzcpc zzcpcVar = this.zzc;
            if (zzcpcVar != null && zzcpcVar.zzd() == 0) {
                this.zzc = null;
            }
            zzl(true, true);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzchd
    public final /* bridge */ /* synthetic */ zzchd zze(zzbxr zzbxrVar) {
        brn.m(zzbxrVar, "Can't pass an empty compressor");
        this.zze = zzbxrVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzchd
    public final void zzf(int i) {
        boolean z;
        if (this.zzb == -1) {
            z = true;
        } else {
            z = false;
        }
        brn.r("max size already set", z);
        this.zzb = i;
    }

    public final /* synthetic */ void zzg(byte[] bArr, int i, int i2) {
        zzk(bArr, i, i2);
    }

    public final /* synthetic */ zzcpd zzh() {
        return this.zzh;
    }
}
