package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class il0 {
    public static final int a;

    static {
        Object m882constructorimpl;
        int i;
        Integer num;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                num = StringsKt.toIntOrNull(property);
            } else {
                num = null;
            }
            m882constructorimpl = Result.m882constructorimpl(num);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
