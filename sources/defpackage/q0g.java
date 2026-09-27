package defpackage;

import java.io.PrintStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class q0g {
    public static final p0g a;
    public static final o0g b;

    static {
        p0g p0gVar;
        o0g o0gVar;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property != null && !property.isEmpty()) {
            int i = 0;
            while (true) {
                if (i < 3) {
                    if (strArr[i].equalsIgnoreCase(property)) {
                        p0gVar = p0g.Stdout;
                        break;
                    }
                    i++;
                } else {
                    p0gVar = p0g.Stderr;
                    break;
                }
            }
        } else {
            p0gVar = p0g.Stderr;
        }
        a = p0gVar;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                o0gVar = o0g.DEBUG;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                o0gVar = o0g.ERROR;
            } else if (property2.equalsIgnoreCase("WARN")) {
                o0gVar = o0g.WARN;
            } else {
                o0gVar = o0g.INFO;
            }
        } else {
            o0gVar = o0g.INFO;
        }
        b = o0gVar;
    }

    public static final void a(String str) {
        c().println("SLF4J(E): ".concat(str));
    }

    public static final void b(String str, Throwable th) {
        c().println("SLF4J(E): ".concat(str));
        c().println("SLF4J(E): Reported exception:");
        th.printStackTrace(c());
    }

    public static PrintStream c() {
        if (a.ordinal() != 1) {
            return System.err;
        }
        return System.out;
    }

    public static void d(String str) {
        if (e(o0g.INFO)) {
            c().println("SLF4J(I): ".concat(str));
        }
    }

    public static boolean e(o0g o0gVar) {
        if (o0gVar.levelInt >= b.levelInt) {
            return true;
        }
        return false;
    }

    public static final void f(String str) {
        if (e(o0g.WARN)) {
            c().println("SLF4J(W): ".concat(str));
        }
    }
}
