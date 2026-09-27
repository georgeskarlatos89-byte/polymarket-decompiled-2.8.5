package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ldd implements xfj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ldd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xfj
    public final wfj a(i19 i19Var, jij jijVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (jijVar.a != Number.class) {
                    return null;
                }
                return (ndd) obj;
            case 1:
                if (jijVar.a != Object.class) {
                    return null;
                }
                return new qfd(i19Var, (c4j) obj);
            default:
                Class cls = jijVar.a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (iea) obj;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((iea) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
