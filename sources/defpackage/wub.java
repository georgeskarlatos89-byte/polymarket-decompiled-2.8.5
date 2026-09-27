package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wub {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final /* synthetic */ x99 e;

    public wub(x99 x99Var, int i, int i2, int i3) {
        this.e = x99Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        String str = (String) ((List) x99Var.c).get(i);
        this.d = str;
        if (i2 >= -1 && i2 < str.length()) {
        } else {
            throw new IllegalStateException("");
        }
    }

    public final Integer a() {
        int i = this.b;
        int max = Math.max(i, 0);
        while (true) {
            String str = this.d;
            if (max < str.length()) {
                char charAt = str.charAt(max);
                if (charAt != ' ' && charAt != '\t') {
                    return Integer.valueOf(max - i);
                }
                max++;
            } else {
                return null;
            }
        }
    }

    public final Integer b() {
        if (this.a + 1 < ((List) this.e.c).size()) {
            return Integer.valueOf((this.d.length() - this.b) + this.c);
        }
        return null;
    }

    public final int c() {
        return (this.d.length() - this.b) + this.c;
    }

    public final wub d() {
        Integer b = b();
        if (b != null) {
            return e(b.intValue() - this.c);
        }
        return null;
    }

    public final wub e(int i) {
        wub wubVar = this;
        while (i != 0) {
            int i2 = wubVar.b;
            int i3 = i2 + i;
            String str = wubVar.d;
            int length = str.length();
            x99 x99Var = this.e;
            int i4 = wubVar.c;
            int i5 = wubVar.a;
            if (i3 < length) {
                return new wub(x99Var, i5, i3, i4 + i);
            }
            if (wubVar.b() == null) {
                return null;
            }
            int length2 = str.length() - i2;
            i -= length2;
            wubVar = new wub(x99Var, i5 + 1, -1, i4 + length2);
        }
        return wubVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == wub.class && this.c == ((wub) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        String substring;
        StringBuilder sb = new StringBuilder("Position: '");
        int i = this.b;
        String str = this.d;
        if (i == -1) {
            substring = k84.g("\\n", str);
        } else {
            substring = str.substring(i);
        }
        return m51.m(sb, substring, '\'');
    }
}
