package defpackage;

import android.os.Process;
import android.os.WorkSource;
import io.sentry.android.core.m0;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class uok {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static Boolean e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e2) {
            m0.q("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e3) {
            m0.q("WorkSourceUtil", "Missing WorkChain class", e3);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        } catch (Exception unused7) {
            method4 = null;
        }
        d = method4;
        e = null;
    }

    public static void a(WorkSource workSource, int i, String str) {
        Method method = b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e2) {
                m0.t("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e3) {
                m0.t("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(WorkSource workSource) {
        int intValue;
        Method method = d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                arn.h(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e2) {
                m0.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e2);
            }
        }
        Method method2 = c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                arn.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e3) {
                m0.t("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
            if (intValue == 0) {
                return false;
            }
            return true;
        }
        intValue = 0;
        if (intValue == 0) {
        }
    }
}
