package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Environment;
import android.os.StatFs;
import defpackage.r5g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/StatFs;", "b", "()Landroid/os/StatFs;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u3 extends Lambda implements Function0<StatFs> {
    public static final u3 h = new Lambda(0);

    public u3() {
        super(0);
    }

    public final StatFs b() {
        Object m882constructorimpl;
        v3 v3Var = v3.a;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(new StatFs(Environment.getRootDirectory().getAbsolutePath()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        return (StatFs) m882constructorimpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ StatFs invoke() {
        return b();
    }
}
