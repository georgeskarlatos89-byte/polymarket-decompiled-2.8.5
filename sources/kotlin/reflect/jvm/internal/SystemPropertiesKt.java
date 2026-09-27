package kotlin.reflect.jvm.internal;

import defpackage.r5g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"useK1Implementation", "", "getUseK1Implementation", "()Z", "newFakeOverridesImplementation", "getNewFakeOverridesImplementation", "loadMetadataDirectly", "getLoadMetadataDirectly", "kotlin-reflection"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SystemPropertiesKt {
    private static final boolean loadMetadataDirectly;
    private static final boolean newFakeOverridesImplementation;
    private static final boolean useK1Implementation;

    static {
        Object m882constructorimpl;
        boolean z;
        Object m882constructorimpl2;
        boolean z2;
        Object m882constructorimpl3;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(System.getProperty("kotlin.reflect.jvm.useK1Implementation"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = null;
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        String str = (String) m882constructorimpl;
        boolean z3 = false;
        if (str != null && Boolean.parseBoolean(str)) {
            z = true;
        } else {
            z = false;
        }
        useK1Implementation = z;
        try {
            m882constructorimpl2 = Result.m882constructorimpl(System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation"));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m882constructorimpl2 = Result.m882constructorimpl(ResultKt.createFailure(th2));
        }
        if (m882constructorimpl2 instanceof r5g) {
            m882constructorimpl2 = null;
        }
        String str2 = (String) m882constructorimpl2;
        if (str2 != null && Boolean.parseBoolean(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        newFakeOverridesImplementation = z2;
        try {
            m882constructorimpl3 = Result.m882constructorimpl(System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly"));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            m882constructorimpl3 = Result.m882constructorimpl(ResultKt.createFailure(th3));
        }
        if (!(m882constructorimpl3 instanceof r5g)) {
            obj = m882constructorimpl3;
        }
        String str3 = (String) obj;
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z3 = true;
        }
        loadMetadataDirectly = z3;
    }

    public static final boolean getLoadMetadataDirectly() {
        return loadMetadataDirectly;
    }

    public static final boolean getNewFakeOverridesImplementation() {
        return newFakeOverridesImplementation;
    }

    public static final boolean getUseK1Implementation() {
        return useK1Implementation;
    }
}
