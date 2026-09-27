package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.eb8;
import defpackage.hi6;
import defpackage.u85;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzabc implements eb8 {
    final /* synthetic */ eb8 zza;

    public zzabc(eb8 eb8Var) {
        this.zza = eb8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        zzabb zzabbVar;
        int i;
        eb8 eb8Var;
        if (continuation instanceof zzabb) {
            zzabbVar = (zzabb) continuation;
            int i2 = zzabbVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzabbVar.zzb = i2 - Integer.MIN_VALUE;
                Object obj2 = zzabbVar.zza;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = zzabbVar.zzb;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eb8Var = (eb8) zzabbVar.zzc;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    eb8Var = this.zza;
                    zzabbVar.zzc = eb8Var;
                    zzabbVar.zzb = 1;
                    obj2 = ((hi6) obj).await(zzabbVar);
                }
                zzabbVar.zzc = null;
                zzabbVar.zzb = 2;
            }
        }
        zzabbVar = new zzabb(this, continuation);
        Object obj22 = zzabbVar.zza;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = zzabbVar.zzb;
        if (i == 0) {
        }
        zzabbVar.zzc = null;
        zzabbVar.zzb = 2;
    }
}
