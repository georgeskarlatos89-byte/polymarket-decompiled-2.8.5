package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import defpackage.lvf;
import defpackage.qvf;
import defpackage.sv6;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1nSDK {
    final Intent getMediationNetwork;

    public AFj1nSDK(Intent intent) {
        intent.getClass();
        this.getMediationNetwork = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0019, B:25:0x0059, B:7:0x0064, B:13:0x006c, B:30:0x000f, B:15:0x0037, B:18:0x0047, B:19:0x0052, B:21:0x004e, B:22:0x0058, B:4:0x0003), top: B:3:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t, boolean z) {
        T t2;
        Throwable m883exceptionOrNullimpl;
        ?? m882constructorimpl;
        Object obj;
        Throwable m883exceptionOrNullimpl2;
        synchronized (this.getMediationNetwork) {
            try {
                Result.Companion companion = Result.INSTANCE;
                t2 = Result.m882constructorimpl(function0.invoke());
            } finally {
                qvf qvfVar = lvf.a;
                KClass[] kClassArr = {qvfVar.getOrCreateKotlinClass(ConcurrentModificationException.class), qvfVar.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
                m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(t2);
                T t3 = t2;
                if (m883exceptionOrNullimpl != null) {
                }
                m883exceptionOrNullimpl2 = Result.m883exceptionOrNullimpl(t3);
                if (m883exceptionOrNullimpl2 != null) {
                }
                return t;
            }
            qvf qvfVar2 = lvf.a;
            KClass[] kClassArr2 = {qvfVar2.getOrCreateKotlinClass(ConcurrentModificationException.class), qvfVar2.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(t2);
            T t32 = t2;
            if (m883exceptionOrNullimpl != null) {
                try {
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                }
                if (ArraysKt.i(qvfVar2.getOrCreateKotlinClass(m883exceptionOrNullimpl.getClass()), kClassArr2)) {
                    if (z) {
                        obj = getCurrencyIso4217Code(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, m883exceptionOrNullimpl, false, false);
                        obj = t;
                    }
                    m882constructorimpl = Result.m882constructorimpl(obj);
                    t32 = m882constructorimpl;
                } else {
                    throw m883exceptionOrNullimpl;
                }
            }
            m883exceptionOrNullimpl2 = Result.m883exceptionOrNullimpl(t32);
            if (m883exceptionOrNullimpl2 != null) {
                t = t32;
            } else {
                AFLogger.afErrorLog(str, m883exceptionOrNullimpl2, false, false);
            }
        }
        return t;
    }

    public final boolean AFAdRevenueData(final String str) {
        str.getClass();
        Boolean bool = (Boolean) getCurrencyIso4217Code(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1nSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final Boolean getMediationNetwork() {
                return Boolean.valueOf(AFj1nSDK.this.getMediationNetwork.hasExtra(str));
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Boolean invoke() {
                return getMediationNetwork();
            }
        }, sv6.n("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final <T extends Parcelable> T H_(final String str) {
        str.getClass();
        return (T) getCurrencyIso4217Code(new Function0<T>() { // from class: com.appsflyer.internal.AFj1nSDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            public final Parcelable J_() {
                return AFj1nSDK.this.getMediationNetwork.getParcelableExtra(str);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Object invoke() {
                return J_();
            }
        }, sv6.n("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(final String str, final long j) {
        str.getClass();
        return (Intent) getCurrencyIso4217Code(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1nSDK.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final Intent K_() {
                return AFj1nSDK.this.getMediationNetwork.putExtra(str, j);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Intent invoke() {
                return K_();
            }
        }, sv6.n("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final String getMediationNetwork(final String str) {
        str.getClass();
        return (String) getCurrencyIso4217Code(new Function0<String>() { // from class: com.appsflyer.internal.AFj1nSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final String getMediationNetwork() {
                return AFj1nSDK.this.getMediationNetwork.getStringExtra(str);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ String invoke() {
                return getMediationNetwork();
            }
        }, sv6.n("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
