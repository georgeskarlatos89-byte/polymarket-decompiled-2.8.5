package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cw8 extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public final List a;
    public rma b;
    public ep5 c;
    public Class d;
    public final String e;

    public cw8(String str, List list) {
        this.e = str;
        setStackTrace(f);
        this.a = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof cw8) {
            Iterator it = ((cw8) th).a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, bw8 bw8Var) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            bw8Var.append("Cause (");
            int i2 = i + 1;
            bw8Var.append(String.valueOf(i2));
            bw8Var.append(" of ");
            bw8Var.append(String.valueOf(size));
            bw8Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof cw8) {
                ((cw8) th).e(bw8Var);
            } else {
                c(th, bw8Var);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            qp7.n(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.a, new bw8(appendable));
        } catch (IOException e) {
            qp7.n(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        String str3 = "";
        if (this.d == null) {
            str = "";
        } else {
            str = ", " + this.d;
        }
        sb.append(str);
        if (this.c == null) {
            str2 = "";
        } else {
            str2 = ", " + this.c;
        }
        sb.append(str2);
        if (this.b != null) {
            str3 = ", " + this.b;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public cw8(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
