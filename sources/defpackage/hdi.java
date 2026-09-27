package defpackage;

import androidx.compose.foundation.layout.b;
import bo.app.h2;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class hdi {
    public static void A(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }

    public static void B(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void C(Response response) {
        boolean isTerminated;
        if (response instanceof AutoCloseable) {
            response.close();
            return;
        }
        if (response instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) response;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        omf.a();
    }

    public static /* synthetic */ void D(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        omf.a();
    }

    public static int a() {
        return new Random().nextInt();
    }

    public static int b(int i) {
        return new Random().nextInt(i);
    }

    public static int c(int i, int i2, double d) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return (i * i2) + i3 + i4 + i5;
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int f(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int g(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int h(xxi xxiVar, int i, int i2) {
        return (xxiVar.hashCode() + i) * i2;
    }

    public static lf0 i(long j, b57 b57Var) {
        return b57Var.a(new ib4(j));
    }

    public static ib4 j(sr8 sr8Var, boolean z, long j) {
        sr8Var.s(z);
        return new ib4(j);
    }

    public static SurveyUiColors k(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        return SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(str, str2, i, defaultConstructorMarker));
    }

    public static String l(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String m(Class cls, String str) {
        return h2.a(cls, new StringBuilder(str));
    }

    public static String n(String str, kki kkiVar, String str2, kki kkiVar2) {
        return str + kkiVar + str2 + kkiVar2;
    }

    public static String o(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String r(StringBuilder sb, float f, String str) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder u(float f, float f2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static Map v(String str, String str2) {
        return c1c.b(new Pair(str, str2));
    }

    public static NoWhenBranchMatchedException w(int i, sr8 sr8Var, boolean z) {
        sr8Var.e0(i);
        sr8Var.s(z);
        return new NoWhenBranchMatchedException();
    }

    public static void x(dl8 dl8Var, q8j q8jVar) {
        q8jVar.d(new el8(dl8Var));
    }

    public static void y(hjc hjcVar, float f, sr8 sr8Var, boolean z) {
        wnl.a(sr8Var, b.e(hjcVar, f));
        sr8Var.s(z);
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        omf.a();
    }
}
