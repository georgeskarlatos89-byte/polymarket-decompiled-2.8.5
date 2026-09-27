package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.eb8;
import defpackage.u85;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaaz implements eb8 {
    final /* synthetic */ eb8 zza;
    final /* synthetic */ Function2 zzb;

    public zzaaz(eb8 eb8Var, Function2 function2) {
        this.zza = eb8Var;
        this.zzb = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        zzaay zzaayVar;
        int i;
        eb8 eb8Var;
        if (continuation instanceof zzaay) {
            zzaayVar = (zzaay) continuation;
            int i2 = zzaayVar.zzb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzaayVar.zzb = i2 - Integer.MIN_VALUE;
                Object obj2 = zzaayVar.zza;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = zzaayVar.zzb;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eb8Var = (eb8) zzaayVar.zzc;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    eb8 eb8Var2 = this.zza;
                    Function2 function2 = this.zzb;
                    zzaayVar.zzc = eb8Var2;
                    zzaayVar.zzb = 1;
                    Object invoke = function2.invoke(obj, zzaayVar);
                    if (invoke != u85Var) {
                        obj2 = invoke;
                        eb8Var = eb8Var2;
                    }
                    return u85Var;
                }
                zzaayVar.zzc = null;
                zzaayVar.zzb = 2;
            }
        }
        zzaayVar = new zzaay(this, continuation);
        Object obj22 = zzaayVar.zza;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = zzaayVar.zzb;
        if (i == 0) {
        }
        zzaayVar.zzc = null;
        zzaayVar.zzb = 2;
    }
}
