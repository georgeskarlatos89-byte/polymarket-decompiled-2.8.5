package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import defpackage.r5g;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/StatFs;", "b", "()Landroid/os/StatFs;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class p3 extends Lambda implements Function0<StatFs> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Context context) {
        super(0);
        this.h = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r3.exists() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r3.canRead() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.v3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r3 = kotlin.Result.m882constructorimpl(new android.os.StatFs(r3.getAbsolutePath()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r3 = kotlin.Result.m882constructorimpl(kotlin.ResultKt.createFailure(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r3.exists() != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StatFs b() {
        Object m882constructorimpl;
        StatFs statFs;
        int i2;
        int i3;
        j = (i + 15) % 128;
        StatFs statFs2 = null;
        if (!Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted") && !Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted_ro")) {
            int i4 = j;
            i3 = (i4 ^ 35) + ((i4 & 35) << 1);
        } else {
            v3 v3Var = v3.a;
            Context context = this.h;
            try {
                Result.Companion companion = Result.INSTANCE;
                m882constructorimpl = Result.m882constructorimpl(context.getExternalCacheDir());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
            }
            if (m882constructorimpl instanceof r5g) {
                m882constructorimpl = null;
            }
            File file = (File) m882constructorimpl;
            if (file != null) {
                int i5 = j;
                int i6 = (i5 & 121) + (i5 | 121);
                i = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 43 / 0;
                }
            }
            return null;
        }
        i = i3 % 128;
        return statFs2;
        if (statFs instanceof r5g) {
            int i8 = i + 21;
            i2 = i8 % 128;
            j = i2;
            if (i8 % 2 == 0) {
                int i9 = 19 / 0;
            }
        } else {
            int i10 = i;
            i2 = (((i10 | 77) << 1) - (i10 ^ 77)) % 128;
            j = i2;
            statFs2 = statFs;
        }
        statFs2 = statFs2;
        i3 = i2 + HttpStatusCodesKt.HTTP_EARLY_HINTS;
        i = i3 % 128;
        return statFs2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ StatFs invoke() {
        int identityHashCode = System.identityHashCode(this);
        int i2 = ~identityHashCode;
        int i3 = (931790060 ^ i2) | (931790060 & i2);
        int i4 = (i2 & 204904494) | (204904494 ^ i2);
        int i5 = (((~((i4 & (-931790061)) | (i4 ^ (-931790061)))) | (~((i3 & (-204904495)) | (i3 ^ (-204904495))))) * (-184)) + 1856673540;
        int i6 = ~identityHashCode;
        int i7 = ~((931790060 & i6) | (931790060 ^ i6));
        int i8 = (i7 & (-1069546735)) | ((-1069546735) ^ i7);
        int i9 = ~((i6 & 204904494) | (204904494 ^ i6));
        int i10 = (i5 - (~(-(-(((i9 & i8) | (i8 ^ i9)) * 184))))) - 1;
        int i11 = (i10 ^ 529702824) + ((529702824 & i10) << 1);
        int identityHashCode2 = System.identityHashCode(this);
        int i12 = ~identityHashCode2;
        int i13 = ~(((-823923427) & i12) | ((-823923427) ^ i12));
        int i14 = (i13 & 806097088) | (i13 ^ 806097088);
        int i15 = ~((2107522791 ^ identityHashCode2) | (2107522791 & identityHashCode2));
        int i16 = 1675997443 - (~(-(-(((i14 & i15) | (i14 ^ i15)) * (-713)))));
        int i17 = -(-((~((identityHashCode2 & 2107522791) | (2107522791 ^ identityHashCode2))) * 1426));
        if (i11 > ((((i16 | i17) << 1) - (i17 ^ i16)) - (~(-(-((~((2089696453 & i12) | (2089696453 ^ i12))) * 713))))) - 1) {
            return b();
        }
        b();
        throw null;
    }
}
