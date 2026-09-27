package defpackage;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class nqb implements azh {
    public static final String d;
    public static final dqb e;
    public final i7h a;
    public final ndg b;
    public final String c;

    /* JADX WARN: Type inference failed for: r0v4, types: [dqb, nqb] */
    static {
        String substring;
        String canonicalName = nqb.class.getCanonicalName();
        canonicalName.getClass();
        int V = StringsKt.V(canonicalName, ".", 0, 6);
        if (V == -1) {
            substring = "";
        } else {
            substring = canonicalName.substring(0, V);
        }
        d = substring;
        e = new nqb("NO_LOCKS", gdn.v);
    }

    public nqb(String str) {
        this(str, new q96(new ReentrantLock(), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        String format;
        if (i != 10 && i != 13 && i != 20 && i != 37) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 10 && i != 13 && i != 20 && i != 37) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1 && i != 3 && i != 5) {
            if (i != 6) {
                switch (i) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        objArr[0] = "compute";
                        break;
                    case 10:
                    case 13:
                    case 20:
                    case 37:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case 15:
                    case MlKitException.UNSUPPORTED /* 18 */:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
                    case 31:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case 33:
                        objArr[0] = "postCompute";
                        break;
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i == 10 && i != 13) {
                if (i != 20) {
                    if (i != 37) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    } else {
                        objArr[1] = "sanitizeStackTrace";
                    }
                } else {
                    objArr[1] = "createMemoizedFunctionWithNullableValues";
                }
            } else {
                objArr[1] = "createMemoizedFunction";
            }
            switch (i) {
                case 4:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case 7:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case MlKitException.UNSUPPORTED /* 18 */:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    break;
                case zh4.REMOTE_EXCEPTION /* 19 */:
                case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case 31:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case 33:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format = String.format(str, objArr);
            if (i != 10 || i == 13 || i == 20 || i == 37) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i == 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i) {
        }
        format = String.format(str, objArr);
        if (i != 10) {
        }
        throw new IllegalStateException(format);
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!stackTrace[i].getClassName().startsWith(d)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    public final gqb b(Function1 function1) {
        return new gqb(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    public final kqb c(Function1 function1) {
        return new kqb(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 0);
    }

    public mqb d(Object obj, String str) {
        String f;
        StringBuilder t = sv6.t("Recursion detected ", str);
        if (obj == null) {
            f = "";
        } else {
            f = k84.f(obj, "on input: ");
        }
        t.append(f);
        t.append(" under ");
        t.append(this);
        AssertionError assertionError = new AssertionError(t.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return woa.r(sb, this.c, ")");
    }

    public nqb(String str, i7h i7hVar) {
        ndg ndgVar = ndg.k;
        this.a = i7hVar;
        this.b = ndgVar;
        this.c = str;
    }
}
