package defpackage;

import java.util.Date;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rh3 extends fq8 implements Function2 {
    public static final rh3 f = new fq8(2, rva.class, "latestOf", "latestOf(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Date date = (Date) obj;
        Date date2 = (Date) obj2;
        if (date == null) {
            return date2;
        }
        if (date2 == null) {
            return date;
        }
        return (Date) ri4.c(date, date2);
    }
}
