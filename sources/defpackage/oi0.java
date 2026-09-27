package defpackage;

import android.content.Context;
import android.os.Build;
import com.polymarket.usdependencies.GeoComplianceGate;
import com.polymarket.usdependencies.GeoComplianceVerdict;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oi0 {
    public static final oi0 a = new Object();
    public static final List b = CollectionsKt.listOf("/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su");

    /* JADX WARN: Can't wrap try/catch for region: R(11:15|(19:36|(2:131|(3:134|(1:136)(1:137)|132))|40|41|42|43|(11:45|(1:47)|48|49|50|51|52|53|54|(1:56)|57)(13:72|73|74|75|(1:99)(1:80)|81|82|83|84|85|86|87|(1:89))|58|59|(1:61)|62|20|21|22|(1:24)|25|(1:27)(1:32)|28|(1:30)(1:31))(0)|19|20|21|22|(0)|25|(0)(0)|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x020e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x020f, code lost:
    
        r4 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m882constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, q55 q55Var) {
        ni0 ni0Var;
        int i;
        Object m882constructorimpl;
        boolean booleanValue;
        boolean z;
        Object m882constructorimpl2;
        String str;
        boolean areEqual;
        Object verifyAppLaunch;
        boolean z2;
        if (q55Var instanceof ni0) {
            ni0Var = (ni0) q55Var;
            int i2 = ni0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ni0Var.o = i2 - Integer.MIN_VALUE;
                Object obj = ni0Var.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ni0Var.o;
                Object obj2 = null;
                if (i == 0) {
                    if (i == 1) {
                        areEqual = ni0Var.l;
                        z2 = ni0Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    String str2 = Build.TAGS;
                    if (str2 == null || !StringsKt.L(str2, "test-keys", false)) {
                        List list = b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (new File((String) it.next()).exists()) {
                                }
                            }
                        }
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            Process start = new ProcessBuilder("/system/xbin/which", "su").redirectErrorStream(true).start();
                            try {
                                start.getOutputStream().close();
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                if (!start.waitFor(750L, timeUnit)) {
                                    start.destroy();
                                    if (!start.waitFor(100L, timeUnit)) {
                                        start.destroyForcibly();
                                    }
                                    try {
                                        start.getInputStream().close();
                                        Result.m882constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th) {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        Result.m882constructorimpl(ResultKt.createFailure(th));
                                    }
                                    try {
                                        start.getErrorStream().close();
                                        Result.m882constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th2) {
                                        Result.Companion companion3 = Result.INSTANCE;
                                        Result.m882constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    try {
                                        start.getOutputStream().close();
                                        Result.m882constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th3) {
                                        Result.Companion companion4 = Result.INSTANCE;
                                        Result.m882constructorimpl(ResultKt.createFailure(th3));
                                    }
                                    if (start.isAlive()) {
                                        start.destroyForcibly();
                                    }
                                    z = false;
                                } else {
                                    InputStream inputStream = start.getInputStream();
                                    inputStream.getClass();
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        bufferedReader.close();
                                        if (start.exitValue() == 0 && readLine != null && !StringsKt.T(readLine)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        try {
                                            start.getInputStream().close();
                                            Result.m882constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th4) {
                                            Result.Companion companion5 = Result.INSTANCE;
                                            Result.m882constructorimpl(ResultKt.createFailure(th4));
                                        }
                                        try {
                                            start.getErrorStream().close();
                                            Result.m882constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th5) {
                                            Result.Companion companion6 = Result.INSTANCE;
                                            Result.m882constructorimpl(ResultKt.createFailure(th5));
                                        }
                                        try {
                                            start.getOutputStream().close();
                                            Result.m882constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th6) {
                                            Result.Companion companion7 = Result.INSTANCE;
                                            Result.m882constructorimpl(ResultKt.createFailure(th6));
                                        }
                                        if (start.isAlive()) {
                                            start.destroyForcibly();
                                        }
                                    } finally {
                                    }
                                }
                                m882constructorimpl = Result.m882constructorimpl(Boolean.valueOf(z));
                            } catch (Throwable th7) {
                                try {
                                    Result.Companion companion8 = Result.INSTANCE;
                                    start.getInputStream().close();
                                    Result.m882constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th8) {
                                    Result.Companion companion9 = Result.INSTANCE;
                                    Result.m882constructorimpl(ResultKt.createFailure(th8));
                                }
                                try {
                                    start.getErrorStream().close();
                                    Result.m882constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th9) {
                                    Result.Companion companion10 = Result.INSTANCE;
                                    Result.m882constructorimpl(ResultKt.createFailure(th9));
                                }
                                try {
                                    start.getOutputStream().close();
                                    Result.m882constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th10) {
                                    Result.Companion companion11 = Result.INSTANCE;
                                    Result.m882constructorimpl(ResultKt.createFailure(th10));
                                }
                                if (start.isAlive()) {
                                    start.destroyForcibly();
                                    throw th7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th11) {
                            Result.Companion companion12 = Result.INSTANCE;
                            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th11));
                        }
                        Boolean bool = Boolean.FALSE;
                        if (m882constructorimpl instanceof r5g) {
                            m882constructorimpl = bool;
                        }
                        booleanValue = ((Boolean) m882constructorimpl).booleanValue();
                        Result.Companion companion13 = Result.INSTANCE;
                        m882constructorimpl2 = Result.m882constructorimpl(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                        if (!(m882constructorimpl2 instanceof r5g)) {
                            obj2 = m882constructorimpl2;
                        }
                        str = (String) obj2;
                        if (str != null) {
                            areEqual = false;
                        } else {
                            areEqual = Intrinsics.areEqual(str, "com.android.vending");
                        }
                        GeoComplianceGate.Companion companion14 = GeoComplianceGate.INSTANCE;
                        ni0Var.k = booleanValue;
                        ni0Var.l = areEqual;
                        ni0Var.o = 1;
                        verifyAppLaunch = companion14.verifyAppLaunch(ni0Var);
                        if (verifyAppLaunch != u85Var) {
                            return u85Var;
                        }
                        z2 = booleanValue;
                        obj = verifyAppLaunch;
                    }
                    booleanValue = true;
                    Result.Companion companion132 = Result.INSTANCE;
                    m882constructorimpl2 = Result.m882constructorimpl(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                    if (!(m882constructorimpl2 instanceof r5g)) {
                    }
                    str = (String) obj2;
                    if (str != null) {
                    }
                    GeoComplianceGate.Companion companion142 = GeoComplianceGate.INSTANCE;
                    ni0Var.k = booleanValue;
                    ni0Var.l = areEqual;
                    ni0Var.o = 1;
                    verifyAppLaunch = companion142.verifyAppLaunch(ni0Var);
                    if (verifyAppLaunch != u85Var) {
                    }
                }
                return new mi0(z2, areEqual, (GeoComplianceVerdict) obj);
            }
        }
        ni0Var = new ni0(this, q55Var);
        Object obj3 = ni0Var.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ni0Var.o;
        Object obj22 = null;
        if (i == 0) {
        }
        return new mi0(z2, areEqual, (GeoComplianceVerdict) obj3);
    }
}
