package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzbrq;
import com.google.android.libraries.places.internal.zzbrw;
import defpackage.dmk;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzbrq<MessageType extends zzbrw<MessageType, BuilderType>, BuilderType extends zzbrq<MessageType, BuilderType>> extends zzbpz<MessageType, BuilderType> {
    protected zzbrw zza;
    private final zzbrw zzb;

    public zzbrq(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzbw()) {
            this.zza = messagetype.zzbz();
        } else {
            dmk.v("Default instance must be immutable.");
            throw null;
        }
    }

    private static void zza(zzbrw zzbrwVar, zzbrw zzbrwVar2) {
        zzbtj.zza().zzb(zzbrwVar.getClass()).zzd(zzbrwVar, zzbrwVar2);
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final /* bridge */ /* synthetic */ Object clone() {
        return zzB();
    }

    public final zzbrq zzB() {
        zzbrq zzbrqVar = (zzbrq) this.zzb.zzb(5, null, null);
        zzbrqVar.zza = zzC();
        return zzbrqVar;
    }

    public MessageType zzC() {
        boolean zzbw = this.zza.zzbw();
        MessageType messagetype = (MessageType) this.zza;
        if (!zzbw) {
            return messagetype;
        }
        messagetype.zzbB();
        return (MessageType) this.zza;
    }

    public final MessageType zzD() {
        MessageType zzC = zzC();
        if (zzC.zzbU()) {
            return zzC;
        }
        throw new zzbtx(zzC);
    }

    public final zzbrq zzE(zzbrw zzbrwVar) {
        if (zzbrwVar != null && !this.zzb.getClass().isInstance(zzbrwVar)) {
            dmk.v("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (!this.zzb.equals(zzbrwVar)) {
            if (!this.zza.zzbw()) {
                zzz();
            }
            zza(this.zza, zzbrwVar);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbsy
    public /* bridge */ /* synthetic */ zzbsz zzF() {
        return zzC();
    }

    @Override // com.google.android.libraries.places.internal.zzbsy
    public /* bridge */ /* synthetic */ zzbsz zzG() {
        return zzD();
    }

    @Override // com.google.android.libraries.places.internal.zzbta
    public final boolean zzbU() {
        return zzbrw.zzbQ(this.zza, false);
    }

    @Override // com.google.android.libraries.places.internal.zzbta
    public final /* bridge */ /* synthetic */ zzbsz zzbV() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final /* bridge */ /* synthetic */ zzbpz zzt() {
        return zzB();
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final /* synthetic */ zzbpz zzu(zzbqa zzbqaVar) {
        zzE((zzbrw) zzbqaVar);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbpz, com.google.android.libraries.places.internal.zzbsy
    public final /* bridge */ /* synthetic */ zzbsy zzx(zzbqu zzbquVar, zzbrh zzbrhVar) {
        if (!this.zza.zzbw()) {
            zzz();
        }
        try {
            zzbtj.zza().zzb(this.zza.getClass()).zzg(this.zza, zzbqv.zza(zzbquVar), zzbrhVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public final void zzy() {
        if (!this.zza.zzbw()) {
            zzz();
        }
    }

    public void zzz() {
        zzbrw zzbz = this.zzb.zzbz();
        zza(zzbz, this.zza);
        this.zza = zzbz;
    }
}
