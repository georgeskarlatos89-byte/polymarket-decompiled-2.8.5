package defpackage;

import java.io.Serializable;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lx9 {
    public final /* synthetic */ int a;
    public final vc9 b;
    public final vc9 c;
    public final vc9 d;
    public final vc9 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public lx9(lx9[] lx9VarArr) {
        this.a = 0;
        this.f = lx9VarArr;
        int length = lx9VarArr.length;
        vc9[] vc9VarArr = new vc9[length];
        for (int i = 0; i < length; i++) {
            vc9VarArr[i] = ((lx9[]) this.f)[i].b();
        }
        this.b = new vc9(1, new u7k(vc9VarArr, 0));
        int length2 = ((lx9[]) this.f).length;
        vc9[] vc9VarArr2 = new vc9[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            vc9VarArr2[i2] = ((lx9[]) this.f)[i2].d();
        }
        this.c = new vc9(0, new uc9(vc9VarArr2, 0));
        int length3 = ((lx9[]) this.f).length;
        vc9[] vc9VarArr3 = new vc9[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            vc9VarArr3[i3] = ((lx9[]) this.f)[i3].c();
        }
        this.d = new vc9(1, new u7k(vc9VarArr3, 1));
        int length4 = ((lx9[]) this.f).length;
        vc9[] vc9VarArr4 = new vc9[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            vc9VarArr4[i4] = ((lx9[]) this.f)[i4].a();
        }
        this.e = new vc9(0, new uc9(vc9VarArr4, 1));
    }

    public final vc9 a() {
        int i = this.a;
        return this.e;
    }

    public final vc9 b() {
        int i = this.a;
        return this.b;
    }

    public final vc9 c() {
        int i = this.a;
        return this.d;
    }

    public final vc9 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ArraysKt.J((lx9[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                return hdi.o("RectRulers(", (String) obj, ')');
        }
    }

    public lx9(String str) {
        this.a = 1;
        this.f = str;
        this.b = new vc9(1, null);
        this.c = new vc9(0, null);
        this.d = new vc9(1, null);
        this.e = new vc9(0, null);
    }
}
