package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cig {
    public int a;
    public int b;
    public int c;
    public final Serializable d;
    public Object e;

    public cig(ArrayList arrayList) {
        this.e = new yeh("", null);
        this.c = 0;
        this.d = arrayList;
        this.a = 0;
        this.b = 0;
        if (!arrayList.isEmpty()) {
            a(0, 0);
            yeh yehVar = (yeh) arrayList.get(0);
            this.e = yehVar;
            this.c = yehVar.a.length();
        }
    }

    public void a(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i >= 0 && i < arrayList.size()) {
            yeh yehVar = (yeh) arrayList.get(i);
            if (i2 >= 0 && i2 <= yehVar.a.length()) {
                return;
            }
            dmk.v(woa.l(i2, yehVar.a.length(), "Index ", " out of range, line length: "));
            return;
        }
        dmk.v(woa.l(i, arrayList.size(), "Line index ", " out of range, number of lines: "));
    }

    public int b(char c) {
        int i = 0;
        while (true) {
            char l = l();
            if (l == 0) {
                return -1;
            }
            if (l == c) {
                return i;
            }
            i++;
            i();
        }
    }

    public void c() {
        int i;
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i = this.a;
        } else {
            i = i2 + this.b;
        }
        this.c = i;
        this.e = ((String) this.d) + this.c;
    }

    public c80 d(q24 q24Var, q24 q24Var2) {
        ofh ofhVar;
        ArrayList arrayList = (ArrayList) this.d;
        int i = q24Var.b;
        int i2 = q24Var.c;
        int i3 = q24Var2.b;
        int i4 = q24Var2.c;
        if (i == i3) {
            yeh yehVar = (yeh) arrayList.get(i);
            CharSequence subSequence = yehVar.a.subSequence(i2, i4);
            ofh ofhVar2 = yehVar.b;
            if (ofhVar2 != null) {
                ofhVar = ofhVar2.a(i2, i4);
            } else {
                ofhVar = null;
            }
            yeh yehVar2 = new yeh(subSequence, ofhVar);
            c80 c80Var = new c80(3);
            c80Var.a.add(yehVar2);
            return c80Var;
        }
        c80 c80Var2 = new c80(3);
        yeh yehVar3 = (yeh) arrayList.get(i);
        yeh a = yehVar3.a(i2, yehVar3.a.length());
        ArrayList arrayList2 = c80Var2.a;
        arrayList2.add(a);
        while (true) {
            i++;
            if (i < i3) {
                arrayList2.add((yeh) arrayList.get(i));
            } else {
                arrayList2.add(((yeh) arrayList.get(i3)).a(0, i4));
                return c80Var2;
            }
        }
    }

    public boolean e() {
        if (this.b < this.c || this.a < ((ArrayList) this.d).size() - 1) {
            return true;
        }
        return false;
    }

    public int f(uhl uhlVar) {
        int i = 0;
        while (((BitSet) uhlVar.b).get(l())) {
            i++;
            i();
        }
        return i;
    }

    public int g(char c) {
        int i = 0;
        while (l() == c) {
            i++;
            i();
        }
        return i;
    }

    public void h() {
        if (this.c != Integer.MIN_VALUE) {
            return;
        }
        dmk.n("generateNewId() must be called before retrieving ids.");
    }

    public void i() {
        ArrayList arrayList = (ArrayList) this.d;
        int i = this.b + 1;
        this.b = i;
        if (i > this.c) {
            int i2 = this.a + 1;
            this.a = i2;
            if (i2 < arrayList.size()) {
                yeh yehVar = (yeh) arrayList.get(this.a);
                this.e = yehVar;
                this.c = yehVar.a.length();
            } else {
                yeh yehVar2 = new yeh("", null);
                this.e = yehVar2;
                this.c = yehVar2.a.length();
            }
            this.b = 0;
        }
    }

    public boolean j(char c) {
        if (l() == c) {
            i();
            return true;
        }
        return false;
    }

    public boolean k(String str) {
        int i = this.b;
        if (i < this.c && str.length() + i <= this.c) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (((yeh) this.e).a.charAt(this.b + i2) == str.charAt(i2)) {
                }
            }
            this.b = str.length() + this.b;
            return true;
        }
        return false;
    }

    public char l() {
        int i = this.b;
        if (i < this.c) {
            return ((yeh) this.e).a.charAt(i);
        }
        if (this.a < ((ArrayList) this.d).size() - 1) {
            return '\n';
        }
        return (char) 0;
    }

    public q24 m() {
        return new q24(this.a, this.b, 10);
    }

    public void n(q24 q24Var) {
        int i = q24Var.b;
        int i2 = q24Var.c;
        a(i, i2);
        this.a = i;
        this.b = i2;
        yeh yehVar = (yeh) ((ArrayList) this.d).get(i);
        this.e = yehVar;
        this.c = yehVar.a.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int o() {
        int i = 0;
        while (true) {
            char l = l();
            if (l != ' ') {
                switch (l) {
                }
            }
            i++;
            i();
        }
    }

    public cig(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public cig(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + AgentHeaderCreator.AGENT_DIVIDER;
        } else {
            str = "";
        }
        this.d = str;
        this.a = i2;
        this.b = i3;
        this.c = Integer.MIN_VALUE;
        this.e = "";
    }
}
