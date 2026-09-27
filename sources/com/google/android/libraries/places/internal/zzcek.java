package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcek extends zzccx {
    private static final zzcei zze = new zzcee();
    private static final zzcei zzf = new zzcef();
    private static final zzcei zzg = new zzceg();
    private static final zzcej zzh = new zzceh();
    private final Deque zza;
    private Deque zzb;
    private int zzc;
    private boolean zzd;

    public zzcek() {
        this.zza = new ArrayDeque();
    }

    private final int zzl(zzcej zzcejVar, int i, Object obj, int i2) {
        zzd(i);
        Deque deque = this.zza;
        if (!deque.isEmpty()) {
            zzn();
        }
        while (i > 0 && !deque.isEmpty()) {
            zzcmb zzcmbVar = (zzcmb) deque.peek();
            int min = Math.min(i, zzcmbVar.zzf());
            i2 = zzcejVar.zza(zzcmbVar, min, obj, i2);
            i -= min;
            this.zzc -= min;
            zzn();
        }
        if (i <= 0) {
            return i2;
        }
        dmk.i("Failed executing read operation");
        return 0;
    }

    private final int zzm(zzcei zzceiVar, int i, Object obj, int i2) {
        try {
            return zzl(zzceiVar, i, obj, i2);
        } catch (IOException e) {
            dmk.i(e);
            return 0;
        }
    }

    private final void zzn() {
        if (((zzcmb) this.zza.peek()).zzf() == 0) {
            zzo();
        }
    }

    private final void zzo() {
        if (this.zzd) {
            Deque deque = this.zzb;
            Deque deque2 = this.zza;
            deque.add((zzcmb) deque2.remove());
            zzcmb zzcmbVar = (zzcmb) deque2.peek();
            if (zzcmbVar != null) {
                zzcmbVar.zzb();
                return;
            }
            return;
        }
        ((zzcmb) this.zza.remove()).close();
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            } else {
                ((zzcmb) deque.remove()).close();
            }
        }
        if (this.zzb != null) {
            while (!this.zzb.isEmpty()) {
                ((zzcmb) this.zzb.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb
    public final boolean zza() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!((zzcmb) it.next()).zza()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb
    public final void zzb() {
        if (this.zzb == null) {
            this.zzb = new ArrayDeque(Math.min(this.zza.size(), 16));
        }
        while (!this.zzb.isEmpty()) {
            ((zzcmb) this.zzb.remove()).close();
        }
        this.zzd = true;
        zzcmb zzcmbVar = (zzcmb) this.zza.peek();
        if (zzcmbVar != null) {
            zzcmbVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb
    public final void zzc() {
        if (this.zzd) {
            Deque deque = this.zza;
            zzcmb zzcmbVar = (zzcmb) deque.peek();
            if (zzcmbVar != null) {
                int zzf2 = zzcmbVar.zzf();
                zzcmbVar.zzc();
                this.zzc = (zzcmbVar.zzf() - zzf2) + this.zzc;
            }
            while (true) {
                zzcmb zzcmbVar2 = (zzcmb) this.zzb.pollLast();
                if (zzcmbVar2 != null) {
                    zzcmbVar2.zzc();
                    deque.addFirst(zzcmbVar2);
                    this.zzc = zzcmbVar2.zzf() + this.zzc;
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    public final void zze(zzcmb zzcmbVar) {
        boolean z;
        if (this.zzd && this.zza.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(zzcmbVar instanceof zzcek)) {
            this.zza.add(zzcmbVar);
            this.zzc = zzcmbVar.zzf() + this.zzc;
        } else {
            zzcek zzcekVar = (zzcek) zzcmbVar;
            while (true) {
                Deque deque = zzcekVar.zza;
                if (deque.isEmpty()) {
                    break;
                }
                this.zza.add((zzcmb) deque.remove());
            }
            this.zzc += zzcekVar.zzc;
            zzcekVar.zzc = 0;
            zzcekVar.close();
        }
        if (z) {
            ((zzcmb) this.zza.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final int zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final int zzg() {
        return zzm(zze, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final void zzh(int i) {
        zzm(zzf, i, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final void zzi(byte[] bArr, int i, int i2) {
        zzm(zzg, i2, bArr, i);
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final void zzj(OutputStream outputStream, int i) {
        zzl(zzh, i, outputStream, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final zzcmb zzk(int i) {
        zzcmb zzcmbVar;
        int i2;
        zzcmb zzcmbVar2;
        if (i <= 0) {
            return zzcme.zza();
        }
        zzd(i);
        this.zzc -= i;
        zzcmb zzcmbVar3 = null;
        zzcek zzcekVar = null;
        while (true) {
            Deque deque = this.zza;
            zzcmb zzcmbVar4 = (zzcmb) deque.peek();
            int zzf2 = zzcmbVar4.zzf();
            if (zzf2 > i) {
                zzcmbVar2 = zzcmbVar4.zzk(i);
                i2 = 0;
            } else {
                if (this.zzd) {
                    zzcmbVar = zzcmbVar4.zzk(zzf2);
                    zzo();
                } else {
                    zzcmbVar = (zzcmb) deque.poll();
                }
                zzcmb zzcmbVar5 = zzcmbVar;
                i2 = i - zzf2;
                zzcmbVar2 = zzcmbVar5;
            }
            if (zzcmbVar3 == null) {
                zzcmbVar3 = zzcmbVar2;
            } else {
                if (zzcekVar == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(deque.size() + 2, 16);
                    }
                    zzcekVar = new zzcek(i3);
                    zzcekVar.zze(zzcmbVar3);
                    zzcmbVar3 = zzcekVar;
                }
                zzcekVar.zze(zzcmbVar2);
            }
            if (i2 <= 0) {
                return zzcmbVar3;
            }
            i = i2;
        }
    }

    public zzcek(int i) {
        this.zza = new ArrayDeque(i);
    }
}
