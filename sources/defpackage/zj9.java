package defpackage;

import java.time.format.DateTimeFormatter;
import kotlin.jvm.functions.Function1;
import skip.foundation.ISO8601DateFormatter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ISO8601DateFormatter b;

    public /* synthetic */ zj9(ISO8601DateFormatter iSO8601DateFormatter, int i) {
        this.a = i;
        this.b = iSO8601DateFormatter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ISO8601DateFormatter iSO8601DateFormatter = this.b;
        switch (i) {
            case 0:
                return ISO8601DateFormatter.h(iSO8601DateFormatter, (DateTimeFormatter) obj);
            case 1:
                return ISO8601DateFormatter.g(iSO8601DateFormatter, (ISO8601DateFormatter.Options) obj);
            default:
                return ISO8601DateFormatter.f(iSO8601DateFormatter, (DateTimeFormatter) obj);
        }
    }
}
