package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class gp7 {
    public static void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            wum.a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }
}
