package defpackage;

import android.database.sqlite.SQLiteDatabase;
import io.sentry.android.core.m0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class up1 {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ up1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static void d(String str) {
        int i;
        boolean z;
        if (!e.o(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (Intrinsics.d(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                m0.p("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    m0.q("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public static String e(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void b(int i) {
        this.b = i | this.b;
    }

    public boolean f(int i) {
        if ((this.b & i) == i) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract int i();

    public abstract int k();

    public abstract int m();

    public abstract int n();

    public abstract void p(so8 so8Var);

    public abstract void q(so8 so8Var, int i, int i2);

    public abstract void s(so8 so8Var);

    public String toString() {
        switch (this.a) {
            case 2:
                return e(this.b);
            default:
                return super.toString();
        }
    }

    public abstract vlk u(vlk vlkVar, List list);

    public abstract ubk v(clk clkVar, ubk ubkVar);

    public abstract void w(so8 so8Var, int i, int i2);

    public /* synthetic */ up1() {
        this.a = 0;
    }

    public void o(so8 so8Var) {
    }

    public void r(clk clkVar) {
    }

    public void t(clk clkVar) {
    }
}
