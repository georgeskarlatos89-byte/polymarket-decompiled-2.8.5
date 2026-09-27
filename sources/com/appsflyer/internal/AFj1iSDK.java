package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import defpackage.r5g;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1iSDK implements AFj1gSDK {
    @Override // com.appsflyer.internal.AFj1gSDK
    public final String getRevenue() {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            m882constructorimpl = Result.m882constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = "";
        }
        return (String) m882constructorimpl;
    }
}
