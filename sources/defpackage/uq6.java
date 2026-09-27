package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Luq6;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class uq6 extends RuntimeException {
    public final lp4 a;

    public uq6(lp4 lp4Var) {
        this.a = lp4Var;
        if (!lp4Var.b) {
            int[] iArr = {MlKitException.CODE_SCANNER_CANCELLED, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 125, -127, 126665345, 200};
            List list = lp4Var.a;
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                op4 op4Var = (op4) list.get(i);
                if (!ArraysKt.h(op4Var.a, iArr)) {
                    if (op4Var.a == 100) {
                        int i3 = i + 2;
                        if (i3 < size && ((op4) list.get(i3)).a == 1000) {
                            break;
                        } else {
                            CollectionsKt.q0(arrayList);
                        }
                    } else {
                        arrayList.add(op4Var);
                    }
                }
                i = i2;
            }
            int size2 = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((op4) arrayList.get(i4)).a, "SourceFile", 1);
            }
            setStackTrace(stackTraceElementArr);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        lp4 lp4Var = this.a;
        if (lp4Var.b) {
            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
            rib b = eb4.b();
            r3c j = b.j(lp4Var.a);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                ((op4) j.get(i)).getClass();
            }
            r3c j2 = b.j(eb4.a(b));
            int size2 = j2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) j2.get(i2);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
            }
            return sb.toString();
        }
        return "Composition stack when thrown:";
    }
}
